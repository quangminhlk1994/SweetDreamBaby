package vn.pro205.android.sweetdreambaby;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Favorites extends android.app.Fragment {

    public Favorites() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment//
        //aaa
        /*String[] titleBook = {"Title Story", "Title Story", "Title Story", "Title Story", "Title Story", "Title Story", "Title Story", "Title Story", "Title Story", "Title Story"};
        String [] typeBook = {"Free","49.000vnd","Free","49.000vnd","Free","Free","39.000vnd","Free","59.000vnd","Free"};
        int[] image = {R.drawable.lordofring, R.drawable.lordofring, R.drawable.xmenfirstclass, R.drawable.xmenfirstclass, R.drawable.lordofring,
                R.drawable.ironman2, R.drawable.thor, R.drawable.ironman2, R.drawable.xmenfirstclass, R.drawable.thor};
        FavoriteBooksAdapter adapter = new FavoriteBooksAdapter(getActivity(),titleBook,typeBook,image);
        setListAdapter(adapter);*/

        View view = inflater.inflate(R.layout.activity_favorites, container, false);


            //setContentView(R.layout.activity_settings);

           /* Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/

           /* CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) view.findViewById(R.id.collapsing_toolbar);
            collapsingToolbar.setTitle("Second Activity");*/

        return view;
    }



}

