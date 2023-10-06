
public class parcial_2 {
    public static void main(String[] args) {

        // cantidad de hoteles (aleatorio)
        int hoteles = (int) (Math.random() * 7 + 1);

        System.out.println("Cantidad de hoteles: " + hoteles);

        // imprimo un espacio para separar
        System.out.println();

        // inicio el arrays para los tipos de luces
        int[] tipoLuz = new int[hoteles];
        //lleno el array de tipos de luces e imprimo a qué tipo de luz corresponde 
        for (int i = 0; i < hoteles; i++) {
            tipoLuz[i] = (int) (Math.random() * 3 + 1);
            if (tipoLuz[i] == 1) {
                String luz = "halógena";
                System.out.println("El hotel " + (i + 1) + " usa luz " + luz);

            } else if (tipoLuz[i] == 2) {
                String luz = "led";
                System.out.println("El hotel " + (i + 1) + " usa luz " + luz);

            } else if (tipoLuz[i] == 3) {
                String luz = "multiled";
                System.out.println("El hotel " + (i + 1) + " usa luz " + luz);
            }
        }
        // imprimo un espacio para separar
        System.out.println();

        // inicio el array para la cantidad de pisos
        int[] pisos = new int[hoteles];
        for (int i = 0; i < hoteles; i++) {
            pisos[i] = (int) (Math.random() * (15 - 3 + 1) + 3);
            System.out.println("El hotel " + (i + 1) + " tiene " + pisos[i] + " pisos");

        }

        // imprimo un espacio para separar
        System.out.println();

        // inicio el array para las horas que las luces estuvieron encendidas
        int[] horasLuces = new int[hoteles];
        for (int i = 0; i < horasLuces.length; i++) {
            horasLuces[i] = (int) (Math.random() * 23 + 1);
        }

        // imprimo un espacio para separar
        System.out.println();

        for (int i = 0; i < hoteles; i++) {
            System.out.println("El hotel " + (i + 1) + " usa luz " + horasLuces[i] + " horas");

        }

        // imprimo un espacio para separar
        System.out.println();

        // ciclo para calcualar cuánto gasta cada hotel en luces, lo cual se guarda en
        // un array

        double[] precios = new double[hoteles];

        for (int i = 0; i < precios.length; i++) {

            if (tipoLuz[i] == 1) {
                // Precio de una hora
                double precioHora = pisos[i] * (3) * (0.25);
                // Precio de todas las horas
                double precioTotal = precioHora * horasLuces[i];
                precios[i] = precioTotal;
                System.out.println("El hotel " + (i + 1) + " gastó $" + precioTotal + " en luces.");

            } else if (tipoLuz[i] == 2) {
                // Precio de una hora
                double precioHora = pisos[i] * (3) * (0.5);
                // Precio de todas las horas
                double precioTotal = precioHora * horasLuces[i];
                precios[i] = precioTotal;
                System.out.println("El hotel " + (i + 1) + " gastó $" + precioTotal + " en luces.");

            } else if (tipoLuz[i] == 3) {
                // Precio de una hora
                double precioHora = pisos[i] * (3) * (1);
                // Precio de todas las horas
                double precioTotal = precioHora * horasLuces[i];
                precios[i] = precioTotal;
                System.out.println("El hotel " + (i + 1) + " gastó $" + precioTotal + " en luces");
            }
        }

        // imprimo un espacio para separar
        System.out.println();

        
        //Proceso para identificar el hotel que más gasta
        int posicionMayor = 0;
        for (int x = 1; x < precios.length; x++) {
            if (precios[x] > precios[posicionMayor]) {
                posicionMayor = x;
            }
        }
        System.out.println("El que más gasta en luces es el hotel " + (posicionMayor + 1));
    }
}
