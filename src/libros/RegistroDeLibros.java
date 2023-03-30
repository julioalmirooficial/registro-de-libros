package libros;

import java.util.ArrayList;

public class RegistroDeLibros {
    private ArrayList<Libro> registro;

    public  RegistroDeLibros(){
        registro = new ArrayList<Libro>();
    }
    //CUMPLE LA FUNCIONALIDAD DE AGREGAR UN LIBRO
    public void agregarLibro(Libro libro){
        registro.add(libro);
        // PHP8.2, Jesus Arias, 2023, jarias
        System.out.println("FELICIDADES HAS AGREGADO UN LIBRO A TU COLECCIÓN");
    }

    public void buscarLibroPorTitulo(String titulo){
        for (Libro libro : registro){
            if(libro.getTitulo().equals(titulo)) {
                System.out.println(libro.toString());
            } else {
                System.out.println("NO SE PUDO ENCONTRAR EL LIBRO QUE BUSCAS");
            }
        }
    }

    public void buscarLibroPorAutor(String autor){
        for (Libro libro : registro){
            if(libro.getTitulo().equals(autor)) {
                System.out.println(libro.toString());
            } else {
                System.out.println("NO SE PUDO ENCONTRAR EL LIBRO QUE BUSCAS");
            }
        }
    }

    public void eliminarLibro(Libro libro){

        registro.remove(libro);
        System.out.println("HAS ELIMINADO UN LIBRO");

    }


}
