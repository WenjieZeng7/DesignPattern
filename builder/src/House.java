import lombok.Data;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-13 2:03
 */
public class House {
    private Window window;
    private Door door;
    private Wall wall;

    @Override
    public String toString() {
        return "House{" +
                "window=" + window +
                ", door=" + door +
                ", wall=" + wall +
                '}';
    }


    public static final class HouseBuilder {
        private Window window;
        private Door door;
        private Wall wall;

        public HouseBuilder() {
        }

        public static HouseBuilder aHouse() {
            return new HouseBuilder();
        }

        public HouseBuilder setWindow(Window window) {
            this.window = window;
            return this;
        }

        public HouseBuilder setDoor(Door door) {
            this.door = door;
            return this;
        }

        public HouseBuilder setWall(Wall wall) {
            this.wall = wall;
            return this;
        }

        public House build() {
            House house = new House();
            house.door = this.door;
            house.wall = this.wall;
            house.window = this.window;
            return house;
        }
    }
}
