package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String expression = "";
    TextView resultContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView _resultContainer = findViewById(R.id.resultContainer);
        resultContainer=_resultContainer;

    }

    public void setContainerValue(View view) {
        expression += ( (TextView) view ).getText().toString();
        Toast.makeText(this, expression, Toast.LENGTH_SHORT).show();
        resultContainer.setText(expression);
    }
    public void EvaluateExpression(View view){
    }
}