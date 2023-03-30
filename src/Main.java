import libros.Libro;
import libros.RegistroDeLibros;

import java.util.Scanner;

public class Main {
    /*
        Registro de libros: Crea una clase "Libro"
        que tenga atributos como "título", "autor",
        "año de publicación", "editorial", etc. Crea
        otra clase "RegistroDeLibros" que permita agregar,
        buscar y eliminar libros en un registro.
        El programa debe permitir al usuario ingresar
        información de un libro y agregarlo al registro,
        buscar un libro por título o autor y eliminar un
        libro del registro.
      */
    public static void main(String[] args) {
        // IMPLEMENTAR UN SISTEMA DE LOGIN
        RegistroDeLibros registro = new RegistroDeLibros();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        while (!salir){
//MENU DEL SISTEMA
            System.out.println("******** MENU *********");
            System.out.println("Opcion 1: Agregar un libro");
            System.out.println("Opcion 2: Buscar un libro por titulo");
            System.out.println("Opcion 3: Buscar un libro por autor");
            System.out.println("Opcion 4: Eliminar un libro");
            System.out.println("Opcion 5: Salir del sistema");
// ACIONES QUE VA A REALIZAR EL USUARIO
            int opciones = scanner.nextInt();
            scanner.nextLine();
            switch (opciones){
                case 1:
                    System.out.println("AGREGA UN LIBRO");
                    System.out.print("Titulo: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Editorial: ");
                    String editorial = scanner.next();
                    System.out.print("Año de publicacion: ");
                    int anio = scanner.nextInt();


                    Libro libro = new Libro();
                    libro.setTitulo(titulo);
                    libro.setAutor(autor);
                    libro.setEditorial(editorial);
                    libro.setAnioDePublicacion(anio);
                    registro.agregarLibro(libro);
                    break;
                case 5:
                    salir = true;
                    break;
            }

        }


    }
}