public class Venta {
    private int id;
    private String descripcion;
    private double precio;

    public Venta(int id, String descripcion, double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public void mostrarVenta(){
        System.out.println(descripcion+" :"+precio);
    }
}
