package com.example.binusezfood;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SnacksFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SnacksFragment extends Fragment {

    ImageButton kk, sn;
    public SnacksFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static FoodFragment newInstance(String param1, String param2) {
        FoodFragment fragment = new FoodFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_snacks, container, false);

        kk = view.findViewById(R.id.kitkatbtn);
        sn = view.findViewById(R.id.snickersbtn);

        kk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OrderActivity.id = 5;
                onOrderButton();
            }
        });

        sn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OrderActivity.id = 6;
                onOrderButton();
            }
        });


        return view;
    }

    public void onOrderButton() {
        Intent intent = new Intent(getActivity(), OrderActivity.class);
        startActivity(intent);
    }
}