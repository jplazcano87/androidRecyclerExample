package spaceghost.com.spaceghostradio.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import spaceghost.com.spaceghostradio.R;
import spaceghost.com.spaceghostradio.adapters.StationsAdapter;
import spaceghost.com.spaceghostradio.services.DataService;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StationsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StationsFragment extends Fragment {

  private static final String ARG_STATION_TYPE= "station_type";
  private int mStationType;


  enum StationType {
    STATION_TYPE_FEATURED, STATION_TYPE_RECENT, STATION_TYPE_PARTY;

  }

  public static StationsFragment newInstance(int stationType) {
    StationsFragment fragment = new StationsFragment();
    Bundle args = new Bundle();
    args.putInt(ARG_STATION_TYPE, stationType);
    fragment.setArguments(args);
    return fragment;
  }

  public StationsFragment() {
    // Required empty public constructor
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments() != null) {
      mStationType = getArguments().getInt(ARG_STATION_TYPE);
    }
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_stations, container, false);
    RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_stations);
    recyclerView.setHasFixedSize(true);
    StationsAdapter stationsAdapter = new StationsAdapter();
    StationType stationType = StationType.values()[mStationType];

    switch (stationType){

      case STATION_TYPE_FEATURED:
        stationsAdapter = new StationsAdapter(DataService.getInstance().getFeaturedStations());
        break;
      case STATION_TYPE_RECENT:
        stationsAdapter = new StationsAdapter(DataService.getInstance().getRecentStations());
        break;
      case STATION_TYPE_PARTY:
        stationsAdapter = new StationsAdapter(DataService.getInstance().getPartyStations());
        break;
    }

    recyclerView.setAdapter(stationsAdapter);
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
    linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
    recyclerView.setLayoutManager(linearLayoutManager);
    return view;
  }

}
