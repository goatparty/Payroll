import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        Employee[] employee = new Employee[1000000];
        int eNum,counter = 0;
        double gPay,fTax,sTax,ficaTax,nPay;
        PayrollUtils payrollUtils = new PayrollUtils();
        PayrollFile payrollFile = new PayrollFile();
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
            payrollFile.outputEmployee(eNum,gPay,fTax,sTax,ficaTax);
            status = payrollUtils.getStatus();
        }
    }
}
