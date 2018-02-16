package maquina.cafe;

public class Dinero {

    public static Float credito=0F;

    public static Float devolverCambio(Float pProducto, Float dinero) {

        return dinero-pProducto;

    }

    public static void restCredit() {
        credito=0F;
    }

    public static void addDinero(Float valor) {

        credito+=valor;

    }

    public static Float verCredito() {
        return credito;
    }

    public static Float devolverPrecio(int pos) {
        return CargaProductos.lProductos.get(pos).getPrecio();

    }

    public static Float faltaCredito(Float creditoInt, Float pProducto) {
        return creditoInt-pProducto;
    }

}
