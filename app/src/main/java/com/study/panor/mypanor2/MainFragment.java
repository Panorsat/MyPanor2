package com.study.panor.mypanor2;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

 //      Register Controller
        registerController();


    }// Mian Method

    private void registerController() {
        TextView textview = getView().findViewById(R.id.txtRegister);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

 //            Replce Fragment
             getActivity()
                     .getSupportFragmentManager()
                     .beginTransaction()
                     .replace(R.id.contentMainFragment,new RegisterFrament())
                     .addToBackStack(null).commit();



            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

} // Mian Class
