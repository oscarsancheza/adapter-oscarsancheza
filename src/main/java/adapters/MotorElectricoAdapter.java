package adapters;

import motorCombustible.MotorCombustible;
import motorElectrico.MotorElectrico;

public class MotorElectricoAdapter implements MotorCombustible {

  private MotorElectrico motorElectrico;

  public MotorElectricoAdapter(MotorElectrico motorElectrico) {
    this.motorElectrico = motorElectrico;
  }

  @Override
  public void encender() {
    motorElectrico.activar();
  }

  @Override
  public void acelerar() {
    motorElectrico.moverMasRapido();
  }

  @Override
  public void apagar() {
    motorElectrico.detener();
  }
}