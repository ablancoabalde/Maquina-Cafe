package maquina.cafe;

import java.util.ArrayList;

public class CargaProductos {

    final static ArrayList<Producto> lProductos=new ArrayList();
    /**
     *
     * @return 
     */
    public static ArrayList<Producto> cargar() {
        lProductos.add(new Producto(0.50F, "Café"));
        lProductos.add(new Producto(1.10F, "Chocolate"));
        lProductos.add(new Producto(0.85F, "Té"));

        return lProductos;
    }

}
