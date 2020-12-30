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
 * Use the {@link DrinkFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DrinkFragment extends Fragment {

    public DrinkFragment() {
        // Required empty public constructor
    }

    ImageButton air,pukat,mangga;

    // TODO: Rename and change types and number of parameters
    public static DrinkFragment newInstance() {
        DrinkFragment fragment = new DrinkFragment();
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
        View view = inflater.inflate(R.layout.fragment_drink, container, false);
        air = view.findViewById(R.id.Image);
        pukat = view.findViewById(R.id.pukatBtn);
        mangga = view.findViewById(R.id.manggaBtn);

        air.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrinkOrder.id = 0;
                onOrderButton();
            }
        });

        pukat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrinkOrder.id = 1;
                onOrderButton();
            }
        });

        mangga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrinkOrder.id = 2;
                onOrderButton();
            }
        });

        return view;
    }

    public void onOrderButton() {
        Intent intent = new Intent(getActivity(), DrinkOrder.class);
        startActivity(intent);
    }

}