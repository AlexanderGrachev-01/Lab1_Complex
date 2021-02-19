package Lab1;

public class Complex {
    private double whole;
    private double odds;

    public Complex() {
        whole = 0;
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

    public void addComplex(Complex x) {
        this.whole += x.whole;
        this.odds += x.odds;
    }

    public void subComplex(Complex x) {
        this.whole -= x.whole;
        this.odds -= x.odds;
    }

    public void multComplex(Complex x) {
        this.whole *= x.whole;
        this.odds *= x.odds;
    }

    public void divComplex(Complex x) {
        if (x.whole == 0 ||x.odds == 0) {
            System.out.println("error 1");
        }
        else {
            this.whole /= x.whole;
            this.odds /= x.odds;
        }
    }

    public void printComplex() {
        if (this.odds != 0){
            System.out.println(this.whole + " + " + this.odds + "i");
        }
        else {
            System.out.println(this.whole);
        }
    }
}
