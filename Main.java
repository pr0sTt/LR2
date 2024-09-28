//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static long l = 123456;
    static double d1, d2;
    static float f = 14.75f;
    char c1 = '0';
    public static void main(String[] args) {
        l = Math.round(f);
        d1 = (Math.random() * (1000-100)) + 100;
        d2 = (Math.random() * (99-1)) + 1;
        System.out.println("l = " + l);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        double y = Math.sin(d1) * Math.sin(d2) - (Math.atan(d1)/Math.atan(d2));
        System.out.println("y = " + y);
    }
}