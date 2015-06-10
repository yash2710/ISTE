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
public class WYMUN extends Fragment {
    public WYMUN(){
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


//        getActivity().setTitle("WYMUN");
        i.setImageResource(R.drawable.b13);
        t.setText("Model United Nations (also Model UN or MUN) is an academic simulation of the " +
                "United Nations that aims to educate participants about current events, topics in " +
                "international relations, diplomacy and the United Nations agenda. The participants " +
                "role-play as diplomats representing a nation or NGO in a simulated session of an " +
                "organ (committee) of the United Nations, such as the Security Council or the General " +
                "Assembly. Participants research a country, take on roles as diplomats, investigate " +
                "international issues, debate, deliberate, consult, and then develop solutions to " +
                "world problems.\n\nThe World Youth Model United Nations (WYMUN) is an attempt to " +
                "create an inclusive youth participation platform, for a 1000+ delegates, that " +
                "enables them to discuss ideas and share opinions and innovative approaches for " +
                "effectively contributing to various world affairs.\n\nThe biggest and best event on" +
                " nirmaland.. WYMUN proved to be the biggest MUN in Gujarat and biggest in the world" +
                " in terms of international partnerships with 14 international partners!!! ISTE " +
                "being a part of this event is proud to help the people cultivate academic simulation.");
    }
}
