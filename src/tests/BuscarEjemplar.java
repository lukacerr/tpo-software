package tests;

import classes.*;
import classes.dtos.EjemplarUbicacionDto;
import classes.enums.*;

public class BuscarEjemplar {
  public static void main(String[] args) throws Exception {
    EjemplarUbicacionDto ejemplarUbicacionDto = Ejemplar.buscarEjemplar(
      "El Principito", 
      "Antoine de Saint-Exupéry", 
      null, 
      CategoriaEjemplar.Libro
      );

    System.out.println("UBICACIÓN: " + ejemplarUbicacionDto.ubicacion.comoString());
  }
}
