package com.iste.itnu;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeFragment extends Fragment {

    public HomeFragment() {
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        TextView t = (TextView) getActivity().findViewById(R.id.txtLabel);
        t.setText("Indian Society for Technical Education is a national, professional, non-" +
                "profit making society registered under the Societies Registration act of " +
                "1860. The major objective of ISTE is to assist and contribute to the " +
                "development of top quality professional engineers and technicians needed " +
                "by the industry and other organizations by having meaningful interactions " +
                "among various technical institutions at degree and diploma level all over " +
                "the country and bring out the shrouded talents of an individual .ISTE " +
                "Students' Chapter is one of the most versatile, dynamic cub of NIRMA " +
                "University. Apart from providing an outstanding platform for expressing " +
                "creativity and exercising their technical skills, ISTE-ITNU is also a great " +
                "guild for honing management skills. The main objective of ISTE-ITNU is to " +
                "formulate the general goals and responsibilities of technical education as " +
                "well as to adjust curriculum & educational processes to evolving " +
                "conditions. It also aims at enhancing instructional methods & practices, " +
                "authoritative utilizations and fostering research as a function " +
                "complementary to teaching and hence with each passing year we have " +
                "been focusing on social activities, by virtue of which the students are " +
                "nurtured to become natives of this extraordinary nation. The undefeated " +
                "BEST STUDENTS' CHAPTER for 6 years, this year ISTE is back with an even " +
                "better team, more enthusiastic, innovative and futuristic than ever.");
        Typeface tf = Typeface.createFromAsset(this.getActivity().getAssets(), "Roboto-Light.ttf");
        t.setTypeface(tf);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        return rootView;
    }

}
