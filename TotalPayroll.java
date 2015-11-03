import java.io.*;
import java.util.*;
public class TotalPayroll {
    public static void main() throws IOException {
        double gPay = 0,fTax = 0,sTax = 0,ficaTax = 0,netPay = 0,total = 0;
        int numLines = 1;
        File file2 = new File("Employee1.emp");
        Scanner read2 = new Scanner(file2);
        File file = new File("Employee1.emp");
        Scanner read = new Scanner(file);
        Scanner keyboard = new Scanner(System.in);
        while (read.hasNext()) {
            read.nextLine();
            numLines++;
        }
        System.out.printf("Save has %d \nType reset to clear file or anything else to total: ",numLines);
        String input = keyboard.nextLine();
        input = input.toLowerCase();
        if (input.equals("reset")) {
            file.delete();
            System.exit(0);
        }
        else {
            System.out.println("Starting Data Totals");
            while(read2.hasNext()) {
                for (int x = 0; x < 5; x++) {
                    while(read2.hasNext()) {
                        double gPayT=0,fTaxT=0,sTaxT = 0,ficaTaxT = 0,totalPay = 0;
                        String bin;
                        bin = read2.nextLine();
                        int employeeNumber = Integer.parseInt(bin);
                        System.out.println("Totaling Employee with #: " + employeeNumber);
                        bin = read2.nextLine();
                        gPayT = Double.parseDouble(bin);
                        bin = read2.nextLine();
                        fTaxT = Double.parseDouble(bin);
                        bin = read2.nextLine();
                        sTaxT = Double.parseDouble(bin);
                        bin = read2.nextLine();
                        ficaTaxT = Double.parseDouble(bin);
                        totalPay = gPayT + fTaxT + sTaxT + ficaTaxT;
                        gPay += gPayT;
                        fTax += fTaxT;
                        sTax += sTaxT;
                        ficaTax += ficaTaxT;
                        total = totalPay;
                        netPay = gPayT - fTaxT - sTaxT - ficaTaxT;
                    }
                }
            }
            System.out.println("Totaling Completed");
            System.out.printf("Total Employee Pay Statistics:\nTotal Gross Pay:$ %,.2f\nTotal Federal Tax:$ %,.2f\nTotal State Tax:$ %,.2f\nTotal FICA Tax:$ %,.2f\nTotal Pay + Taxes:$ %,.2f\n",gPay,fTax,sTax,ficaTax,total);
        }
    }
}
