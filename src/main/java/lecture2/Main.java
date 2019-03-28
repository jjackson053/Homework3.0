package lecture2;

public class Main {
    public static void main(String[] args) {
   // Shape square = new Shape();
      // square.setLength(50);
       //square.setWidth(40);
       //square.setSide(3);
        //System.out.println(Shape.calculateArea(square.getLength(),square.getWidth(),square.getSide()));

        //Square shape = new Square();

         //shape.setSides(40);
        //System.out.println(Square.calulatearea(shape.getSides()));

        //Triangle lol = new Triangle();

        //lol.setBase(40);
        //lol.setHeight(30);
        //System.out.println(Triangle.calculateArea(lol.getBase(),lol.getHeight()));

        /*Circle boy = new Circle(20,40 );

        boy.setRadius(20);
        boy.setCirumference(40);

        System.out.println(boy.calculateAreas());

        System.out.println(boy.calculateCirumference());*/

        Square cool = new Square("Square","blue" ,20.5);
        System.out.println(cool.calculateArea());

        Triangle pool = new Triangle("Triangle","green", 54.0, 3);
        System.out.println(pool.calculateArea());
    }


}
