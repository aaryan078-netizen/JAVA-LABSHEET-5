public class ShapeMain {
    public static void main(String[] args) { Shape[] shapes={new Circle("Circle",3),new Rectangle("Rectangle",4,5)}; new ShapeManager().displayAreas(shapes); }
}
class Shape { protected String name; Shape(String name){this.name=name;} void displayShapeName(){System.out.println("Shape: "+name);} }
class Circle extends Shape { private double radius; Circle(String name,double radius){super(name);this.radius=radius;} double calculateArea(){return Math.PI*radius*radius;} }
class Rectangle extends Shape { private double length,width; Rectangle(String name,double length,double width){super(name);this.length=length;this.width=width;} double calculateArea(){return length*width;} }
class ShapeManager { void displayAreas(Shape[] shapes){for(int i=0;i<shapes.length;i++){Shape s=shapes[i];s.displayShapeName();if(s instanceof Circle)System.out.printf("Area: %.2f%n",((Circle)s).calculateArea());else if(s instanceof Rectangle)System.out.printf("Area: %.2f%n",((Rectangle)s).calculateArea());}} }
