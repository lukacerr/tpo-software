package classes;
import java.time.LocalDate;
import java.util.*;

import classes.abstractas.*;
import classes.interfaces.IEstado;

public class Socio extends Usuario {
  private MedioDeComunicacion medioDeComunicacion;
  private IEstado estado; 

  public Prestamo EfectuarPrestamo(int idEjemplar) {
    Ejemplar ejemplar = Ejemplar.buscarEjemplar(idEjemplar).ejemplar;
    Date fechaFin = new Date();
    // TODO: Sumarle días en función a categoría
    return new Prestamo(this, ejemplar, fechaFin);
  }

  public List<Prestamo> GetHistorialDePrestamos() {
    return new ArrayList<Prestamo>();
  }
}
