//1011
//1344 Angle Between Hands of a Clock

public class Angle {
    public double angleClock(int hour, int minutes) {
        double ang;
        double m = minutes * 6;
        double h = hour * 30 + minutes * 0.5;
        double diff = Math.abs(m - h);
        if (diff > 180) ang = 360 - diff;
        else ang = diff;
        return ang;
    }

    public static void main(String[] args) {
        Angle a = new Angle();
        System.out.println(a.angleClock(12, 30));
    }
}
