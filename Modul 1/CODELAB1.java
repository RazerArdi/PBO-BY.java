public class CODELAB1 //democonf
{
    private double meter;

    public CODELAB1(double meter) {
        this.meter = meter;
    }

    public double convCM() {
        return meter * 100;
    }

    public double convMM() {
        return meter * 1000;
    }

    public void demoConv() {
        System.out.println( meter + " Meter" );
        System.out.println( convCM() + " Cm: ");
        System.out.println( convMM() + " Mm");
    }

    public static void main(String[] args) {
        CODELAB1 demo = new CODELAB1(1);
        demo.demoConv();
    }
}

