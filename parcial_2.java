
public class parcial_2 {
    public static void main(String[] args) {

        //cantidad de hoteles (aleatorio)
        int hoteles = (int) (Math.random() * 7 + 1);

        
        //inicio los arrays para los tipos de luces y la cantidad de pisos 
        //y las horas que las luces estuvieron encendidas
        int[] tipoLuz = new int[hoteles];
        for (int i = 0; i < hoteles; i++) {
            tipoLuz[i] = (int) (Math.random() * 3 + 1);
        }

        int[] pisos = new int[hoteles];
        for (int i = 0; i < hoteles; i++) {
            pisos[i] = (int) (Math.random() * (15 - 3 + 1) + 3);
        }

        int[] horasLuces = new int[hoteles];
        for (int i = 0; i < horasLuces.length; i++) {
            horasLuces[i] = (int) (Math.random() * 23 + 1);
            System.out.println("El hotel " + (i + 1) + " tuvo las luces encendidas " + horasLuces[i] + " horas");
        }

        //imprimo un espacio para separar
        System.out.println();

        
        //ciclo para calcualar cuánto gasta cada hotel en luces
        for (int i = 0; i < hoteles; i++) {

            if (tipoLuz[i] == 1) {
                //Precio de una hora
                double precioHora = pisos[i] * (3) * (0.25);
                //Precio de todas las horas
                double precioTotal = precioHora * horasLuces[i];
                System.out.println("El hotel " + (i + 1) + " gastó $" + precioTotal + " en luces.");


            } else if (tipoLuz[i] == 2) {
                //Precio de una hora
                double precioHora = pisos[i] * (3) * (0.5);
                //Precio de todas las horas
                double precioTotal = precioHora * horasLuces[i];
                System.out.println("El hotel " + (i + 1) + " gastó $" + precioTotal + " en luces.");


            } else if (tipoLuz[i] == 3) {
                //Precio de una hora
                double precioHora = pisos[i] * (3) * (1);
                //Precio de todas las horas
                double precioTotal = precioHora * horasLuces[i];
                System.out.println("El hotel " + (i + 1) + " gastó $" + precioTotal + " en luces.");
            }


        }

    }
}
