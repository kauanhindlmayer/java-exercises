public class Door {
    boolean opened;
    String color;
    int dimensionX;
    int dimensionY;
    int dimensionZ;

    public Door(boolean opened, String color, int dimensionX, int dimensionY, int dimensionZ) {
        this.opened = opened;
        this.color = color;
        this.dimensionY = dimensionY;
        this.dimensionX = dimensionX;
        this.dimensionZ = dimensionZ;
    }

    void open() {
        if(!opened) {
            System.out.println("The door was opened");
            this.opened = true;
        } else {
            System.out.println("The door was open");
        }
    }

    void close() {
        if(opened) {
            System.out.println("The door was closed");
            this.opened = false;
        } else {
            System.out.println("The door was close");
        }
    }

    void paint() {
        System.out.println("Painting the door");
    }

    boolean isOpen() {
        return opened;
    }

}
