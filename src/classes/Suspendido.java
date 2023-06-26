package classes;

import classes.abstractas.Estado;

public class Suspendido extends Estado {

  @Override
  public int calculoDiasHabilesHandle() {
    return -999;
  }
}
