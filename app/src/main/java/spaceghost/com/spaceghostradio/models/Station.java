package spaceghost.com.spaceghostradio.models;

/**
 * Created by spaceghost-mac on 19-09-16.
 */
public class Station {
  final String DRAWABLE = "drawable/";
  private String stationTitle;
  private String imageUri;


  public Station(String stationTitle, String imageUri) {
    this.stationTitle = stationTitle;
    this.imageUri = imageUri;
  }

  public String getStationTitle() {
    return stationTitle;
  }

  public String getImageUri() {
    return imageUri;
  }


}
