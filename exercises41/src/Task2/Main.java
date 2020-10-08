package Task2;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args){
    Room room = new Room(new Wall(4),6,6,3);
    Room room1 = new Room(new Wall(4),2,3,4);
    Room room2 = new Room(new Wall(4),4,3,5);

    ArrayList<Room> rooms = new ArrayList<>();
            rooms.add(room);
            rooms.add(room1);
            rooms.add(room2);

    Building building = new Building(3,3,5,true, rooms);

        System.out.println("Total amount of lamps " + (room.getLamps() + room1.getLamps() + room2.getLamps()));
    if (building.getFloors() > building.getRoom() ){
        System.out.println("This is an odd building");
    }


    }

}
