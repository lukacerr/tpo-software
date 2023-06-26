package classes;

import classes.adapters.AdaptadorUbicacion;

public class Ubicacion {
  private String sector;
  private String pasillo;
  private int estanteria;
  private int estante;

  public Ubicacion() { }

  public Ubicacion(String Sector, String Pasillo, int Estanteria, int Estante) { 
    sector = Sector;
    pasillo = Pasillo;
    estanteria = Estanteria;
    estante = Estante;
  }

  public String asString() {
    return "Sector: " + sector 
      + " | Pasillo: " + pasillo 
      + " | Estantería: " + estanteria 
      + " | Estante: " + estante;
  }

  public static Ubicacion obtenerUbicacion(int idEjemplar) {
    return new AdaptadorUbicacion().obtenerUbicacion(idEjemplar);
  }
}
