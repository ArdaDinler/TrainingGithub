package com.arda.sadelabs01.traininggithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textView = (EditText) findViewById(R.id.TestTextView);
        textView.setText("Github Hello World", TextView.BufferType.EDITABLE);

    }
}
