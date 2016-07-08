package Pantallas;

import Beans.BeanProducto;
import Beans.BeanVenta;
import Daos.Producto;
import Daos.Venta;
import Otras.LlenarTablas;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VentaNueva extends javax.swing.JFrame {

    LlenarTablas lt = new LlenarTablas();
    Producto p = new Producto();
    BeanProducto b = new BeanProducto();
    BeanVenta venta = new BeanVenta();
    Producto dao = new Producto();
    Venta d = new Venta();
    VerVentas vv = new VerVentas();

    List<BeanProducto> productosVenta = new ArrayList();
    List<BeanProducto> productosTodos = p.consultareProductos();
    List<BeanProducto> productosLista = p.consultareProductos();

    double total = 0;
    int i = 0;

    public VentaNueva() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        txtTotal.setText("0,00");
        txtCambio.setText("0,00");
        txtEfectivo.setText("");
        tablaVentaNueva.getTableHeader().setFont(new Font("Yu Mincho Light", 0, 20));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventaProductos = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBucarProVentas = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInventarioVentas = new javax.swing.JTable();
        btnAñadir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNoUnidades = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentaNueva = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCancelarVenta = new javax.swing.JButton();
        btnRegistrarVenta = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoBarras = new javax.swing.JTextField();
        btnGenerarTicket = new javax.swing.JButton();
        txtEfectivo = new javax.swing.JTextField();
        txtTotal = new javax.swing.JLabel();
        txtCambio = new javax.swing.JLabel();
        btnAñadirDesdeInventario = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnVentasDelDia = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Venta nueva");

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel6.setText("Buscar producto:");

        txtBucarProVentas.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        txtBucarProVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBucarProVentasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBucarProVentasKeyTyped(evt);
            }
        });

        tablaInventarioVentas.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        tablaInventarioVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "$ Compra", "$ Venta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaInventarioVentas.setRowHeight(20);
        tablaInventarioVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaInventarioVentasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaInventarioVentas);
        if (tablaInventarioVentas.getColumnModel().getColumnCount() > 0) {
            tablaInventarioVentas.getColumnModel().getColumn(0).setResizable(false);
            tablaInventarioVentas.getColumnModel().getColumn(0).setPreferredWidth(25);
            tablaInventarioVentas.getColumnModel().getColumn(1).setResizable(false);
            tablaInventarioVentas.getColumnModel().getColumn(2).setResizable(false);
            tablaInventarioVentas.getColumnModel().getColumn(2).setPreferredWidth(15);
            tablaInventarioVentas.getColumnModel().getColumn(3).setResizable(false);
            tablaInventarioVentas.getColumnModel().getColumn(3).setPreferredWidth(15);
        }

        btnAñadir.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Mincho Light", 0, 24)); // NOI18N
        jLabel7.setText("Agregar unidades:");

        txtNoUnidades.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        txtNoUnidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoUnidadesKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                    .addComponent(jSeparator5)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBucarProVentas))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNoUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAñadir)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBucarProVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAñadir)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNoUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout ventaProductosLayout = new javax.swing.GroupLayout(ventaProductos.getContentPane());
        ventaProductos.getContentPane().setLayout(ventaProductosLayout);
        ventaProductosLayout.setHorizontalGroup(
            ventaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventaProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ventaProductosLayout.setVerticalGroup(
            ventaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventaProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Realizar venta");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Mincho Light", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENTAS");

        tablaVentaNueva.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        tablaVentaNueva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Descripción", "Precio Unitario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVentaNueva.setGridColor(new java.awt.Color(0, 0, 255));
        tablaVentaNueva.setRowHeight(25);
        jScrollPane1.setViewportView(tablaVentaNueva);
        if (tablaVentaNueva.getColumnModel().getColumnCount() > 0) {
            tablaVentaNueva.getColumnModel().getColumn(0).setPreferredWidth(80);
            tablaVentaNueva.getColumnModel().getColumn(1).setPreferredWidth(80);
            tablaVentaNueva.getColumnModel().getColumn(2).setPreferredWidth(80);
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));

        jLabel3.setFont(new java.awt.Font("Yu Mincho Light", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TOTAL: $");

        jLabel4.setFont(new java.awt.Font("Yu Mincho Light", 0, 24)); // NOI18N
        jLabel4.setText("EFECTIVO: $");

        jLabel5.setFont(new java.awt.Font("Yu Mincho Light", 0, 24)); // NOI18N
        jLabel5.setText("CAMBIO: $");

        btnCancelarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_48.png"))); // NOI18N
        btnCancelarVenta.setToolTipText("Cancelar la venta actual");
        btnCancelarVenta.setBorder(null);
        btnCancelarVenta.setContentAreaFilled(false);
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });

        btnRegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/currency_blue_dollar-64.png"))); // NOI18N
        btnRegistrarVenta.setToolTipText("Realizar venta");
        btnRegistrarVenta.setBorder(null);
        btnRegistrarVenta.setContentAreaFilled(false);
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Mincho Light", 0, 24)); // NOI18N
        jLabel9.setText("Código de barras:");

        txtCodigoBarras.setFont(new java.awt.Font("Yu Mincho Light", 0, 24)); // NOI18N
        txtCodigoBarras.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodigoBarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoBarrasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoBarrasKeyTyped(evt);
            }
        });

        btnGenerarTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Purchase-Order-64.png"))); // NOI18N
        btnGenerarTicket.setToolTipText("Generar ticket de compra");
        btnGenerarTicket.setBorder(null);
        btnGenerarTicket.setContentAreaFilled(false);
        btnGenerarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarTicketActionPerformed(evt);
            }
        });

        txtEfectivo.setFont(new java.awt.Font("Yu Mincho Light", 0, 24)); // NOI18N
        txtEfectivo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEfectivoKeyReleased(evt);
            }
        });

        txtTotal.setFont(new java.awt.Font("Yu Mincho Light", 0, 24)); // NOI18N
        txtTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCambio.setBackground(new java.awt.Color(255, 255, 255));
        txtCambio.setFont(new java.awt.Font("Yu Mincho Light", 0, 24)); // NOI18N
        txtCambio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAñadirDesdeInventario.setBackground(new java.awt.Color(255, 255, 255));
        btnAñadirDesdeInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirDesdeInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add-48.png"))); // NOI18N
        btnAñadirDesdeInventario.setToolTipText("Añadir desde inventario");
        btnAñadirDesdeInventario.setBorder(null);
        btnAñadirDesdeInventario.setContentAreaFilled(false);
        btnAñadirDesdeInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirDesdeInventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEfectivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAñadirDesdeInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerarTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenerarTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAñadirDesdeInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/House-48x48.png"))); // NOI18N
        btnVolver.setToolTipText("Volver al menú principal");
        btnVolver.setBorder(null);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setMargin(new java.awt.Insets(50, 50, 50, 50));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnVentasDelDia.setBackground(new java.awt.Color(255, 255, 255));
        btnVentasDelDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sales-report-64.png"))); // NOI18N
        btnVentasDelDia.setToolTipText("Ver las ventas de hoy");
        btnVentasDelDia.setBorder(null);
        btnVentasDelDia.setContentAreaFilled(false);
        btnVentasDelDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasDelDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVentasDelDia))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnVolver)
                    .addComponent(btnVentasDelDia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void txtCodigoBarrasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoBarrasKeyReleased
        String codigo = txtCodigoBarras.getText();
        if (codigo.length() >= 5) {
            for (BeanProducto bn : productosTodos) {
                if (bn.getCodigo().equals(codigo)) {
                    productosVenta.add(bn);
                    total = total + bn.getPrecio_venta();
                    lt.llenarTablaVentaNueva(productosVenta, tablaVentaNueva);
                    txtCodigoBarras.setText("");
                    txtTotal.setText("" + Math.round(total));
                }
            }
        }
    }//GEN-LAST:event_txtCodigoBarrasKeyReleased

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        this.dispose();
        mp.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGenerarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarTicketActionPerformed

    }//GEN-LAST:event_btnGenerarTicketActionPerformed

    private void txtCodigoBarrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoBarrasKeyTyped
        char letra = evt.getKeyChar();
        if (letra < '0' || letra > '9') {
            evt.consume();
        }
        if (txtCodigoBarras.getText().length() > 13) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoBarrasKeyTyped

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "¿Esta seguro de cancelar la venta actual?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (opc == JOptionPane.YES_OPTION) {
            total = 0;
            productosVenta.clear();
            lt.llenarTablaVentaNueva(productosVenta, tablaVentaNueva);
            txtTotal.setText("0,00");
            txtCambio.setText("0,00");
            txtEfectivo.setText("");
        }
    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    private void txtEfectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEfectivoKeyReleased

        char letra = evt.getKeyChar();
        if (letra == '\n') {
            if (Float.parseFloat(txtEfectivo.getText()) >= Float.parseFloat(txtTotal.getText())) {
                total = Float.parseFloat(txtEfectivo.getText()) - Float.parseFloat(txtTotal.getText());
                txtCambio.setText(total + "");
            } else {
                JOptionPane.showMessageDialog(this, "La cantidad ingresada es incorrecta");
            }

        }
    }//GEN-LAST:event_txtEfectivoKeyReleased

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        if (productosVenta.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay productos en la lista");
        } else if (txtEfectivo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de efectivo esta vacio, porfavor ingrese una cantidad");
        } else {
            int opc = JOptionPane.showConfirmDialog(this, "Confirmar la venta actual", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (opc == JOptionPane.YES_OPTION) {
                total = 0;
                txtTotal.setText("0,00");
                txtEfectivo.setText("");
                txtCambio.setText("0,00");
                for (BeanProducto bean : productosVenta) {
                    venta.setId_producto(bean.getId());
                    venta.setFecha(lt.obtenerFecha());
                    venta.setUnidades(1);
                    venta.setTotal(bean.getPrecio_venta());

                    dao.modificarExistencia(bean.getId());
                    d.registrarVenta(venta);
                }
                productosVenta.clear();
                lt.llenarTablaVentaNueva(productosVenta, tablaVentaNueva);
                JOptionPane.showMessageDialog(this, "Venta registrada con éxito");
            }
        }
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void txtBucarProVentasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBucarProVentasKeyReleased
        List<BeanProducto> productos = dao.consultareProductos();
        List<BeanProducto> nuevaLista = new ArrayList<>();
        String cadena = txtBucarProVentas.getText();

        for (BeanProducto beanP : productos) {
            String nombreCompleto = beanP.getId() + "" + beanP.getCodigo() + "" + beanP.getNombre() + " " + beanP.getDescripcion() + " " + beanP.getPrecio_compra() + " " + beanP.getPrecio_venta() + " " + beanP.getProveedor() + " " + beanP.getMarca();
            if (nombreCompleto.toLowerCase().contains(cadena.toLowerCase())) {
                nuevaLista.add(beanP);
            }
        }
        productosLista = nuevaLista;
        lt.llenarInventarioVentas(productosLista, tablaInventarioVentas);
    }//GEN-LAST:event_txtBucarProVentasKeyReleased

    private void txtBucarProVentasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBucarProVentasKeyTyped
        char letra = evt.getKeyChar();
        if (txtBucarProVentas.getText().length() > 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBucarProVentasKeyTyped

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed

        int fila = tablaInventarioVentas.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Selecciona un producto de la lista");
        } else {
            BeanProducto bp = productosLista.get(fila);
            double sumar = bp.getPrecio_venta();
            if (txtNoUnidades.getText().isEmpty()) {
                productosVenta.add(bp);
                total = total + bp.getPrecio_venta();
            } else {
                for (int j = 0; j < Integer.parseInt(txtNoUnidades.getText()); j++) {
                    productosVenta.add(bp);
                    total = total + sumar;
                }
            }
            txtTotal.setText("" + Math.round(total));
            txtBucarProVentas.setText("");
            txtNoUnidades.setText("");
            lt.llenarTablaVentaNueva(productosVenta, tablaVentaNueva);
            productosLista = dao.consultareProductos();
            lt.llenarInventarioVentas(dao.consultareProductos(), tablaInventarioVentas);
        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnAñadirDesdeInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirDesdeInventarioActionPerformed
        txtNoUnidades.setText("");
        txtBucarProVentas.setText("");
        this.tablaInventarioVentas.getTableHeader().setFont(new Font("Yu Mincho Light", 0, 20));
        this.ventaProductos.pack();
        this.ventaProductos.setLocationRelativeTo(this);
        this.ventaProductos.setResizable(false);
        this.ventaProductos.setVisible(true);
        lt.llenarInventarioVentas(dao.consultareProductos(), tablaInventarioVentas);
    }//GEN-LAST:event_btnAñadirDesdeInventarioActionPerformed

    private void btnVentasDelDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasDelDiaActionPerformed
        vv.setVisible(true);
        lt.llenarTablaVentas(d.consultarVentas(), vv.tablaVerVentas);
        vv.txtVentaTotalDelDia.setText("$" + d.consultarVentaTotalDelDia(lt.obtenerFecha()));
        this.dispose();
    }//GEN-LAST:event_btnVentasDelDiaActionPerformed

    private void txtNoUnidadesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoUnidadesKeyTyped
        char letra = evt.getKeyChar();
        if (!Character.isDigit(letra) || txtNoUnidades.getText().length() > 2) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNoUnidadesKeyTyped

    private void tablaInventarioVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaInventarioVentasMouseClicked
        if (evt.getClickCount() == 2) {
            int linea = tablaInventarioVentas.getSelectedRow();

            BeanProducto bp = productosLista.get(linea);
            double sumar = bp.getPrecio_venta();
            if (txtNoUnidades.getText().isEmpty()) {
                productosVenta.add(bp);
                total = total + bp.getPrecio_venta();
            } else {
                for (int j = 0; j < Integer.parseInt(txtNoUnidades.getText()); j++) {
                    productosVenta.add(bp);
                    total = total + sumar;
                }
            }
            txtTotal.setText("" + Math.round(total));
            txtBucarProVentas.setText("");
            txtNoUnidades.setText("");
            lt.llenarTablaVentaNueva(productosVenta, tablaVentaNueva);
            productosLista = dao.consultareProductos();
            lt.llenarInventarioVentas(dao.consultareProductos(), tablaInventarioVentas);
        }
    }//GEN-LAST:event_tablaInventarioVentasMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentaNueva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnAñadirDesdeInventario;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnGenerarTicket;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JButton btnVentasDelDia;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tablaInventarioVentas;
    private javax.swing.JTable tablaVentaNueva;
    private javax.swing.JTextField txtBucarProVentas;
    private javax.swing.JLabel txtCambio;
    private javax.swing.JTextField txtCodigoBarras;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JTextField txtNoUnidades;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JFrame ventaProductos;
    // End of variables declaration//GEN-END:variables
}
