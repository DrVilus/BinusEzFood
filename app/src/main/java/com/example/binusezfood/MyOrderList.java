package com.example.binusezfood;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MyOrderList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyOrderList extends Fragment {

    public MyOrderList() {
        // Required empty public constructor
    }

    TextView a1,a2,p1,p2,m1,m2,ng1,ng2,mg1,mg2;
    LinearLayout ah,ph,mh,ngh,mgh;
    Button h1,h2,h3,h4,h5;


    // TODO: Rename and change types and number of parameters
    public static MyOrderList newInstance() {
        MyOrderList fragment = new MyOrderList();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_order_list, container, false);

        a1= view.findViewById(R.id.air1);
        a2= view.findViewById(R.id.air2);
        ah= view.findViewById(R.id.airh);

        p1= view.findViewById(R.id.pukat1);
        p2= view.findViewById(R.id.pukat2);
        ph= view.findViewById(R.id.pukath);

        m1= view.findViewById(R.id.mangga1);
        m2= view.findViewById(R.id.mangga2);
        mh= view.findViewById(R.id.manggah);

        ng1 = view.findViewById(R.id.nasgor1);
        ng2 = view.findViewById(R.id.nasgor2);
        ngh = view.findViewById(R.id.nasgorh);

        mg1 = view.findViewById(R.id.miegor1);
        mg2 = view.findViewById(R.id.miegor2);
        mgh = view.findViewById(R.id.miegorh);



        if(MyOrder.air==0){
            a1.setVisibility(View.GONE);
            a2.setVisibility(View.GONE);
            ah.setVisibility(View.GONE);
        }
        if(MyOrder.pukat==0){
            p1.setVisibility(View.GONE);
            p2.setVisibility(View.GONE);
            ph.setVisibility(View.GONE);
        }
        if(MyOrder.mangga==0){
            m1.setVisibility(View.GONE);
            m2.setVisibility(View.GONE);
            mh.setVisibility(View.GONE);
        }
        if(MyOrder.nasgor==0){
            ng1.setVisibility(View.GONE);
            ng2.setVisibility(View.GONE);
            ngh.setVisibility(View.GONE);
        }if(MyOrder.miegor==0){
            mg1.setVisibility(View.GONE);
            mg2.setVisibility(View.GONE);
            mgh.setVisibility(View.GONE);
        }


        a2.setText(MyOrder.air + " x RP 1000");
        p2.setText(MyOrder.pukat + " x RP 5000");
        m2.setText(MyOrder.mangga + " x RP 5000");
        ng2.setText(MyOrder.nasgor + " x RP 10000");
        mg2.setText(MyOrder.miegor + " x RP 10000");

        h1 = view.findViewById(R.id.hapusBtn);
        h2 = view.findViewById(R.id.hapus2Btn);
        h3 = view.findViewById(R.id.hapus3Btn);
        h4 = view.findViewById(R.id.hapus4Btn);
        h5 = view.findViewById(R.id.hapus5Btn);

        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyOrder.air = 0;
                a1.setVisibility(View.GONE);
                a2.setVisibility(View.GONE);
                ah.setVisibility(View.GONE);
            }
        });
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyOrder.pukat = 0;
                p1.setVisibility(View.GONE);
                p2.setVisibility(View.GONE);
                ph.setVisibility(View.GONE);
            }
        });
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyOrder.pukat = 0;
                m1.setVisibility(View.GONE);
                m2.setVisibility(View.GONE);
                mh.setVisibility(View.GONE);
            }
        });
        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyOrder.nasgor = 0;
                ng1.setVisibility(View.GONE);
                ng2.setVisibility(View.GONE);
                ngh.setVisibility(View.GONE);
            }
        });
        h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyOrder.miegor = 0;
                mg1.setVisibility(View.GONE);
                mg2.setVisibility(View.GONE);
                mgh.setVisibility(View.GONE);
            }
        });

        return view;
    }
}