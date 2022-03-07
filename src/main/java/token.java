import java.util.Random;
import java.util.Scanner;

public class token {
    public static void main(String args[]) throws Exception {

        int lenght;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please press 5 then press Enter : ");
//        System.out.println("Enter code length you require : ");
        lenght = sc.nextInt();

        if (lenght % 5 > 0 || lenght > 5 || lenght == 0) {
//      if (lenght % 5 > 0 || lenght > 15) {
//      Changing the conditions at this point would make it possible to build tokens for other numbers typed from the keyboard
            throw new Exception("Wrong number entered, please try again");
        }
        tokenGenerator(3, lenght);
    }

    private static String tokenGenerator(int n, int length) {
        String str1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()";
        StringBuilder sBuldier = new StringBuilder(length);
        Random random = new Random();

        System.out.println("Yours codes are :");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < length; j++) {
                sBuldier.append(str1.charAt(random.nextInt(str1.length())));
            }
            System.out.println("  " + sBuldier.toString());
        }
        return sBuldier.toString();
    }
}

