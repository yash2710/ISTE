package com.iste.itnu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Yash on 29-Dec-14.
 */
public class Ifest extends Fragment {
    public Ifest() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View rootView = inflater.inflate(R.layout.eventdesc, container, false);

        return rootView;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ImageView i = (ImageView) getView().findViewById(R.id.imageevent);
        TextView t = (TextView) getView().findViewById(R.id.textevent);


        getActivity().setTitle("I FEST");
        i.setImageResource(R.drawable.ifest);
        t.setText("\"Be thou the rainbow in the storms of life.\n" +
                "And when it rains on your parade look up rather than down\"\n" +
                "\n" +
                "Days that will serve as a panorama of techno-management and cultural events; " +
                "Days which will mark the magical amalgam of skill and intellect mingled with " +
                "ceaseless fun; Days which will bring together young technocrats, juvenile " +
                "scientists and adolescent artists for a memorable experience; Days that will leave " +
                "cherishable memories in everyones hearts which would remain etched therein, forever;" +
                " these will be days that would be termed as IFEST 2K14.\n" +
                "\n" +
                "\n" +
                "The biggest techno-cultural and management symposium, IFEST 2k14 encompassed " +
                "everything you have ever dreamt of! It brought out the passion and cravings of your" +
                " heart through the amazing cultural events and will ameliorate your knowledge of " +
                "technology through its dynamically designed technical events. IFEST 2k14 were days " +
                "overflowing with perpetual frivolousness and at the same time, which would equip " +
                "you with loads of learning experiences. IFEST 2k14 is going to be the biggest and " +
                "by far, the most vibrant coronas of INNOVATIONS, INTELLECT, IMAGINATION and ‘INTERESTS’ !!! \n" +
                "\n" +
                "Having a pre-fest launch by none other than legendary cricketer VVS Laxman and being" +
                " a part of the EDM NIGHT by DJ Teri Miko, IFEST 2k14 proved to be the biggest thing!!!");

    }
}