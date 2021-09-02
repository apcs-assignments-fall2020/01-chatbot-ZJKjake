import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String a=scan.nextLine();
        System.out.println("Hi "+a+"");
        System.out.println("How old are you？");
        int b=scan.nextInt();
        System.out.println("I'm "+b+" as well！");
        System.out.println("What is your favorite number， "+a+"？");
        int c=scan.nextInt();
        System.out.println("I like "+c+" too！");
        System.out.println("What is your least favorite number， "+a+"？");
        int e=scan.nextInt();
        System.out.println("I hate "+e+" as well！");
        System.out.println("What time is it， "+a+"？");
        int f=scan.nextInt();
        System.out.println("I have to leave at "+f+"！");
        System.out.println("Goodbye！");

        scan.close();
    }
}
