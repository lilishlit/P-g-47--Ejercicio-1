//Hecho por: Brashly Cast. (2024-0014)
public class Pág47Ejercicio6 {
    public static void main(String[] args) {
        // --- DEFINICIÓN ---
        System.out.println("--- ¿QUÉ ES UN DATO TIPO REFERENCIA? ---");
        System.out.println("A diferencia de los tipos primitivos como int o float, que guardan su valor directamente,");
        System.out.println("los tipos de referencia guardan la dirección de memoria o una referencia, que es donde se encuentra el objeto.");
        System.out.println("Apuntan a datos más complejos creados en una estructura llamada 'Heap'.\n");

        System.out.println("--- TRES EJEMPLOS ---");
        //Ejemplo 1:
        String texto = "Hola Mundo";
        System.out.println("Ejemplo 1: Una cadena de texto (String): " + texto);

        //Ejemplo 2:
        int[] numeros = {10, 20, 30};
        System.out.println("Ejemplo 2: Un arreglo o vector (Array) - Primer elemento: " + numeros[0]);

        //Ejemplo 3:
        java.util.Date fechaActual = new java.util.Date();
        System.out.println("Ejemplo 3: una instancia de una clase propia (Objeto Clase Date): " + fechaActual);
    }
}
