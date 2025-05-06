public class Circle {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    public void displayInfo() {
        System.out.println("Koło o promieniu: " + radius);
        System.out.println("Obwód: " + calculatePerimeter());
        System.out.println("Pole: " + calculateArea());
    }
}