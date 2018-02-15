package maquina.cafe;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static maquina.cafe.Inicio.*;

public class CargaProductos {

    ArrayList<Producto> lProductos=new ArrayList();

    public ArrayList<Producto> cargar() {
        lProductos.add(new Producto(0.50F, "Café"));
        lProductos.add(new Producto(1.10F, "Chocolate"));
        lProductos.add(new Producto(0.85F, "Té"));

        return lProductos;
    }

    public Icon insertimg(Integer num) {
        // Instanciamos clase Inicio, para poder llamar a la etiqueta label
        Inicio mIni=new Inicio();
        if (num==0) {
            // Windows
//          ImageIcon icono=new ImageIcon("D:\\NeatBeansProjects\\Maquina-Cafe\\src\\com\\vasoV.jpg");
            // Linux
            ImageIcon icono=new ImageIcon("/home/local/DANIELCASTELAO/ablancoabalde/NetBeansProjects/COD/Maquina-Cafe/src/com/vasoV.jpg");
            // Escala la imagen al tamaño de la label
            Icon icon=new ImageIcon(icono.getImage().getScaledInstance(mIni.preparar.getWidth(), mIni.preparar.getHeight(), Image.SCALE_DEFAULT));

            return icon;
        } else {
            // Windows
//            ImageIcon icono=new ImageIcon("D:\\NeatBeansProjects\\Maquina-Cafe\\src\\com\\vasoLL.jpg");
            // Linux
            ImageIcon icono=new ImageIcon("/home/local/DANIELCASTELAO/ablancoabalde/NetBeansProjects/COD/Maquina-Cafe/src/com/vasoLL.jpg");
            Icon icon=new ImageIcon(icono.getImage().getScaledInstance(mIni.preparar.getWidth(), mIni.preparar.getHeight(), Image.SCALE_DEFAULT));

            return icon;

        }

    }
}
