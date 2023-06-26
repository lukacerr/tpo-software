package classes.adapters.apis;

import classes.Ubicacion;

public class UbicacionAPI {
  public UbicacionAPI() {}

  public Ubicacion getById(int idEjemplar) {
    return new Ubicacion("AA2", "B1", 1, 2);
  }
}
