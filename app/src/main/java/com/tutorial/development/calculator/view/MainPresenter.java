package com.tutorial.development.calculator.view;

import com.tutorial.development.calculator.model.Calculator;

public class MainPresenter implements MainContract.Presenter {

    MainContract.View mView;
    Calculator mCalculator;

    public MainPresenter(MainContract.View view){
        setView(view);
        mCalculator = new Calculator();
    }

    @Override
    public void setView(MainContract.View view) {
        this.mView = view;
    }

    @Override
    public void requestCalculate(int a, int b) {
        int result = mCalculator.operateAdd(a,b);
        result += mCalculator.operateSub(a,b);
        result += mCalculator.operateMul(a,b);
        mView.displayResult(result);
    }
}
