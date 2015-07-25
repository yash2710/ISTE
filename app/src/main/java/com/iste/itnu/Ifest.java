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


//        getActivity().setTitle("I FEST");
        i.setImageResource(R.drawable.ifest);
        t.setText("LABYRINTH- CHASE YOUR DREAMS\n" +
                "\"Life is a maze in which we take the wrong turning before we have learnt to " +
                "walk.\"\n" +
                "Days that will serve as a panorama of techno-management and cultural events; " +
                "Days which will mark the magical amalgam of skill and intellect mingled with " +
                "ceaseless fun; Days which will bring together young technocrats, juvenile " +
                "scientists adolescent artists for a memorable and spellbinding experience; Days " +
                "that will leave cherishable memories in everyone's hearts which would remain " +
                "etched therein, forever; these will be days that would be termed as I-FEST " +
                "2k15.\n" +
                "The biggest techno cultural and management symposium, I-FEST 2k15 would " +
                "encompass everything you would have dreamt of! It would bring out the " +
                "passion and cravings of your heart through the amazing cultural events. I-FEST " +
                "2k15 would days of perpetual frivolousness and at the same time, which would " +
                "equip you with loads of learning experiences. " +
                "\nAs someone very rightly said,\n" +
                "\"You spend your whole life stuck in the labyrinth, thinking about how you'll " +
                "escape one day, and how awesome it will be, and imagining that future keeps " +
                "you going, but you never do it. You just use the future to escape the present.\"\n" +
                "Life is a labyrinth, where the final spot is the success, that can only be attained " +
                "by failing to find the end but getting up each time with a hope to excel. Dreams " +
                "are ways to escape the exhausting monotonous reality. Dreams are measure of " +
                "your imagination, a perspective of how you want to shape your life. So this " +
                "year, I-FEST 2k15 will embark on a journey to celebrate the fusion of " +
                "imagination with dreams. The Labyrinth will offer you the chance to " +
                "wander out of your comfort zone and think beyond your present " +
                "knowledge.");

    }
}