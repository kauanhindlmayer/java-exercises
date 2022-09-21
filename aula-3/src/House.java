public class House {
    String color;
    Door door1;
    Door door2;
    Door door3;

    public House(String color, Door door1, Door door2, Door door3) {
        this.color = color;
        this.door1 = door1;
        this.door2 = door2;
        this.door3 = door3;
    }

    void paint() {
        System.out.println("Painting the house");
    }

    int howManyDoorsAreOpen() {
        int amount = 0;
        if(door1.isOpen()) amount++;
        if(door2.isOpen()) amount++;
        if(door3.isOpen()) amount++;
        return amount;
    }
}
