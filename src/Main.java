import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, !");
//        System.out.println("hi my name is amine");
//

//        double age = 21.3;
//        int year = 2023;
//        char grade = 'A';
//        char symbol = '!';
//        boolean isAlive = true;
//        String name="amine ";
//        String day="monday";
//
//        if (!isAlive) {
//            System.out.println("amine is alive");
//        } else {
//            System.out.println("amine is not alive");
//        }
//
//        System.out.println(isAlive);
//        System.out.println(grade);
//        System.out.println(age);
//        System.out.println(year);
//        System.out.println("the year is " + year);
//        System.out.println(name);




        //  3rd part user input
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("enter your name : ");
//        String name = scanner.nextLine();
//
//        System.out.print("enter your age : ");
//        int age=scanner.nextInt();
//
//
//        System.out.print("enter your note : ");
//        double note=scanner.nextDouble();
//
//        System.out.print("are you student (true/false) ");
//        boolean isStudent=scanner.nextBoolean();
//
//
//        System.out.println("hello " + name);
//        System.out.println("age is  " + age);
//        System.out.println("note is  " + note);
//
//        if (isStudent){
//            System.out.println("you are a student");
//        }else {
//            System.out.println("you are not a student");
//
//
//        }
//


        //calculate area of a rectangle----------------
   Scanner scanner = new Scanner(System.in);

        double width=0;
        double height=0;
        double area=0;


        System.out.print("enter the width : ");
         width=scanner.nextDouble();

        System.out.print("enter the height : ");
        height=scanner.nextDouble();

        area=width*height;

        System.out.println("the area is "+ area);



        //-------------------------------------



        scanner.close();
    }
}