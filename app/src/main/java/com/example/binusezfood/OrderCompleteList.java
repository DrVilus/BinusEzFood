package com.example.binusezfood;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OrderCompleteList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrderCompleteList extends Fragment {

    public OrderCompleteList() {
        // Required empty public constructor
    }
    TextView a1,a2,p1,p2,m1,m2,ng1,ng2,mg1,mg2,kk1,kk2,sn1,sn2;

    // TODO: Rename and change types and number of parameters
    public static OrderCompleteList newInstance(String param1, String param2) {
        OrderCompleteList fragment = new OrderCompleteList();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_order_complete_list, container, false);

        a1= view.findViewById(R.id.air1);
        a2= view.findViewById(R.id.air2);

        p1= view.findViewById(R.id.pukat1);
        p2= view.findViewById(R.id.pukat2);

        m1= view.findViewById(R.id.mangga1);
        m2= view.findViewById(R.id.mangga2);

        ng1= view.findViewById(R.id.nasgor1);
        ng2= view.findViewById(R.id.nasgor2);

        mg1= view.findViewById(R.id.miegor1);
        mg2= view.findViewById(R.id.miegor2);

        kk1= view.findViewById(R.id.kk1);
        kk2= view.findViewById(R.id.kk2);

        sn1= view.findViewById(R.id.sn1);
        sn2= view.findViewById(R.id.sn2);

        if(MyOrder.air==0){
            a1.setVisibility(View.GONE);
            a2.setVisibility(View.GONE);
        }
        if(MyOrder.pukat==0){
            p1.setVisibility(View.GONE);
            p2.setVisibility(View.GONE);
        }
        if(MyOrder.mangga==0){
            m1.setVisibility(View.GONE);
            m2.setVisibility(View.GONE);
        }
        if(MyOrder.nasgor==0){
            ng1.setVisibility(View.GONE);
            ng2.setVisibility(View.GONE);
        }
        if(MyOrder.miegor==0){
            mg1.setVisibility(View.GONE);
            mg2.setVisibility(View.GONE);
        }
        if(MyOrder.kitkat==0){
            kk1.setVisibility(View.GONE);
            kk2.setVisibility(View.GONE);
        }
        if(MyOrder.snickers==0){
            sn1.setVisibility(View.GONE);
            sn2.setVisibility(View.GONE);
        }


        a2.setText(MyOrder.air + " x RP 1000");
        p2.setText(MyOrder.pukat + " x RP 5000");
        m2.setText(MyOrder.mangga + " x RP 5000");
        ng2.setText(MyOrder.nasgor + " x RP 10000");
        mg2.setText(MyOrder.miegor + " x RP 10000");
        kk2.setText(MyOrder.kitkat + " x RP 3000");
        sn2.setText(MyOrder.snickers + " x RP 5000");

        MyOrder.clearList();
        return view;
    }
}