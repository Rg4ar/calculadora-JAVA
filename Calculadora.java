import java.util.Scanner;

// Clase que representa una calculadora matemática básica
public class Calculadora {

    // Variables donde se guardan los números
    private double numero1;
    private double numero2;

    // Constructor por defecto
    public Calculadora() {
        numero1 = 0;
        numero2 = 0;
    }

    // Método para asignar los números
    public void ingresarNumeros(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Método para sumar
    public double sumar() {
        return numero1 + numero2;
    }

    // Método para restar
    public double restar() {
        return numero1 - numero2;
    }

    // Método para multiplicar
    public double multiplicar() {
        return numero1 * numero2;
    }

    // Método para dividir con validación
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
            return 0;
        }
        return numero1 / numero2;
    }

    // Método principal
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int opcionMenu;

        // Bucle que mantiene el menú activo
        do {
            System.out.println("===== CALCULADORA MATEMÁTICA =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.println("==================================");
            System.out.print("Seleccione una opción: ");

            opcionMenu = scanner.nextInt();

            // Si elige una operación, se piden los números
            if (opcionMenu >= 1 && opcionMenu <= 4) {
                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();

                calculadora.ingresarNumeros(num1, num2);
            }

            // Controla la opción seleccionada
            switch (opcionMenu) {
                case 1:
                    System.out.println("Resultado de la suma: " + calculadora.sumar());
                    break;

                case 2:
                    System.out.println("Resultado de la resta: " + calculadora.restar());
                    break;

                case 3:
                    System.out.println("Resultado de la multiplicación: " + calculadora.multiplicar());
                    break;

                case 4:
                    System.out.println("Resultado de la división: " + calculadora.dividir());
                    break;

                case 0:
                    System.out.println("¡Gracias por usar la calculadora!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

            System.out.println();

        } while (opcionMenu != 0);

        scanner.close();
    }
}


