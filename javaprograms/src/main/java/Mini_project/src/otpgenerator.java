package Mini_project.src;

import java.util.Random;

public class otpgenerator {
    public static void main(String[] args) {

        Random random = new Random();
        int myOtp = random.nextInt(1000000);
        System.out.println("your otp is " + myOtp + "dont share this otp to other");


    }
}




//psvm for public static void main