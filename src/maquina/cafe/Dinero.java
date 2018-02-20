package maquina.cafe;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dinero {

    private static Float credito = 0F;

    /**
     * Metodo que devuelve el cambio de un producto ya preparado
     *
     * @param pProducto
     * @param dinero
     * @return Un Float cambio, resultado de dinero menos producto
     */
    public static Float devolverCambio(Float pProducto, Float dinero) {
        // Usando la clase BigDecimal , usando el método setScale que recibe
        //dos parámetros la cantidad de decimales a limitar y el modo de redondeo
        Float num = dinero - pProducto;
        BigDecimal bd = new BigDecimal(num);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();

    }

    /**
     * Metodo que pone la variable credito a 0
     */
    public static void restCredit() {
        credito = 0F;
    }

    /**
     * Metodo que agrega valor númerico a credito que representa el dinero
     * introducido
     *
     * @param valor
     */
    public static void addDinero(Float valor) {

        credito += valor;

    }

    /**
     * Metodo que devuelve la variable credito
     *
     * @return Un Float con el valor de credito
     */
    public static Float CreditoIn() {
        return credito;
    }

    /**
     * Metodo que busca el producto en el array de la clase CargarProductos a
     * traves de la posición y obtiene el precio
     *
     * @param pos
     * @return Un Float con el precio del producto seleccionado
     */
    public static Float devolverPrecio(int pos) {

        return CargaProductos.lProductos.get(pos).getPrecio();

    }

    /**
     * Metodo que indica si falta credito para adquirir un producto
     *
     * @param creditoInt
     * @param pProducto
     * @return Un Float faltaCredito, resultado del valor credito menos el coste
     * del producto
     */
    public static Float faltaCredito(Float creditoInt, Float pProducto) {
        // Usando la clase BigDecimal , usando el método setScale que recibe
        //dos parámetros la cantidad de decimales a limitar y el modo de redondeo
        Float num = creditoInt - pProducto;
        BigDecimal bd = new BigDecimal(num);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();
    }

}
