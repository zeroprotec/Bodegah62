package BodegaH62;
public class Producto {

    // Atributos
    private String tipo;
    private String nombre;
    private String marca;
    private String presentacion;
    private String codigo;
    private int precio;
    private int cantidad;

    // Constructor 1
public Producto() {
        this.tipo = "";
        this.nombre = "";
        this.marca = "";
        this.presentacion = "";
        this.codigo = "";
        this.precio = 0;
        this.cantidad = 0;

}
    // Cosntructor Main
public void Producto(String tipo, String nombre, String marca, String presentacion, String codigo, int precio, int cantidad) {
        // To Do implement here
        this.tipo = tipo;
        this.nombre = nombre;
        this.marca = marca;
        this.presentacion = presentacion;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
}
    // Getters
public String getTipo() {
        return tipo;
}

public String getNombre() {
        return nombre;
}

public String getMarca() {
        return marca;
}

public String getPresentacion() {
        return presentacion;
}

public int getPrecio() {
        return precio;
}

public int getCantidad() {
        return cantidad;
}
    // Setters
public void setPrecio(int precio) {
        this.precio = precio;
}

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
}
}