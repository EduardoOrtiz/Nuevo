package Pantallas;

import Beans.BeanProducto;
import Daos.Producto;
import Daos.Venta;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.PopupMenuListener;
import javax.swing.table.DefaultTableModel;

public class VerInventario extends javax.swing.JFrame {

    Venta daoVen = new Venta();
    static VerInventario vp = new VerInventario();
    VerVentas producto = new VerVentas();
    Producto p = new Producto();
    BeanProducto bp = new BeanProducto();
    List<BeanProducto> listaP = p.consultareProductos();

    public void actualTabla(List<BeanProducto> lista) {
        DefaultTableModel modelo = (DefaultTableModel) tablaProductos.getModel();
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }

        for (int i = 0; i < lista.size(); i++) {

            BeanProducto bean = lista.get(i);

            String[] fila = new String[8];
            fila[0] = bean.getCodigo();
            fila[1] = bean.getNombre();
            fila[2] = bean.getDescripcion();
            fila[3] = "$" + Float.toString(bean.getPrecio_compra());
            fila[4] = "$" + Float.toString(bean.getPrecio_venta());
            fila[5] = Integer.toString(bean.getExistencias());
            fila[6] = bean.getProveedor();
            fila[7] = bean.getMarca();
            modelo.addRow(fila);
        }

    }

    public void limpiarCampos() {
        txtCodigo.setText("");
        txtProdNom.setText("");
        txtDesc.setText("");
        txtExist.setText("");
        txtPrecCom.setText("");
        txtPrecVent.setText("");
        txtProved.setText("");
        txtMarca.setText("");

    }

    public void llenarCampos(BeanProducto bpr) {
        bp = bpr;
        txtCodigo.setText(bp.getCodigo());
        txtProdNom.setText(bp.getNombre());
        txtDesc.setText(bp.getDescripcion());
        txtPrecVent.setText(bp.getPrecio_venta() + "");
        txtPrecCom.setText(bp.getPrecio_compra() + "");
        txtExist.setText(bp.getExistencias() + "");
        txtProved.setText(bp.getProveedor());
        txtMarca.setText(bp.getMarca());
        btnRegProducto.setText("Guardar");
    }

    public VerInventario() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        actualTabla(listaP);

        tablaProductos.getTableHeader().setFont(new Font("Yu Mincho Light", 0, 20));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegProducto = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        txtProdNom = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtPrecCom = new javax.swing.JTextField();
        txtPrecVent = new javax.swing.JTextField();
        txtExist = new javax.swing.JTextField();
        txtProved = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRegProducto = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnCancelarAccion = new javax.swing.JButton();
        menuOpciones = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        txtBucarProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnVerVentas = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));

        txtCodigo.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        txtProdNom.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txtProdNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProdNomKeyTyped(evt);
            }
        });

        txtDesc.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txtDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescKeyTyped(evt);
            }
        });

        txtPrecCom.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txtPrecCom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecComKeyTyped(evt);
            }
        });

        txtPrecVent.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txtPrecVent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecVentKeyTyped(evt);
            }
        });

        txtExist.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txtExist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExistKeyTyped(evt);
            }
        });

        txtProved.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txtProved.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProvedKeyTyped(evt);
            }
        });

        txtMarca.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel1.setText("Código: *");

        jLabel4.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel4.setText("Producto: *");

        jLabel8.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel8.setText("Descripción:  *");

        jLabel9.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel9.setText("Precio de compra: *");

        jLabel10.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel10.setText("Precio de venta: *");

        jLabel11.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel11.setText("Existencia: *");

        jLabel12.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel12.setText("Proveedor:");

        jLabel13.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel13.setText("Marca:");

        jLabel7.setFont(new java.awt.Font("Yu Mincho Light", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Agregar al inventario");

        btnRegProducto.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        btnRegProducto.setText("Registrar");
        btnRegProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegProductoActionPerformed(evt);
            }
        });

        btnCancelarAccion.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        btnCancelarAccion.setText("Cancelar");
        btnCancelarAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnCancelarAccion, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProved, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtExist, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrecVent, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrecCom, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDesc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtProdNom, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMarca)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProdNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecVent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegProducto)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnCancelarAccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout RegProductoLayout = new javax.swing.GroupLayout(RegProducto.getContentPane());
        RegProducto.getContentPane().setLayout(RegProductoLayout);
        RegProductoLayout.setHorizontalGroup(
            RegProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegProductoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        RegProductoLayout.setVerticalGroup(
            RegProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegProductoLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Setting-Tools-16.png"))); // NOI18N
        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuOpciones.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close-16.png"))); // NOI18N
        jMenuItem2.setText("Eliminar");
        menuOpciones.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Box-16.png"))); // NOI18N
        jMenuItem3.setText("Rellenar");
        menuOpciones.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Yu Mincho Light", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inventario");

        tablaProductos.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Producto", "Descripción", "$ Compra", "$ Venta", "Existencias", "Proveedor", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setRowHeight(25);
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setResizable(false);
            tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaProductos.getColumnModel().getColumn(1).setResizable(false);
            tablaProductos.getColumnModel().getColumn(2).setResizable(false);
            tablaProductos.getColumnModel().getColumn(3).setResizable(false);
            tablaProductos.getColumnModel().getColumn(3).setPreferredWidth(10);
            tablaProductos.getColumnModel().getColumn(4).setResizable(false);
            tablaProductos.getColumnModel().getColumn(4).setPreferredWidth(10);
            tablaProductos.getColumnModel().getColumn(5).setResizable(false);
            tablaProductos.getColumnModel().getColumn(5).setPreferredWidth(20);
            tablaProductos.getColumnModel().getColumn(6).setResizable(false);
            tablaProductos.getColumnModel().getColumn(7).setResizable(false);
        }

        txtBucarProducto.setFont(new java.awt.Font("Yu Mincho Light", 0, 24)); // NOI18N
        txtBucarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBucarProductoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBucarProductoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32.png"))); // NOI18N

        jButton2.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reload_32.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/House-48x48.png"))); // NOI18N
        btnVolver.setToolTipText("Volver al menu");
        btnVolver.setBorder(null);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnVerVentas.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        btnVerVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sales-report-64.png"))); // NOI18N
        btnVerVentas.setToolTipText("Ver ventas");
        btnVerVentas.setBorder(null);
        btnVerVentas.setContentAreaFilled(false);
        btnVerVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerVentasActionPerformed(evt);
            }
        });

        btnModificarProducto.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        btnModificarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exchange-64.png"))); // NOI18N
        btnModificarProducto.setToolTipText("Modificar datos");
        btnModificarProducto.setBorder(null);
        btnModificarProducto.setContentAreaFilled(false);
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add-48.png"))); // NOI18N
        jButton4.setToolTipText("Añadir nuevo producto");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBucarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVerVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1211, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBucarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBucarProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBucarProductoKeyReleased
        List<BeanProducto> productos = p.consultareProductos();
        List<BeanProducto> nuevaLista = new ArrayList<>();
        String cadena = txtBucarProducto.getText();

        for (BeanProducto beanP : productos) {
            String nombreCompleto = beanP.getDescripcion() + " " + beanP.getCodigo() + " " + beanP.getNombre();
            if (nombreCompleto.toLowerCase().contains(cadena.toLowerCase())) {
                nuevaLista.add(beanP);
            }
        }
        listaP = nuevaLista;
        actualTabla(listaP);
    }//GEN-LAST:event_txtBucarProductoKeyReleased

    private void txtBucarProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBucarProductoKeyTyped

        if (txtBucarProducto.getText().length() > 50) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBucarProductoKeyTyped

    private void btnVerVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerVentasActionPerformed
        VerVentas vv = new VerVentas();
        producto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerVentasActionPerformed

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        int linea = tablaProductos.getSelectedRow();

        if (linea >= 0) {
            BeanProducto bpro = listaP.get(linea);
            llenarCampos(bpro);
            RegProducto.pack();
            RegProducto.setResizable(false);
            RegProducto.setLocationRelativeTo(this);
            RegProducto.setVisible(true);
        } else {
            actualTabla(p.consultareProductos());
            JOptionPane.showMessageDialog(this, "Porfavor, seleccione una fila");
        }
    }//GEN-LAST:event_btnModificarProductoActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char letra = evt.getKeyChar();
        if (!Character.isDigit(letra)) {
            evt.consume();
        }
        if (txtCodigo.getText().length() > 12) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void btnRegProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegProductoActionPerformed
        if (btnRegProducto.getText().equals("Registrar")) {
            int opc = JOptionPane.showConfirmDialog(this, "¿Esta seguro de realizar este registro?", "Confirmar acción", JOptionPane.YES_NO_OPTION);

            if (opc == JOptionPane.YES_OPTION) {
                if (!txtProdNom.getText().equals("") || !txtDesc.getText().equals("") || !txtPrecCom.getText().equals("") || !txtPrecVent.getText().equals("") && !txtExist.getText().equals("")) {
                    bp.setCodigo(txtCodigo.getText());
                    bp.setNombre(txtProdNom.getText());
                    bp.setDescripcion((txtDesc.getText()));
                    bp.setPrecio_compra(Float.parseFloat(txtPrecCom.getText()));
                    bp.setPrecio_venta(Float.parseFloat(txtPrecVent.getText()));
                    bp.setExistencias(Integer.parseInt(txtExist.getText()));
                    bp.setProveedor((txtProved.getText()));
                    bp.setMarca((txtMarca.getText()));
                    if (p.registrarProducto(bp)) {
                        RegProducto.dispose();
                        actualTabla(p.consultareProductos());
                        listaP = p.consultareProductos();
                        limpiarCampos();
                        JOptionPane.showMessageDialog(this, "Producto registrado correctamente");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Verifique los datos, revise que se han llenado los campos obligatorios");
                }

            }
        } else if (btnRegProducto.getText().equals("Guardar")) {

            int opc = JOptionPane.showConfirmDialog(this, "¿Esta seguro de modificar los datos?", "Confirmar cambios", JOptionPane.YES_NO_OPTION);

            if (opc == JOptionPane.YES_OPTION) {
                Producto p = new Producto();
                String codigo = txtCodigo.getText();
                String nombre = txtProdNom.getText();
                String desc = txtDesc.getText();
                float pre_com = Float.valueOf(txtPrecCom.getText());
                float pre_ven = Float.valueOf(txtPrecVent.getText());
                int exist = Integer.parseInt(txtExist.getText());
                String provee = txtProved.getText();
                String marca = txtMarca.getText();

                BeanProducto bpro = new BeanProducto(bp.getId(), codigo, nombre, desc, pre_com, pre_ven, exist, provee, marca);

                if (p.modificarProducto(bpro)) {
                    RegProducto.dispose();
                    JOptionPane.showMessageDialog(this, "Cambios guardados");
                    limpiarCampos();
                    actualTabla(p.consultareProductos());
                }

            }
        }


    }//GEN-LAST:event_btnRegProductoActionPerformed

    private void txtProdNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdNomKeyTyped
        char letra = evt.getKeyChar();
        if (!Character.isLetter(letra) && !Character.isDigit(letra) && !Character.toString(letra).equals(" ")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtProdNomKeyTyped

    private void txtDescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescKeyTyped
        char letra = evt.getKeyChar();
        if (!Character.isLetter(letra) && !Character.isDigit(letra) && !Character.toString(letra).equals(" ") && !Character.toString(letra).equals("#") && !Character.toString(letra).equals("/")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDescKeyTyped

    private void txtPrecComKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecComKeyTyped
        char letra = evt.getKeyChar();
        if (!Character.toString(letra).equals(".") && !Character.isDigit(letra)) {
            evt.consume();
        }
        if (txtPrecCom.getText().length() > 6) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecComKeyTyped

    private void txtPrecVentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecVentKeyTyped
        char letra = evt.getKeyChar();
        if (!Character.toString(letra).equals(".") && !Character.isDigit(letra)) {
            evt.consume();
        }
        if (txtPrecVent.getText().length() > 6) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecVentKeyTyped

    private void txtExistKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExistKeyTyped
        char letra = evt.getKeyChar();
        if (!Character.isDigit(letra)) {
            evt.consume();
        }
        if (txtExist.getText().length() > 2) {
            evt.consume();
        }
    }//GEN-LAST:event_txtExistKeyTyped

    private void txtProvedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvedKeyTyped
        char letra = evt.getKeyChar();
        if (!Character.isLetter(letra) && !Character.toString(letra).equals(".") && !Character.toString(letra).equals(" ")) {
            evt.consume();
        }
        if (txtProved.getText().length() > 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtProvedKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        char letra = evt.getKeyChar();
        if (!Character.isLetter(letra) && !Character.toString(letra).equals(".") && !Character.toString(letra).equals(" ")) {
            evt.consume();
        }
        if (txtMarca.getText().length() > 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        actualTabla(p.consultareProductos());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCancelarAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAccionActionPerformed
        if (btnRegProducto.getText().equals("Guardar")) {
            limpiarCampos();
            btnRegProducto.setText("Registrar");
            RegProducto.dispose();
        } else if (btnRegProducto.getText().equals("Registrar")) {
            limpiarCampos();
            btnRegProducto.setText("Guardar");
            RegProducto.dispose();
        }
        limpiarCampos();

    }//GEN-LAST:event_btnCancelarAccionActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        RegProducto.pack();
        RegProducto.setResizable(false);
        RegProducto.setLocationRelativeTo(this);
        RegProducto.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        jLabel7.setText("Modificar datos");
        if (evt.getClickCount() > 1) {
            int linea = tablaProductos.getSelectedRow();

            if (linea >= 0) {
                BeanProducto bpro = listaP.get(linea);
                llenarCampos(bpro);
                RegProducto.pack();
                RegProducto.setResizable(false);
                RegProducto.setLocationRelativeTo(this);
                RegProducto.setVisible(true);
            } else {
                actualTabla(p.consultareProductos());
                JOptionPane.showMessageDialog(this, "Porfavor, seleccione una fila");
            }

        }
        if (evt.getButton() == MouseEvent.BUTTON3) {
            menuOpciones.add(jMenuItem1);
            menuOpciones.add(jMenuItem2);
            menuOpciones.add(jMenuItem3);
            menuOpciones.show(evt.getComponent(),evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int linea = tablaProductos.getSelectedRow();

            if (linea >= 0) {
                BeanProducto bpro = listaP.get(linea);
                llenarCampos(bpro);
                RegProducto.pack();
                RegProducto.setResizable(false);
                RegProducto.setLocationRelativeTo(this);
                RegProducto.setVisible(true);
            } else {
                actualTabla(p.consultareProductos());
                JOptionPane.showMessageDialog(this, "Porfavor, seleccione una fila");
            }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(VerInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JFrame RegProducto;
    private javax.swing.JButton btnCancelarAccion;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JButton btnRegProducto;
    private javax.swing.JButton btnVerVentas;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu menuOpciones;
    public javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtBucarProducto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtExist;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPrecCom;
    private javax.swing.JTextField txtPrecVent;
    private javax.swing.JTextField txtProdNom;
    private javax.swing.JTextField txtProved;
    // End of variables declaration//GEN-END:variables
}
