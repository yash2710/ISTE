package com.iste.itnu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.iste.itnu.model.Gallery;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yash on 04-Jun-15.
 */
public class GalleryActivity extends AppCompatActivity {

    static List<Gallery> movieList = new ArrayList<Gallery>();

    @Override
    public void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        Intent i = getIntent();

        int position = i.getIntExtra("id", 0);
        JSONArray response = null;
        try {
            response = new JSONArray(i.getStringExtra("array"));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        for (int j = 0; j < response.length(); j++) {
            try {

                JSONObject obj = response.getJSONObject(j);
                Gallery movie = new Gallery(obj.getString("title"), obj.getString("image"), obj.getInt("year"));

                // adding movie to movies array

                movieList.add(movie);

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        pager.setCurrentItem(position);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    class ViewPagerAdapter extends FragmentStatePagerAdapter{

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            GalleryFragment galleryFragment = GalleryFragment.getInstance(i, movieList);
            return galleryFragment;
        }

        @Override
        public int getCount() {
            return movieList.size();
        }
    }

    public static class GalleryFragment extends Fragment {
        private NetworkImageView imageView;
        private TextView event,year;
        public static GalleryFragment getInstance(int position, List<com.iste.itnu.model.Gallery> movieLists){
            movieList = movieLists;
            GalleryFragment galleryFragment = new GalleryFragment();
            Bundle args = new Bundle();
            args.putInt("id",position);
            galleryFragment.setArguments(args);
            return galleryFragment;
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View layout = inflater.inflate(R.layout.fragment_gallery_pager,container,false);
            imageView = (NetworkImageView) layout.findViewById(R.id.image);
            event = (TextView) layout.findViewById(R.id.event);
            year = (TextView) layout.findViewById(R.id.year);
            Bundle bundle = getArguments();
            if(bundle != null){
                imageView.setImageUrl(movieList.get(bundle.getInt("id")).getThumbnailUrl(),AppController.getInstance().getImageLoader());
                event.setText(movieList.get(bundle.getInt("id")).getTitle());
                year.setText(movieList.get(bundle.getInt("id")).getYear());
            }else{
                imageView.setImageUrl(movieList.get(0).getThumbnailUrl(),AppController.getInstance().getImageLoader());
                event.setText(movieList.get(0).getTitle());
                year.setText(movieList.get(0).getYear());
            }
            return layout;
        }
    }
}
