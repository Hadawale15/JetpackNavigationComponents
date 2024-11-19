package com.example.jetpacknavigationcomponents.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.jetpacknavigationcomponents.R;

public class FragmentA extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_a, container, false);

        Bundle bundle=new Bundle();
        bundle.putString("Name","MYAPP");
        bundle.putString("Email","MYAPP@gmail.com");


        Button goToFragmentC=view.findViewById(R.id.goToFragmentC_id);
        goToFragmentC.setOnClickListener(v->{

            Navigation.findNavController(v).navigate(R.id.action_fragmentA_to_fragmentC,bundle);
        });
        return  view;
    }
}