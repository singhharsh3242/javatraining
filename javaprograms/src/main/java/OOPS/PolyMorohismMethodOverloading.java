package OOPS;

public class PolyMorohismMethodOverloading {
    public static void main(String[] args) {
        //method calling for addition integer

       int result= add(5, 6); //4+
        double resultvalue=add(2.5,9.3);
        System.out.println("M1"+ result);
        System.out.println("m2"+resultvalue);
    }

    private static double add(double v, double v1) {
        double value =v+v1;
        return value;
    }

    private static int add(int i, int i1) {
        int a = i +i1;
        return a;
    }
}
//the return keyword will return the method result with datatype


