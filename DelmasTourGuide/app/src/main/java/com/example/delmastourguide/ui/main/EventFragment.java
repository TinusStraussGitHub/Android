package com.example.delmastourguide.ui.main;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

import com.example.delmastourguide.R;
import com.example.delmastourguide.TourGuideItem;
import com.example.delmastourguide.TourGuideItemLocation;

import java.util.ArrayList;

public class EventFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 4;


    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public EventFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static EventFragment newInstance(int columnCount) {
        EventFragment fragment = new EventFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);

        ArrayList<TourGuideItem> items = CreateItemList();

        TourGuideItemViewAdapter adapter = new TourGuideItemViewAdapter(getActivity(), items, R.color.category_restaurants);

        ListView listView = (ListView) view.findViewById(R.id.list);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TourGuideItem thisItem = (TourGuideItem) adapterView.getItemAtPosition(i);

                final FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(view.getId(), RestaurantFragment.newInstance(mColumnCount), "NewFragmentTag");
                ft.commit();
                ft.addToBackStack(null);
            }

        });

        return view;
    }

    private ArrayList<TourGuideItem> CreateItemList() {
        ArrayList<TourGuideItem> items = new ArrayList<TourGuideItem>();
        items.add(new TourGuideItem("Park Run",new TourGuideItemLocation("54 Sarel Cilliers Street","26°08'56.8\"S 28°41'21.8\"E"),R.drawable.parkrun));
        items.add(new TourGuideItem("Corn Festival",new TourGuideItemLocation("Delmas High School","26°08'56.8\"S 28°41'21.8\"E"),R.drawable.corn));

        return items;
    }
}
