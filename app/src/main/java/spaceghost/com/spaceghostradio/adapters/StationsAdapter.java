package spaceghost.com.spaceghostradio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

import spaceghost.com.spaceghostradio.holders.StationViewHolder;
import spaceghost.com.spaceghostradio.models.Station;

/**
 * Created by spaceghost-mac on 19-09-16.
 */
public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder> {
   private ArrayList<Station> mStations;

  public StationsAdapter(ArrayList<Station> stations) {
    mStations = stations;
  }

  public StationsAdapter() {
  }

  @Override
  public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    return null;
  }

  @Override
  public void onBindViewHolder(StationViewHolder holder, int position) {

  }

  @Override
  public int getItemCount() {
    return 0;
  }
}
