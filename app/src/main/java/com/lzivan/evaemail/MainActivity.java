package com.lzivan.evaemail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText emailinput;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.label);
        emailinput = findViewById(R.id.emailText);
    }

    public void checkEmail(View view){
        if (emailinput.getText().toString().contains("@")){
            result.setText("VALID");
        }else{
            result.setText("INVALID");
        }
    }
}