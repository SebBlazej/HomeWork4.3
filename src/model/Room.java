package model;

public class Room {
    private double roomArea;
    private final int tempLimit = 17;
    private AirConditioner airConditioner;
    private double actualTemp;

    Room(){

    }

    public Room(double roomArea, double actualTemp){
        this.roomArea = roomArea;
        this.actualTemp = actualTemp;
    }

    public Room(double roomArea, double actualTemp, AirConditioner airConditioner) {
        this.roomArea = roomArea;
        this.actualTemp = actualTemp;
        this.airConditioner = airConditioner;
    }

    public void decreaseTemp(){
        if(checkIfCanChangeTemp()) {
            this.actualTemp = this.actualTemp - countTempChangeValue();
        }
    }

    private boolean checkIfCanChangeTemp(){
        return isAirConditioner() && (actualTemp - countTempChangeValue() > tempLimit);
    }

    public double countTempChangeValue(){
        return (isAirConditioner())?1*airConditioner.countPerformanceValue(this.roomArea):0;
    }

    private boolean isAirConditioner(){
        return airConditioner != null;
    }

    public double getActualTemp() {
        return actualTemp;
    }
}
