package com.nico.quiz.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.nico.quiz.AdsInterstialActivity;
import com.nico.quiz.R;

/**
 * Created by Nicolas on 02.03.2017.
 */

public class GameOverDialog extends DialogFragment implements View.OnClickListener
{
    private Activity a;
    private TextView textGameOver;
    private TextView textYourLives;
    private Button close;
    private Button restore;

    public GameOverDialog(Activity a)
    {
        this.a = a;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.custom_dialog2, container, false);
        textGameOver = (TextView) view.findViewById(R.id.text_game_over);
        textYourLives = (TextView) view.findViewById(R.id.text_your_lives);
        close = (Button) view.findViewById(R.id.close_btn);
        restore = (Button) view.findViewById(R.id.restore_btn);
        close.setOnClickListener(this);
        restore.setOnClickListener(this);
        return view;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        return dialog;
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.close_btn:
                dismiss();
                break;
            case R.id.restore_btn:
                Intent i = new Intent(getActivity(), AdsInterstialActivity.class);
                getActivity().startActivity(i);
                dismiss();
                break;
            default:
                break;
        }
        dismiss();
    }

}
