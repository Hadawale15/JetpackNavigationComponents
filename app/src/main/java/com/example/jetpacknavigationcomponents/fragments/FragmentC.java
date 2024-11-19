package com.example.jetpacknavigationcomponents.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jetpacknavigationcomponents.R;


public class FragmentC extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_c, container, false);


        //get data from which shared with transaction
        assert getArguments() != null;
        String name=getArguments().getString("Name");
        Log.d("NAMSMAS",name);

        return view;
    }
}