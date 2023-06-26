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

  public int identificar() {
    return id;
  }

  public int getDiasDePrestamo() {
    return categoriaEjemplar == CategoriaEjemplar.Libro 
      ? PrestamosPorDefecto.diasHabilesLibro 
      : PrestamosPorDefecto.diasHabilesOtros;
  }

  public static EjemplarUbicacionDto buscarEjemplar(int idEjemplar) {
    Ejemplar ejemplar = findEjemplarBy(idEjemplar);
    Ubicacion ubicacion = Ubicacion.obtenerUbicacion(idEjemplar);
    return new EjemplarUbicacionDto(ejemplar, ubicacion);
  }

  public static EjemplarUbicacionDto buscarEjemplar(String titulo, String autor, Date fechaDePublicacion, CategoriaEjemplar categoria) {
    Ejemplar ejemplar = findEjemplarBy(titulo, autor, fechaDePublicacion, categoria);
    Ubicacion ubicacion = Ubicacion.obtenerUbicacion(ejemplar.id);
    return new EjemplarUbicacionDto(ejemplar, ubicacion);
  }

  private static Ejemplar findEjemplarBy(int idEjemplar) {
    return new Ejemplar(null, null, null, null);
  }

  private static Ejemplar findEjemplarBy(String titulo, String autor, Date fechaDePublicacion, CategoriaEjemplar categoria) {
    return new Ejemplar(titulo, autor, fechaDePublicacion, categoria);
  }
}
