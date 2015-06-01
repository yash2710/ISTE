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


        getActivity().setTitle("Laxman");
        i.setImageResource(R.drawable.laxman);
        t.setText("Epic moments in the history of Nirma University wherein, for the first time ever, a cricketer, and that too none other than the legendary cricketer VVS Laxman was here amidst us, for the launch of the biggest techno-cultural fest ‘IFEST 2K14’, that Ahmedabad will witness from 15th to 17th October, 2014!! With the flawless speech of Laxman working it's way on his huge fan following, the audience was literally spellbound once he started speaking.\n" +
                "ISTE Students’ Chapter ITNU has yet again done their bit towards giving back to the society by providing the perfect platform to raise money for the underprivilegedkids’ education in such a star studded event. The CEOs of the various top notch MNCs of Ahmedabad offered to adopt a fixed number of schools wherein all the expenses incurred in the education of the children would be borne by their respective firms. The event not only aimed to create social " +
                "awareness but also helped one and all present, to imbibe life’s greatest lessons from VVS Laxman’s motivational talk and also served as the umbrella event for the launch of the biggest upcoming techno-cultural fest – IFEST 2K14");
    }
}
