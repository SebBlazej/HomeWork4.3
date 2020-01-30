package app;

import model.AirConditioner;
import model.Room;

public class TestClass {
    public static void main(String[] args){
        AirConditioner airConditioner = new AirConditioner(100);

        Room largerRoom = new Room(120, 20, airConditioner);
        Room perfectRoom = new Room(100, 30, airConditioner);
        Room smallerRoom = new Room(80, 25, airConditioner);

        Room roomWithoutConditioner = new Room(20, 25);

        Room coldRoom = new Room(20, 17, airConditioner);
        Room firstAlmostColdRoom = new Room(100, 17.9, airConditioner);
        Room secondAlmostColdRoom = new Room(100, 18.1, airConditioner);

        System.out.println("Aktualna temperatura większego pokoju to - " + largerRoom.getActualTemp());
        System.out.println("Oczekiwana zmiana temperatury - " + largerRoom.countTempChangeValue());
        largerRoom.decreaseTemp();
        System.out.println("Temperatura większego pokoju po zmianie - " + largerRoom.getActualTemp());
        System.out.println();
        System.out.println("Aktualna temperatura idealnego pokoju to - " + perfectRoom.getActualTemp());
        System.out.println("Oczekiwana zmiana temperatury - " + perfectRoom.countTempChangeValue());
        perfectRoom.decreaseTemp();
        System.out.println("Temperatura idealnego pokoju po zmianie - " + perfectRoom.getActualTemp());
        System.out.println();
        System.out.println("Aktualna temperatura mniejszego pokoju to - " + smallerRoom.getActualTemp());
        System.out.println("Oczekiwana zmiana temperatury - " + smallerRoom.countTempChangeValue());
        smallerRoom.decreaseTemp();
        System.out.println("Temperatura mniejszego pokoju po zmianie - " + smallerRoom.getActualTemp());
        System.out.println();
        System.out.println("Temperatura w pokoju bez klimatyzatora - " + roomWithoutConditioner.getActualTemp());
        System.out.println("Oczekiwana zmiana temperatury - " + roomWithoutConditioner.countTempChangeValue());
        roomWithoutConditioner.decreaseTemp();
        System.out.println("Temperatura pokoju bez klimatyzatora po zmianie - " + roomWithoutConditioner.getActualTemp());
        System.out.println();
        System.out.println("Temperatura zimnego pokoju - " + coldRoom.getActualTemp());
        System.out.println("Oczekiwana zmiana temperatury - " + coldRoom.countTempChangeValue());
        coldRoom.decreaseTemp();
        System.out.println("Temperatura zimnego pokoju po zmianie- " + coldRoom.getActualTemp());
        System.out.println();
        System.out.println("Temperatura pierwszego prawie zimnego pokoju - " + firstAlmostColdRoom.getActualTemp());
        System.out.println("Oczekiwana zmiana temperatury - " + firstAlmostColdRoom.countTempChangeValue());
        firstAlmostColdRoom.decreaseTemp();
        System.out.println("Temperatura pierwszego prawie zimnego pokoju - " + firstAlmostColdRoom.getActualTemp());
        System.out.println();
        System.out.println("Temperatura drugiego prawie zimnego pokoju - " + secondAlmostColdRoom.getActualTemp());
        System.out.println("Oczekiwana zmiana temperatury - " + secondAlmostColdRoom.countTempChangeValue());
        secondAlmostColdRoom.decreaseTemp();
        System.out.println("Temperatura drugiego prawie zimnego pokoju - " + secondAlmostColdRoom.getActualTemp());

    }
}
