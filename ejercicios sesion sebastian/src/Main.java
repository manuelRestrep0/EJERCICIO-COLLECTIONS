import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Venta> ventasAux = new ArrayList<>();
        ventasAux.add(new Venta(1,"Carro",100000));
        ventasAux.add(new Venta(2,"Moto",9999));
        ventasAux.add(new Venta(3,"Agua",1234));
        Tienda tiendaAux = new Tienda(1,ventasAux);
        SistemaVentas.agregarTienda(tiendaAux);
        tiendaAux = new Tienda(2,ventasAux);
        SistemaVentas.agregarTienda(tiendaAux);
        tiendaAux = new Tienda(3,ventasAux);
        SistemaVentas.agregarTienda(tiendaAux);

        Venta ventaAux = new Venta(5,"Coca Cola",2500);
        SistemaVentas.agregarVenta(3,ventaAux);
        SistemaVentas.mostrarTiendas();
    }
}