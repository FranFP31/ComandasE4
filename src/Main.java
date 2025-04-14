import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Instrucciones
Diseñar en Java con POO en donde el Camarero de un Bar pueda  tomar notas de los Menús que se sirven.

Tenemos el MENU1 MENU2 MENU3 MENU4 MENU5

El camarero en el pedido indicará :
La mesa al que se hace referencia el pedido
Los menús que piden los clientes
El saldo del pedido
Y cuando lo soliciten los clientes, la cuenta a pagar.

        Recomendaciones:  ENUM/ArraysList/Arrays para los productos, el que tu prefieras, POO, instanciar la clase Comandas con un Ejemplo. Comenta el código

Valoración:
        2 puntos POO
2 puntos ENUM- ArrayList-Arrays
2 puntos instanciar correctamente la Clase
1 puntos interfaces visuales (JOPTION)
2 puntos Funciones y modularidad de la aplicación
1 punto documentación*/

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Comanda c1=new Comanda(1,Menus.Menu1,5);

        ArrayList<Comanda> clientes=new ArrayList<>();
        clientes.add(c1);

        System.out.println(clientes);
    }



}