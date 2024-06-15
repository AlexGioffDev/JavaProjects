
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra primero = new OrdenCompra("Ordine di quattro bottiglie");
        primero.setCliente(new Cliente("Micheal", "Rodriguez"));
        Calendar calendar = Calendar.getInstance();
        calendar.set(2025, Calendar.AUGUST, 10);
        Date date = calendar.getTime();
        primero.setData(date);
        primero.addProduct(new Producto(20, "Rum", "Nics"));
        primero.addProduct(new Producto(10, "Acqua", "Nics"));
        primero.addProduct(new Producto(5, "Rum", "Nics"));
        primero.addProduct(new Producto(20, "Rum", "Nics"));

        System.out.println("---------------");
        dettagliOrdini(primero);

        // Secondo ordine
        OrdenCompra secondo = new OrdenCompra("Ordine di quattro bottiglie di vino");
        secondo.setCliente(new Cliente("Maria", "Garcia"));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2025, Calendar.SEPTEMBER, 20);
        Date date2 = calendar2.getTime();
        secondo.setData(date2);
        secondo.addProduct(new Producto(10, "Vino Bianco", "VinoItalia"));
        secondo.addProduct(new Producto(8, "Cioccolato Fondente", "Lindt")); // Aggiunto un altro prodotto
        secondo.addProduct(new Producto(12, "Vino Rosato", "VinoItalia")); // Aggiunto un terzo prodotto
        secondo.addProduct(new Producto(7, "Cioccolato al Latte", "Ferrero")); // Aggiunto un quarto prodotto

        System.out.println("---------------");
        dettagliOrdini(secondo);

        // Terzo ordine
        OrdenCompra terzo = new OrdenCompra("Ordine di quattro cioccolatini");
        terzo.setCliente(new Cliente("Anna", "Rossi"));
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(2025, Calendar.OCTOBER, 5);
        Date date3 = calendar3.getTime();
        terzo.setData(date3);
        terzo.addProduct(new Producto(8, "Cioccolato Fondente", "Lindt"));
        terzo.addProduct(new Producto(10, "Cioccolato al Latte", "Ferrero"));
        terzo.addProduct(new Producto(5, "Cioccolato Bianco", "Lindt")); // Aggiunto un terzo prodotto
        terzo.addProduct(new Producto(15, "Cioccolato con Nocciole", "Ferrero")); // Aggiunto un quarto prodotto

        System.out.println("---------------");
        dettagliOrdini(terzo);
    }


    public static void dettagliOrdini(OrdenCompra orden) {
        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy");
        String fechaStr = df.format(orden.getData());
        System.out.println("Dettagli ordine: " + orden.getDescription());
        System.out.println("Cliente: " +orden.getCliente().getNombre() + " " +orden.getCliente().getApellido());
        System.out.println("Fecha: " + fechaStr);
        System.out.println("Productos:");
        for(Producto product: orden.getProductos()) {
            System.out.println("\t"+product.getNombre() +" - " +product.getFabricante() + " - $" +product.getPrecio());
        }
        System.out.println("Total: $" + orden.getTotal());

    }
}
