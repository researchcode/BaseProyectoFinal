package baseproyectofinal;

import java.util.Scanner;

public class BaseProyectoFinal {

    //variables que pueden usarse en cualquier parte del programa
    Scanner sc = new Scanner(System.in); //para leer datos por teclado
    int variableNumerica = 0;
    String variableTexto = "Prueba";

    public static void main(String[] args) {
        BaseProyectoFinal obj = new BaseProyectoFinal(); //objeto de la clase
        obj.ejecutarMenu();
    }//cierra main

    public void mostrarMenu() {
        System.out.println("");
        System.out.println("***********MENÚ***********");
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("3. Salir");
    }//cierra mostrarMenu

    public void ejecutarMenu() {
        byte opcion = 0;
        do {
            mostrarMenu();
            System.out.println("Seleccione una opción");
            opcion = Byte.parseByte(sc.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Ingresó a la opción 1");
                    metodoOpcion1();
                    break;
                case 2:
                    System.out.println("Ingresó a la opción 2");
                    metodoOpcion2();
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción NO disponible.");
                    break;
            }
            opcion = 0;
        } while (opcion != 3);
    }//cierra ejecutarMenu
    
    public void metodoOpcion1(){
        System.out.println("Hola, estás en el método de la opción 1");
        System.out.println("Contenido primer variable: " + variableNumerica);
    }//cierra metodoOpcion1
    
    public void metodoOpcion2(){
        System.out.println("Hola, estás en el método de la opción 1");
        System.out.println("Contenido segunda variable: " + variableTexto);
    }//cierra metodoOpcion2
    
}//cierra class
