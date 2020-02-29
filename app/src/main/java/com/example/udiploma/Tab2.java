package com.example.udiploma;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2 extends Fragment implements View.OnClickListener {


    public Tab2() {
        // Required empty public constructor
    }


    private CardView cardView7,cardView8,cardView9,cardView10,cardView11,cardView12;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab2, container, false);

        cardView7 = view.findViewById(R.id.cardViewId7);
        cardView8 = view.findViewById(R.id.cardViewId8);
        cardView9 = view.findViewById(R.id.cardViewId9);
        cardView10 = view.findViewById(R.id.cardViewId10);
        cardView11 = view.findViewById(R.id.cardViewId11);
        cardView12 = view.findViewById(R.id.cardViewId12);

        cardView7.setOnClickListener(this);
        cardView8.setOnClickListener(this);
        cardView9.setOnClickListener(this);
        cardView10.setOnClickListener(this);
        cardView11.setOnClickListener(this);
        cardView12.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.cardViewId7){
            Intent intent = new Intent(getActivity(), BookList.class);
            startActivity(intent);
        }else if(view.getId()==R.id.cardViewId8){
            Intent intent = new Intent(getActivity(), BooklistActivity.class);
            startActivity(intent);
        }else if(view.getId()==R.id.cardViewId9){
            Intent intent = new Intent(getActivity(), CGPA.class);
            startActivity(intent);
        }else if(view.getId()==R.id.cardViewId10){
            Intent intent = new Intent(getActivity(), Calender.class);
            startActivity(intent);
        }else if(view.getId()==R.id.cardViewId11){
            Intent intent = new Intent(getActivity(), DistrictActivity.class);
            startActivity(intent);
        }else if(view.getId()==R.id.cardViewId12){
            Intent intent = new Intent(getActivity(), Bord.class);
            startActivity(intent);
        }

    }

}
