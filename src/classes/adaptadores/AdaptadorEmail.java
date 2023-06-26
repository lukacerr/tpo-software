package classes.adaptadores;

import classes.Notificacion;
import classes.adaptadores.apis.EmailAPI;

public class AdaptadorEmail {
  private EmailAPI email;

  public AdaptadorEmail() {
    email = new EmailAPI();
  }

  public boolean enviarNotificacion(Notificacion notificacion) {
    return email.enviarNotificacion(notificacion);
  }
}
