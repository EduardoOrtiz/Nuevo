package Pantallas;

import Beans.BeanProducto;
import Daos.Producto;
import Daos.Venta;
import Otras.LlenarListas;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerInventario extends javax.swing.JFrame {

    Venta daoVen = new Venta();
    static VerInventario vp = new VerInventario();
    VerVentas producto = new VerVentas();
    Producto p = new Producto();
    BeanProducto bp = new BeanProducto();
    List<BeanProducto> listaP = p.consultareProductos();
    BeanProducto bpro = new BeanProducto();

    LlenarListas ll = new LlenarListas();

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
        labelAñadirModificar = new javax.swing.JLabel();
        btnRegProducto = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnCancelarAccion = new javax.swing.JButton();
        txtCodigo_Proveedor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        menuOpciones = new javax.swing.JPopupMenu();
        menuItemMod = new javax.swing.JMenuItem();
        menuItemEliminar = new javax.swing.JMenuItem();
        menuItemRellenar = new javax.swing.JMenuItem();
        ModProducto = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        txtCodigo1 = new javax.swing.JTextField();
        txtProdNom1 = new javax.swing.JTextField();
        txtDesc1 = new javax.swing.JTextField();
        txtPrecCom1 = new javax.swing.JTextField();
        txtPrecVent1 = new javax.swing.JTextField();
        txtExist1 = new javax.swing.JTextField();
        txtProved1 = new javax.swing.JTextField();
        txtMarca1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        labelAñadirModificar1 = new javax.swing.JLabel();
        btnRegProducto1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnCancelarAccion1 = new javax.swing.JButton();
        txtCodigo_Proveedor1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
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
        btnNuevoProducto = new javax.swing.JButton();

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
        jLabel9.setText("Precio de compra: $");

        jLabel10.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel10.setText("Precio de venta:   $");

        jLabel11.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel11.setText("Existencia: *");

        jLabel12.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel12.setText("Proveedor:");

        jLabel13.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel13.setText("Marca:");

        labelAñadirModificar.setFont(new java.awt.Font("Yu Mincho Light", 0, 24)); // NOI18N
        labelAñadirModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAñadirModificar.setText("Agregar al inventario");

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

        txtCodigo_Proveedor.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txtCodigo_Proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigo_ProveedorKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel14.setText("Código proveedor:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelAñadirModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel8))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecVent, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrecCom, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDesc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtProdNom, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnCancelarAccion, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRegProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigo_Proveedor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtProved, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(txtMarca)
                                    .addComponent(txtExist, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelAñadirModificar)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
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
            .addGroup(RegProductoLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        RegProductoLayout.setVerticalGroup(
            RegProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuItemMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Setting-Tools-16.png"))); // NOI18N
        menuItemMod.setText("Modificar");
        menuItemMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemModActionPerformed(evt);
            }
        });
        menuOpciones.add(menuItemMod);

        menuItemEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close-16.png"))); // NOI18N
        menuItemEliminar.setText("Eliminar");
        menuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarActionPerformed(evt);
            }
        });
        menuOpciones.add(menuItemEliminar);

        menuItemRellenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Box-16.png"))); // NOI18N
        menuItemRellenar.setText("Rellenar");
        menuOpciones.add(menuItemRellenar);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));

        txtCodigo1.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txtCodigo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigo1KeyTyped(evt);
            }
        });

        txtProdNom1.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txtProdNom1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProdNom1KeyTyped(evt);
            }
        });

        txtDesc1.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txtDesc1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDesc1KeyTyped(evt);
            }
        });

        txtPrecCom1.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txtPrecCom1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecCom1KeyTyped(evt);
            }
        });

        txtPrecVent1.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txtPrecVent1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecVent1KeyTyped(evt);
            }
        });

        txtExist1.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txtExist1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExist1KeyTyped(evt);
            }
        });

        txtProved1.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txtProved1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProved1KeyTyped(evt);
            }
        });

        txtMarca1.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txtMarca1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarca1KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel3.setText("Código: *");

        jLabel6.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel6.setText("Producto: *");

        jLabel15.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel15.setText("Descripción:  *");

        jLabel16.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel16.setText("Precio de compra: $");

        jLabel17.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel17.setText("Precio de venta:   $");

        jLabel18.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel18.setText("Existencia: *");

        jLabel19.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel19.setText("Proveedor:");

        jLabel20.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel20.setText("Marca:");

        labelAñadirModificar1.setFont(new java.awt.Font("Yu Mincho Light", 0, 24)); // NOI18N
        labelAñadirModificar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAñadirModificar1.setText("Modificar Información");

        btnRegProducto1.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        btnRegProducto1.setText("Guardar");
        btnRegProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegProducto1ActionPerformed(evt);
            }
        });

        btnCancelarAccion1.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        btnCancelarAccion1.setText("Cancelar");
        btnCancelarAccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAccion1ActionPerformed(evt);
            }
        });

        txtCodigo_Proveedor1.setFont(new java.awt.Font("Yu Mincho Light", 0, 14)); // NOI18N
        txtCodigo_Proveedor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigo_Proveedor1KeyTyped(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        jLabel21.setText("Código proveedor:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelAñadirModificar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel15))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel16)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecVent1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrecCom1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDesc1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtProdNom1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodigo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnCancelarAccion1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRegProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigo_Proveedor1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtProved1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(txtMarca1)
                                    .addComponent(txtExist1, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelAñadirModificar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProdNom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecCom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecVent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExist1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProved1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo_Proveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegProducto1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnCancelarAccion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout ModProductoLayout = new javax.swing.GroupLayout(ModProducto.getContentPane());
        ModProducto.getContentPane().setLayout(ModProductoLayout);
        ModProductoLayout.setHorizontalGroup(
            ModProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModProductoLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ModProductoLayout.setVerticalGroup(
            ModProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
            tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(50);
            tablaProductos.getColumnModel().getColumn(2).setResizable(false);
            tablaProductos.getColumnModel().getColumn(2).setPreferredWidth(120);
            tablaProductos.getColumnModel().getColumn(3).setResizable(false);
            tablaProductos.getColumnModel().getColumn(3).setPreferredWidth(10);
            tablaProductos.getColumnModel().getColumn(4).setResizable(false);
            tablaProductos.getColumnModel().getColumn(4).setPreferredWidth(10);
            tablaProductos.getColumnModel().getColumn(5).setResizable(false);
            tablaProductos.getColumnModel().getColumn(5).setPreferredWidth(20);
            tablaProductos.getColumnModel().getColumn(6).setResizable(false);
            tablaProductos.getColumnModel().getColumn(6).setPreferredWidth(10);
            tablaProductos.getColumnModel().getColumn(7).setResizable(false);
            tablaProductos.getColumnModel().getColumn(7).setPreferredWidth(10);
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

        btnNuevoProducto.setFont(new java.awt.Font("Yu Mincho Light", 0, 18)); // NOI18N
        btnNuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add-48.png"))); // NOI18N
        btnNuevoProducto.setToolTipText("Añadir nuevo producto");
        btnNuevoProducto.setBorder(null);
        btnNuevoProducto.setContentAreaFilled(false);
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
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
                        .addComponent(btnNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(btnNuevoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
        //System.out.println(Arrays.toString(tablaProductos.getSelectedRows()));
        VerVentas vv = new VerVentas();
        producto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerVentasActionPerformed

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        labelAñadirModificar.setText("Modificar datos");

        TextAutoCompleter autoNom = new TextAutoCompleter(txtProdNom);
        TextAutoCompleter autoDesc = new TextAutoCompleter(txtDesc);
        TextAutoCompleter autoMarcas = new TextAutoCompleter(txtMarca);
        TextAutoCompleter autoProveedor = new TextAutoCompleter(txtProved);

        autoNom.addItems(p.nombresProductos());
        autoDesc.addItems(p.descripcionesProductos());
        autoMarcas.addItems(p.marcasProductos());
        autoProveedor.addItems(p.proveedoresProductos());

        if (btnRegProducto.getText().equals("Registrar")) {
            labelAñadirModificar.setText("Agregar al inventario");
        } else if (btnRegProducto.getText().equals("Guardar")) {
            labelAñadirModificar.setText("Modificar datos");
        }

        int linea = tablaProductos.getSelectedRow();

        if (linea >= 0) {
            bpro = listaP.get(linea);
            System.out.println("ID capturado en Boton" + bpro.getId());
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
                    bp.setCodigo_tienda(txtCodigo_Proveedor.getText());
                    if (p.registrarProducto(bp)) {
                        RegProducto.dispose();
                        actualTabla(p.consultareProductos());
                        listaP = p.consultareProductos();
                        limpiarCampos();
                        JOptionPane.showMessageDialog(this, "Producto registrado correctamente");
                        listaP = p.consultareProductos();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Verifique los datos, revise que se han llenado los campos obligatorios");
                }

            }
        } else if (btnRegProducto.getText().equals("Guardar")) {

            int opc = JOptionPane.showConfirmDialog(this, "¿Esta seguro de modificar los datos?", "Confirmar cambios", JOptionPane.YES_NO_OPTION);

            if (opc == JOptionPane.YES_OPTION) {

               

                bpro.setCodigo(txtCodigo.getText());
                bpro.setNombre(txtProdNom.getText());
                bpro.setDescripcion(txtDesc.getText());
                bpro.setPrecio_compra(Float.parseFloat(txtPrecCom.getText()));
                bpro.setPrecio_venta(Float.parseFloat(txtPrecVent.getText()));
                bpro.setExistencias(Integer.parseInt(txtExist.getText()));
                bpro.setProveedor(txtProved.getText());
                bpro.setMarca(txtMarca.getText());
                bpro.setCodigo_tienda(txtCodigo_Proveedor.getText());
                System.out.println("ID" + bpro.getId());
                if (p.modificarProducto(bpro)) {
                    RegProducto.dispose();
                    JOptionPane.showMessageDialog(this, "Cambios guardados");
                    limpiarCampos();
                    actualTabla(p.consultareProductos());
                    btnRegProducto.setText("Registrar");
                    listaP = p.consultareProductos();
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

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        listaP = p.consultareProductos();
        TextAutoCompleter autoNom = new TextAutoCompleter(txtProdNom);
        TextAutoCompleter autoDesc = new TextAutoCompleter(txtDesc);
        TextAutoCompleter autoMarcas = new TextAutoCompleter(txtMarca);
        TextAutoCompleter autoProveedor = new TextAutoCompleter(txtProved);

        autoNom.addItems(p.nombresProductos());
        autoDesc.addItems(p.descripcionesProductos());
        autoMarcas.addItems(p.marcasProductos());
        autoProveedor.addItems(p.proveedoresProductos());

        if (btnRegProducto.getText().equals("Registrar")) {
            labelAñadirModificar.setText("Agregar al inventario");
        } else if (btnRegProducto.getText().equals("Guardar")) {
            labelAñadirModificar.setText("Modificar datos");
        }
        RegProducto.pack();
        RegProducto.setResizable(false);
        RegProducto.setLocationRelativeTo(this);
        RegProducto.setVisible(true);

    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked

        if (evt.getClickCount() > 1) {
           
            int linea = tablaProductos.getSelectedRow();
            bpro = listaP.get(linea);
            VerProductoIndividual vpi = new VerProductoIndividual();
            vpi.llenarCampos(bpro);
            vpi.setLocationRelativeTo(this);
            vpi.setVisible(true);
            
        }
        if (evt.getButton() == MouseEvent.BUTTON3) {
            menuOpciones.add(menuItemMod);
            menuOpciones.add(menuItemEliminar);
            menuOpciones.add(menuItemRellenar);
            menuOpciones.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void menuItemModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemModActionPerformed
        labelAñadirModificar.setText("Modificar datos");

        TextAutoCompleter autoNom = new TextAutoCompleter(txtProdNom);
        TextAutoCompleter autoDesc = new TextAutoCompleter(txtDesc);
        TextAutoCompleter autoMarcas = new TextAutoCompleter(txtMarca);
        TextAutoCompleter autoProveedor = new TextAutoCompleter(txtProved);

        autoNom.addItems(p.nombresProductos());
        autoDesc.addItems(p.descripcionesProductos());
        autoMarcas.addItems(p.marcasProductos());
        autoProveedor.addItems(p.proveedoresProductos());

        int linea = tablaProductos.getSelectedRow();

        if (linea >= 0) {
            bpro = listaP.get(linea);
            System.out.println("ID recogido en Item" + bpro.getId());
            llenarCampos(bpro);
            RegProducto.pack();
            RegProducto.setResizable(false);
            RegProducto.setLocationRelativeTo(this);
            RegProducto.setVisible(true);
        } else {
            actualTabla(p.consultareProductos());
            JOptionPane.showMessageDialog(this, "Porfavor, seleccione una fila");
        }
    }//GEN-LAST:event_menuItemModActionPerformed

    private void menuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "¿Eliminar este producto?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (opc == JOptionPane.YES_OPTION) {
            BeanProducto bean = listaP.get(tablaProductos.getSelectedRow());
            System.out.println(bean.getId());
            if (p.eliminarProducto(bean.getId())) {
                JOptionPane.showMessageDialog(this, "Producto eliminado correctamente");
            }
        }
        actualTabla(p.consultareProductos());
    }//GEN-LAST:event_menuItemEliminarActionPerformed

    private void txtCodigo_ProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo_ProveedorKeyTyped
        
    }//GEN-LAST:event_txtCodigo_ProveedorKeyTyped

    private void txtCodigo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo1KeyTyped

    private void txtProdNom1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdNom1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdNom1KeyTyped

    private void txtDesc1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDesc1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesc1KeyTyped

    private void txtPrecCom1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecCom1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecCom1KeyTyped

    private void txtPrecVent1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecVent1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecVent1KeyTyped

    private void txtExist1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExist1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExist1KeyTyped

    private void txtProved1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProved1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProved1KeyTyped

    private void txtMarca1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarca1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarca1KeyTyped

    private void btnRegProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegProducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegProducto1ActionPerformed

    private void btnCancelarAccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarAccion1ActionPerformed

    private void txtCodigo_Proveedor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo_Proveedor1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo_Proveedor1KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VerInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JFrame ModProducto;
    public javax.swing.JFrame RegProducto;
    private javax.swing.JButton btnCancelarAccion;
    private javax.swing.JButton btnCancelarAccion1;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JButton btnNuevoProducto;
    private javax.swing.JButton btnRegProducto;
    private javax.swing.JButton btnRegProducto1;
    private javax.swing.JButton btnVerVentas;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAñadirModificar;
    private javax.swing.JLabel labelAñadirModificar1;
    private javax.swing.JMenuItem menuItemEliminar;
    private javax.swing.JMenuItem menuItemMod;
    private javax.swing.JMenuItem menuItemRellenar;
    private javax.swing.JPopupMenu menuOpciones;
    public javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtBucarProducto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtCodigo_Proveedor;
    private javax.swing.JTextField txtCodigo_Proveedor1;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtDesc1;
    private javax.swing.JTextField txtExist;
    private javax.swing.JTextField txtExist1;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMarca1;
    private javax.swing.JTextField txtPrecCom;
    private javax.swing.JTextField txtPrecCom1;
    private javax.swing.JTextField txtPrecVent;
    private javax.swing.JTextField txtPrecVent1;
    private javax.swing.JTextField txtProdNom;
    private javax.swing.JTextField txtProdNom1;
    private javax.swing.JTextField txtProved;
    private javax.swing.JTextField txtProved1;
    // End of variables declaration//GEN-END:variables
}
