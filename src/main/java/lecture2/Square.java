package lecture2;

public class Square extends Shape {
    private double sides;


   public Square (String name, String color, double sides){
       super(name,color);
       this.sides = sides;
   }


    @Override
    public String calculateArea (){
        double r =  sides * sides;
        return "the area of the " + getName() + " is "+ r + " and is the color "+ getColor();
    }
}
