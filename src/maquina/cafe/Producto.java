package maquina.cafe;

public class Producto {

    private Float precio;
    private String nombre;
    private static Integer azucar;

    public Producto(Float precio, String nombre) {
        this.precio=precio;
        this.nombre=nombre;
        this.azucar=3;
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

    @Override
    public String toString() {
        return "precio="+precio+", nombre="+nombre+", azucar="+azucar;
    }

}
