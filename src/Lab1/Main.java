// Copyright Grachev Alexander

package Lab1;

public class Main {
    public static void main(String[] args) {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(2, 1);

        b.addComplex(a);
        b.printComplex();
        System.out.println();
        System.out.println();

        Matrix matrix1 = new Matrix(3, 3, a);
        System.out.println("Matrix1");
        matrix1.print();

        Matrix matrix2 = new Matrix(3, 3, new Complex(1, 1));
        System.out.println("Matrix2");
        matrix2.print();

        matrix1.add(matrix2);
        System.out.println("Matrix result");
        matrix1.print();


    }
}
