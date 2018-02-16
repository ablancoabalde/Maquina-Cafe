/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina.cafe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author espec
 */
public class Inicio extends javax.swing.JFrame {

    // Variable para cargar el producto y trabajar con la lista en el main 
//    CargaProductos mCarga= new CargaProductos();
//    ArrayList<Producto> lProductos=CargaProductos.cargar();
    public Inicio() {
        initComponents();

        //Metodo para cargar el azucar inicial en pantalla
        jTAzucar.setText(Display.mAzucar());
        CargaProductos.cargar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBCafe = new javax.swing.JButton();
        jBChoco = new javax.swing.JButton();
        jBte = new javax.swing.JButton();
        jBmas = new javax.swing.JButton();
        jBmenos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBDevolver = new javax.swing.JButton();
        Jdisplay = new javax.swing.JTextField();
        CreditoJBoX = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        preparar = new javax.swing.JLabel();
        devolucion = new javax.swing.JLabel();
        jTAzucar = new javax.swing.JTextField();
        jTcredito = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBCafe.setText("Café");
        jBCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCafeActionPerformed(evt);
            }
        });

        jBChoco.setText("Chocolate");
        jBChoco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBChocoActionPerformed(evt);
            }
        });

        jBte.setText("Té");
        jBte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBteActionPerformed(evt);
            }
        });

        jBmas.setText("+");
        jBmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmasActionPerformed(evt);
            }
        });

        jBmenos.setText("-");
        jBmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmenosActionPerformed(evt);
            }
        });

        jLabel1.setText(" Azucar");

        jBDevolver.setText("Devolver");
        jBDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDevolverActionPerformed(evt);
            }
        });

        Jdisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JdisplayActionPerformed(evt);
            }
        });

        CreditoJBoX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.5", "1", "2" }));
        CreditoJBoX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditoJBoXActionPerformed(evt);
            }
        });

        jLabel2.setText("  Monedas");

        preparar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                prepararMousePressed(evt);
            }
        });

        devolucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                devolucionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(Jdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jBChoco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBCafe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CreditoJBoX, 0, 142, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)))))
                        .addComponent(jTcredito, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(preparar, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBDevolver, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(devolucion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBmas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTAzucar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreditoJBoX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcredito, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTAzucar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBmas)
                            .addComponent(jBmenos)
                            .addComponent(jBCafe))
                        .addGap(18, 18, 18)
                        .addComponent(jBChoco)
                        .addGap(18, 18, 18)
                        .addComponent(jBte)
                        .addGap(16, 16, 16)
                        .addComponent(devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(preparar, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jBCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCafeActionPerformed
        // Café

        if (Dinero.verCredito()==0) {
            //Mostrar precio
            Jdisplay.setText(Display.MostrarPrecio(0));

        } else if (Dinero.verCredito()<Dinero.devolverPrecio(0)) {
            // Muestra el dinero que falta para pagar el producto

            Jdisplay.setText("Faltan "+String.valueOf(Dinero.devolverCambio(Dinero.verCredito(), Dinero.devolverPrecio(0))));
        } else {

            preparar.setIcon(Display.insertimg(0, preparar.getWidth(), preparar.getHeight()));
            Jdisplay.setText("Preparando");
            // Metodo para cambiar la imagen cada 10 segundos, instanciamos variable TimerTask
            TimerTask timerTask=new TimerTask() {
                @Override
                public void run() {
                    // Acción que quiero que se produzca

                   preparar.setIcon(Display.insertimg(2,preparar.getWidth(), preparar.getHeight()));
                    Jdisplay.setText("Retire producto");
                }
            };

            // Aquí se pone en marcha el timer cada segundo. 
            Timer timer=new Timer();
            // Metodo para cambiar la imagen dentro de 0 milisegundos avísame cada 1000 milisegundos 
            timer.scheduleAtFixedRate(timerTask, 10000, 100000000);

            //Hacer metodo devolver cambio
            Jdisplay.setText("Su cambio es "+String.valueOf(Dinero.devolverCambio(Dinero.devolverPrecio(0), Dinero.verCredito())));

            Dinero.restCredit();

        }
    }//GEN-LAST:event_jBCafeActionPerformed

    private void jBDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDevolverActionPerformed
        // Devolver
        if (Dinero.credito>0) {
            devolucion.setIcon(Display.imgDevDinero(devolucion.getWidth(), devolucion.getHeight()));
        } else {
            Jdisplay.setText("No hay moneda");
        }
    }//GEN-LAST:event_jBDevolverActionPerformed

    private void jBChocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBChocoActionPerformed
        // Chocolate
               if (Dinero.verCredito()==0) {
            //Mostrar precio
            Jdisplay.setText(Display.MostrarPrecio(1));

        } else if (Dinero.verCredito()<Dinero.devolverPrecio(1)) {
            // Muestra el dinero que falta para pagar el producto

            Jdisplay.setText("Faltan "+String.valueOf(Dinero.devolverCambio(Dinero.verCredito(), Dinero.devolverPrecio(1))));
        } else {

            preparar.setIcon(Display.insertimg(0, preparar.getWidth(), preparar.getHeight()));
            Jdisplay.setText("Preparando");
            // Metodo para cambiar la imagen cada 10 segundos, instanciamos variable TimerTask
            TimerTask timerTask=new TimerTask() {
                @Override
                public void run() {
                    // Acción que quiero que se produzca

                    preparar.setIcon(Display.insertimg(2,preparar.getWidth(), preparar.getHeight()));
                    Jdisplay.setText("Retire producto");
                }
            };

            // Aquí se pone en marcha el timer cada segundo. 
            Timer timer=new Timer();
            // Metodo para cambiar la imagen dentro de 0 milisegundos avísame cada 1000 milisegundos 
            timer.scheduleAtFixedRate(timerTask, 10000, 100000000);

            //Hacer metodo devolver cambio
            Jdisplay.setText("Su cambio es "+String.valueOf(Dinero.devolverCambio(Dinero.devolverPrecio(1), Dinero.verCredito())));

            Dinero.restCredit();
        }
    }//GEN-LAST:event_jBChocoActionPerformed

    private void jBteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBteActionPerformed
        // Té
        if (Dinero.credito==0) {
            //Mostrar precio
            Jdisplay.setText(CargaProductos.lProductos.get(2).getPrecio().toString());
        } else if (Dinero.credito<CargaProductos.lProductos.get(2).getPrecio()) {
            // Muestra el dinero que falta para pagar el producto
            Float falta=Dinero.credito-CargaProductos.lProductos.get(2).getPrecio();
            Jdisplay.setText("Faltan "+falta.toString());
        } else {
            Jdisplay.setText("Retire producto");
            //Hacer metodo devolver cambio
            Float cambio=Dinero.devolverCambio(CargaProductos.lProductos.get(2).getPrecio(), Dinero.credito);
            if (cambio>0) {
                Jdisplay.setText("Su cambio es "+String.valueOf(cambio));
            }
            Dinero.credito=0F;
        }
    }//GEN-LAST:event_jBteActionPerformed

    private void jBmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmenosActionPerformed
        // - Azucar
        // LLamada al metodo para extraer azucar
        Display.tAzucar(1);
        // Llamada al metodo para visualizar azucar
        jTAzucar.setText(Display.mAzucar());
    }//GEN-LAST:event_jBmenosActionPerformed

    private void jBmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmasActionPerformed
        //  + Azucar
        // LLamada al metodo para añadir azucar
        Display.tAzucar(0);
        // Llamada al metodo para visualizar azucar
        jTAzucar.setText(Display.mAzucar());
    }//GEN-LAST:event_jBmasActionPerformed

    private void JdisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JdisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JdisplayActionPerformed

    private void CreditoJBoXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditoJBoXActionPerformed
        // Credito       
        //Float valorCaja=Float.parseFloat(CreditoJBoX.getSelectedItem().toString());
        Dinero.addDinero(Float.parseFloat(CreditoJBoX.getSelectedItem().toString()));
        jTcredito.setText(String.valueOf(Display.verCredito()));

    }//GEN-LAST:event_CreditoJBoXActionPerformed
    // Metodo que clickas sobre la imagen y borra la imagen y vacia el text label de devolución
    private void devolucionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionMousePressed
        devolucion.setIcon(null);
        Dinero.restCredit();
        Jdisplay.setText(null);
        jTcredito.setText(null);
    }//GEN-LAST:event_devolucionMousePressed
// Metodo que clickas sobre la imagen y borra la imagen
    private void prepararMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prepararMousePressed
        preparar.setIcon(null);
        Dinero.restCredit();
        Jdisplay.setText(null);
        jTcredito.setText(null);
    }//GEN-LAST:event_prepararMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> CreditoJBoX;
    public javax.swing.JTextField Jdisplay;
    public javax.swing.JLabel devolucion;
    private javax.swing.JButton jBCafe;
    private javax.swing.JButton jBChoco;
    private javax.swing.JButton jBDevolver;
    private javax.swing.JButton jBmas;
    private javax.swing.JButton jBmenos;
    private javax.swing.JButton jBte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTAzucar;
    public javax.swing.JTextField jTcredito;
    public javax.swing.JLabel preparar;
    // End of variables declaration//GEN-END:variables

    private void setInterval(ImageIcon insertimg, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
