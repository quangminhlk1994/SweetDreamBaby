package vn.pro205.android.sweetdreambaby;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        String [] books= {"Test1","Test2"};
        int [] image = {R.drawable.lordofring,R.drawable.lordofring};
        MyBooksAdapter adapter = new MyBooksAdapter(getActivity(),books,image);
        setListAdapter(adapter);


        //Button
        View view = inflater.inflate(R.layout.activity_my_books, container, false);

        //  FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.btnadd);
        //   fab.setOnClickListener(new View.OnClickListener() {
        //      @Override
        //     public void onClick(View v) {
        //         Toast.makeText(getActivity(), "TTEst", Toast.LENGTH_LONG).show();
        //     }
        //  }); -->
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}

