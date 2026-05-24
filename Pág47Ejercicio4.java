//Hecho por: Brashly Cast. (2024-0014)
public class Pág47Ejercicio4 {
    public static void main(String[] args) {
        String cadena = "200";
        
        // Convertir cadena a float
        float f1 = Float.parseFloat(cadena);
        
        // Variable auxiliar
        float numero2 = 30.08f; 
        
        // Comprobación
        float suma = f1 + numero2;
        float resta = f1 - numero2;
        float multiplicacion = f1 * numero2;
        
        // Imprimir resultados
        System.out.println("Variable f1 = " + f1);
        System.out.println("           ");
        System.out.println("Comprobación suma (" + f1 + " + " + numero2 + "): " + suma);
        System.out.println("Comprobación resta (" + f1 + " - " + numero2 + "): " + resta);
        System.out.println("Comprobación multiplicación (" + f1 + " * " + numero2 + "): " + multiplicacion);
    }
}
