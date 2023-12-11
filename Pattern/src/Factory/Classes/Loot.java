package Factory.Classes;

public abstract class Loot {
    private int numbCells;
    private int Weight;

    public int getNumbCells() {
        return numbCells;
    }

    public void setNumbCells(int numbCells) {
        this.numbCells = numbCells;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }
}
