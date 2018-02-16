package maquina.cafe;

import java.util.ArrayList;
//import static maquina.cafe.Inicio.*;

public class CargaProductos {

    ArrayList<Producto> lProductos = new ArrayList();

    public ArrayList<Producto> cargar() {
        lProductos.add(new Producto(0.50F, "Café"));
        lProductos.add(new Producto(1.10F, "Chocolate"));
        lProductos.add(new Producto(0.85F, "Té"));

        return lProductos;
    }

}
