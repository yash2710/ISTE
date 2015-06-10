package com.iste.itnu;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Yash on 03-Feb-15.
 */
public class EDM extends Fragment {
    public EDM(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.eventdesc2, container, false);

        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ImageView i = (ImageView) getView().findViewById(R.id.imageevent);
        ImageView i2 = (ImageView) getView().findViewById(R.id.imageevent2);
        TextView t = (TextView) getView().findViewById(R.id.textevent);


//        getActivity().setTitle("EDM");
        i.setImageResource(R.drawable.edm1);
        i2.setImageResource(R.drawable.edm2);
        t.setText("Electronic Dance Music night.. a one of its kind event .. slowly and gradually " +
                "booming in the city of Ahmedabad!! ISTE Students' Chapter, ITNU volunteered in the " +
                "EDM night of INTERNATIONAL TOMORROWLAND DJ - DJ TERI MIKO !!! The night enthralled " +
                "the people and everyone was left asking for more!!!");
    }
}
