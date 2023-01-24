import java.util.Scanner;

public class IncredibleCalculator {

    public static void main(String[] args) {
        int total=0;
        double total2=0;
        System.out.println("Selecciona la operación que prefieras realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir (división entera)");
        System.out.println("5. Dividir (división con decimales)");

        int opcion = leerEnteroEntrada();


        switch (opcion) {
            case 1: //Sumar. Debes leer dos numeros enteros de entrada e imprimir su suma
                    int n1=leerEnteroEntrada();
                    int n2=leerEnteroEntrada();
                    total=n1+n2;
                    System.out.println("El resultado de la suma es: "+ total);
                    break;
            case 2: // Restar. Debes leer dos números enteros de entrada e imprimir su resta
                    int n1=leerEnteroEntrada();
                    int n2=leerEnteroEntrada();
                    total=n1-n2;
                    System.out.println("El resultado de la resta es: "+ total);
                    break;
            case 3: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su producto.
                    int n1=leerEnteroEntrada();
                    int n2=leerEnteroEntrada();
                    total=n1*n2;
                    System.out.println("El resultado de la multiplicación es: "+ total);
                    break;
            case 4: // Dividir. Debes leer dos números enteros de entrada e imprimir su división entera.
                    int n1=leerEnteroEntrada();
                    int n2=leerEnteroEntrada();
                    total=n1/n2;
                    System.out.println("El resultado de la división es: "+ total);
                    break;
            case 5: // Dividir. Debes leer dos números enteros de entrada e imprimir su división con decimales.
                    double n1=leerEnteroEntrada();
                    double n2=leerEnteroEntrada();
                    total2=n1/n2;
                    System.out.println("El resultado de la división es: "+ total);
                    break;

        }

    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int divisionEntera(int a, int b) {
        return a / b;
    }

    public static double divisionConDecimales(int a, int b) {
        return a / (b * 1.0);
    }

    public static int leerEnteroEntrada() {
        try {
            Scanner sc = new Scanner(System.in);
            int result = Integer.parseInt(sc.next());
            sc.close();
            return result;
        } catch (NumberFormatException ex) {
            System.err.println("Lo que has introducido no es un número entero!");
            System.exit(1);
            return -1;
        }

    }

}