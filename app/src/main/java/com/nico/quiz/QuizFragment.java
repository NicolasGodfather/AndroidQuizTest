package com.nico.quiz;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.nico.quiz.dialogs.GameOverDialog;
import com.nico.quiz.dialogs.NextLevelDialog;

import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.text.NumberFormat;

import static com.nico.quiz.Data.gameData;
import static java.lang.String.valueOf;

public class QuizFragment extends Fragment
{
    private static final String TAG = "Quiz Fragment";
    private static final NumberFormat numberFormat = NumberFormat.getIntegerInstance();
    public static int totalPoints = 0; // очки игрока
    public static int totalLives = 5; // жизни игрока
    public static int i = 0; // first number multi array
    private int j = 0; // second number multi array
    private SecureRandom random; // Обеспечивает случайное распределение
    private int answerNumber; // индекс верной картинки в двумерном массиве
    private String answerText; // индекс верного ответа в двумерном массиве
    protected TextView countPoints;
    protected TextView countLives;
    private TextView titleText;
    private ImageView imageRating;
    private ImageView[] images;
    private AdView adView;
    private AdRequest adRequest;
    private GridLayout gridImages;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private StateData stateListener;

    public void setStateListener(StateData stateListener)
    {
        this.stateListener = stateListener;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);

        // слушает изменения жизней и очков
        this.setStateListener(new StateData()
        {
            @Override
            public void checkPoints(int points)
            {
                countPoints.setText(String.valueOf(points));
            }

            @Override
            public void checkLives(int lives)
            {
                countLives.setText(String.valueOf(lives));
            }
        });

        countPoints = (TextView) view.findViewById(R.id.points_count);
        countLives = (TextView) view.findViewById(R.id.lives_count);
        titleText = (TextView) view.findViewById(R.id.title);
        gridImages = (GridLayout) view.findViewById(R.id.grid_images);
        random = new SecureRandom();

        images = new ImageView[4];
        images[0] = (ImageView) view.findViewById(R.id.img1);
        images[1] = (ImageView) view.findViewById(R.id.img2);
        images[2] = (ImageView) view.findViewById(R.id.img3);
        images[3] = (ImageView) view.findViewById(R.id.img4);

        countPoints.setText(valueOf(totalPoints));
        countLives.setText(valueOf(totalLives));

        // Load an ad into the AdMob banner view.
        adView = (AdView) view.findViewById(R.id.adView);
        adRequest = new AdRequest.Builder().setRequestAgent("android_studio:ad_template").build();

        for (ImageView image : images)
        {
            image.setOnClickListener(onClickListener);
        }

        sharedPreferences = getActivity().getPreferences(Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        totalLives = sharedPreferences.getInt("lives", totalLives);
        totalPoints = sharedPreferences.getInt("points", totalPoints);
        i = sharedPreferences.getInt("level", i);

        stateListener.checkPoints(totalPoints);
        stateListener.checkLives(totalLives);

        loadGame();
        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        editor.putInt("lives", totalLives);
        editor.putInt("points", totalPoints);
        editor.putInt("level", i);
        editor.commit();
    }

    // Загрузка игры
    public void loadGame()
    {
        Log.d(TAG, "***" + i);
        j = 0; // second number multi array
        answerText = gameData[i][4];
        answerNumber = Integer.parseInt(gameData[i][5]) - 1;
        adView.setVisibility(View.INVISIBLE);

        titleText.setText(R.string.choose_excess_image1);
        titleText.setTextColor(getResources().getColor(R.color.colorImg));

        AssetManager assets = getActivity().getAssets();
        for (; j < 4; j++)
        {
            try
            {
                InputStream stream = assets.open(gameData[i][j]);
                Drawable d = Drawable.createFromStream(stream, null);
                images[j].setImageDrawable(d);
                images[j].setBackgroundResource(R.drawable.image_view_border);
                images[j].setEnabled(true);
                images[j].setAlpha(1.0F);
            } catch (IOException e)
            {
                Log.e(TAG, "***************" + e.getMessage());
                return;
            }
        }
    }

    // Вызывается при касании картинки с ответом
    View.OnClickListener onClickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(final View view)
        {
            ImageView currentImage = (ImageView) view; // текущая нажатая картинка
            ImageView correctImage = images[answerNumber]; // верная нажатая картинка

            if (currentImage == correctImage)
            { // верно нажал
                totalPoints += 150;
                stateListener.checkPoints(totalPoints);
                i++; // следующий уровень

                editor.putInt("points", totalPoints);
                editor.putInt("level", i);
                editor.commit();

                int index = random.nextInt(Data.rightAnswers.length);
                Drawable drawable = currentImage.getDrawable();

                NextLevelDialog result = new NextLevelDialog(getContext(), getActivity(),
                        (Data.rightAnswers[index]), answerText, drawable);
                result.show();
                // задержка
                new CountDownTimer(1000, 1000)
                {
                    public void onTick(long millisUntilFinished)
                    {
                    }

                    public void onFinish()
                    {
                        loadGame();
                    }
                }.start();
            } else
            { // неверно нажал
                if (totalPoints != 0)
                {
                    totalPoints -= 50;
                }
                if (totalLives != 0)
                {
                    --totalLives;
                }
                if (totalLives % 3 == 0)
                {
                    adView.loadAd(adRequest);
                    adView.setVisibility(View.VISIBLE);
                }

                stateListener.checkPoints(totalPoints);
                stateListener.checkLives(totalLives);
                editor.putInt("points", totalPoints);
                editor.putInt("lives", totalLives);
                editor.commit();

                currentImage.setEnabled(false);
                currentImage.setBackgroundResource(R.drawable.image_view_border_wrong);
                currentImage.setAlpha(0.5F);
                titleText.setText(R.string.choose_wrong);
                titleText.setTextColor(getResources().getColor(R.color.colorRed));

                if (totalLives == 0)
                {
                    final GameOverDialog dialog = new GameOverDialog(getActivity());
                    dialog.show(getFragmentManager().beginTransaction(), TAG);

                    for (ImageView image : images)
                    {
                        image.setEnabled(false);
                    }
                    gridImages.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            dialog.show(getFragmentManager().beginTransaction(), TAG);
                        }
                    });
                }
            }
        }
    };
}
