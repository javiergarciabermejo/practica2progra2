package aplicacion;

import mates.Matematicas;

public class Principal {
    public static void main(String[] args) {
        long pasos = Long.parseLong(args[0]);

        double piIterativo = Matematicas.generarNumeroPiIterativo(pasos);
        double piRecursivo = Matematicas.generarNumeroPiRecursivo(pasos);

        System.out.println("Aproximación al número PI (Iterativo): " + piIterativo);
        System.out.println("Aproximación al número PI (Recursivo): " + piRecursivo);
    }
}