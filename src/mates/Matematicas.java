package mates;

import java.util.Random;

public class Matematicas {

    public static double generarNumeroPiIterativo(long pasos) {
        long puntosDentroCirculo = 0;

        Random rand = new Random();

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
        return generarNumeroPiRecursivoAux(pasos, 0, 0);
    }

    private static double generarNumeroPiRecursivoAux(long pasos, long puntosDentroCirculo, long totalPuntos) {
        if (pasos == 0) {
            return 4.0 * puntosDentroCirculo / totalPuntos;
        }

        Random rand = new Random();

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