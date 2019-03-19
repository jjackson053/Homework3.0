package home3;

public class Person {
    public String name;
    public int age;
    public String favoritesport;
    public  String occupation;
    public  int salary;


    public Person(String name, int age, String favoritesport, String occupation, int salary) {
        this.name = name;
        this.age = age;
        this.favoritesport = favoritesport;
        this.occupation = occupation;
        this.salary = salary;


    }
    public Person(){this.name= name;}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", favoritesport='" + favoritesport + '\'' +
                ", occupation='" + occupation + '\'' +
                ", salary=" + salary +
                '}';
    }
    public String printmethod(){
        return "My name is " + name + " and I am " + age + " years old. " +
                "My favorite sports is " + favoritesport + " and by this time next" +
                " year my occupation will be " + occupation + " meaning I could be making up to " +
                salary + " yearly";

    }
}


