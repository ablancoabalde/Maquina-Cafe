package maquina.cafe;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import static maquina.cafe.Inicio.*;

public class CargaProductos {

    ArrayList<Producto> lProductos = new ArrayList();

    public ArrayList<Producto> cargar() {
        lProductos.add(new Producto(0.50F, "Café"));
        lProductos.add(new Producto(1.10F, "Chocolate"));
        lProductos.add(new Producto(0.85F, "Té"));

        return lProductos;
    }

    public ImageIcon insertimg(Integer num) {

        if (num == 0) {
            ImageIcon icono = new ImageIcon("D:\\NeatBeansProjects\\Maquina-Cafe\\src\\com\\vasoV.jpg");
            
            return icono;
        } else {
            ImageIcon icono = new ImageIcon("D:\\NeatBeansProjects\\Maquina-Cafe\\src\\com\\vasoLL.jpg");
            return icono;
        }

    }
}
