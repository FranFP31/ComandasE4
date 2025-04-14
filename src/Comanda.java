public class Comanda {
    int numMesa;
    Menus menu;//Importo los Menus del Enum Menus
    int numClientes;
    double total;
    //Creo el constructor
    public Comanda(int numMesa, Menus x, int numClientes) {
        this.numMesa = numMesa;
        this.menu=x;
        this.numClientes = numClientes;
    }
    //declaro los metodos Getter y Setter

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public int getNumClientes() {
        return numClientes;
    }

    public void setNumClientes(int numClientes) {
        this.numClientes = numClientes;
    }
    //Aqui he intentado calcular el total del, ticket pero no entiendo porque no me ha salido
    public  double total(Menus x,int numClientes){
        total= this.menu.getPrecio()*numClientes;
        return total;
    }

//He intentado hacer en el toString de la salida del los datos, sacar el precio(aunque no ha funcionado), he progbado ademas de realizar la operacion dentro del total en un parentesis pero no se puede ejecutar de esa manera
    @Override
    public String toString() {
        return "Ticket |" + "numMesa=" + numMesa +"|"+
                "Numero de Platos=" + numClientes+"|"+
                "PRECIO "+ this.menu.getPrecio()+"|"+
                "Menu Numero =" +menu +"|"+
                "Total=" + total+"€" ;
    }

}
