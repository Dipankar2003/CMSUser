package com.example.studentapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class calender_fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calender_fragment, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = getActivity().findViewById(R.id.calnder_recyclerList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        String[] cName = {"WLUG","PACE","SAIT", "ARAYANS","ACCES","ELSA"};
        String[] eName = {"WLUGEVENT", "PACEEVENT" , "SAITEVENT" , "ARAYNSEVENT", "ACCESEVENT", "ELSAEVENT"};
        recyclerView.setAdapter(new calender_list_adapter(eName,cName));

    }
}