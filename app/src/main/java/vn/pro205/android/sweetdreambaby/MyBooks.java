package vn.pro205.android.sweetdreambaby;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import vn.pro205.android.sweetdreambaby.Adapters.MyBooksAdapter;

public class MyBooks extends android.app.Fragment {

    ListView lists;
    Fragment fragment = null;
    public MyBooks() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment//
        //aaa
        //String[] titleBook = {"Title Story", "Title Story", "Title Story", "Title Story", "Title Story", "Title Story", "Title Story", "Title Story", "Title Story", "Title Story"};
        ArrayList<String> titleBook = new ArrayList<>();
        String [] typeBook = {"Free","49.000vnd","Free","49.000vnd","Free","Free","39.000vnd","Free","59.000vnd","Free"};
        int[] image = {R.drawable.lordofring, R.drawable.lordofring, R.drawable.xmenfirstclass, R.drawable.xmenfirstclass, R.drawable.lordofring,
                R.drawable.ironman2, R.drawable.thor, R.drawable.ironman2, R.drawable.xmenfirstclass, R.drawable.thor};
        for (int i = 0 ; i < 10 ; i++)
        {
            titleBook.add("Title Story " + i);
        }

        View view = inflater.inflate(R.layout.activity_my_books, container, false);
        lists = (ListView)view.findViewById(R.id.list);
        MyBooksAdapter adapter = new MyBooksAdapter(getActivity(), titleBook,typeBook, image);
        lists.setAdapter(adapter);

        lists.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                fragment = new Fragment() {

                    public void restartAnimation() {

                    }

                    public void onReset() {

                    }
                };
            }
        });

        return view;
    }

}

