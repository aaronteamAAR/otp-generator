import java.util.*;

public class Otp {
    static char[] OTP(int len) {
        System.out.print("Generating OTP with random():");

        System.out.print("Your OTP is => ");
        String num = "0123456789";
        Random rndm_method = new Random();
        char[] otp = new char[len];
        for (int i = 0; i < len; i++){
            otp[i] =num.charAt(rndm_method.nextInt(num.length()));
        }
          return otp;

    }
    public static void main(String[] args)
    {
        int length = 4;
        System.out.print(OTP(length));
    }
}