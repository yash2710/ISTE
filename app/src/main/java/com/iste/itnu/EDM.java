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
        t.setText("Today DJ TERI MIKO's tour diary continues to be full with performances all " +
                "around the globe, spinning at world’s most exclusive VIP Nightclubs, Festivals " +
                "and playing for the finest dance music brands. And ISTE organized An EDM " +
                "NIGHT, in which we had world famous DJ- DJ TERI MIKO for the first time in " +
                "Ahmedabad, that too free of cost!! Her onstage performance with hard hitting " +
                "electronic sounds, with shifting tempos and genres made every performance a " +
                "testament to her passion & talent. The nail-biting success of the LED NIGHT " +
                "marked the grand end of I-FEST 14’and the 3-day annual techno-cultural fest of " +
                "ISTE gracefully came to a close.");
    }
}
