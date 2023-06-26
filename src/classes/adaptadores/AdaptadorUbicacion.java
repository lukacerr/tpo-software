package classes.adaptadores;

import classes.Ubicacion;
import classes.adaptadores.apis.UbicacionAPI;

public class AdaptadorUbicacion {
  private UbicacionAPI ubicacion;

  public AdaptadorUbicacion() {
    ubicacion = new UbicacionAPI();
  }

  public Ubicacion obtenerUbicacion(int idEjemplar) { 
    return ubicacion.getById(idEjemplar);
  }
}
