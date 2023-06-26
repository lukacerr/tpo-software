package classes;

import java.util.Date;

public class Prestamo {
  private int id;
  private Socio socio;
  private Ejemplar ejemplar;
  private Date fechaInicio;
  private Date fechaFin;
  private boolean devuelto;

  public Prestamo(Socio Socio, Ejemplar Ejemplar, Date FechaFin) {
    id = 1;
    socio = Socio;
    ejemplar = Ejemplar;
    fechaInicio = new Date();
    fechaFin = FechaFin;
    devuelto = false;
  }

  public void actualizarEstado(boolean Devuelto) {
    devuelto = Devuelto;
  }
}
