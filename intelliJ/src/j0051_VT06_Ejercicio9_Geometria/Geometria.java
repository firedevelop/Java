package j0051_VT06_Ejercicio9_Geometria;

public class Geometria {
	public static double areaCuadrado(int lado) {
        return lado * lado;
    }

    // Método para calcular el área de un círculo
    public static double areaCirculo(int radio) {
        return Math.PI * radio * radio;
    }

    // Método para calcular el área de un triángulo
    public static double areaTriangulo(int base, int altura) {
        return (base * altura)/2;
    }

}
