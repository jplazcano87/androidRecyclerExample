package spaceghost.com.spaceghostradio.services;

import java.util.ArrayList;

import spaceghost.com.spaceghostradio.models.Station;

/**
 * Created by spaceghost-mac on 19-09-16.
 */
public class DataService {

  private static DataService ourInstance = new DataService();

  public static DataService getInstance() {
    return ourInstance;
  }

  private DataService() {
  }

  public ArrayList<Station> getFeaturedStations(){
    ArrayList<Station> stationsArrayList = new ArrayList<>();
    stationsArrayList.add(new Station("Flight Plan (tunes for traveling)","flightplanmusic"));
    stationsArrayList.add(new Station("Two-Wheelin' (biking playlist)","bicyclemusic"));
    stationsArrayList.add(new Station("Kids Jams' (music for childens)","kidsmusic"));

    return  stationsArrayList;
  }
  public ArrayList<Station> getRecentStations(){
    ArrayList<Station> stationsArrayList = new ArrayList<>();
    stationsArrayList.add(new Station("Flight Plan (tunes for traveling)","flightplanmusic"));
    stationsArrayList.add(new Station("Two-Wheelin' (biking playlist)","bicyclemusic"));
    stationsArrayList.add(new Station("Kids Jams' (music for childens)","kidsmusic"));

    return  stationsArrayList;
  }
  public ArrayList<Station> getPartyStations(){
    ArrayList<Station> stationsArrayList = new ArrayList<>();
    stationsArrayList.add(new Station("Flight Plan (tunes for traveling)","flightplanmusic"));
    stationsArrayList.add(new Station("Two-Wheelin' (biking playlist)","bicyclemusic"));
    stationsArrayList.add(new Station("Kids Jams' (music for childens)","kidsmusic"));

    return  stationsArrayList;
  }
}
