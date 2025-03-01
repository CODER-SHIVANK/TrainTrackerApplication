public class Train {
    private String TrainName;
    private int TrainNumber;
    private String TrainType;

    public Train(String trainName, int trainNumber, String trainType) {
        this.TrainName = trainName;
        this.TrainNumber = trainNumber;
        this.TrainType = trainType;
    }

    public String getTrainType() {
        return TrainType;
    }

    public int getTrainNumber() {
        return TrainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        TrainNumber = trainNumber;
    }

    public void setTrainType(String trainType) {
        TrainType = trainType;
    }

    public String getTrainName(){
        return TrainName;
    }

    public void setTrainName(String newTrainName){
        TrainName = newTrainName;
    }

    @Override
    public String toString() {
        return "Train{" +
                "TrainName='" + TrainName + '\'' +
                ", TrainNumber=" + TrainNumber +
                ", TrainType='" + TrainType + '\'' +
                '}';
    }
}
