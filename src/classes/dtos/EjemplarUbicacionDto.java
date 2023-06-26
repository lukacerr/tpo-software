package classes.dtos;

import classes.Ejemplar;
import classes.Ubicacion;

public class EjemplarUbicacionDto {
  public final Ejemplar ejemplar;
  public final Ubicacion ubicacion;

  public EjemplarUbicacionDto(Ejemplar Ejemplar, Ubicacion Ubicacion) {
    ejemplar = Ejemplar;
    ubicacion = Ubicacion;
  }
}
