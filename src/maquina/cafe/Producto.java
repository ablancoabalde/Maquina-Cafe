package maquina.cafe;

public class Producto {

    private Float precio;
    private String nombre;
    public static Integer azucar = 3;

    /**
     * Constructor del producto
     *
     * @param precio
     * @param nombre
     */
    public Producto(Float precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    /**
     * Getter del valor precio del producto
     *
     * @return Un FLoat con el precio del producto
     */
    public Float getPrecio() {
        return precio;

    }

}
