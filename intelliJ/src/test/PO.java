package test;
public class PO extends Main{
    public PO(){
        super.dni = "123";
        super.name = "john";
    }
    public double getNotaMedia(double pac1, double pac2, double pac3, double pac4){
        double notaMedia = pacs(pac1, pac2, pac3, pac4);
        System.out.println("nota media: " + notaMedia);
        return notaMedia;
    }

    @Override
    public double pacs(double pac1, double pac2, double pac3, double pac4){
        double notaFinal = ((pac1 + pac2 + pac3 + pac4) / 4) * 0.6;
        return notaFinal;
    }

    public static void main(String[] args) {
        PO p = new PO();
        p.getNotaMedia(7,8,9,10);
    }
}