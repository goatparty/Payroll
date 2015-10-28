import java.util.*;
import java.io.*;
public class PayrollUtils {

    public double askInput(String questionType) {
        questionType = questionType.trim();
        System.out.print("Please enter " + questionType + ": ");
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextDouble();
    }

    public int askInput(String questionType,boolean bin) {
        questionType = questionType.trim();
        System.out.print("Please enter " + questionType + ": ");
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }

    public char getStatus() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter q to quit or anything else to continue: ");
        String statusString = keyboard.nextLine();
        return statusString.charAt(0);
    }

    public boolean processStatus(char status) {
        if (status == 'q' || status == 'Q') {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean validate(double gPay,double fTax,double sTax,double ficaTax) {
        double totalTax = fTax + sTax + ficaTax;
        if (gPay < totalTax) {
            return true;
        }
        else {
            return false;
        }
    }

    public void errorMessage(String message) {
        System.out.println("\n\nERROR: " + message.toUpperCase() + '\n');
    }
}
