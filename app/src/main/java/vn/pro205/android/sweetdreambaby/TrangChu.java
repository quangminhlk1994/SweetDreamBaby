package vn.pro205.android.sweetdreambaby;


import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import org.eazegraph.lib.charts.BarChart;
import org.eazegraph.lib.communication.IOnBarClickedListener;
import org.eazegraph.lib.models.BarModel;


public class TrangChu extends Fragment {

    public TrangChu() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment//
        //aaa





        //Button
        View view = inflater.inflate(R.layout.activity_trang_chu, container, false);
        mBarChart = (BarChart) view.findViewById(R.id.barchart);

        mBarChart.setOnBarClickedListener(new IOnBarClickedListener() {
            @Override
            public void onBarClicked(int _Position) {
                Log.d("BarChart", "Position: " + _Position);
            }
        });

        loadData();
        //Spinner Thang
        Spinner spinner = (Spinner)view.findViewById(R.id.spnThang);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.spnThang_array, android.R.layout.simple_spinner_item); // Create an ArrayAdapter using the string array and a default spinner layout
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Specify the layout to use when the list of choices appears
        spinner.setAdapter(adapter);
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
    public void onResume() {
        super.onResume();
        mBarChart.startAnimation();
    }


    public void restartAnimation() {
        mBarChart.startAnimation();
    }


    public void onReset() {

    }

    private void loadData() {
        mBarChart.addBar(new BarModel("Tong", Tong, Color.parseColor("#F44336")));
        mBarChart.addBar(new BarModel("Thu", 30000, Color.parseColor("#673AB7")));
        mBarChart.addBar(new BarModel("Chi", 15000, Color.parseColor("#009688")));


    }
    private int Tong;
    private BarChart mBarChart;
}

