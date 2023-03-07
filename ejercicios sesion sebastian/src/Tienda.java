import java.util.ArrayList;

public class Tienda {
    private int id;
    private ArrayList<Venta> ventas = new ArrayList<>();

    public Tienda(int id, ArrayList<Venta> ventas) {
        this.id = id;
        this.ventas = ventas;
    }

    public void agregarVenta(Venta venta){
        ventas.add(venta);
    }
    public void mostrarTienda(){
        System.out.println("Identificador tienda: "+id);
        System.out.println("Ventas: ");
        for (Venta venta:ventas) {
            venta.mostrarVenta();
        }
        System.out.println("-------------");
    }

    public int getId() {
        return id;
    }
}
