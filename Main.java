import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Black Cat", 22, 450);

        Scanner datos = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = datos.nextLine();

        System.out.print("Ingrese la edad del empleado: ");
        int edad = datos.nextInt();

        System.out.print("Ingrese el salario del empleado: ");
        double salario = datos.nextDouble();

        Empleado empleado2 = new Empleado(nombre, edad, salario);

        System.out.println("\nInformación del primer empleado:");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Edad: " + empleado1.getEdad());
        System.out.println("Salario: " + empleado1.getSalario());

        System.out.println("\nInformación del segundo empleado:");
        System.out.println("Nombre: " + empleado2.getNombre());
        System.out.println("Edad: " + empleado2.getEdad());
        System.out.println("Salario: " + empleado2.getSalario());

        datos.close();
    }
}
