package com.rujira.callbacksmethod;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Random;

public class GenerateNumber extends Fragment {
    public NumberCallback callback;

    public GenerateNumber() {
        super();
    }

    public static GenerateNumber newInstance() {
        GenerateNumber generateNumberFragment = new GenerateNumber();
        Bundle args = new Bundle();
        generateNumberFragment.setArguments(args);
        return generateNumberFragment;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_generate_number, container, false);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {
        int random = new Random().nextInt(61) + 20; // [0, 60] + 20 => [20, 80]
        callback.callBackMethod(random);
    }

}
