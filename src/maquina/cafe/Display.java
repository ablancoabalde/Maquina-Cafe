package maquina.cafe;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Display {
//    CargaProductos mCarga = new CargaProductos();

    // Ver
    public final static String MostrarPrecio(int pos) {

        switch (pos) {
            case 0:
                return String.valueOf(CargaProductos.lProductos.get(0).getPrecio());

            case 1:
                return String.valueOf(CargaProductos.lProductos.get(1).getPrecio());

            case 2:
                return String.valueOf(CargaProductos.lProductos.get(2).getPrecio());

        }
        return null;
    }

    //CREDITO
    public static Float verCredito() {
        return Dinero.credito;
    }

    // IMAGENES
    public static Icon insertimg(Integer num, Integer width, Integer height) {
        // Instanciamos clase Inicio, para poder llamar a la etiqueta label

        if (num==0) {
            // Windows
//            ImageIcon icono = new ImageIcon("D:\\NeatBeansProjects\\Maquina-Cafe\\src\\com\\vasoV.jpg");
            // Linux
            ImageIcon icono=new ImageIcon("/home/local/DANIELCASTELAO/ablancoabalde/NetBeansProjects/COD/Maquina-Cafe/src/com/vasoV.jpg");
            // Escala la imagen al tamaño de la label
            Icon icon=new ImageIcon(icono.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

            return icon;
        } else {
            // Windows
            //           ImageIcon icono = new ImageIcon("D:\\NeatBeansProjects\\Maquina-Cafe\\src\\com\\vasoLL.jpg");
            // Linux
            ImageIcon icono=new ImageIcon("/home/local/DANIELCASTELAO/ablancoabalde/NetBeansProjects/COD/Maquina-Cafe/src/com/vasoLL.jpg");
            Icon icon=new ImageIcon(icono.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

            return icon;

        }

    }

    public static Icon imgDevDinero(int width, int height) {

        // Windows
//        ImageIcon icono = new ImageIcon("D:\\NeatBeansProjects\\Maquina-Cafe\\src\\com\\moneda.jpg");
        // Linux
        ImageIcon icono=new ImageIcon("/home/local/DANIELCASTELAO/ablancoabalde/NetBeansProjects/COD/Maquina-Cafe/src/com/moneda.jpg");
        // Escala la imagen al tamaño de la label
        Icon icon=new ImageIcon(icono.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        return icon;

    }

    // AZUCAR
    public static String mAzucar() {
        String cadenaAzucar="";
        // Inicio JtextconAzucar predefinido
        if (Producto.azucar>=6) {
            Producto.azucar=6;
            return "MAX. Azucar";
        } else if (Producto.azucar<=0) {
            Producto.azucar=0;
            return "MIN. Azucar";
        } else {
            for (int i=0; i<Producto.azucar; i++) {
                cadenaAzucar+="*";
            }
            return cadenaAzucar;
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

//    public void restore() {
//        mIni = new Inicio();
//        mIni.devolucion.setIcon(null);
//        mIni.preparar.setIcon(null);
//        Dinero.credito = 0F;
//        mIni.Jdisplay.setText(null);
//        mIni.jTcredito.setText(null);
//    }
}
