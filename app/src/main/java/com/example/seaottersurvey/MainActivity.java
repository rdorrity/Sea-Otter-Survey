package com.example.seaottersurvey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;

public class MainActivity extends AppCompatActivity {

    TextView tvDescription, tvQuestion, tvQ1;
    RadioGroup rbG1;
    RadioButton radioButton, rb1, rb2, rb3, rb4;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDescription = findViewById(R.id.tvDescription);
        tvQuestion = findViewById(R.id.tvQuestion);
        tvQ1 = findViewById(R.id.tvQ1);
        rbG1= findViewById(R.id.rbG1);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);


        btnSubmit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int btnID = rbG1.getCheckedRadioButtonId();

                radioButton = (RadioButton) findViewById(btnID);



            }
        });
    }
}
