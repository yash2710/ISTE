package com.iste.itnu;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class EventFragment extends Fragment {

    ListView list;
    String[] names = {"CineFreaks", "Freshers Frenzy", "Incendio", "Lecture Series"};
    Integer[] pics = {R.drawable.b1, R.drawable.b2, R.drawable.b4, R.drawable.b5};
    public EventFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_events, container, false);

        return rootView;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        third adapter = new third(getActivity(), names, pics);
        list = (ListView) getActivity().findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getActivity(), Event_Desc.class);
                i.putExtra("a", arg2);
                startActivity(i);

            }
        });
    }
}
