package OOP.baitap;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private boolean on;
    private int speed;
    private double radius;
    private String color;
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(getFAST());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan1.toString(fan1.isOn());

        Fan fan2 = new Fan();
        fan2.setSpeed(getMEDIUM());
        fan2.setRadius(5);
        fan2.setColor("black");
        fan2.setOn(false);
        fan2.toString(fan2.isOn());
    }
    public Fan() {
        this.speed = Fan.SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public void toString(boolean on) {
        if (on) {
            System.out.println("Fan is on");
            System.out.println("Speed: " + getSpeed());
            System.out.println("Color: " + getColor());
            System.out.println("Radius: " + getRadius());
        }
        else {
            System.out.println("\nFan is off");
            System.out.println("Speed: " + getSpeed());
            System.out.println("Color: " + getColor());
            System.out.println("Radius: " + getRadius());
        }
    }
    public static int getSLOW() {
        return SLOW;
    }
    public static int getMEDIUM() {
        return MEDIUM;
    }
    public static int getFAST() {
        return FAST;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return this.on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
class demoFan {
    public static void main(String[] args) {
        Fan fan = new Fan();
//        fan.setSpeed(2);
        System.out.println(fan.getSpeed());
    }
}