public class Main {
    public static void main(String[] args) {
        Main m = new Main(1.0, 2.0, 3.0);
        System.out.println(m.getX() + " " + m.getY() + " " + m.getZ());
        System.out.println(m.toString());
        System.out.println(m.getMagnitude());
    }
    double x;
    double y;
    double z;
    public Main (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public String toString() {
        String roundedX = String.format("%.2f", x);
        String roundedY = String.format("%.2f", y);
        String roundedZ = String.format("%.2f", z);
        return "(" + roundedX + ", " + roundedY + ", " + roundedZ + ")";
    }
    public double getMagnitude() {
        return Math.sqrt(x*x + y*y + z*z);
    }
}