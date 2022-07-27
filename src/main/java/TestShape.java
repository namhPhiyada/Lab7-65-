public class TestShape {

    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
        System.out.println(s1);  // A Circle with radius = 5.5, which is a subclass of A Shape with color of RED and not filled
        System.out.println(s1.getClass().getName()); // Circle
        System.out.println(s1.hashCode()); // 1252169911
        System.out.println(s1.getClass() == Shape.class); // false
        System.out.println(s1.getClass() == Circle.class); // true
        System.out.println(s1 instanceof Shape); // true
        System.out.println(s1 instanceof Circle); // true
        System.out.println(s1.getArea());          // 95.03317777109125
        System.out.println(s1.getPerimeter());     // 34.55751918948772
        System.out.println(s1.getColor()); // RED
        System.out.println(s1.isFilled()); // false
      //System.out.println(s1.getRadius()); //error

         Circle c1 = (Circle) s1;                   // Downcast back to Circle
        System.out.println(c1); //A Circle with radius= 5.5, which is a subclass of yyyA Shape with color of RED and not filled
        System.out.println(c1.hashCode());//245257410
        System.out.println(c1.getClass().getName());//Circle
        System.out.println(c1 instanceof Shape);//true
        System.out.println(c1 instanceof Circle);//true
        System.out.println(c1.getArea());//95.03317777109125
        System.out.println(c1.getPerimeter());//34.55751918948772
        System.out.println(c1.getColor());//RED
        System.out.println(c1.isFilled());//false
 //     //  System.out.println(c1.getRadius());//error

//        //   Shape s2 = new Shape();
           Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast
        System.out.println(s3);//A Rectangle with width=1.0 and length=2.0, which is a subclass of yyyA Shape with color of RED and not filled
        System.out.println(s3.hashCode());//1283928880
        System.out.println(s3.getClass().getName());//Rectangle
        System.out.println(s3 instanceof Shape);//true
        System.out.println(s3 instanceof Rectangle);//true
        System.out.println(s3.getArea());//2.0
        System.out.println(s3.getPerimeter());//4.0
        System.out.println(s3.getColor());//RED
//        // System.out.println(s3.getLength());//Error
//
        Rectangle r1 = (Rectangle) s3;   // downcast
        System.out.println(r1);//A Rectangle with width=1.0 and length=2.0, which is a subclass of yyyA Shape with color of RED and not filled
        System.out.println(r1.hashCode());//1283928880
        System.out.println(r1.getClass().getName());//Rectangle
        System.out.println(r1 instanceof Shape);//true
        System.out.println(r1 instanceof Rectangle);//true
        System.out.println(r1.getArea());//2.0
        System.out.println(r1.getColor());//RED
        System.out.println(r1.getLength());//2.0
//
         Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);//A Square with side=6.6, which is a subclass of yyyA Rectangle with width=6.6 and length=6.6, which is a subclass of yyyA Shape with color of red and filled
        System.out.println(s4.hashCode());//1149319664
        System.out.println(s4.getClass().getName());//Square
        System.out.println(s4 instanceof Shape);//true
        System.out.println(s4 instanceof Rectangle);//true
        System.out.println(s4 instanceof Square);//true
        System.out.println(s4.getArea());//43.559999999999995
        System.out.println(s4.getColor());//red
  //   // System.out.println(s4.getSide());//error
//
//// Take note that we downcast Shape s4 to Rectangle, 
////  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);//A Square with side=6.6, which is a subclass of yyyA Rectangle with width=6.6 and length=6.6, which is a subclass of yyyA Shape with color of red and filled
        System.out.println(r2.hashCode());//1149319664
        System.out.println(r2.getClass().getName());//Square
        System.out.println(r2 instanceof Shape);//true
        System.out.println(r2 instanceof Rectangle);//true
        System.out.println(r2 instanceof Square);//true
        System.out.println(r2.getArea());//43.559999999999995
        System.out.println(r2.getColor());//red
    //    System.out.println(r2.getSide());//Error
        System.out.println(r2.getLength());//6.6
//
//// Downcast Rectangle r2 to Square
        Square sq1 = (Square) r2;
        System.out.println(sq1);//A Square with side=6.6, which is a subclass of yyyA Rectangle with width=6.6 and length=6.6, which is a subclass of yyyA Shape with color of red and filled
        System.out.println(sq1.hashCode());//1149319664
        System.out.println(sq1.getClass().getName());//Square
        System.out.println(sq1 instanceof Shape);//true
        System.out.println(sq1 instanceof Rectangle);//true
        System.out.println(sq1 instanceof Square);//true
//     //   System.out.println(sq1 instanceof Circle);
        System.out.println(sq1.getArea());//43.559999999999995
        System.out.println(sq1.getColor());//red
        System.out.println(sq1.getSide());//6.6
        System.out.println(sq1.getLength());//6.6

    }

}
