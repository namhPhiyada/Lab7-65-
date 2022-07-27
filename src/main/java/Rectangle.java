public class Rectangle extends Shape{
    protected double width;
    protected double length;
    
public Rectangle(){
    width = 0.0;
    length = 0.0;
}
public Rectangle(double width , double length){
this.width = width;
this.length = length;
}
public Rectangle(double width , double length, String color, boolean filled){
super(color , filled);
this.length = length;
this.width = width;
}
public void setWidth(double width){
this.width = width;
}
public void setLength(double length){
this.length = length;
}
public double getLength(){
return length;
}
public double getWidth(){
return width;
}
    @Override
    public double getArea() {
     return width*length;
    }
    @Override
    public double getPerimeter() {
    return (width*length)*2;
    }
    @Override
    public String toString(){
return"A Rectangle with width="+ width +" and length="+ length +", which is a subclass of yyy"+super.toString() ;
}
}
