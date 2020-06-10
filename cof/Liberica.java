package cof;

public class Liberica extends cof.Coffee {
    public Liberica(double weight, double price, int quality, String packageType, double size) {
        super(weight, price, quality, packageType, size);
    }
    public String toString() {
        return "Liberica"+super.toString();
    }
}
