import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem {
    private Map<String, Station> stations = new HashMap<>();
    private Map<Integer, Train> trains = new HashMap<>();
    private List<Schedule> schedules = new ArrayList<>();

    public void addStations(Station station)
    {
        stations.put(station.getStationName(), station);
    }
    public void addTrains(Train train)
    {
        trains.put(train.getTrainNumber(), train);
    }
    public void addSchedule(Schedule schedule)
    {
        schedules.add(schedule);
    }
    public List<Schedule> findMyTrains(String startStationName, String endStationName)
    {
        List<Schedule>res = new ArrayList<>();
        for(Schedule schedule : schedules)
        {
            if(schedule.getStation().getStationName().equals(startStationName) || schedule.getStation().getStationName().equals(endStationName))
            {
                res.add(schedule);
            }
            else
            {
                System.out.println("No train found between these stations");
                System.exit(0);
            }
        }
        return res;
    }

}
