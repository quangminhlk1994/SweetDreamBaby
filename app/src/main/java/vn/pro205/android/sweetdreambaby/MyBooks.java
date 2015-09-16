package vn.pro205.android.sweetdreambaby;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import vn.pro205.android.sweetdreambaby.Adapters.MyBooksAdapter;

public class MyBooks extends android.app.ListFragment implements RatingBar.OnRatingBarChangeListener{
TextView txtValue;
    public MyBooks() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment//
        //aaa
        String [] books= {"Test1","Test2","Test3","Test4","Test5","Test6"};
        int [] image = {R.drawable.lordofring,R.drawable.lordofring,R.drawable.xmenfirstclass,R.drawable.xmenfirstclass,R.drawable.lordofring,R.drawable.xmenfirstclass};
        MyBooksAdapter adapter = new MyBooksAdapter(getActivity(),books,image);
        setListAdapter(adapter);

        View view = inflater.inflate(R.layout.activity_my_books, container, false);
        //  FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.btnadd);
        //   fab.setOnClickListener(new View.OnClickListener() {
        //      @Override
        //     public void onClick(View v) {
        //         Toast.makeText(getActivity(), "TTEst", Toast.LENGTH_LONG).show();
        //     }
        //  }); -->

        txtValue = (TextView) view.findViewById(R.id.txtRatingValue);
        RatingBar ratingBar = (RatingBar) view.findViewById(R.id.ratingBar);
        ratingBar.setOnRatingBarChangeListener(this);


    return view;

    }



    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

        txtValue.setText(String.valueOf(rating));

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}

