package testing;

public class Triangulo {

    public double a;
    public double b;
    public double c;

    public double area () {
        double p = (a + b + c) / 2.0;
        double result = Math.sqrt(p * (p - a));
        return p;
    }
}
