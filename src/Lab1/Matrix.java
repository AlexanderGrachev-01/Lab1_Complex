// Copyright Grachev Alexander

package Lab1;

public class Matrix {
    private int xSize, ySize;
    private Complex [][] vals;

    public Matrix(int size) {
        xSize = size;
        ySize = size;
        vals = new Complex [size][size];
    }

    public Matrix(int xSize, int ySize) {
        this.xSize = xSize;
        this.ySize = ySize;
        vals = new Complex[ySize][xSize];
    }

    public Matrix(int xSize, int ySize, Complex val) {
        this.xSize = xSize;
        this.ySize = ySize;
        vals = new Complex[ySize][xSize];
        for(int i = 0; i < ySize; i++)
            for(int j = 0; j < xSize; j++)
                this.vals[i][j] = val;
    }

    public Matrix(Matrix x) {
        xSize = x.xSize;
        ySize = x.ySize;
        vals = x.vals;
    }

    public void setXYVal(int x, int y, Complex val) {
        vals[x][y] = val;
    }

    public  void setXYVal(int x, int y, double val) {
        vals[x][y] = new Complex(val);
    }

    public void print() {
        for(int i = 0; i < ySize; i++) {
            for(int j = 0; j < xSize; j++) {
                vals[i][j].printComplex();
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void add(Matrix x) {
        if (xSize != x.xSize || ySize != x.ySize) {
            System.out.println("Error 2");
        }
        else {
            for(int i = 0; i < ySize; i++)
                for (int j = 0; j < xSize; j++) {
                    vals[i][j].addComplex(x.vals[i][j]);
                }
        }
    }

    public void sub(Matrix x) {
        if (xSize != x.xSize || ySize != x.ySize) {
            System.out.println("Error 2");
        }
        else {
            for(int i = 0; i < ySize; i++)
                for (int j = 0; j < xSize; j++) {
                    vals[i][j].subComplex(x.vals[i][j]);
                }
        }
    }

    public void mult(Matrix x) {
        if (xSize != x.xSize || ySize != x.ySize) {
            System.out.println("Error 2");
        }
        else {
            for(int i = 0; i < ySize; i++)
                for (int j = 0; j < xSize; j++) {
                    vals[i][j].multComplex(x.vals[i][j]);
                }
        }
    }

    public void mult(double x) {
        for(int i = 0; i < ySize; i++)
            for (int j = 0; j < xSize; j++)
                vals[i][j].multComplex(x);
    }

    public void div(Matrix x) {
        if (xSize != x.xSize || ySize != x.ySize) {
            System.out.println("Error 2");
        }
        else {
            for(int i = 0; i < ySize; i++)
                for (int j = 0; j < xSize; j++) {
                    vals[i][j].divComplex(x.vals[i][j]);
                }
        }
    }

    public void div(double x) {
        for(int i = 0; i < ySize; i++)
            for (int j = 0; j < xSize; j++)
                vals[i][j].divComplex(x);
    }
}
