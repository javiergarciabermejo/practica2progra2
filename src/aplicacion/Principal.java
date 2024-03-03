package aplicacion;

import mates.Matematicas;

public class Principal {
    public static void main(String[] args) {
      
        long pasosIterativo = 1000000;
        double piIterativo = Matematicas.generarNumeroPiIterativo(pasosIterativo);
        System.out.println("Estimación de Pi (Iterativo): " + piIterativo);

      
        long pasosRecursivo = 1000000;
        double piRecursivo = Matematicas.generarNumeroPiRecursivo(pasosRecursivo);
        System.out.println("Estimación de Pi (Recursivo): " + piRecursivo);
    }
}