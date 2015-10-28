import java.util.*;
import java.io.*;
public class PayrollFile {
private static double gPay, fTax, sTax, ficaTax, netPay;

        public void Employee(int number) {
            String bin;
            int eNum1;
            double gPay1,fTax1,sTax1,ficaTax1,nPay1;
            Employee employee;
            File file = new File("Employee" + number + ".emp");
            Scanner read = new Scanner(file);

            bin = read.nextLine();
            eNum1 = Integer.parseInt(bin);
            bin = read.nextLine();
            gPay1 = Double.parseDouble(bin);
            bin = read.nextLine();
            fTax1 = Double.parseDouble(bin);
            bin = read.nextLine();
            sTax1 = Double.parseDouble(bin);
            bin = read.nextLine();
            ficaTax1 = Double.parseDouble(bin);

            employee = new Employee(eNum1,gPay1,fTax1,sTax1,ficaTax1);

        }




        public void outputEmployee(Employee employee) {
            int numSave = getNumSave() + 1;
            String userFileName = "Employee" + numSave + ".emp";
            FileWriter 	fWriter = new FileWriter(userFileName, true);
            PrintWriter pWriter = new PrintWriter(fWriter);
            pWriter.println(employee.getENum());
            pWriter.println(employee.getGPay());
            pWriter.println(employee.getFTax());
            pWriter.println(employee.getSTax());
            pWriter.println(employee.getFicaTax());
            pWriter.close();
        }



        /**
        *   Searches and gets number of saves
        */
        public int getNumSave() {
            int counter = 0;
            File file;
            boolean foundLast = false;
            while(!foundLast) {
                String fileName = "PayrollSave" + counter + ".Pay";
                file = new File(fileName);
                if (file.exists()) {
                    counter++;
                    continue;
                }
                else {
                    foundLast = true;
                    return counter;
                }
            }
        }



        public void total(Employee employee) {
            gPay += employee.getGPay();
            fTax += employee.getFTax();
            sTax += employee.getSTax();
            ficaTax += employee.getFicaTax();
            netPay += employee.getNPay();
        }

}
