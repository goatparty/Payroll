public class PayrollFile {

    public class EmployeeInput {
        public static Employee(int number) {
            String bin
            int eNum;
            double gPay,fTax,sTax,ficaTax,nPay;
            Employee employee;
            File file = new File("Employee" + number + ".emp")
            Scanner read = new Scanner(file);

        }

    }

    public class EmployeeOutput {
        public static void outputEmployee(Employee employee) {
            int numSave = PayrollIOUtils.getNumSave() + 1;
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
    }

    public class PayrollIOUtils {
        /**
        *   Searches and gets number of saves
        */
        public static int getNumSave() {
            int counter = 0;
            File file;
            boolean foundLast = false;
            while(!foundLast) {
                String fileName = "payrollSave" + counter + ".pay";
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
    }
}
