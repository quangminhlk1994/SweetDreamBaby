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





        //Button
        View view = inflater.inflate(R.layout.activity_favorites, container, false);

        //  FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.btnadd);
        //   fab.setOnClickListener(new View.OnClickListener() {
        //      @Override
        //     public void onClick(View v) {
        //         Toast.makeText(getActivity(), "TTEst", Toast.LENGTH_LONG).show();
        //     }
        //  }); -->
        return view;
    }
}

