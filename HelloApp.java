/*
* HelloApp - UC4 - A simple Java application that greets multiple users by name if
* provided as command-line arguments, or defaults to greeting "World" if no names are given.
* @author
* @version 4.0
*/
public class HelloApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Hello " + args[i]);
            }
        }

    }
}