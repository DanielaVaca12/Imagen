package triangulos;

import java.util.Arrays;
import java.util.Objects;

public class Imagen {
  public static int[] oscurecerImagen(int[] pixeles, String oscurecer, int porcentaje){
    int[] resultado = new int[pixeles.length];
    if (Objects.equals(oscurecer, "oscurecer")) {
      for (int i = 0; i < pixeles.length ; i++) {
        if (pixeles[i] + pixeles[i] * porcentaje / 100 < 255) {
          resultado[i] = pixeles[i] + pixeles[i] * porcentaje / 100;
        }else{
          resultado[i] = pixeles[i];
        }
      }
    }
    return resultado;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(oscurecerImagen(new int[]{255, 100, 50, 200, 20, 66}, "oscurecer", 20)));
  }
}
