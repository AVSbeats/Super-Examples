public class MainSuper { // This MainSuper is attached with Superclass Person.java & Subclass Hero.java
    public static void main(String[] args) {

        Hero batman = new Hero("Batman", 42, "Millionair");
        Hero superman = new Hero("Superman", 43, "Flying & Strength");

        System.out.println();
        System.out.println(batman.toString());

        System.out.println();
        System.out.println(superman.toString());

        System.out.println();
    }
}
