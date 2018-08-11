package com.tutorial.development.calculator;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorial.development.calculator.databinding.FragmentMainBinding;

public class MainFragment extends Fragment {

    public static MainFragment newInstance(){
        return new MainFragment();
    }

    private FragmentMainBinding mFragmentMainBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mFragmentMainBinding = FragmentMainBinding.inflate(inflater,container,false);

        MainViewModel mainViewModel = new MainViewModel();
        mFragmentMainBinding.setMainViewModel(mainViewModel);

        View root = mFragmentMainBinding.getRoot();

        return root;
    }

}
