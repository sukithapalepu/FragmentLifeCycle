package com.example.fragmentlifecycle;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Fr1 extends Fragment {
    View view;
    Button frgbn;


    public Fr1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view = inflater.inflate(R.layout.fragment_fr1, container, false);
         frgbn = (Button) view.findViewById(R.id.frgbn);
         frgbn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(getActivity(),"Fragment ButtonClicked!",Toast.LENGTH_LONG).show();
             }
         });
         return view;
    }

}
