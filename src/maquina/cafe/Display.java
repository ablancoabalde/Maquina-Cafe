package maquina.cafe;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Display extends Inicio {
//    CargaProductos mCarga = new CargaProductos();

    // Ver
    public static void MostrarPrecio(int pos) {
        Jdisplay.setText(String.valueOf(CargaProductos.lProductos.get(pos).getPrecio()));

    }

    public static void verCambio(int pos) {
        Jdisplay.setText("Faltan "+String.valueOf(Dinero.devolverCambio(Dinero.CreditoIn(), Dinero.devolverPrecio(pos))));

    }

    public static void verDevCambio(int pos) {
        Jdisplay.setText("Su cambio es "+String.valueOf(Dinero.devolverCambio(Dinero.devolverPrecio(pos), Dinero.CreditoIn())));

    }

    //CREDITO
    public static void verCredito() {
        jTcredito.setText(String.valueOf(Dinero.CreditoIn()));

    }

    // IMAGENES
    public static void insertimg(Integer num, Integer width, Integer height) {
        

        if (num==0) {
            // Windows
//            ImageIcon icono = new ImageIcon("D:\\NeatBeansProjects\\Maquina-Cafe\\src\\com\\vasoV.jpg");
            // Linux
            ImageIcon icono=new ImageIcon("/home/local/DANIELCASTELAO/ablancoabalde/NetBeansProjects/COD/Maquina-Cafe/src/com/vasoV.jpg");
            // Escala la imagen al tamaño de la label
            Icon icon=new ImageIcon(icono.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
            imgPrep.setIcon(icon);
            Jdisplay.setText("Preparando");

        } else {
            // Windows
            //           ImageIcon icono = new ImageIcon("D:\\NeatBeansProjects\\Maquina-Cafe\\src\\com\\vasoLL.jpg");
            // Linux
            ImageIcon icono=new ImageIcon("/home/local/DANIELCASTELAO/ablancoabalde/NetBeansProjects/COD/Maquina-Cafe/src/com/vasoLL.jpg");
            Icon icon=new ImageIcon(icono.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
            imgPrep.setIcon(icon);
            Jdisplay.setText("Retire producto");

        }

    }

    public static void imgDevDinero(Float credito, int width, int height) {

        // Windows
//        ImageIcon icono = new ImageIcon("D:\\NeatBeansProjects\\Maquina-Cafe\\src\\com\\moneda.jpg");
        // Linux
        ImageIcon icono=new ImageIcon("/home/local/DANIELCASTELAO/ablancoabalde/NetBeansProjects/COD/Maquina-Cafe/src/com/moneda.jpg");
        // Escala la imagen al tamaño de la label
        Icon icon=new ImageIcon(icono.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        if (credito>0) {

            imgDev.setIcon(icon);
        } else {
            Jdisplay.setText("No hay moneda");
        }

    }

    // AZUCAR
    public static void mAzucar() {
        String cadenaAzucar="";

        if (Producto.azucar>=6) {
            Producto.azucar=6;

            jTAzucar.setText("MAX. Azucar");
        } else if (Producto.azucar<=0) {
            Producto.azucar=0;
            jTAzucar.setText("MIN. Azucar");

        } else {
            for (int i=0; i<Producto.azucar; i++) {
                cadenaAzucar+="*";
            }
            jTAzucar.setText(cadenaAzucar);

        }

    }

    public static void tAzucar(int num) {
        if (num==0) {

            Producto.azucar+=1;
            mAzucar();

        } else {

            Producto.azucar-=1;
            mAzucar();
        }
    }

    public static void restore() {
        imgDev.setIcon(null);
        imgPrep.setIcon(null);
        Dinero.restCredit();
        Jdisplay.setText(null);
        jTcredito.setText(null);
    }

}
