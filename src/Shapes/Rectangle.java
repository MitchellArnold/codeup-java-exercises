package Shapes;

class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width){
        super(length, width);
    }

    @Override
    void setLength(double length) {
    super.length = length;
    }

    @Override
    void setWidth(double width) {
    super.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public double getArea() {
        return width * length;
    }
}










//
//    protected int length;
//    protected int width;
//
//
//    public Rectangle(){};
//
//    public Rectangle(double length, double width) {
//        this.length = (int) length;
//        this.width = (int) width;
//    }
//
//    public int getLength() {    // user doesn't need access to class protected properties
//        return length;
//    }
//
//
//    public int setLength(int length) {
//        return this.length = length;
//    }
//
//    public int getWidth(int width) {
//        return this.width = width;
//    }
//
//    public int getArea(){
//        int area = length * width;
//        return area;
//    }
//
//    public int getPerimeter(){
//        int perimeter = (length * 2) + (width * 2);
//        return perimeter;
//    }

//    public Rectangle getPerimeter(){}


