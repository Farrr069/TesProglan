// package modul2;

// public class Messycode {
//     public double r;

//     public Messycode(double radius){
//         this.r = radius;
//     }

//     public static void main(String[] args){
//         Messycode circle = new Messycode(2.5)
//         double area;
//         area = 3.14 * circle.r;
//         System.out.println("Radius: " + circle.r);
//         System.out.println("Area: " + area);
//     }
    
// }

package modul2;

public class Circle {
    private double radius;
    public static final double PHI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PHI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        double area = circle.getArea();
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " +area);
}
}
