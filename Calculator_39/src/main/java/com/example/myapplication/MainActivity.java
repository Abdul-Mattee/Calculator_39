package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.itis.libs.parserng.android.expressParser.MathExpression;

public class MainActivity extends AppCompatActivity {

    public String expression = "";
    public String answer="";
    TextView resultContainer;
    TextView expressionContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView _resultContainer = findViewById(R.id.resultContainer);
        TextView _expressionContainer = findViewById(R.id.expressionContainer);
        resultContainer=_resultContainer;
        expressionContainer=_expressionContainer;

    }
    public void ClearExpression(View view){
        expression="";
        expressionContainer.setText(expression);
    }
    public void SetContainerValue(View view) {
        expression += ( (TextView) view ).getText().toString();
        expressionContainer.setText(expression);
    }
    public void DeleteExpression(View view){
        if(expression.length()<=0) return;
        expression = expression.substring(0,expression.length()-1);
        expressionContainer.setText(expression);
    }
    public void ShowAnswer(View view){
        expression+=answer;
        expressionContainer.setText(expression);
    }
    public void EvaluateExpression(View view){
        MathExpression exp = new MathExpression(expression);
        answer= exp.solve();
        resultContainer.setText(answer);
    }
}