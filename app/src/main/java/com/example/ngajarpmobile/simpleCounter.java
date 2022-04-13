package com.example.ngajarpmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class simpleCounter extends AppCompatActivity {

    TextView tv_result;
    Button btn_minus, btn_plus, btn_reset;
    int counter;

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_minus:
                    minusCounter();
                    break;
                case R.id.btn_plus:
                    plusCounter();
                    break;
                case R.id.btn_reset:
                    initCounter();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_counter);

        tv_result = findViewById(R.id.tv_result);
        btn_minus = findViewById(R.id.btn_minus);
        btn_minus.setOnClickListener(clickListener);
        btn_plus = findViewById(R.id.btn_plus);
        btn_plus.setOnClickListener(clickListener);
        btn_reset = findViewById(R.id.btn_reset);
        btn_reset.setOnClickListener(clickListener);

        initCounter();
    }

    private void initCounter() {
        counter = 0;
        tv_result.setText(counter + "");
    }

    private void plusCounter () {
        counter++;
        tv_result.setText(counter + "");
    }

    private void minusCounter () {
        counter--;
        tv_result.setText(counter + "");
    }
}