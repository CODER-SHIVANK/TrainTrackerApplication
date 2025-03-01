public class Platform {
    private int PlatformNumber;
    private Train train;

    public int getPlatfrmNumber() {
        return PlatformNumber;
    }

    public void setPlatfrmNumber(int platformNumber) {
        PlatformNumber = platformNumber;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Platform(int platformNumber) {
        this.PlatformNumber = platformNumber;

    }

    @Override
    public String toString() {
        return "Platform{" +
                "PlatformNumber=" + PlatformNumber +
                '}';
    }
}