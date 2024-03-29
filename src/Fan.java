public class Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.on = true;

        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(10);

        System.out.println(fan1);
        System.out.println(fan2.toString());
    }

    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
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

    public Fan() {

    }

    @Override
    public String toString() {
        if (this.on) {
            return String.format("speed: %s, color: %s, radius: %s\nfan is on", this.speed, this.color, this.radius);
        } else {
            return "fan is off";
        }
    }
}
