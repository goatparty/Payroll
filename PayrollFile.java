public class PayrollFile {

    public class PayrollInput {

    }

    public class PayrollOutput {
        
    }

    public class PayrollIOUtils {
        /**
        *   Searches and gets number of saves
        */
        public static int getNumSaves() {
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
