package morales.tarea2;

import java.util.Scanner;
/**
 *
 * @author waiting
 */
public class Tarea2 {
    
    public static void calcular(double num1, double num2, String symbol){
        // Mostrar el resultado de la operación matemática
        switch (symbol){
            case "+":
                System.out.printf("Resultado: %.2f\n", num1 + num2);
                break;
            case "-":
                System.out.printf("Resultado: %.2f\n", num1 - num2);
                break;
            case "*":
                System.out.printf("Resultado: %.2f\n", num1 * num2);
                break;
            case "/":
                if (num2 != 0){
                    System.out.printf("Resultado: %.2f\n", num1 / num2);
                }
                else{
                    System.out.println("MATH ERROR");
                }
                
                break;
            case "^":
                System.out.printf("Resultado: %.2f\n", Math.pow(num1, num2));
                break;
            default:
                System.out.println("Ingrese un operado adecuado");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1, num2;
        String simbolo, flag;
        boolean stop = true;
        do{
            System.out.println("Escriba la expresión a calcular");
            System.out.println("(Ej. 5 + 10)");
            System.out.println("Operaciones válidas: +, -, *, ^");
            num1 = in.nextDouble();
            simbolo = in.next();
            num2 = in.nextDouble();
            calcular(num1, num2, simbolo);
            // Limpiar el input buffer
            in.nextLine();
            System.out.println("¿Desea continuar? (s/n)");
            flag = in.nextLine();
            if (flag.equals("n")){
                stop = false;
            }
            // Limpiar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }while (stop);
        System.out.println("Gracias por usar nuestra calculadora!");
        
    }
}
