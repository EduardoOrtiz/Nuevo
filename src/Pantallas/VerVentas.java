package Pantallas;

import Beans.BeanProducto;
import Daos.Producto;
import Daos.Venta;
import Otras.LlenarTablas;
import java.awt.Font;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

public class VerVentas extends javax.swing.JFrame {

    String NombreProducto;
    int producto;
    Producto dao = new Producto();
    Venta daoVen = new Venta();
    List<BeanProducto> productosLista = dao.consultareProductos();
    LlenarTablas lt = new LlenarTablas();

    

    public VerVentas() {

        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        lt.llenarTablaVentas(daoVen.consultarVentas(), tablaVerVentas);
        tablaVerVentas.getTableHeader().setFont(new Font("Yu Mincho Light", 0, 20));
        float venta_total = daoVen.consultarVentaTotalDelDia(lt.obtenerFecha());
        txtVentaTotalDelDia.setText("$"+venta_total);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVerVentas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarPorFecha = new javax.swing.JButton();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        btnVolverVerProductos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtVentaTotalDelDia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventas");
        setBackground(new java.awt.Color(255, 255, 255));
        setModalExclusionType(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        jPanel2.setEnabled(false);
        jPanel2.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N

        tablaVerVentas.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        tablaVerVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Producto", "Unidades", "Precio Unitario", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVerVentas.setRowHeight(20);
        jScrollPane1.setViewportView(tablaVerVentas);
        if (tablaVerVentas.getColumnModel().getColumnCount() > 0) {
            tablaVerVentas.getColumnModel().getColumn(0).setResizable(false);
            tablaVerVentas.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablaVerVentas.getColumnModel().getColumn(1).setResizable(false);
            tablaVerVentas.getColumnModel().getColumn(2).setResizable(false);
            tablaVerVentas.getColumnModel().getColumn(2).setPreferredWidth(20);
            tablaVerVentas.getColumnModel().getColumn(3).setResizable(false);
            tablaVerVentas.getColumnModel().getColumn(3).setPreferredWidth(40);
            tablaVerVentas.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        jLabel5.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel5.setText("Búsqueda por fecha:");

        jLabel1.setFont(new java.awt.Font("Yu Mincho Light", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENTAS");

        btnBuscarPorFecha.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        btnBuscarPorFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32.png"))); // NOI18N
        btnBuscarPorFecha.setBorder(null);
        btnBuscarPorFecha.setContentAreaFilled(false);
        btnBuscarPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorFechaActionPerformed(evt);
            }
        });

        txtFecha.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/currency_blue_dollar-64.png"))); // NOI18N
        jButton1.setToolTipText("Realizar una venta");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnVolverVerProductos.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        btnVolverVerProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/House-48x48.png"))); // NOI18N
        btnVolverVerProductos.setToolTipText("Volver al menú principal");
        btnVolverVerProductos.setBorder(null);
        btnVolverVerProductos.setContentAreaFilled(false);
        btnVolverVerProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverVerProductosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Mincho Light", 0, 24)); // NOI18N
        jLabel2.setText("Venta total del dia:");

        txtVentaTotalDelDia.setFont(new java.awt.Font("Yu Mincho Light", 0, 24)); // NOI18N
        txtVentaTotalDelDia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtVentaTotalDelDia.setText("00000.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarPorFecha))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVolverVerProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVentaTotalDelDia)
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarPorFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVolverVerProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addComponent(txtVentaTotalDelDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverVerProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverVerProductosActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        this.dispose();
        mp.setVisible(true);
    }//GEN-LAST:event_btnVolverVerProductosActionPerformed

    private void btnBuscarPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorFechaActionPerformed
        if (txtFecha.getDate()==null) {
            JOptionPane.showMessageDialog(this, "Porfavor, ingrese una fecha para realizar la busqueda");
        }else{
        String fecha = txtFecha.getCalendar().get(Calendar.YEAR) + "/" + (txtFecha.getCalendar().get(Calendar.MONTH) + 1) + "/" + txtFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
        lt.llenarTablaVentas(daoVen.consultarVentasPorFecha(fecha), tablaVerVentas);
        txtVentaTotalDelDia.setText("$" + daoVen.consultarVentaTotalDelDia(fecha));
        }
    }//GEN-LAST:event_btnBuscarPorFechaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentaNueva v = new VentaNueva();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VerVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPorFecha;
    private javax.swing.JButton btnVolverVerProductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaVerVentas;
    private com.toedter.calendar.JDateChooser txtFecha;
    public javax.swing.JLabel txtVentaTotalDelDia;
    // End of variables declaration//GEN-END:variables
}
