package cof;

public class Robusta extends cof.Coffee {
    public Robusta(double weight, double price, int quality, String packageType, double size) {
        super(weight, price, quality, packageType, size);
    }
    public String toString() {
        return "Robusta"+super.toString();
    }

}
