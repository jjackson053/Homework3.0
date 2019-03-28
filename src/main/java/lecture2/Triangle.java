package lecture2;

public class Triangle extends Shape{
    private double base;
    private double height;

   public Triangle(String name, String color , double base ,double height){
       super(name, color);
       this.height= height;
       this.base= base;
   }
     @Override
     public String calculateArea(){
        double y = .5;
        double p = base * height;
        double c = (base * 2) + height;
        double e = p / y;


        return e + "\n" + c;
    }
}
