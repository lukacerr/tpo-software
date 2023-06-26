package tests;

import classes.PrestamosPorDefecto;

public class ModificarDiasHabiles {
  public static void main(String[] args) throws Exception {    
    System.out.println(
      "ANTES: Libro = " + PrestamosPorDefecto.diasHabilesLibro 
      + " | Otros = " + PrestamosPorDefecto.diasHabilesOtros
    );

    PrestamosPorDefecto.modificarDiasHabilesLibro(15);
    PrestamosPorDefecto.modificarDiasHabilesOtros(10);

    System.out.println(
      "AHORA: Libro = " + PrestamosPorDefecto.diasHabilesLibro 
      + " | Otros = " + PrestamosPorDefecto.diasHabilesOtros
    );
  }
}
