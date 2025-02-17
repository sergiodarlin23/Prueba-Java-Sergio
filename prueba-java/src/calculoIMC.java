import java.util.Scanner;

public class calculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar datos al usuario
        System.out.print("Ingrese su peso en kg: ");
        float peso = scanner.nextFloat();
        
        System.out.print("Ingrese su altura en metros: ");
        float altura = scanner.nextFloat();
        
        // Calcular IMC
        float imc = calcularIMC(peso, altura);
        String categoria = obtenerCategoriaIMC(imc);
        
        // Mostrar resultados correctamente
        System.out.print(categoria);

        scanner.close();
    }
    
    //Calcula el IMC
    public static float calcularIMC(float peso, float altura) {
        return peso / (altura * altura);
    }
    
    //Engloba la categoría de peso en la que estás
    public static String obtenerCategoriaIMC(float imc) {
        if (imc <= 18.5f) {
            return "Usted tiene Infrapeso";
        } else if (imc <= 25.0f) {
            return "Usted tiene un peso Normal";
        } else if (imc <= 30.0f) {
            return "Usted tiene Sobrepeso";
        } else {
            return "Usted esta Obeso";
        }
    }
}
