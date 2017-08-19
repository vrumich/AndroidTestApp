package com.vogella.android.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick (View view) {
        EditText text = (EditText) findViewById(R.id.main_input);
        String sText = text.getText().toString();
        Toast.makeText(this, sText,
                Toast.LENGTH_LONG).show();
    }
}
