/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_josehernandez;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jrdjh
 */
public class PrincipalLab extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalLab
     */
    public PrincipalLab() {
        initComponents();

        this.setLocationRelativeTo(null);
        lista_bebidas.add(new Bebida("rt1", "Patito", "7Down", 45, 10, "Nacional", 200192, 20, 100, new Date()));
        lista_bebidas.add(new Bebida("rt2", "Patos", "Koka", 35, 0, "No Nacional", 205192, 20, 100, new Date()));
        lista_bebidas.add(new Bebida("rt3", "Dell", "Comp", 50, 50, "Nacional", 100192, 70, 100, new Date()));
        lista_bebidas.add(new Bebida("rt4", "HP", "Tarjeta", 45, 10, "Nacional", 800192, 20, 100, new Date()));
        lista_bebidas.add(new Bebida("rt5", "Coca", "7UP", 45, 10, "Nacional", 880192, 20, 100, new Date()));
        lista_bebidas.add(new Bebida("rt6", "Coca", "Coca-Cola", 45, 10, "Nacional", 900192, 20, 100, new Date()));
        lista_bebidas.add(new Bebida("rt7", "Casa", "Pepsi", 45, 10, "Nacional", 300192, 20, 100, new Date()));
        lista_bebidas.add(new Bebida("rt8", "Hogar", "Familiar", 45, 10, "Nacional", 500192, 20, 100, new Date()));
        lista_bebidas.add(new Bebida("rt9", "Templo", "Down", 45, 10, "Nacional", 1100192, 20, 100, new Date()));
        lista_bebidas.add(new Bebida("rt10", "Tempestad", "Bombastico", 45, 10, "Nacional", 5600192, 20, 100, new Date()));
        lista_bebidas.add(new Bebida("rt11", "Tormenta", "Huracan", 45, 10, "Nacional", 8700192, 20, 100, new Date()));
        lista_bebidas.add(new Bebida("rt12", "Natural", "Manzanares", 45, 10, "Nacional", 5400192, 20, 100, new Date()));
        lista_bebidas.add(new Bebida("rt13", "RX", "Xtreme", 45, 10, "Nacional", 3300192, 20, 100, new Date()));
        lista_bebidas.add(new Bebida("rt14", "Desma", "LocuraFresa", 45, 10, "Nacional", 1100192, 20, 100, new Date()));
        lista_bebidas.add(new Bebida("rt15", "Patio", "24/7", 45, 10, "Nacional", 208192, 20, 100, new Date()));
        DefaultTableModel m = (DefaultTableModel) jt_inventario.getModel();

        for (int i = 0; i < lista_bebidas.size(); i++) {
            lista_bebidas.get(i).getColorantes().add(new Colorante("Azul-4"));
            lista_bebidas.get(i).getColorantes().add(new Colorante("Rojo-69"));
            Object[] newRow1 = {
                lista_bebidas.get(i).getCodigo(), lista_bebidas.get(i).getNombre_marca(),
                lista_bebidas.get(i).getNombre_bebida(), lista_bebidas.get(i).getCant_azucar(),
                lista_bebidas.get(i).getPorcentaje_alcohol(), lista_bebidas.get(i).getNacional(),
                lista_bebidas.get(i).getNum_lote(), lista_bebidas.get(i).getColorantes(),
                lista_bebidas.get(i).getPrecio(), lista_bebidas.get(i).getCantidad(),
                lista_bebidas.get(i).getFecha_vencimiento()
            };
            m.addRow(newRow1);
            jt_inventario.setModel(m);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_productoNacional = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        tf_nombreMarca = new javax.swing.JTextField();
        tf_nombreBebida = new javax.swing.JTextField();
        tf_ozAzucar = new javax.swing.JTextField();
        tf_porcentajeAlcohol = new javax.swing.JTextField();
        rb_nacional = new javax.swing.JRadioButton();
        rb_noNacional = new javax.swing.JRadioButton();
        tf_numLote = new javax.swing.JTextField();
        cb_coloranteAzul = new javax.swing.JCheckBox();
        cb_coloranteRojo = new javax.swing.JCheckBox();
        cb_coloranteVerde = new javax.swing.JCheckBox();
        cb_coloranteAmarillo = new javax.swing.JCheckBox();
        cb_coloranteBlanco = new javax.swing.JCheckBox();
        tf_precio = new javax.swing.JTextField();
        tf_cantidad = new javax.swing.JTextField();
        dc_fechaVencimiento = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_inventario = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nombre de la Marca:");

        jLabel3.setText("Nombre de La Bebida:");

        jLabel4.setText("Cantidad de Azucar en OZ:");

        jLabel5.setText("Porcentaje de Alcohol:");

        jLabel6.setText("Nacional/No Nacional:");

        jLabel7.setText("N° de Lote:");

        jLabel8.setText("Tipo de Colorante(s):");

        jLabel9.setText("Precio:");

        jLabel10.setText("Cantidad:");

        jLabel11.setText("Fecha Vencimiento:");

        bg_productoNacional.add(rb_nacional);
        rb_nacional.setText("Nacional");

        bg_productoNacional.add(rb_noNacional);
        rb_noNacional.setText("No Nacional");

        cb_coloranteAzul.setText("Azul-4");

        cb_coloranteRojo.setText("Rojo-69");

        cb_coloranteVerde.setText("Verde-420");

        cb_coloranteAmarillo.setText("Amarillo-77");

        cb_coloranteBlanco.setText("Blanco-07");

        jButton1.setText("Agregar Al Inventario");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_porcentajeAlcohol))
                        .addComponent(jLabel6)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_ozAzucar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rb_nacional)
                        .addGap(18, 18, 18)
                        .addComponent(rb_noNacional))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_nombreMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_nombreBebida))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_numLote, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(dc_fechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cb_coloranteRojo)
                                                .addComponent(cb_coloranteAzul)
                                                .addComponent(cb_coloranteVerde)
                                                .addComponent(cb_coloranteAmarillo)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(cb_coloranteBlanco)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(tf_cantidad))))))
                                .addGap(0, 270, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(74, 74, 74))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tf_numLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tf_nombreMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cb_coloranteAzul)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tf_nombreBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_coloranteRojo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_coloranteVerde)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tf_ozAzucar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_coloranteAmarillo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_coloranteBlanco)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(tf_porcentajeAlcohol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(tf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dc_fechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_nacional)
                    .addComponent(rb_noNacional)
                    .addComponent(jButton1))
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("Agregar Bebida", jPanel1);

        jt_inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre de la Marca", "Nombre de la Bebida", "OZ Azucar", "% de Alcohol", "Nacional/No Nacional", "N° de Lote", "Colorantes", "Precio", "Cantidad", "Fecha de Vencimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_inventario);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inventario", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 855, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 855, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 855, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab5", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jt_inventario.getModel();
        String codigo = tf_codigo.getText();
        String nomMarca = tf_nombreMarca.getText();
        String nomBebida = tf_nombreBebida.getText();
        double ozAzucar = Integer.parseInt(tf_ozAzucar.getText());
        double porcentaje_alcohol = Double.parseDouble(tf_porcentajeAlcohol.getText());
        String nacio = "";
        Colorante c1 = new Colorante(), c2 = new Colorante(), c3 = new Colorante(), c4 = new Colorante(), c5 = new Colorante();
        if (rb_nacional.isSelected()) {
            nacio = "Nacional";
        } else if (rb_noNacional.isSelected()) {
            nacio = "No Nacional";
        }
        int numLote = Integer.parseInt(tf_numLote.getText());
        if (cb_coloranteAmarillo.isSelected()) {
            c1 = new Colorante("Amarillo-77");
        }
        if (cb_coloranteAzul.isSelected()) {
            c2 = new Colorante("Azul-4");
        }
        if (cb_coloranteBlanco.isSelected()) {
            c3 = new Colorante("Blanco-07");
        }
        if (cb_coloranteRojo.isSelected()) {
            c4 = new Colorante("Rojo-69");
        }
        if (cb_coloranteVerde.isSelected()) {
            c5 = new Colorante("Verde-420");
        }

        double precio = Double.parseDouble(tf_precio.getText());
        int cantidad = Integer.parseInt(tf_cantidad.getText());
        Date fecha_ven = dc_fechaVencimiento.getDate();

        for (int i = 0; i < lista_bebidas.size(); i++) {
            if (lista_bebidas.get(i).getCodigo().equals(codigo)) {
                JOptionPane.showMessageDialog(this, "El Codigo Ya Existe En una Bebida");
            } else {

                lista_bebidas.add(new Bebida(codigo, nomMarca, nomBebida, ozAzucar,
                        porcentaje_alcohol, nacio, numLote, precio, cantidad, fecha_ven));
                System.out.println(lista_bebidas.size());
                bebida_actual = lista_bebidas.get(lista_bebidas.size() - 1);

                break;
            }
        }
        if (c1 != null) {
            bebida_actual.getColorantes().add(c1);
        }
        if (c2 != null) {
            bebida_actual.getColorantes().add(c2);
        }
        if (c3 != null) {
            bebida_actual.getColorantes().add(c3);
        }

        if (c4 != null) {
            bebida_actual.getColorantes().add(c4);
        }
        if (c5 != null) {
            bebida_actual.getColorantes().add(c5);
        }

        String colorantes = "";
        for (int i = 0; i < bebida_actual.getColorantes().size(); i++) {

            colorantes += bebida_actual.getColorantes().get(i) + "\n";

        }

        Object[] newRow = {codigo, nomMarca, nomBebida, ozAzucar,
            porcentaje_alcohol, nacio, numLote, colorantes, precio, cantidad, fecha_ven
        };

        model.addRow(newRow);
        jt_inventario.setModel(model);

        tf_cantidad.setText("");
        tf_codigo.setText("");
        tf_nombreBebida.setText("");
        tf_nombreMarca.setText("");
        tf_numLote.setText("");
        tf_ozAzucar.setText("");
        tf_porcentajeAlcohol.setText("");
        tf_precio.setText("");
        dc_fechaVencimiento.setDate(new Date());
        rb_nacional.setSelected(true);
        rb_noNacional.setSelected(false);
        cb_coloranteAmarillo.setSelected(false);
        cb_coloranteAzul.setSelected(false);
        cb_coloranteVerde.setSelected(false);
        cb_coloranteBlanco.setSelected(false);
        cb_coloranteRojo.setSelected(false);


    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(PrincipalLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalLab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_productoNacional;
    private javax.swing.JCheckBox cb_coloranteAmarillo;
    private javax.swing.JCheckBox cb_coloranteAzul;
    private javax.swing.JCheckBox cb_coloranteBlanco;
    private javax.swing.JCheckBox cb_coloranteRojo;
    private javax.swing.JCheckBox cb_coloranteVerde;
    private com.toedter.calendar.JDateChooser dc_fechaVencimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jt_inventario;
    private javax.swing.JRadioButton rb_nacional;
    private javax.swing.JRadioButton rb_noNacional;
    private javax.swing.JTextField tf_cantidad;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_nombreBebida;
    private javax.swing.JTextField tf_nombreMarca;
    private javax.swing.JTextField tf_numLote;
    private javax.swing.JTextField tf_ozAzucar;
    private javax.swing.JTextField tf_porcentajeAlcohol;
    private javax.swing.JTextField tf_precio;
    // End of variables declaration//GEN-END:variables
    ArrayList<Bebida> lista_bebidas = new ArrayList();
    Bebida bebida_actual;

}
