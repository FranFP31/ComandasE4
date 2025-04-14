/*
* Mostramos el enum donde se pueden verlos 5 menus con sus precios para que se les pueda llamar desde el main y diga los precios */
public enum Menus {
    Menu1(10),Menu2(5),Menu3(7),Menu4(9),Menu5(10);

    int precio;

    Menus(int precio) {
        this.precio = precio;
    }
    //aqui he añadido el get precio para que me tome el precio del enum
    public int getPrecio() {
        return precio;
    }
    //con su correspondiente metodo setter para que se vea el precio
    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
