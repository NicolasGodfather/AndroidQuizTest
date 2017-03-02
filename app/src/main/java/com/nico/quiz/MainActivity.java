package com.nico.quiz;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity implements QuizFragment.StateListener
{
    QuizFragment quizFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quizFragment = (QuizFragment) getSupportFragmentManager().findFragmentById(R.id.quizFragment);
    }

    @Override
    public void checkPoints(int points)
    {
        quizFragment.countPoints.setText(String.valueOf(points));
    }

    @Override
    public void checkLives(int lives)
    {
        quizFragment.countLives.setText(String.valueOf(lives));
    }
}
