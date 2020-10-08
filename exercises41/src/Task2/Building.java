package Task2;

import java.util.ArrayList;

public class Building {
    final int Room;
    int bathroom;
    int floors;
    boolean officeBuilding;
    ArrayList<Room> allRooms;


    public Building(int room, int bathroom, int floors, boolean officeBuilding,ArrayList<Room> allRooms) {
        Room = room;
        this.bathroom = bathroom;
        this.floors = floors;
        this.officeBuilding = officeBuilding;
        this.allRooms = allRooms;

    }

    public int getRoom() {
        return Room;
    }

    public int getBathroom() {
        return bathroom;
    }

    public int getFloors() {
        return floors;
    }

    public boolean isOfficeBuilding() {
        return officeBuilding;
    }
}
