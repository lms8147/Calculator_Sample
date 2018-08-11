package com.tutorial.development.calculator;

import android.databinding.ObservableField;
import android.view.View;

public class MainViewModel {

    public String operandA;
    public String operandB;
    public ObservableField<String> result;

    private Calculator mCalculator;

    public MainViewModel(){
        result = new ObservableField<>();
        mCalculator = new Calculator();
    }

    public void onCalculateClick(View view){
        int a = Integer.parseInt(operandA);
        int b = Integer.parseInt(operandB);

        int result = mCalculator.operateAdd(a,b);
        result += mCalculator.operateSub(a,b);
        result += mCalculator.operateMul(a,b);

        this.result.set("" + result);
    }

}
