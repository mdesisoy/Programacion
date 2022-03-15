/*
Modificar la tabla de manera que convierta los numeros negativos en positivos
y los positivos los multiplique por 5
*/
package primera;


public class Ejercicio027 {
    public static void main(String arg[]){
        int tabla[][] = {{10, 20, -30, -40}, {50, 60, -70, 80}, {90, 100, -110, 120}};
        for(int i = 0; i < tabla.length; i++){
            for (int j = 0; j < tabla[i].length; j++){
                if(tabla[i][j] > 0)
                    tabla[i][j] *= 5;
                else
                    tabla[i][j] *= -1;
                System.out.printf(" %d ", tabla[i][j]);
            }
            System.out.println();
        }
        
    }
}
