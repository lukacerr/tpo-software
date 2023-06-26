package tests;

import classes.*;
import classes.enums.*;

public class EfectuarPrestamo {
    public static void main(String[] args) throws Exception {
    Socio socio = new Socio(new WhatsApp());
    Ejemplar ejemplar = Ejemplar.buscarEjemplar(
      "El Principito", 
      "Antoine de Saint-Exupéry", 
      null, 
      CategoriaEjemplar.Libro
      ).ejemplar;

    boolean resultado = socio.EfectuarPrestamo(ejemplar.identificar());
    System.out.println("Resultado: " + resultado);
  }
}
