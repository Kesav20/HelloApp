/*
* HelloApp-java - A simple Java application that greets the user by name if
* provided as a command-line argument, or defaults to greeting "World" if no name is
* given 
* @author
* @version 3.0
*/
public class HelloApp {

    public static void main(String[] args) {

        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello, " + name + "!");

    }
}