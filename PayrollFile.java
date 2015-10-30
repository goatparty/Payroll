import java.util.*;
import java.io.*;
public class PayrollFile {

private int eNum2;
private double gPay2,fTax2,sTax2,ficaTax2;

        /**public void Employee(int number) throws IOException {
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




        public void outputEmployee(int eNum3,double gPay3,double fTax3,double sTax3,double ficaTax3) throws IOException {
            eNum2 = eNum3;
            gPay2 = gPay3;
            fTax2 = fTax3;
            sTax2 = sTax3;
            ficaTax2 = ficaTax3;
            int numSave = getNumSave() + 1;
            String userFileName = "Employee" + numSave + ".emp";
            FileWriter 	fWriter = new FileWriter(userFileName, true);
            PrintWriter pWriter = new PrintWriter(fWriter);
            pWriter.println(eNum2);
            pWriter.println(gPay2);
            pWriter.println(fTax2);
            pWriter.println(sTax2);
            pWriter.println(ficaTax2);
            pWriter.close();
        }
        */
        /**
        *   Searches and gets number of saves
        */
        public int getNumSave() throws IOException {
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
            return counter;
        }
}
