import java.util.Scanner;

import javax.swing.plaf.SliderUI;

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            return;
        }
        this.denominator = denominator;
        simplfy();
    }

    public int getnumerator() {
        return numerator;
    }

    public int getdenominator() {
        return denominator;
    }

    public void setnumerator(int numerator) {
        this.numerator = numerator;
        simplfy();
    }

    public void setdemominator(int denominator) {
        if (denominator == 0) {
            return;
        }
        this.denominator = denominator;
        this.simplfy();
    }

    private void simplfy() {
        int gcd = 1;
        int smallest = Math.min(numerator, denominator);
        for (int i = 2; i <= smallest; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public void print() {
        if (denominator == 1) {
            System.out.println(numerator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }

    public void add(Fraction f) {
        this.numerator = this.numerator * f.denominator + f.numerator * this.denominator;
        this.denominator = this.denominator * f.denominator;
        simplfy();
    }

    public void multiply(Fraction f) {
        this.numerator = this.numerator * f.numerator;
        this.denominator = this.denominator * f.denominator;
        simplfy();
    }

    public static Fraction add(Fraction f1, Fraction f2) {
        int newnumerator = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        int newdenominator = f1.denominator * f2.denominator;
        Fraction f = new Fraction(newnumerator, newdenominator);
        return f;
    }
}

public class FractionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction f1 = new Fraction(20, 30);
        f1.print();
        f1.setnumerator(12);
        f1.print();
        System.out.println(f1.getdenominator());
        f1.setnumerator(10);
        f1.setdemominator(30);
        f1.print();
        Fraction f2 = new Fraction(3, 4);
        f2.print();
        f1.add(f2);
        f1.print();
        f2.print();
        Fraction f3 = new Fraction(4, 5);
        f3.print();
        f3.multiply(f2);
        f3.print();
        f2.print();
        Fraction f4 = Fraction.add(f1, f3);
        f4.print();
    }
}
