package com.example.delmastourguide.ui.main;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.delmastourguide.R;
import com.example.delmastourguide.TourGuideItem;
import java.util.ArrayList;



public class TourGuideItemViewAdapter extends ArrayAdapter<TourGuideItem> {

    private int ItemBackColor;

    public TourGuideItemViewAdapter(Activity context, ArrayList<TourGuideItem> tourItems,int ColorID) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, tourItems);
        ItemBackColor = ColorID;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        TourGuideItem currentItem = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.item_name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentItem.getName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.item_address);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        addressTextView.setText(currentItem.getLocation().getAddress());

        TextView gpsTextView = (TextView) listItemView.findViewById(R.id.item_gps);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        gpsTextView.setText(currentItem.getLocation().getGps());


        ImageView myimage = (ImageView) listItemView.findViewById(R.id.item_image);

        LinearLayout rootLayout = (LinearLayout) listItemView.findViewById(R.id.root_layout);

        rootLayout.setBackgroundColor(listItemView.getResources().getColor(ItemBackColor));

        if (currentItem.getImageResourceId()==0) {
            myimage.setVisibility(View.GONE);
        }
        else
        {
            myimage.setVisibility(View.VISIBLE);
            myimage.setImageResource(currentItem.getImageResourceId());
        }


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }


}
