package lecture2;

public class Circle {
    private double radius;
    private  double cirumference;

    public double getRadius(){
        return radius;
    }
    public double getCirumference(){
        return cirumference;
    }
    public void setRadius(double radius){
        this.radius =radius;
    }
    public void setCirumference(double cirumference){
        this.cirumference =cirumference;
    }

    public Circle(double radius, double cirumference){
        this.cirumference= cirumference;
        this.radius= radius;

    }

    public Circle(){
    }


    public double calculateAreas(){
        double z = 3.14;
        double q = (cirumference / 2);
        double l = (q * q) * z;
        return l;
    }
    public  double calculateCirumference(){
       double u = 3.14;
        double cirumferences = 2 * u * radius;
        return cirumferences;
    }
}

