package com.iste.itnu;
/**
 * Created by Yash on 06-Jan-15.
 */

import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.iste.itnu.adapter.ListAdapterSponsors;
import com.iste.itnu.model.Sponsor;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class SponsorFragment extends Fragment implements ClickListener {

    // Log tag
    private static final String TAG = MainActivity.class.getSimpleName();

    // Movies json url
    private static final String url = "http://www.isteitnu.org/app/sponsor.json";
    private ProgressDialog pDialog;
    private List<Sponsor> sponsorList = new ArrayList<Sponsor>();
    private RecyclerView listView;
    private ListAdapterSponsors adapter;


    public SponsorFragment() {
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);

    }

    private void hidePDialog() {
        if (pDialog != null) {
            pDialog.dismiss();
            pDialog = null;
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sponsers, container, false);
        listView = (RecyclerView) rootView.findViewById(R.id.list_s);
        adapter = new ListAdapterSponsors(getActivity());
        listView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        listView.setAdapter(adapter);
        listView.addOnItemTouchListener(new RecyclerTouchListener(getActivity(), listView, this));

        pDialog = new ProgressDialog(getActivity());
        // Showing progress dialog before making http request
        pDialog.setMessage("Loading...");
        pDialog.show();
        // Creating volley request obj
        JsonArrayRequest sponsorReq = new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Log.d(TAG, response.toString());
                        hidePDialog();

                        // Parsing json
                        for (int i = 0; i < response.length(); i++) {
                            try {

                                JSONObject obj = response.getJSONObject(i);
                                Sponsor sponsor = new Sponsor(obj.getString("title"), obj.getString("image"), obj.getString("url"));
                                // adding movie to movies array
                                sponsorList.add(sponsor);

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }

                        // notifying list adapter about data changes
                        // so that it renders the list view with updated data
                        adapter.setList(sponsorList);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                hidePDialog();

            }
        });


        // Adding request to request queue
        AppController.getInstance().

                addToRequestQueue(sponsorReq);

        return rootView;
    }

    @Override
    public void onLongClick(View view, int position) {

    }

    @Override
    public void onClick(View view, int position) {
        Uri u;
        Intent i;
        Sponsor s = sponsorList.get(position);
        u = Uri.parse(s.getLink());
        i = new Intent(Intent.ACTION_VIEW, u);
        startActivity(i);
    }

}
