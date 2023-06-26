package tests;

import classes.*;

public class EnviarNotificacion {
  public static void main(String[] args) throws Exception {
    Socio socio = new Socio(new WhatsApp());
    boolean resultado = socio.enviarNotificacion(
      new Notificacion("Mensaje de la notificación"));
      
    System.out.println("Resultado: " + resultado);
  }
}
