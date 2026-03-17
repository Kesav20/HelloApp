/*
* UC 5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For
* Loop or Default Message
* @author
* @version 5.0
*/
public class HelloApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        }

    }
}