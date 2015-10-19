public static class PayrollUtils {
    public static double askInput(String questionType) {
        questionType = questionType.trim();
        System.out.print("Please enter " + questionType + ": ");
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextDouble();
    }
    public static char getStatus() {
        System.out.print("Please enter q to quit or anything else to continue: ");
        String statusString = keyboard.nextLine();
        return statusString.charAt(0);
    }

    public static boolean processStatus(char status) {
        if (status = 'q' || 'Q') {
            return false;
        }
        else {
            true;
        }
    }

    public static boolean validate(double gPay,double fTax,double sTax,double ficaTax) {
        double totalTax = fTax + sTax + ficaTax;
        if (gPay < totalTax) {
            return true;
        }
        else {
            return false;
        }
    }
}
