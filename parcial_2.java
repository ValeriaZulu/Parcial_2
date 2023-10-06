
public class parcial_2 {
public static void main(String[] args) {

int hoteles=(int) (Math.random() *7 + 1); 



int[] tipoLuz=new int[hoteles];
for(int i=0;i<hoteles;i++){
    tipoLuz[i]=(int) (Math.random() * 3 +1);
}

int[] pisos=new int[hoteles];
for(int i=0;i<hoteles;i++){
pisos[i]=(int) (Math.random() * (15 - 3 + 1) + 3);
}

int[] horasLuces=new int[hoteles];
for(int i=0;i<horasLuces.length;i++){
    horasLuces[i]=(int) (Math.random() * 23 + 1);
    System.out.println("El hotel " + (i+1) + " tuvo las luces encendidas " + horasLuces[i] + " horas");
}
}

/*int luces=0;
for(int i:pisos){
    luces *= 3;
} */

}

