package classes;

import classes.abstractas.MedioDeComunicacion;
import classes.adaptadores.AdaptadorSMS;

public class SMS extends MedioDeComunicacion {

  @Override
  public boolean enviarNotificacion(Notificacion notificacion) {
    return new AdaptadorSMS().enviarNotificacion(notificacion);
  }
}
