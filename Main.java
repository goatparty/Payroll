import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Employee employee[];
        int eNum,counter = 0;
        double gPay,fTax,sTax,ficaTax,nPay;

        status = getStatus();
        while(PayrollUtils.processStatus(status)) {
            do {
                PayrollUtils.askInput("Employee Number");
                eNum = keyboard.nextInt();
                gPay = PayrollUtils.askInput("Gross Pay");
                fTax = PayrollUtils.askInput("Federal Tax");
                sTax = PayrollUtils.askInput("State Tax");
                ficaTax = PayrollUtils.askInput("FICA Tax");
            } while(PayrollUtils.validate(gPay,fTax,sTax,ficaTax));
            employee[counter] = new Employee(eNum,gPay,fTax,sTax,ficaTax);
            counter++;
        }
    }
}
