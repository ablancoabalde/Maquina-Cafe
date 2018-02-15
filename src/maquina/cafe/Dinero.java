package maquina.cafe;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Dinero {

    public static Float credito=0F;
    private Float cambio;

    public Float devolverCambio(Float pProducto, Float dinero) {

        return dinero-pProducto;

    }

    public Icon devolverDinero() {
        Inicio mIni=new Inicio();

        // Windows
//          ImageIcon icono=new ImageIcon("D:\\NeatBeansProjects\\Maquina-Cafe\\src\\com\\moneda.jpg");
        // Linux
        ImageIcon icono=new ImageIcon("/home/local/DANIELCASTELAO/ablancoabalde/NetBeansProjects/COD/Maquina-Cafe/src/com/moneda.jpg");
        // Escala la imagen al tamaño de la label
        Icon icon=new ImageIcon(icono.getImage().getScaledInstance(mIni.devolucion.getWidth(), mIni.devolucion.getHeight(), Image.SCALE_DEFAULT));
        return icon;

    }

}
