package home3;

public class Main {
    public static void main(String[] args) {
     Person mike = new Person("mike",30,"track","programmer",20000);
     Person jake = new Person();
        System.out.println(jake.printmethod());
        System.out.println(mike.printmethod());
    }
}
