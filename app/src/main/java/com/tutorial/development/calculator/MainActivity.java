package com.tutorial.development.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText mEditTextOperandA;
    private EditText mEditTextOperandB;
    private TextView mTextViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextOperandA = findViewById(R.id.edit_text_operand_a);
        mEditTextOperandB = findViewById(R.id.edit_text_operand_b);
        mTextViewResult = findViewById(R.id.text_view_result);
        Button button = findViewById(R.id.button_caculate);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(mEditTextOperandA.getText().toString());
                int b = Integer.parseInt(mEditTextOperandB.getText().toString());

                int result = operateAdd(a,b);

                mTextViewResult.setText("" + result);
            }
        });
    }

    public int operateAdd(int a, int b){
        return a + b;
    }
}
