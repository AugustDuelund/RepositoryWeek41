package Task2;

public class Room {
    Wall wall;
    int doors;
    int lamps;
    int windows;

    public Room(Wall wall, int doors, int lamps, int windows) {
        this.wall = wall;
        this.doors = doors;
        this.lamps = lamps;
        this.windows = windows;
    }

    public Wall getWall() {
        return wall;
    }

    public int getDoors() {
        return doors;
    }

    public int getLamps() {
        return lamps;
    }

    public int getWindows() {
        return windows;
    }
}

