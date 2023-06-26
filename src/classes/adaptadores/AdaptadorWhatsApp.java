package classes.adaptadores;

import classes.Notificacion;
import classes.adaptadores.apis.WhatsAppAPI;

public class AdaptadorWhatsApp {
  private WhatsAppAPI whatsApp;

  public AdaptadorWhatsApp() {
    whatsApp = new WhatsAppAPI();
  }

  public boolean enviarNotificacion(Notificacion notificacion) {
    return whatsApp.enviarNotificacion(notificacion);
  }
}
