abstract class Shape
 {
abstract  void area(int a ,int b);
  }
class Traingle extends Shape
{

       void area(int base,int altitude)
	   {
        System.out.println("Area of Triangle is : " + 0.5*base*altitude);
       }
}
class Rectangle extends Shape
{
      void area(int length,int breadth)
	  {
        System.out.println("Area of Rectangle is : " + length*breadth);
    }
}
class Circle extends Shape
{
    void area(int radius,int radius2)
	{
        System.out.println("Area of Circle is : " + 3.14*radius*radius2);
    }
}
class AbstractDemo
{
    public static void main(String[] args) 
	{
        Shape s = new Traingle();
        s.area(50,80);

        s = new Rectangle();
        s.area(55,45);

        s = new Circle();
        s.area(7,9);
    }
}

