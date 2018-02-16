package maquina.cafe;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static maquina.cafe.Inicio.*;

public class Dinero {

    

    public static Float credito = 0F;
    private Float cambio;

    public Float devolverCambio(Float pProducto, Float dinero) {

        return dinero - pProducto;

    }

    public Icon devolverDinero() {
        Inicio mIni = new Inicio();

        // Windows
        ImageIcon icono = new ImageIcon("D:\\NeatBeansProjects\\Maquina-Cafe\\src\\com\\moneda.jpg");
        // Linux
        //       ImageIcon icono=new ImageIcon("/home/local/DANIELCASTELAO/ablancoabalde/NetBeansProjects/COD/Maquina-Cafe/src/com/moneda.jpg");
        // Escala la imagen al tamaño de la label
        Icon icon = new ImageIcon(icono.getImage().getScaledInstance(mIni.devolucion.getWidth(), mIni.devolucion.getHeight(), Image.SCALE_DEFAULT));
        return icon;

    }

    public void addDinero() {
        String variable =CreditoJBoX.getSelectedItem().toString();
        System.out.println(variable);
        if (CreditoJBoX.getSelectedItem().toString().equalsIgnoreCase("0.5")) {
            Dinero.credito = Dinero.credito + 0.5f;
        } else if (CreditoJBoX.getSelectedItem().toString().equalsIgnoreCase("1")) {
            Dinero.credito = Dinero.credito + 1f;
        } else {
            Dinero.credito = Dinero.credito + 2f;
        }
    }

}
