public class Grunnkonsepter {
    public static void main(String[] args) {

        // System.out.println(args[0] + " " + args[1]); // this will call index 0 and index 1 from our arguments.

        System.out.println(args[0]); // this will call index 0 from our arguments

        System.out.println();
        int number = 10;
        if (number < 5) {
            System.out.println("The number is less then 5.");
        } else if (number > 15) {
            System.out.println("The number is greater then 15.");
        } else {
            System.out.println("The number is greater then 5 but less than 15.");
        }

        if (number == 10) {
            System.out.println("Yippi! The number is 10.");
        }

        System.out.println();
        int iteration = 0;
        while (iteration < 5) {
            System.out.println(iteration);
            iteration++;
        }

        System.out.println();
        for (int x = 0; x < 5; x++) {
            System.out.println(x);
        }

        System.out.println();
        for (int x = 5; x > 0; x--) {
            System.out.println(x);
        }

        System.out.println();
        for (int x = 5; x > 0; x-= 2) {
            System.out.println(x);
        }

        System.out.println();
        printSomething();
    }
    public static void printSomething(){
        System.out.println("Something!");
    }
}