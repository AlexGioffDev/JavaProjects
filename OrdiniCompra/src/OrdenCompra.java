import java.util.Date;

public class OrdenCompra {
    private int id;
    private String description;
    private Date data;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];
    private int indiceProducto;

    private static int ultimoid;


    public OrdenCompra(String description) {
        this.id = ++ultimoid;
        this.description = description;
    }

    // METODI
    public void addProduct(Producto producto) {
        if(indiceProducto < 4) {
            productos[indiceProducto++] = producto;
        } else {
            System.out.println("Troppi prodotti");
        }
    }

    public int getTotal() {
        int total = 0;
        for(Producto product: productos) {
            total += product.getPrecio();
        }
        return total;
    }

    // GET AND SETTER

    public int getId() {
        return id;
    }

    public int getIndiceProducto() {
        return indiceProducto;
    }

    public String getDescription() {
        return description;
    }

    public Date getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
