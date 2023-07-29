import java.util.Scanner;

class Complex {
    private int Real;
    private int Imaginary;

    public Complex(int Real, int Imaginary) {
        this.Real = Real;
        this.Imaginary = Imaginary;
    }

    public void add(Complex c) {
        this.Real = this.Real + c.Real;
        this.Imaginary = this.Imaginary + c.Imaginary;
    }

    public void multiply(Complex c) {
        int newReal = (this.Real * c.Real) - (this.Imaginary * c.Imaginary);
        this.Imaginary = (this.Real * c.Imaginary) + (this.Imaginary * c.Real);
        this.Real = newReal;
    }

    public void print() {
        if (Imaginary > 0) {
            System.out.println(Real + " + " + "i" + Imaginary);
        } else {
            System.out.println(Real + " - " + "i" + -Imaginary);
        }
    }

}

public class ComplexNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Real1 = sc.nextInt();
        int Imaginary1 = sc.nextInt();
        int Real2 = sc.nextInt();
        int Imaginary2 = sc.nextInt();
        int choice = sc.nextInt();
        Complex c1 = new Complex(Real1, Imaginary1);
        Complex c2 = new Complex(Real2, Imaginary2);
        if (choice == 1) {
            c1.add(c2);
            c1.print();
        } else if (choice == 2) {
            c1.multiply(c2);
            c1.print();
        } else {

        }
    }
}
