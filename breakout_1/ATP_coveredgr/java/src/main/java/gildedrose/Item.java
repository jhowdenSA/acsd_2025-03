package gildedrose;

public class Item {

    public String name;

    public int sellWithinDays;

    public int quality;

    public Item(String name, int sellWithinDays, int quality) {
        this.name = name;
        this.sellWithinDays = sellWithinDays;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellWithinDays + ", " + this.quality;
    }
}
