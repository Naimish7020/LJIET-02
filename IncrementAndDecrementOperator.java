public class IncrementAndDecrementOperator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a);// pre increment.
        System.out.println(a++);// post increment.
        a++;// post increment.
        ++a;// pre increment.
        System.out.println(a);
        int b = a++;
        System.out.println(b);
        System.out.println(a);
        int c = 23;
        int d = 20;
        --c;// pre decrement.
        d--;// post decrement.
        System.out.println(d--);
        System.out.println(d--);
        System.out.println(d);
        System.out.println(c);

    }
}
