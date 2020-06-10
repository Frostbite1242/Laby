package cof;

public class Arabica extends cof.Coffee{
    public Arabica(double weight, double price, int quality, String packageType, double size) {
        super(weight, price, quality, packageType, size);
    }
    public String toString() {
        return "Arabica"+super.toString();
    }
}
