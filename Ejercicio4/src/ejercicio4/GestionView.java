/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.TreeSet;

/**
 *
 * @author Abigail
 */
public class GestionView extends javax.swing.JFrame {

    public static TreeSet<Producto> listaProductos = new TreeSet<>();

    /**
     * Creates new form GestionProductos
     */
    public GestionView() {
        initComponents();
        cargarProd();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMAdmin = new javax.swing.JMenu();
        jMenuItemProductos = new javax.swing.JMenuItem();
        jMConsultas = new javax.swing.JMenu();
        jMenuItemRubro = new javax.swing.JMenuItem();
        jMenuItemNombre = new javax.swing.JMenuItem();
        jMenuItemPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de Productos");
        setPreferredSize(new java.awt.Dimension(700, 600));

        escritorio.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        jMenuBar.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar.setForeground(new java.awt.Color(204, 204, 204));

        jMAdmin.setBackground(new java.awt.Color(51, 51, 51));
        jMAdmin.setForeground(new java.awt.Color(204, 204, 204));
        jMAdmin.setText("Administración");
        jMAdmin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jMenuItemProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemProductos.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItemProductos.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItemProductos.setText("Productos");
        jMenuItemProductos.setPreferredSize(new java.awt.Dimension(117, 21));
        jMenuItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductosActionPerformed(evt);
            }
        });
        jMAdmin.add(jMenuItemProductos);

        jMenuBar.add(jMAdmin);

        jMConsultas.setBackground(new java.awt.Color(51, 51, 51));
        jMConsultas.setForeground(new java.awt.Color(204, 204, 204));
        jMConsultas.setText("Consultas");
        jMConsultas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMConsultas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jMenuItemRubro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemRubro.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItemRubro.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItemRubro.setText("Por Rubro");
        jMenuItemRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRubroActionPerformed(evt);
            }
        });
        jMConsultas.add(jMenuItemRubro);

        jMenuItemNombre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemNombre.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItemNombre.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItemNombre.setText("Por Nombre");
        jMenuItemNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNombreActionPerformed(evt);
            }
        });
        jMConsultas.add(jMenuItemNombre);

        jMenuItemPrecio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemPrecio.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItemPrecio.setForeground(new java.awt.Color(204, 204, 204));
        jMenuItemPrecio.setText("Por Precio");
        jMenuItemPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPrecioActionPerformed(evt);
            }
        });
        jMConsultas.add(jMenuItemPrecio);

        jMenuBar.add(jMConsultas);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jMenuItemRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRubroActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaPorRubro busquedaPorRubro = new BusquedaPorRubro();
        busquedaPorRubro.setVisible(true);
        escritorio.add(busquedaPorRubro);
        escritorio.moveToFront(busquedaPorRubro);
    }//GEN-LAST:event_jMenuItemRubroActionPerformed

    private void jMenuItemNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNombreActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaPorNombre busquedaPorNombre = new BusquedaPorNombre();
        busquedaPorNombre.setVisible(true);
        escritorio.add(busquedaPorNombre);
        escritorio.moveToFront(busquedaPorNombre);
    }//GEN-LAST:event_jMenuItemNombreActionPerformed

    private void jMenuItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        GestionPorProductos administracion = new GestionPorProductos();
        administracion.setVisible(true);
        escritorio.add(administracion);
        escritorio.moveToFront(administracion);
    }//GEN-LAST:event_jMenuItemProductosActionPerformed

    private void jMenuItemPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPrecioActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaPorPrecio busquedaPorPrecio = new BusquedaPorPrecio();
        busquedaPorPrecio.setVisible(true);
        escritorio.add(busquedaPorPrecio);
        escritorio.moveToFront(busquedaPorPrecio);
    }//GEN-LAST:event_jMenuItemPrecioActionPerformed
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
            java.util.logging.Logger.getLogger(GestionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMAdmin;
    private javax.swing.JMenu jMConsultas;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemNombre;
    private javax.swing.JMenuItem jMenuItemPrecio;
    private javax.swing.JMenuItem jMenuItemProductos;
    private javax.swing.JMenuItem jMenuItemRubro;
    // End of variables declaration//GEN-END:variables

    private void cargarProd() {
        listaProductos.add(new Producto(10, "Azucar", 180.75, 5, Categorias.COMESTIBLE));
        listaProductos.add(new Producto(12, "Yerba Mate", 6505, 10, Categorias.COMESTIBLE));
        listaProductos.add(new Producto(14, "Aceite Natura x 900ml", 890, 30, Categorias.COMESTIBLE));
        listaProductos.add(new Producto(16, "Fideos Lucchetti spaghetti x 50gr", 450, 100, Categorias.COMESTIBLE));
        listaProductos.add(new Producto(35, "Desodorante Rexona", 985, 13, Categorias.PERFUMERIA));
        listaProductos.add(new Producto(49, "Jabon de tocador Lux", 325.75, 80, Categorias.PERFUMERIA));
        listaProductos.add(new Producto(23, "CIF limpiador blanco", 531.50, 4, Categorias.LIMPIEZA));
    }
}
