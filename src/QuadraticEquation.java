public class QuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation equation = new QuadraticEquation(1,3,1);

        double delta = equation.getDiscriminant();

        if (delta > 0) {
            System.out.println(String.format("root 1 = %s, root 2 = %s", equation.getRoot1(delta), equation.getRoot2(delta)));
        }else if (delta == 0) {
            System.out.println(String.format("root = %s", equation.getRoot1(delta)));
        }else {
            System.out.println("No root");
        }
    }
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1(double delta) {
        if (delta >= 0) {
            return (-b + Math.pow(delta, 0.5)) / (2 * a);
        } else {
            return 0;
        }
    }
    public double getRoot2(double delta) {
        if (delta >= 0) {
            return (-b - Math.pow(delta, 0.5)) / (2 * a);
        } else {
            return 0;
        }
    }

}
