import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Employee employee[];
        int eNum,counter = 0;
        double gPay,fTax,sTax,ficaTax,nPay;
        PayrollFile.totalEmployee total = new PayrollFile.totalEmployee();

        status = getStatus();
        while(PayrollUtils.processStatus(status)) {
            do {
                eNum = PayrollUtils.askInput("Employee Number",true);
                gPay = PayrollUtils.askInput("Gross Pay");
                fTax = PayrollUtils.askInput("Federal Tax");
                sTax = PayrollUtils.askInput("State Tax");
                ficaTax = PayrollUtils.askInput("FICA Tax");
                if(PayrollUtils.validate(gPay,fTax,sTax,ficaTax)) {
                    PayrollUtils.errorMessage("Tax Greater Than Gross Pay, Please Try Again");
                }
            } while(PayrollUtils.validate(gPay,fTax,sTax,ficaTax));
            employee[counter] = new Employee(eNum,gPay,fTax,sTax,ficaTax);
            counter++;
            PayrollFile.EmployeeOutput.outputEmployee(employee[counter]);
            status = PayrollUtils.getStatus();
        }
        int saveNum1 = PayrollUtils.askInput("Enter first save to total",true);
        int saveNum2 = PayrollUtils.askInput("Enter last save to total",true);
        for (int x = saveNum1; x < saveNum2; x++) {

        }
    }
}
