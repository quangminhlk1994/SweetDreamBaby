package vn.pro205.android.sweetdreambaby;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        ArrayList<String> titleBook = new ArrayList<>();

        ArrayList<String> typeBook = new ArrayList<>();

        Integer [] image = {
                R.drawable.xmenfirstclass,
                R.drawable.ironman2,
                R.drawable.thor,
                R.drawable.lordofring,
                R.drawable.xmenfirstclass,
                R.drawable.ironman2,
                R.drawable.thor,
                R.drawable.lordofring,
                R.drawable.xmenfirstclass,
                R.drawable.ironman2

        };

        for (int i = 0 ; i < 10 ; i++)
        {
            titleBook.add("Title Story " + i);
            typeBook.add("Type Book " + i);

        }

        View view = inflater.inflate(R.layout.activity_my_books, container, false);
        lists = (ListView)view.findViewById(R.id.list);
        MyBooksAdapter adapter = new MyBooksAdapter(getActivity(), titleBook,typeBook, image);
        lists.setAdapter(adapter);


        return view;
    }

}

//....................