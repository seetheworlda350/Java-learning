public class Trapezoid {
    public static void main(String[] args) {
        int Base1 = 3;
        int Base2 = 8;
        int Height = 7;

        int x = Base1;
        int y = Base2;
        int z = Height;

        x += y;
        z *= x;
        z /= 2;

        System.out.println("The area of your trapezoid is " + z);
    }
}