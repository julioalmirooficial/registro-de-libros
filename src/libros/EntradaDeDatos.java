package libros;

import javax.swing.*;
import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cerrar = "true";
        while (cerrar.equalsIgnoreCase("true")) {
            JOptionPane.showInputDialog("INGRESA TU NOMBRE");
            cerrar  = JOptionPane.showInputDialog("INGRESA VERDARO CONTINUAR EL INGRESO DE NOMBRES O FALSO PARA CERRAR");
        }
    }
}
