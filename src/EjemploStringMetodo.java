
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class EjemploStringMetodo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la opcion para comvertir \n1. cantidad de carateres \n2. Primera letra mayuscula \n3. todo minuscula \n4. todo mayuscula");
        int opcion = 0;
        try {
            opcion = scanner.nextInt();
        } catch(InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "ingres un de las sigresa un entreto");
            System.exit(0);
        }

        String nombre = JOptionPane.showInputDialog(null, "ingrese cualquier dato para ver la cantidad de caracteres");
        

        switch (opcion) {
            case 1:
                int cantidad = cantidadCatacteres(nombre);
                System.out.println("ver cuantos caracteres: " + cantidad);
                break;

            case 2:
                String pirmerMuscula = primerLetraMuscula(nombre);
                System.out.println("primera letra Muyuscula: "+ pirmerMuscula);
                break;

            case 3:
                String todoMinuscula = minuscula(nombre);
                System.out.println("todo en minuscula: " + todoMinuscula);
                break;
            
            case 4:
                String todoMayuscula = mayuscula(nombre);
                System.out.println("todo en mayuscula: " + todoMayuscula);
                break;

            default:
                JOptionPane.showMessageDialog(null, "el numeor que ingresaste no esta en las opcion, las opciones son \n1. cantidad de carateres \n2. Primera letra mayuscula \n3. todo minuscula \n4. todo mayuscula");
                break;
        }
        scanner.close();
    }

    public static int cantidadCatacteres(String nombre) {
        return nombre.length();
    }

    public static String primerLetraMuscula(String nombre){
        boolean isNull = nombre == null;
        if(isNull || nombre.isBlank()) {
            return nombre;
        }

        String[] espacioPalabra = nombre.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : espacioPalabra) {
            if (!palabra.isEmpty()) {
                // comvertir la primera pablara en mayusculay el resto en minuscula
                String primeraPalabra = palabra.substring(0, 1).toUpperCase();
                String restoDePalabras = palabra.substring(1).toLowerCase();

                // Unirlas y agregarlas al resulatod con espacio
                resultado.append(primeraPalabra).append(restoDePalabras).append(" ");
            } else {
                resultado.append("");
            }
        }

        return resultado.toString().trim();
    }

    public static String minuscula(String nombre) {
        return nombre.toLowerCase();
    }

    public static String mayuscula(String nombre) {
        return nombre.toUpperCase();
    }

}
