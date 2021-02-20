// Copyright Grachev Alexander

package Lab1;

public class Main {
    public static void main(String[] args) {
        Complex a = new Complex(23.8, 1);
        Complex b = new Complex(2, 1);
        b.multDoubleComplex(3);
        a.divComplex(b);

        b.printComplex();
    }
}
