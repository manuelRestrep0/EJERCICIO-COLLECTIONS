import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SistemaVentas {
    private static Map<Integer,Tienda> tiendas = new HashMap<Integer,Tienda>();

    public static void agregarTienda(Tienda tienda){
        tiendas.put(tienda.getId(),tienda);
    }
    public static void agregarVenta(int identificador, Venta venta){
        Tienda aux = tiendas.get(identificador);
        aux.agregarVenta(venta);
    }
    public static void mostrarTiendas(){
        for(Map.Entry entry: tiendas.entrySet()){
            Tienda aux = (Tienda) entry.getValue();
            System.out.println("Key de la tienda en el map tiendad:"+entry.getKey());
            aux.mostrarTienda();
        }
    }
}
