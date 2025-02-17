import java.util.Scanner;

public class SumaDigitos {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el número N al usuario
        System.out.print("Ingrese un numero N: ");
        int N = scanner.nextInt();
        
        // Calcular la suma de los dígitos de todos los números de 1 a N
        int sumaTotal = calcularSumaDigitos(N);
        
        // Mostrar el resultado
        System.out.println("La suma de los digitos de todos los numeros de 1 a " + N + " es: " + sumaTotal);
        
        scanner.close();
    }
    
    public static int calcularSumaDigitos(int N) {
        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += sumaDigitos(i);
        }
        return suma;
    }
    
    public static int sumaDigitos(int num) {
        int suma = 0;
        while (num > 0) {
            suma += num % 10;
            num /= 10;
        }
        return suma;
    }
	
}