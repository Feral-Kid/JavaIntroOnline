package lesson5.task5.sweets;

public class Lollipop extends Sweets {
    private int lollipopCount;

    @Override
    public void add(double countToAdd) {
        int newCount = lollipopCount + (int)countToAdd;
        if (newCount < 1)
            throw new IllegalArgumentException("New count: " + newCount + " is below zero");
        this.lollipopCount = newCount;
    }

    public Lollipop(double sugar, String manufacture, String lollipopName, double unitPrice) {
        super(sugar, manufacture, lollipopName, unitPrice);
        this.lollipopCount = 1;
    }

    public int getCount() {
        return this.lollipopCount;
    }


    @Override
    public double calculatePrice() {
        return lollipopCount * price;
    }

    @Override
    public String getInfoAboutSweet() {
        return "Lollipop:\n" + super.getInfoAboutSweet() +
                "lollipop count: " + this.lollipopCount + "\n";
    }
}
