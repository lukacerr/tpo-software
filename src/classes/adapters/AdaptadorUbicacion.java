package classes.adapters;

import classes.Ubicacion;
import classes.adapters.apis.UbicacionAPI;

public class AdaptadorUbicacion {
  private UbicacionAPI ubicacion;

  public AdaptadorUbicacion() {
    ubicacion = new UbicacionAPI();
  }

  public Ubicacion obtenerUbicacion(int idEjemplar) { 
    return ubicacion.getById(idEjemplar);
  }
}
