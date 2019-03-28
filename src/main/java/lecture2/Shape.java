package lecture2;

public class Shape {
    private String name;
    private  String color;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Shape(String name, String color) {
        this.name =name;
        this.color =color;
    }
    public Shape(){

    }
    public String calculateArea(){
        return "the area is ";}

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}



