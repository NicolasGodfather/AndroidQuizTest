package com.nico.quiz.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
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
    private Activity c;
    private Button button_next_level;
    private TextView titleText, answerText;
    private String title, answer;
    private ImageView imageView;
    private Drawable drawable;

    public NextLevelDialog(Context context, Activity c, String title, String answer, Drawable drawable)
    {
        super(context);
        this.c = c;
        this.title = title;
        this.answer = answer;
        this.drawable = drawable;
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
        imageView.setImageDrawable(drawable);
    }

    @Override
    public void onClick(View v) {
        dismiss();
    }
}
