package lesson5.task5.presentPackage;

public class Package {
    private PackageType packageType;
    private double price;
    private PackageColor packageColor;

    @Override
    public String toString() {
        return "Package:\n" +
                "Package Type " + packageType + "\n" +
                "Price " + price + "\n" +
                "Package Color " + packageColor + "\n";
    }

    private boolean isPriseValueValid(double prise) {
        return prise > 0;
    }

    public Package(PackageType packageType, double prise, PackageColor packageColor) {
        this.packageType = packageType;
        this.price = prise;
        if (!isPriseValueValid(prise)) {
            throw new IllegalArgumentException("Prise: " + prise + " is below zero");
        }
        this.packageColor = packageColor;
    }

    public PackageColor getPackageColor() {
        return packageColor;
    }

    public void setPackageColor(PackageColor packageColor) {
        this.packageColor = packageColor;
    }

    public PackageType getPackageType() {
        return packageType;
    }

    public void setPackageType(PackageType packageType) {
        this.packageType = packageType;
    }

    public double getPrise() {
        return price;
    }

    public void setPrise(double prise) {
        this.price = prise;
    }


}
