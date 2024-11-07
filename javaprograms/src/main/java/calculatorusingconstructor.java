import java.util.Scanner;

public class calculatorusingconstructor {
    public static void main(String[] args) {
        System.out.println("enter a and b value ");
        Scanner scanner= new Scanner(System.in);
       int a = scanner.nextInt();
       int b = scanner.nextInt();
        System.out.println("choose the option \n 1 for addition \n 2 for subtration \n 3 for multiplication \n 4 for division");
        int c= scanner.nextInt();
        MyClass myclass = new MyClass(a,b,c);
    }
}
class MyClass{
    int a,b,c;

    //parameter constructor
    public MyClass(int a,int b,int choise){
        this.a = a;
        this.b =b;
        this.c=choise;
        switch(choise){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("you select the wrong option");
        }

    }
}
