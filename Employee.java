public class Employee {
    private int eNum;
    private double gPay,fTax,sTax,ficaTax;

    public Employee(int eNum,double gPay,double fTax,double sTax,double ficaTax) {
        this.eNum = eNum;
        this.gPay = gPay;
        this.fTax = fTax;
        this.sTax = sTax;
        this.ficaTax = ficaTax;
    }

    public Employee() {
        eNum = 0;
        gPay = 0;
        fTax = 0;
        sTax = 0;
        ficaTax = 0;
    }

    public void setENum(int eNum) {
        this.eNum = eNum;
    }

    public void setGPay(double gPay) {
        this.gPay = gPay;
    }

    public void setFTax(double fTax) {
        this.fTax = fTax;
    }

    public void setSTax(double sTax) {
        this.sTax = sTax;
    }

    public void setFicaTax(double ficaTax) {
        this.ficaTax = ficaTax;
    }

    public int getENum() {
        return eNum;
    }

    public double getGPay() {
        return gPay;
    }

    public double getFTax() {
        return fTax;
    }

    public double getSTax() {
        return sTax;
    }

    public double getFicaTax() {
        retirm ficaTax;
    }

    public double getNPay() {
        return gPay - fTax - sTax - ficaTax;
    }

    public void output() {
        //TODO: Output
    }
}
