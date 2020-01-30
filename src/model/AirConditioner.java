package model;

public class AirConditioner {
    private double roomAreaForGoodPerformance;

    AirConditioner(){

    }

    public AirConditioner(int roomAreaForGoodPerformance){
        this.roomAreaForGoodPerformance = roomAreaForGoodPerformance;
    }

    double countPerformanceValue(double roomSize){
        return  roomAreaForGoodPerformance/roomSize;
    }
}
