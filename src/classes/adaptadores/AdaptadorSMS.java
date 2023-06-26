package classes.adaptadores;

import classes.Notificacion;
import classes.adaptadores.apis.SMSAPI;

public class AdaptadorSMS {
  private SMSAPI sms;

  public AdaptadorSMS() {
    sms = new SMSAPI();
  }

  public boolean enviarNotificacion(Notificacion notificacion) {
    return sms.enviarNotificacion(notificacion);
  }
}
