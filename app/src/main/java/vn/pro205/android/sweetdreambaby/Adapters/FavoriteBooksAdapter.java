package vn.pro205.android.sweetdreambaby.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import vn.pro205.android.sweetdreambaby.R;

/**
 * Created by nguye_000 on 16/09/2015.
 */
public class FavoriteBooksAdapter extends RecyclerView.Adapter<FavoriteBooksAdapter.ViewHolder> {

    List<ItemsBook> items;

    public FavoriteBooksAdapter (){
        super();
        items = new ArrayList<ItemsBook>();
        ItemsBook item = new ItemsBook();
        item.setTitleBook("Iron Man");
        item.setTypeBook("Free");
        item.setImage(R.drawable.ironman2);
        items.add(item);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.custom_cardview_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        ItemsBook item = items.get(i);
        viewHolder.txtTiltle.setText(item.getTitleBook());
        viewHolder.txtType.setText(item.getTypeBook());
        viewHolder.imgCardView.setImageResource(item.getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgCardView;
        public TextView txtTiltle;
        public TextView txtType;

        public ViewHolder(View itemView) {
            super(itemView);
            imgCardView = (ImageView)itemView.findViewById(R.id.imgCardView);
            txtTiltle = (TextView)itemView.findViewById(R.id.txtTitleBookFavorites);
            txtType = (TextView)itemView.findViewById(R.id.txtTypeBookFavorites);
        }
    }
}
