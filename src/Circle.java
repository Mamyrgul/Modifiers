public class Circle {
    private static final  double PI=3.14159;
    private int radius;

    public Circle(){}
    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public static void area(int radius){
        double rAdius =  PI * (radius * radius);
        System.out.println("Area: "+rAdius);
    }
    public static void circumference(int radius){
      double circumference= PI * 2 * radius;
        System.out.println("Circumference: "+circumference);
    }
}
