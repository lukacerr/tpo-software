package classes;

public class PrestamosPorDefecto {
  public static int diasHabilesLibro = 10;
  public static int diasHabilesOtros = 5;

  public static void modificarDiasHabilesLibro(int dias) {
    diasHabilesLibro = dias;
  }

  public static void modificarDiasHabilesOtros(int dias) {
    diasHabilesOtros = dias;
  }
}
