// Copyright Grachev Alexander

package Lab1;

public class Complex {
    // Формула комплексного числа (a + bi)
    private double whole;  // a
    private double odds;   // b

    public Complex() {
        whole = 0;
        odds = 0;
    }

    public Complex(double whole) {
        this.whole = whole;
        odds = 0;
    }

    public Complex(double whole, double odds) {
        this.whole = whole;
        this.odds = odds;
    }

    public Complex(Complex x) {
        whole = x.whole;
        odds = x.odds;
    }

    // Сложение по формуле (a + c) + (b + d)i
    public void addComplex(Complex x) {
        this.whole += x.whole;
        this.odds += x.odds;
    }

    public void addComplex(double x) {
        this.whole += x;
    }

    // Вычитание по формуле (a - c) + (b - d)i
    public void subComplex(Complex x) {
        this.whole -= x.whole;
        this.odds -= x.odds;
    }

    public void subComplex(double x) {
        this.whole -= x;
    }

    // Умножение по формуле (ac - bd) + (ad + bc)i
    public void multComplex(Complex x) {
        this.whole = this.whole * x.whole - this.odds * x.odds;
        this.odds = this.whole * x.odds + x.whole * this.odds;
    }

    public void multComplex(double x) {
        this.whole *= x;
        this.odds *= x;
    }

    // Деление по формуле (ac + bd)/(c^2 +d^2) + (bc - ad)/(c^2 +d^2)i
    public void divComplex(Complex x) {
        if (Math.pow(x.whole, 2) + Math.pow(x.odds, 2) == 0) {
            System.out.println("Error 1");
        }
        else {
            this.whole = (this.whole * x.whole + this.odds * x.odds) / (Math.pow(x.whole, 2) + Math.pow(x.odds, 2));
            this.odds = (this.odds * x.whole - this.whole * x.odds) / (Math.pow(x.whole, 2) + Math.pow(x.odds, 2));
        }
    }

    public void divComplex(double x) {
        if (x == 0) {
            System.out.println("Error 1");
        }
        else {
            this.whole /= x;
            this.odds /= x;
        }
    }

    public void printComplex() {
        if (this.odds != 0){
            System.out.print(this.whole + " + " + this.odds + "i");
        }
        else {
            System.out.print(this.whole);
        }
    }
}
