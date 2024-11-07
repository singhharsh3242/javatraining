public class Exceptionhandling {
    //to control the error in proggram
    public static void main(String[] args) {
//        System.out.println(100/0);


        //we use try and cath to handle the error
        try {
            System.out.println(100 / 0);
        } catch (Exception exception) {
            System.out.println(exception);
        }//null pointer or valvue exception
        String name = null;
        try {
            System.out.println(name.length());

        } catch (Exception e) {
            System.out.println(e);
        }
        String fullname = "pawan sharma";
        try {
            int z = Integer.parseInt(fullname);
            System.out.println(z);
        } catch (Exception e) {
            System.out.println(e);
        }
//out of bound exception
        int array[] = {1, 2, 3, 4};
        try {
            System.out.println(array[4]);
        } catch (Exception e) {
            System.out.println(e);

        }
        finally {
            System.out.println("this is finally code");
        }
    }
}
