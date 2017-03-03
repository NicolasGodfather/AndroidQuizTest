package com.nico.quiz;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.nico.quiz.dialogs.ExitDialog;

public class MainActivity extends FragmentActivity
{
//    private QuizFragment quizFragment;

    /* public interface StateListener
    {
        void checkPoints(int points);

        void checkLives(int lives);
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        quizFragment = (QuizFragment) getSupportFragmentManager().findFragmentById(quizFragment);

    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        ExitDialog exitDialog = new ExitDialog(this);
        exitDialog.show();
    }
}
