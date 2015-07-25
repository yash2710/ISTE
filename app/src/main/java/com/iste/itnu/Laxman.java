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
public class Laxman extends Fragment {
    public Laxman() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.eventdesc, container, false);

        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ImageView i = (ImageView) getView().findViewById(R.id.imageevent);
        TextView t = (TextView) getView().findViewById(R.id.textevent);


//        getActivity().setTitle("Laxman");
        i.setImageResource(R.drawable.laxman);
        t.setText("On the 10th of October, epic moments in the history of Nirma University were written " +
                "wherein, for the first time ever, a cricketer, and that too none other than the legendary " +
                "cricketer VVS Laxman was here amidst us, for the launch of the biggest techno-cultural fest " +
                "‘IFEST 2K14’, that Ahmedabad witnessed from 15th to 17th October, 2014!! With the flawless " +
                "speech of Laxman working it's way on his huge fan following, the audience was literally " +
                "spellbound once he started speaking.  He, in his pep talk, motivated the audience toward " +
                "the need to socialize, the need for social work required in our budding nation. " +
                "\n\t The event not only aimed to create social awareness but also helped one and all " +
                "present, to imbibe life’s greatest lessons from VVS Laxman’s motivational talk and also " +
                "served as the umbrella event for the launch of the biggest upcoming techno-cultural fest – " +
                "IFEST 2K14.");
    }
}
