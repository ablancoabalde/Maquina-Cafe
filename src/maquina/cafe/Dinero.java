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
    
    public static Float verCredito(){
        return credito;
    }
    
    public static Float devolverPrecio(int pos){
              switch (pos) {
            case 0:
                return CargaProductos.lProductos.get(0).getPrecio();

            case 1:
                return CargaProductos.lProductos.get(1).getPrecio();

            case 2:
                return CargaProductos.lProductos.get(2).getPrecio();

        }
        return null;
    }
    
    public static Float faltaCredito(Float creditoInt, Float pProducto){
        return creditoInt - pProducto;
    }

}
