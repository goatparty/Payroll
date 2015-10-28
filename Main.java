import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Employee employee[];
        int eNum,counter = 0;
        double gPay,fTax,sTax,ficaTax,nPay;
        PayrollUtils payrollUtils = new PayrollUtils();

        char status = payrollUtils.getStatus();
        while(payrollUtils.processStatus(status)) {
            do {
                eNum = payrollUtils.askInput("Employee Number",true);
                gPay = payrollUtils.askInput("Gross Pay");
                fTax = payrollUtils.askInput("Federal Tax");
                sTax = payrollUtils.askInput("State Tax");
                ficaTax = payrollUtils.askInput("FICA Tax");
                if(payrollUtils.validate(gPay,fTax,sTax,ficaTax)) {
                    payrollUtils.errorMessage("Tax Greater Than Gross Pay, Please Try Again");
                }
            } while(payrollUtils.validate(gPay,fTax,sTax,ficaTax));
            employee[counter] = new Employee(eNum,gPay,fTax,sTax,ficaTax);
            counter++;
            PayrollFile.outputEmployee(employee[counter]);
            status = payrollUtils.getStatus();
        }
        int saveNum1 = payrollUtils.askInput("Enter first save to total",true);
        int saveNum2 = payrollUtils.askInput("Enter last save to total",true);
        for (int x = saveNum1; x < saveNum2; x++) {

        }
    }
}
