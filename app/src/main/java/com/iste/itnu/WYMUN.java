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
        t.setText("For the first time ever, in the history of Nirma, Asia’s Largest Model UN Conference- WORLD" +
                "YOUTH MUN (WYMUN) was organised in the university campus by ISTE in collaboration " +
                "with Youthemism & Young Leader’s Consortium (YLC). The two day event saw numerous " +
                "national and international delegates thronging the campus and addressing current world " +
                "issues related to regional conflicts, peacekeeping, human rights, women and children, " +
                "economic and social development, environment etc. The event ended with delegates " +
                "reflecting their day on themselves through their communication skills." +
                "With more than 40 international collaborations backing the organisation of the event, " +
                "\nWYMUN turned out to be a prestigious learning experience for both, the participants as well " +
                "as the organisers and is another feather in the cap of ISTE which has yet again proven its " +
                "mettle  by organising such an esteemed and large-scale event, successfully, in the university " +
                "campus.");
    }
}
