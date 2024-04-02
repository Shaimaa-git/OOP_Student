import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=scanner.nextLine();
        System.out.println("Enter the age:");
        Integer age=scanner.nextInt();
        System.out.println("Enter the grade:");
        Integer grade=scanner.nextInt();
        Student studentInformation=new Student(name, age, grade);
        System.out.println("The Student information are:");
        studentInformation.studentInfo();
        scanner.close();


    }
}