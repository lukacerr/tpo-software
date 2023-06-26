package classes;
import java.util.*;

import classes.abstractas.*;

public class Socio extends Usuario {
  private MedioDeComunicacion medioDeComunicacion;
  private Estado estado; 

  public Socio(MedioDeComunicacion MedioDeComunicacion) {
    estado = new Habilitado();
    medioDeComunicacion = MedioDeComunicacion;
  }

  public boolean EfectuarPrestamo(int idEjemplar) {
    Ejemplar ejemplar = Ejemplar.buscarEjemplar(idEjemplar).ejemplar;
    int diasDePrestamo = ejemplar.getDiasDePrestamo() + calculoDiasHabiles();
    if (diasDePrestamo <= 0) return false;
    
    Date fechaFin = generarFechaFin(diasDePrestamo);
    new Prestamo(this, ejemplar, fechaFin);
    
    return true;
  }

  public boolean enviarNotificacion(Notificacion notificacion) {
    return medioDeComunicacion.enviarNotificacion(notificacion);
  }

  public List<Prestamo> GetHistorialDePrestamos() {
    return new ArrayList<Prestamo>();
  }

  public int calculoDiasHabiles() {
    return estado.calculoDiasHabilesHandle();
  }

  private Date generarFechaFin(int diasDePrestamo) {
    Date fechaFin = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(fechaFin);
    c.add(Calendar.DATE, diasDePrestamo);
    return c.getTime();
  }
}
