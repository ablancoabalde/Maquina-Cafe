package maquina.cafe;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Display extends Inicio {

    /**
     * Metodo que introduce el valor del precio del producto en un TextField
     *
     * @param pos
     */
    public static void MostrarPrecio(int pos) {
        Jdisplay.setText(String.valueOf(CargaProductos.lProductos.get(pos).getPrecio()));

    }

    /**
     * Metodo que introduce el valor del credito que falta por introducir en un
     * TextField
     *
     * @param pos
     */
    public static void verDevCredito(int pos) {
        Jdisplay.setText("Faltan " + String.valueOf(Dinero.devolverCambio(Dinero.CreditoIn(), Dinero.devolverPrecio(pos))));

    }

    /**
     * Metodo que introduce el valor del cambio del producto en un TextField
     *
     * @param pos
     */
    public static void verDevCambio(int pos) {
        Jdisplay.setText("Su cambio es " + String.valueOf(Dinero.devolverCambio(Dinero.devolverPrecio(pos), Dinero.CreditoIn())));

    }

    /**
     * Metodo que introduce el valor del credito introducido en un TextField
     */
    public static void verCredito() {
        jTcredito.setText(String.valueOf(Dinero.CreditoIn()));

    }

    /**
     * Inserta una imagen escalada con la medidas del Label en este. Y cambie la
     * imagen según indicador
     *
     * @param num
     * @param width
     * @param height
     */
    public static void insertimg(Integer num, Integer width, Integer height) {

        if (num == 0) {
            // Habilitar para ver imagenes en Windows
//            ImageIcon icono = new ImageIcon("D:\\NeatBeansProjects\\Maquina-Cafe\\src\\com\\vasoV.jpg");
            // Habilitar para ver imagenes en Linux
            ImageIcon icono = new ImageIcon("/home/local/DANIELCASTELAO/ablancoabalde/NetBeansProjects/COD/Maquina-Cafe/src/com/vasoV.jpg");
            // Escala la imagen al tamaño de la label
            Icon icon = new ImageIcon(icono.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
            imgPrep.setIcon(icon);
            Jdisplay.setText("Preparando");

        } else {
            // Habilitar para ver imagenes en Windows
            //           ImageIcon icono = new ImageIcon("D:\\NeatBeansProjects\\Maquina-Cafe\\src\\com\\vasoLL.jpg");
            //Habilitar para ver imagenes en Linux
            ImageIcon icono = new ImageIcon("/home/local/DANIELCASTELAO/ablancoabalde/NetBeansProjects/COD/Maquina-Cafe/src/com/vasoLL.jpg");
            Icon icon = new ImageIcon(icono.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
            imgPrep.setIcon(icon);
            Jdisplay.setText("Retire producto");

        }

    }

    /**
     * Inserta una imagen escalada con la medidas del Label en este. Y en caso
     * del credito sea 0 introduce una frase en un TextField
     *
     * @param credito
     * @param width
     * @param height
     */
    public static void imgDevDinero(Float credito, int width, int height) {

        //Habilitar para ver imagenes en Windows
//        ImageIcon icono = new ImageIcon("D:\\NeatBeansProjects\\Maquina-Cafe\\src\\com\\moneda.jpg");
        //Habilitar para ver imagenes en Linux
        ImageIcon icono = new ImageIcon("/home/local/DANIELCASTELAO/ablancoabalde/NetBeansProjects/COD/Maquina-Cafe/src/com/moneda.jpg");
        // Escala la imagen al tamaño de la label
        Icon icon = new ImageIcon(icono.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        if (credito > 0) {

            imgDev.setIcon(icon);
        } else {
            Jdisplay.setText("No hay moneda");
        }

    }

    /**
     * Metodo para visualizar la cantidad de azucar que desea el cliente,
     * introduciendo esta cantidad, representada por asteriscos en un TextField
     */
    public static void mAzucar() {
        String cadenaAzucar = "";

        if (Producto.azucar >= 6) {
            Producto.azucar = 6;

            jTAzucar.setText("MAX. Azucar");
        } else if (Producto.azucar <= 0) {
            Producto.azucar = 0;
            jTAzucar.setText("MIN. Azucar");

        } else {
            for (int i = 0; i < Producto.azucar; i++) {
                cadenaAzucar += "*";
            }
            jTAzucar.setText(cadenaAzucar);

        }

    }

    /**
     * Metodo agrega o disminuye la cantidad de azucar, según el valor del
     * parametro num.
     *
     * @param num
     */
    public static void tAzucar(int num) {
        if (num == 0) {

            Producto.azucar += 1;
            mAzucar();

        } else {

            Producto.azucar -= 1;
            mAzucar();
        }
    }

    /**
     * Metodo que restaura todos los valores del programa como al inicio.
     */
    public static void restore() {
        imgDev.setIcon(null);
        imgPrep.setIcon(null);
        Dinero.restCredit();
        Jdisplay.setText(null);
        jTcredito.setText(null);
    }

}
