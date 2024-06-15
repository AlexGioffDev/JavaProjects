public class Producto {
    private String fabricante;
    private String nombre;
    private int precio;

    public Producto(int precio, String nombre, String fabricante) {
        this.precio = precio;
        this.nombre = nombre;
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
}
