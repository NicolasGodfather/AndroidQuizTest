package com.nico.quiz;

import android.app.Fragment;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.text.NumberFormat;

import static com.nico.quiz.Data.gameData;

public class QuizFragment extends Fragment
{
    private static final String TAG = "Quiz Activity";
    private static final NumberFormat numberFormat = NumberFormat.getIntegerInstance();
    private int points = 0;
    private int lives = 10;
    private TextView pointsCount;
    private TextView livesCount;
    private ImageView[] images;
    private String correctAnswer;
    private Data data;
    private boolean wasMakingChoose;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);

        pointsCount = (TextView) view.findViewById(R.id.points_count);
        livesCount = (TextView) view.findViewById(R.id.lives_count);
        images = new ImageView[4];
        images[0] = (ImageView) view.findViewById(R.id.img1);
        images[1] = (ImageView) view.findViewById(R.id.img2);
        images[2] = (ImageView) view.findViewById(R.id.img3);
        images[3] = (ImageView) view.findViewById(R.id.img4);
        pointsCount.setText(numberFormat.format(points));
        livesCount.setText(numberFormat.format(lives));

        loadQuiz();

        return view;
    }

    private void loadQuiz()
    {
        AssetManager assets = getActivity().getAssets();
        for (int i = 0; i < gameData.length; i++)
        {
            wasMakingChoose = false;
            while (!wasMakingChoose)
            {
                String answerText = gameData[i][4];
                final int answerNumber = Integer.parseInt(gameData[i][5]) - 1;

                for (int j = 0; j < 4; j++)
                {
                    View.OnClickListener onClickListener = new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            /*switch (view.getId())
                            {
                                case R.id.img1:
                                    if (images[j] == answerNumber)
                                    {

                                    }
                            }*/
                        }
                    };

                    try
                    {
                        InputStream stream = assets.open(gameData[i][j]);
                        Drawable d = Drawable.createFromStream(stream, null);
                        images[j].setImageDrawable(d);
                        images[j].setOnClickListener(onClickListener);
                        Log.d(TAG, images[j].toString());
                    } catch (IOException e)
                    {
                        e.printStackTrace();
                        return;
                    }
                }
            }
            wasMakingChoose = true;

        }
    }

    private void makeToast(int i)
    {
        Toast.makeText(getActivity().getApplicationContext(), "", Toast.LENGTH_SHORT).show();
    }


    private void updatePointsCount()
    {
    }

    private void updateLivesCount()
    {
    }

    private TextWatcher textWatcher = new TextWatcher()
    {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
        {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
        {

        }

        @Override
        public void afterTextChanged(Editable editable)
        {
        }
    };

}
