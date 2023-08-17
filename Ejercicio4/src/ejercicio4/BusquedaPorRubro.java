/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abigail Castro
 */
public class BusquedaPorRubro extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int x, int y) {
            return false;
        }
    };

    /**
     * Creates new form BusquedaPorRubro
     */
    public BusquedaPorRubro() {
        initComponents();
        cargarCombo();
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCCategorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProductos = new javax.swing.JTable();

        setClosable(true);
        setTitle("Busqueda por Rubro");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Elija un rubro:");

        jCCategorias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCCategoriasItemStateChanged(evt);
            }
        });

        jTProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jCCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCCategoriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCCategoriasItemStateChanged
        // TODO add your handling code here:
        Categorias seleccionada = (Categorias) jCCategorias.getSelectedItem();
        if (evt.getStateChange() == java.awt.event.ItemEvent.DESELECTED) {
            eliminarFilas();
            for (Producto prod : GestionView.listaProductos) {
                if (seleccionada == prod.getRubro()) {
                    modelo.addRow(new Object[]{
                        prod.getCodigo(),
                        prod.getDescripcion(),
                        prod.getPrecio(),
                        prod.getStock()
                    });
                }
            }
        }
    }//GEN-LAST:event_jCCategoriasItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Categorias> jCCategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProductos;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("CÓDIGO");
        modelo.addColumn("DESCRIPCIÓN");
        modelo.addColumn("PRECIO");
        modelo.addColumn("STOCK");

        jTProductos.setModel(modelo);

        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) jTProductos.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void cargarCombo() {
        jCCategorias.addItem(Categorias.COMESTIBLE);
        jCCategorias.addItem(Categorias.LIMPIEZA);
        jCCategorias.addItem(Categorias.PERFUMERIA);
    }

    private void eliminarFilas() {
        int filas = jTProductos.getRowCount() - 1; //al ser un indice le resto 1
        //Como ya iniciamos la variable contadora no la incluimos en el for.
        for (; filas >= 0; filas--) {
            modelo.removeRow(filas);
        }
    }
}
