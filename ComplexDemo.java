class Complex {
    private int Real;
    private int Imaginary;

    public Complex(int Real, int Imaginary) {
        this.Real = Real;
        this.Imaginary = Imaginary;
    }

    public int getReal() {
        return Real;
    }

    public int getImaginary() {
        return Imaginary;
    }

    public void setReal(int Real) {
        this.Real = Real;
    }

    public void setImaginary(int Imaginary) {
        this.Imaginary = Imaginary;
    }

    public void print() {
        if (Imaginary > 0) {
            System.out.print(Real + "  + " + "i" + Imaginary);
        } else {
            System.out.print(Real + " - " + " i" + -Imaginary);
        }

        System.out.println();
    }

    public void add(Complex c) {
        this.Real = this.Real + c.Real;
        this.Imaginary = this.Imaginary + c.Imaginary;
    }

    public void multiply(Complex c) {
        int newImaginary1 = (this.Real * c.Imaginary) + (this.Imaginary * c.Real);
        this.Real = (this.Real * c.Real) - (this.Imaginary * c.Imaginary);
        this.Imaginary = newImaginary1;
    }

    public static Complex add(Complex c1, Complex c2) {
        int newReal = c1.Real + c2.Real;
        int newImaginary = c1.Imaginary + c2.Imaginary;
        Complex c = new Complex(newReal, newImaginary);
        return c;
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        c1.print();
        c1.setReal(10);
        c1.setImaginary(30);
        c1.print();
        Complex c2 = new Complex(1, 5);
        c1.add(c2);
        c1.print();
        c2.print();
        Complex c3 = new Complex(3, 2);
        c3.multiply(c2);
        c3.print();
        c2.print();
        Complex c4 = Complex.add(c1, c3);
        c4.print();
        c1.print();
        c3.print();

    }
}
