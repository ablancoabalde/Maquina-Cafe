package maquina.cafe;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dinero {

    private static Float credito=0F;

    public static Float devolverCambio(Float pProducto, Float dinero) {
        // Usando la clase BigDecimal , usando el método setScale que recibe
        //dos parámetros la cantidad de decimales a limitar y el modo de redondeo
        Float num=dinero-pProducto;
        BigDecimal bd=new BigDecimal(num);
        bd=bd.setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();

    }

    public static void restCredit() {
        credito=0F;
    }

    public static void addDinero(Float valor) {

        credito+=valor;

    }

    public static Float CreditoIn() {
        return credito;
    }

    public static Float devolverPrecio(int pos) {

        return CargaProductos.lProductos.get(pos).getPrecio();

    }

    public static Float faltaCredito(Float creditoInt, Float pProducto) {
        // Usando la clase BigDecimal , usando el método setScale que recibe
        //dos parámetros la cantidad de decimales a limitar y el modo de redondeo
        Float num=creditoInt-pProducto;
        BigDecimal bd=new BigDecimal(num);
        bd=bd.setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();
    }

}
