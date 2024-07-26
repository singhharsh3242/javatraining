package OOPS;
import java.util.Scanner;

public class Classobject {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);  //to memorize
        //print the trainer name,technology
        //print the student name, technology
        Trainer trainer= new Trainer();
            trainer.trainerName="pawan sharma";
        trainer.trainerTechnology="java";
        System.out.println("my name is" +trainer.trainerName +"my technology is " +trainer.trainerTechnology);

        System.out.print("type student name: ");
        Student stu = new Student();
//        String abc = sc.nextLine();
        stu.studentName = sc.nextLine();
        System.out.println(" Student ka naam hai " +stu.studentName);

        stu.strudentEnrolledtechnology = "java";

        System.out.println("technology is "+ stu.strudentEnrolledtechnology);
    }
}
class Trainer{

     String trainerName;
    String trainerTechnology;

}
class Student{
    String studentName;
    String strudentEnrolledtechnology;
    }








    //object name hamesa small me rehta hai
//Trainer trainer= new Trainer()

