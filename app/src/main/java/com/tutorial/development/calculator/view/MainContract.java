package com.tutorial.development.calculator.view;

public interface MainContract {

    interface View{

        void setPresenter(Presenter presenter);

        void displayResult(int result);
    }

    interface Presenter{

        void setView(View view);

        void requestCalculate(int a, int b);

    }
}
