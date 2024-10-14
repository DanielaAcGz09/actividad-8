import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        perro perro1 = new perro();
        System.out.println("Ingrese el nombre del primer perro:");
        perro1.setNombre(scanner.nextLine());
        System.out.println("Ingrese la raza del primer perro:");
        perro1.setRaza(scanner.nextLine());
        System.out.println("Ingrese la edad del primer perro:");
        perro1.setEdad(scanner.nextInt());
        scanner.nextLine();
        perro perro2 = new perro();
        System.out.println("Ingrese el nombre del segundo perro:");
        perro2.setNombre(scanner.nextLine());
        System.out.println("Ingrese la raza del segundo perro:");
        perro2.setRaza(scanner.nextLine());
        System.out.println("Ingrese la edad del segundo perro:");
        perro2.setEdad(scanner.nextInt());
        perro1.comer("croquetas", 150.0);
        PrintStream var10000 = System.out;
        String var10001 = perro1.getNombre();
        var10000.println(var10001 + " está ladrando: " + perro1.ladrar());
        perro2.comer("pollo", 200.0);
        var10000 = System.out;
        var10001 = perro2.getNombre();
        var10000.println(var10001 + " está ladrando: " + perro2.ladrar());
    }
}
