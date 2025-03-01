import java.util.ArrayList;
import java.util.List;

public class Station {
    private String StationName;
    private List<Platform> platformList;

    public Station(String stationName) {
        this.StationName = stationName;
        this.platformList = new ArrayList<>();
    }

    public List<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(List<Platform> platformList) {
        this.platformList = platformList;
    }

    public String getStationName() {
        return StationName;
    }

    public void setStationName(String stationName) {
        StationName = stationName;
    }

    @Override
    public String toString() {
        return "Station{" +
                "StationName='" + StationName + '\'' +
                '}';
    }
}
