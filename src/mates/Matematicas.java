package mates;

import java.util.Random;

public class Matematicas {

    private static Random rand = new Random();

    public static double generarNumeroPiIterativo(long pasos) {
        long puntosDentroCirculo = 0;

        for (long i = 0; i < pasos; i++) {
            double x = rand.nextDouble();
            double y = rand.nextDouble();

            double distanciaAlOrigen = Math.sqrt(x * x + y * y);

            if (distanciaAlOrigen <= 1) {
                puntosDentroCirculo++;
            }
        }

        return 4.0 * puntosDentroCirculo / pasos;
    }

    public static double generarNumeroPiRecursivo(long pasos) {
        if (pasos < 0) {
            throw new IllegalArgumentException("El número de pasos no puede ser negativo.");
        }

        return generarNumeroPiRecursivoAux(pasos, 0, 0);
    }

    private static double generarNumeroPiRecursivoAux(long pasos, long puntosDentroCirculo, long totalPuntos) {
        if (pasos == 0) {
            return (totalPuntos > 0) ? 4.0 * puntosDentroCirculo / totalPuntos : 0.0;
        }

        double x = rand.nextDouble();
        double y = rand.nextDouble();

        double distanciaAlOrigen = Math.sqrt(x * x + y * y);

        if (distanciaAlOrigen <= 1) {
            return generarNumeroPiRecursivoAux(pasos - 1, puntosDentroCirculo + 1, totalPuntos + 1);
        } else {
            return generarNumeroPiRecursivoAux(pasos - 1, puntosDentroCirculo, totalPuntos + 1);
        }
    }
}
