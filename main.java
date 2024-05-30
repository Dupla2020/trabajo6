import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // Ejemplo de juego de adivinar número
        adivinarNumero(1, 100, 5);

        // Ejemplo de cálculo de figuras geométricas
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            // Mostrar menú de opciones
            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectángulo");
            System.out.println("4. Círculo");
            System.out.println("0. Salir");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularTriangulo(scanner);
                    break;
                case 2:
                    calcularCuadrado(scanner);
                    break;
                case 3:
                    calcularRectangulo(scanner);
                    break;
                case 4:
                    calcularCirculo(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
        scanner.close();
    }

    // Método para calcular el salario devengado
    public static double calcularSalarioDevengado(int salarioBase, int horasTrabajo, int horasExtras) {
        return salarioBase + (horasExtras * 1.5 * (salarioBase / horasTrabajo));
    }

    // Método para calcular las deducciones
    public static double calcularDeducciones(double salarioDevengado, double auxilioTransporte) {
        // Suponemos una deducción fija del 10% del salario devengado
        return salarioDevengado * 0.1 + auxilioTransporte;
    }

    // Método para adivinar un número aleatorio
    public static void adivinarNumero(int min_numero, int max_numero, int max_intentos) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(max_numero - min_numero + 1) + min_numero;
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        System.out.println("¡Bienvenido al juego de adivinar el número! El número está entre " + min_numero + " y " + max_numero);
        while (intentos < max_intentos) {
            System.out.println("Introduzca un número:");
            int numeroUsuario = scanner.nextInt();
            intentos++;
            if (numeroUsuario == numeroAleatorio) {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                return;
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
        }
        System.out.println("¡Lo siento! Has agotado todos tus intentos. El número era " + numeroAleatorio);
    }

    // Métodos para calcular áreas de figuras geométricas
    private static void calcularTriangulo(Scanner scanner) {
        System.out.println("Ingrese la base del triángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del triángulo:");
        double altura = scanner.nextDouble();
        double area = 0.5 * base * altura;
        System.out.println("El área del triángulo es: " + area);
    }

    private static void calcularCuadrado(Scanner scanner) {
        System.out.println("Ingrese el lado del cuadrado:");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }

    private static void calcularRectangulo(Scanner scanner) {
        System.out.println("Ingrese la base del rectángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }

    private static void calcularCirculo(Scanner scanner) {
        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }
}
