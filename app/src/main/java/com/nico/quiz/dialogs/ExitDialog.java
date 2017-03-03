package com.nico.quiz.dialogs;

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
 * Created by Nicolas on 03.03.2017.
 */

public class ExitDialog extends Dialog implements View.OnClickListener
{
    private TextView questionText;
    private ImageView imageView;
    private Button yes, no;

    public ExitDialog(Context context)
    {
        super(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog3);

        questionText = (TextView) findViewById(R.id.question);
        imageView = (ImageView) findViewById(R.id.kubok);
        yes = (Button) findViewById(R.id.btn_yes);
        no = (Button) findViewById(R.id.btn_no);

        yes.setOnClickListener(this);
        no.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btn_yes:
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(0);
                dismiss();
                break;
            case R.id.btn_no:
                dismiss();
                break;
            default:
                break;
        }
        dismiss();
    }

}
