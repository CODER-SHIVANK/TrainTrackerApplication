public class Schedule {
    private Train train;
    private Station station;
    private String ArrivalTime;
    private String DepartureTime;
    private Platform platform;

    public Schedule(Train train, Station station, String arrivalTime, String departureTime, Platform platform) {
        this.train = train;
        this.station = station;
        this.ArrivalTime = arrivalTime;
        this.DepartureTime = departureTime;
        this.platform = platform;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String departureTime) {
        DepartureTime = departureTime;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "train=" + train +
                ", station=" + station +
                ", ArrivalTime=" + ArrivalTime +
                ", DepartureTime=" + DepartureTime +
                ", platform=" + platform +
                '}';
    }
}

