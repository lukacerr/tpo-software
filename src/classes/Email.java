package classes;

import classes.abstractas.MedioDeComunicacion;
import classes.adaptadores.AdaptadorEmail;

public class Email extends MedioDeComunicacion {

  @Override
  public boolean enviarNotificacion(Notificacion notificacion) {
    return new AdaptadorEmail().enviarNotificacion(notificacion);
  }
}
