package maquina.cafe;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MaquinaCafe {

    public static void main(String[] args) {
        ImageIcon icono=new ImageIcon("src/com/taza.jpg");
        boolean exit=true;
        Display mDis = new Display();
        String[] options={"Café", "Chocolate", "Té", "+ Azucar", "- Azucar", "Devolver dinero"};

        CargaProductos cLista = new CargaProductos();
        // Metodo para cargar o crear el arraylist
        cLista.cargar();
        // Variable con inicializada con el número de opciones
        int seleccion;
      

        // Bucle para trabajar con la app
        do{
            /*
            Try para que no deje de funcionar cuando pulse cancelar en el JOptionPane y cierre la app
             */
            try {
                
               seleccion=JOptionPane.showOptionDialog(null, "Seleccione producto", "Máquina", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icono, options, options[0]);
     

                switch (seleccion) {
                    case 0:
                     JOptionPane.showMessageDialog(null,mDis.MostrarPrecio(cLista.lProductos.get(0)) + " Euros");
                        break;
                    case 1:
                        
                        break;
                    case 2:
                       
                        break;

                    case 3:

                        
                        break;
                    case 4:
                        
                         break;
                    case -1:
                        
                        exit=true;
                        break;

                }
            } catch (NumberFormatException excepcion) {
                System.out.println("Aplicación cerrada");
                exit=false;
            }

        }while(exit==true);

    }

}
