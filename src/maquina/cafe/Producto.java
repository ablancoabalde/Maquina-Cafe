package maquina.cafe;

public class  Producto {

    private Float precio;
    private String nombre;
    public static Integer azucar=3;
    /**
     * 
     * @param precio
     * @param nombre 
     */
    public Producto(Float precio, String nombre) {
        this.precio=precio;
        this.nombre=nombre;        
    }

    public Float getPrecio() {
        return precio;

    }

    public void setPrecio(Float precio) {
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public void setAzucar(Integer azucar) {
        this.azucar=azucar;
    }

}
