package vn.pro205.android.sweetdreambaby.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import vn.pro205.android.sweetdreambaby.R;

/**
 * Created by nguye_000 on 15/09/2015.
 */
public class MyBooksAdapter extends ArrayAdapter<String>

{
    String [] books;
    int [] image;

    public MyBooksAdapter(Activity context, String [] books, int [] image) {
        super(context,R.layout.custom_items_list_adapter,books);
        this.image = image;
        this.books = books;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_items_list_adapter, parent, false);
        }
        // Lookup view for data population
        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.imageView);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.txtTitle);
        TextView txtAuthor = (TextView) convertView.findViewById(R.id.txtAuthor);
        Button btnBuy = (Button) convertView.findViewById(R.id.btnBuy);
        // Populate the data into the template view using the data object
        imgIcon.setImageResource((image[position]));
        txtTitle.setText(books[position]);
        txtAuthor.setText(books[position]);
        btnBuy.setText("buy");
                // Return the completed view to render on screen
        return convertView;
    }
}
