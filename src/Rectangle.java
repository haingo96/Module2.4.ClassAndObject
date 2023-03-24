public class Rectangle {
    double width;
    double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return this.width + this.height + this.width + this.height;
    }

    public String display() {
        return String.format("Rect(width = %s, height = %s)", this.width, this.height);
    }
}
