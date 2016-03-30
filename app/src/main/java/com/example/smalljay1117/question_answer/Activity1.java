package com.example.smalljay1117.question_answer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    public static final String Q1_ANSWER_KEY = "Q1";

    private TextView m_tv_no;
    private TextView m_tv_question;
    private RadioButton m_radio_a;
    private RadioButton m_radio_b;
    private RadioButton m_radio_c;

    private CharSequence m_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        init();
    }

    private void init() {
        m_tv_no = (TextView)findViewById(R.id.tv_no);
        m_tv_question = (TextView)findViewById(R.id.tv_question);
        m_radio_a = (RadioButton)findViewById(R.id.radio_a);
        m_radio_b = (RadioButton)findViewById(R.id.radio_b);
        m_radio_c = (RadioButton)findViewById(R.id.radio_c);

        m_tv_no.setText("第一題");
        m_tv_question.setText(getString(R.string.question_1));
        m_radio_a.setText(getString(R.string.question_1_radio_a));
        m_radio_b.setText(getString(R.string.question_1_radio_b));
        m_radio_c.setText(getString(R.string.question_1_radio_c));
    }

    public void next(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_right_in, R.anim.push_left_out);
    }
}
