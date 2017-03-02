package com.nico.quiz;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nico.quiz.dialogs.NextLevelDialog;

import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.text.NumberFormat;

import static com.nico.quiz.Data.gameData;

public class QuizFragment extends Fragment
{
    private static final String TAG = "Quiz Fragment";
    private static final NumberFormat numberFormat = NumberFormat.getIntegerInstance();
    protected int totalPoints = 0; // очки игрока
    protected int totalLives = 10; // жизни игрока
    private int i = -1; // first number multi array
    private int j = 0; // second number multi array
    private SecureRandom random; // Обеспечивает случайное распределение
    private int answerNumber; // индекс верной картинки в двумерном массиве
    private String answerText; // индекс верного ответа в двумерном массиве
    protected TextView countPoints;
    protected TextView countLives;
    private TextView titleText;
    private ImageView[] images;
    private StateListener stateListener;

    public interface StateListener
    {
        void checkPoints(int points);
        void checkLives(int lives);
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try {
            stateListener = (StateListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnItemClickedListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);

        Log.d(TAG, "*************************** Start ***************************");
        countPoints = (TextView) view.findViewById(R.id.points_count);
        countLives = (TextView) view.findViewById(R.id.lives_count);
        titleText = (TextView) view.findViewById(R.id.title);
        random = new SecureRandom();

        images = new ImageView[4];
        images[0] = (ImageView) view.findViewById(R.id.img1);
        images[1] = (ImageView) view.findViewById(R.id.img2);
        images[2] = (ImageView) view.findViewById(R.id.img3);
        images[3] = (ImageView) view.findViewById(R.id.img4);

        countPoints.setText(String.valueOf(totalPoints));
        countLives.setText(String.valueOf(totalLives));

        for (ImageView image : images)
        {
            image.setOnClickListener(onClickListener);
        }

        loadGame();

        return view;
    }

    // Загрузка игры
    public void loadGame()
    {
        Log.d(TAG, "***" + i);
        i++;
        j = 0; // second number multi array
        answerText = gameData[i][4];
        answerNumber = Integer.parseInt(gameData[i][5]) - 1;

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
                //show dialog window
                /*DialogFragment correctResult = new DialogFragment()
                {
                    @Override
                    public Dialog onCreateDialog(Bundle savedInstanceState)
                    {
                        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                        builder.setCancelable(false);
                        int index = random.nextInt(Data.rightAnswers.length);

                        builder.setTitle(Data.rightAnswers[index]);

                        builder.setMessage(answerText); // верный ответ

                        builder.setPositiveButton(R.string.result_dialog,
                                new DialogInterface.OnClickListener()
                                {
                                    public void onClick(DialogInterface dialog, int id)
                                    {
                                        loadGame(); // next level
                                    }
                                }
                        );
                        return builder.create();
                    }
                };
                correctResult.show(getFragmentManager(), "quiz results");*/
                //show dialog window
                int index = random.nextInt(Data.rightAnswers.length);
                NextLevelDialog result = new NextLevelDialog(getContext(), getActivity(),
                        (Data.rightAnswers[index]), answerText, correctImage.getId());
                result.show();
                loadGame();
            } else
            { // неверно нажал
                if (totalPoints != 0)
                    totalPoints -= 50;
                stateListener.checkPoints(totalPoints);

                if (totalLives != 0)
                {
                    totalLives -= 1;
                }
                stateListener.checkLives(totalLives);

                currentImage.setEnabled(false);
                //hide image
                currentImage.setBackgroundResource(R.drawable.image_view_border_wrong);
                currentImage.setAlpha(0.5F);
                titleText.setText(R.string.choose_wrong);
                titleText.setTextColor(getResources().getColor(R.color.colorRed));
            }
        }
    };

}
