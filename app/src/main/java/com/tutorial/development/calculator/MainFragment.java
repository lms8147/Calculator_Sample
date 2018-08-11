package com.tutorial.development.calculator;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainFragment extends Fragment {

    private EditText mEditTextOperandA;
    private EditText mEditTextOperandB;
    private TextView mTextViewResult;
    private Calculator mCalculator;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_main, container, false);

        mCalculator = new Calculator();

        mEditTextOperandA = root.findViewById(R.id.edit_text_operand_a);
        mEditTextOperandB = root.findViewById(R.id.edit_text_operand_b);
        mTextViewResult = root.findViewById(R.id.text_view_result);
        Button button = root.findViewById(R.id.button_caculate);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(mEditTextOperandA.getText().toString());
                int b = Integer.parseInt(mEditTextOperandB.getText().toString());

                int result = mCalculator.operateAdd(a, b);
                result += mCalculator.operateSub(a, b);
                result += mCalculator.operateAdd(a, b);
                result += mCalculator.operateSub(a, b);
                result += mCalculator.operateAdd(a, b);
                result += mCalculator.operateSub(a, b);
                result += mCalculator.operateAdd(a, b);
                result += mCalculator.operateSub(a, b);
                result += mCalculator.operateAdd(a, b);
                result += mCalculator.operateSub(a, b);
                result += mCalculator.operateAdd(a, b);
                result += mCalculator.operateSub(a, b);
                result += mCalculator.operateAdd(a, b);
                result += mCalculator.operateSub(a, b);
                result += mCalculator.operateAdd(a, b);
                result += mCalculator.operateSub(a, b);
                result += mCalculator.operateAdd(a, b);
                result += mCalculator.operateSub(a, b);
                result += mCalculator.operateAdd(a, b);
                result += mCalculator.operateSub(a, b);
                result += mCalculator.operateAdd(a, b);
                result += mCalculator.operateMul(a, b);

                mTextViewResult.setText("" + result);
            }
        });
        return root;
    }

}
