package com.placeremainder.place.market24.fragments.Services;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.placeremainder.place.market24.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShowServiceDetailWithPrice extends Fragment {


    public ShowServiceDetailWithPrice() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show_service_detail_with_price, container, false);
    }

}
