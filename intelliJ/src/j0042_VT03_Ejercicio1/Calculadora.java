package j0042_VT03_Ejercicio1;

public class Calculadora{
    private int total = 0;
    private int num1;
    private int num2;
    private String operador;

    public Calculadora (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        this.setMultiplicacion(num1,num2);
    }
    public Calculadora(int num1, int num2, String operador){
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;
        this.setOperacion(num1, num2, operador);
    }

    public void setMultiplicacion(int num1, int num2){
        total = num1 * num2;
    }
    public void getMultiplicacion(){
        System.out.println("Multiplicacion: " + total);
    }
    public void setOperacion(int num1, int num2, String operador){
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;

        switch (operador){
            case "sumar":
                total = num1 + num2;
                break;
            case "restar":
                total = num1 - num2;
                break;
            default:
                System.out.println("Introduce oerador válido sumar o restar");
                total = 0;
                break;
        }
    }
    public void getOperacion(){
        if(total !=0 || operador.equals("sumar") || operador.equals("restart")){
            System.out.println("Operacion = " + total);
        }

    }
}
