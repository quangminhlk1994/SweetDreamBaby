package vn.pro205.android.sweetdreambaby;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import vn.pro205.android.sweetdreambaby.Adapters.MyBooksAdapter;

public class MyBooks extends android.app.ListFragment {


    public MyBooks() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment//
        //aaa
        String[] titleBook = {"Title Story", "Title Story", "Title Story", "Title Story", "Title Story", "Title Story", "Title Story", "Title Story", "Title Story", "Title Story"};
        String [] typeBook = {"Free","49.000vnd","Free","49.000vnd","Free","Free","39.000vnd","Free","59.000vnd","Free"};
        int[] image = {R.drawable.lordofring, R.drawable.lordofring, R.drawable.xmenfirstclass, R.drawable.xmenfirstclass, R.drawable.lordofring,
                R.drawable.ironman2, R.drawable.thor, R.drawable.ironman2, R.drawable.xmenfirstclass, R.drawable.thor};
        MyBooksAdapter adapter = new MyBooksAdapter(getActivity(), titleBook,typeBook, image);
        setListAdapter(adapter);

        View view = inflater.inflate(R.layout.activity_my_books, container, false);
       final ListView lists=(ListView)view.findViewById(android.R.id.list);
        lists.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity().getApplicationContext(), "Yea!!! click ho gae called", Toast.LENGTH_LONG).show();
            }

    /*        public void onListItemClick(ListView l, View v, int position, long id) {
                Toast.makeText(getActivity().getApplicationContext(), "Yea!!! click ho gae called", Toast.LENGTH_SHORT).show();
            }

            */
        });


        return view;
    }


}