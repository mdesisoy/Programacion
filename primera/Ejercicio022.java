/*
Bucles anidados
*/
package primera;


public class Ejercicio022 {
    public static void main(String arg[]){
        for(int i = 0; i < 5; i++){
            System.out.println("Fila: " + i);
            for(int j = 0; j < 5; j++)
                System.out.println("Fila: " + i + "Columna: " + j);
        }
    }
}
