package com.nico.quiz.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.nico.quiz.R;

/**
 * Created by Nicolas on 01.03.2017.
 */

public class NextLevelDialog extends Dialog implements View.OnClickListener
{
    public Activity c;
    public Button button_next_level;
    public TextView titleText, answerText;
    public String title, answer;
    public ImageView imageView;
    public int imgId;

    public NextLevelDialog(Context context, Activity c, String title, String answer, int imgId)
    {
        super(context);
        this.c = c;
        this.title = title;
        this.answer = answer;
        this.imgId = imgId;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);

        titleText = (TextView) findViewById(R.id.title_dialog_answer);
        answerText = (TextView) findViewById(R.id.message_dialog_answer);
        imageView = (ImageView) findViewById(R.id.img_dialog_answer);
        button_next_level = (Button) findViewById(R.id.btn_next);
        button_next_level.setOnClickListener(this);

        titleText.setText(title);
        answerText.setText(answer);
        imageView.setImageResource(imgId);
    }

    @Override
    public void onClick(View v) {
        dismiss();
    }
}
