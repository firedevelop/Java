package j0024_Array_Methods;

public class Main {
    public static void main(String[] args)  {
        // Ejemplo del método length
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Length of array: " + array.length); // Obtiene la longitud de la matriz

        // Ejemplo del método clone()
        int[] arrayClone = array.clone();
        System.out.println("Array cloned: " + java.util.Arrays.toString(arrayClone)); // Crea y devuelve una copia del objeto

        // Ejemplo del método hashCode()
        int hashCode = array.hashCode();
        System.out.println("Hash code of array: " + hashCode); // Devuelve un valor de código hash para el objeto

        // Ejemplo del método toString()
        String arrayString = array.toString();
        System.out.println("String representation of array: " + arrayString); // Devuelve una representación de cadena del objeto

        // Ejemplo del método equals()
        boolean isEqual = array.equals(arrayClone);
        System.out.println("Array equals arrayClone: " + isEqual); // Indica si algún otro objeto es igual a este

        // Ejemplo del método getClass()
        Class<?> arrayClass = array.getClass();
        System.out.println("Class of array: " + arrayClass); // Devuelve la clase de tiempo de ejecución de este objeto


    }
}
