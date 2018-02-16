package maquina.cafe;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Display {

    Inicio mIni;

    public Float MostrarPrecio(Producto p) {
        return p.getPrecio();

    }

    public Float verCredito() {
        return Dinero.credito;
    }

    // IMAGENES
    public Icon insertimg(Integer num) {
        // Instanciamos clase Inicio, para poder llamar a la etiqueta label
        mIni = new Inicio();
        if (num == 0) {
            // Windows
            ImageIcon icono = new ImageIcon("D:\\NeatBeansProjects\\Maquina-Cafe\\src\\com\\vasoV.jpg");
            // Linux
            //           ImageIcon icono=new ImageIcon("/home/local/DANIELCASTELAO/ablancoabalde/NetBeansProjects/COD/Maquina-Cafe/src/com/vasoV.jpg");
            // Escala la imagen al tamaño de la label
            Icon icon = new ImageIcon(icono.getImage().getScaledInstance(mIni.preparar.getWidth(), mIni.preparar.getHeight(), Image.SCALE_DEFAULT));

            return icon;
        } else {
            // Windows
            ImageIcon icono = new ImageIcon("D:\\NeatBeansProjects\\Maquina-Cafe\\src\\com\\vasoLL.jpg");
            // Linux
            //          ImageIcon icono=new ImageIcon("/home/local/DANIELCASTELAO/ablancoabalde/NetBeansProjects/COD/Maquina-Cafe/src/com/vasoLL.jpg");
            Icon icon = new ImageIcon(icono.getImage().getScaledInstance(mIni.preparar.getWidth(), mIni.preparar.getHeight(), Image.SCALE_DEFAULT));

            return icon;

        }

    }

    // AZUCAR
    public String mAzucar() {
        String cadenaAzucar = "";
        // Inicio JtextconAzucar predefinido
        if (Producto.azucar >= 6) {
            Producto.azucar = 6;
            return "MAX. Azucar";
        } else if (Producto.azucar <= 0) {
            Producto.azucar = 0;
            return "MIN. Azucar";
        } else {
            for (int i = 0; i < Producto.azucar; i++) {
                cadenaAzucar += "*";
            }
            return cadenaAzucar;
        }

    }

    public void tAzucar(int num) {
        if (num == 0) {

            Producto.azucar += 1;
            mAzucar();

        } else {

            Producto.azucar -= 1;
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
