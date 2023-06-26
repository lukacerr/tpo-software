package classes;

import java.util.Date;

import classes.dtos.*;
import classes.enums.*;

public class Ejemplar {
  private int id;
  private String titulo;
  private String autor;
  private Date fechaDePublicacion;
  private CategoriaEjemplar categoriaEjemplar;

  public Ejemplar(String Titulo, String Autor, Date FechaDePublicacion, CategoriaEjemplar CategoriaEjemplar) {
    id = 1;
    titulo = Titulo;
    autor = Autor;
    fechaDePublicacion = FechaDePublicacion;
    categoriaEjemplar = CategoriaEjemplar;
  }

  public EjemplarUbicacionDto buscarEjemplar(String titulo, String autor, Date fechaDePublicacion, CategoriaEjemplar categoria) {
    Ejemplar ejemplar = findEjemplarBy(titulo, autor, fechaDePublicacion, categoria);
    Ubicacion ubicacion = Ubicacion.obtenerUbicacion(ejemplar.id);
    return new EjemplarUbicacionDto(ejemplar, ubicacion);
  }

  private Ejemplar findEjemplarBy(String titulo, String autor, Date fechaDePublicacion, CategoriaEjemplar categoria) {
    return new Ejemplar(titulo, autor, fechaDePublicacion, categoria);
  }
}
