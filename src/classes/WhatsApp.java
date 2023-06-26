package classes;

import classes.abstractas.MedioDeComunicacion;
import classes.adaptadores.AdaptadorWhatsApp;

public class WhatsApp extends MedioDeComunicacion {

  @Override
  public boolean enviarNotificacion(Notificacion notificacion) {
    return new AdaptadorWhatsApp().enviarNotificacion(notificacion);
  }
}
