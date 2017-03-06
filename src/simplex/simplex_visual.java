package simplex;
import javax.swing.table.DefaultTableModel;
public class simplex_visual extends javax.swing.JFrame {

    public simplex_visual() {
    
        initComponents();
        contenedor.setVisible(false);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Resultado_vista = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita_vista = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        contenedor = new javax.swing.JLayeredPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        resultado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablita_vista1 = new javax.swing.JTable();
        accion = new javax.swing.JButton();
        jvariables = new javax.swing.JTextField();
        condiciones = new javax.swing.JTextField();

        tablita_vista.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablita_vista);

        javax.swing.GroupLayout Resultado_vistaLayout = new javax.swing.GroupLayout(Resultado_vista.getContentPane());
        Resultado_vista.getContentPane().setLayout(Resultado_vistaLayout);
        Resultado_vistaLayout.setHorizontalGroup(
            Resultado_vistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Resultado_vistaLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        Resultado_vistaLayout.setVerticalGroup(
            Resultado_vistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Resultado_vistaLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simplex - Investigación de operaciones - PRIMAVERA 2017");

        jLabel1.setText("Número de variables: ");

        jLabel2.setText("Número de condiciones:");

        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablita);

        resultado.setText("¡Resultado!");
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        tablita_vista1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablita_vista1);

        contenedor.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        contenedor.setLayer(resultado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        contenedor.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(resultado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(resultado)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        accion.setText("Simplex!");
        accion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accionActionPerformed(evt);
            }
        });

        jvariables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvariablesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(condiciones)
                            .addComponent(jvariables, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(accion)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jvariables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(condiciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accion)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(18, 18, 18)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accionActionPerformed
        /* NumX = Integer.decode(variables.getText());
        conditions = Integer.decode(condiciones.getText());
        DefaultTableModel model = (DefaultTableModel) tablita.getModel();
        
        System.out.println("Conditions value: "+Double.valueOf(condiciones.getText()));
        System.out.println("Variables value: "+Double.valueOf(variables.getText()));
        
        for (int l = 0; l < Double.valueOf(variables.getText())+1; l++) {
        model.addColumn(new String[Integer.valueOf(condiciones.getText())+1]);
        }
        for(int i = 0; i<Double.valueOf(condiciones.getText())+1; i++ ){
        model.addRow(new String [ NumX + 1 ]);
        }
        contenedor.setVisible(true);
        variables.disable();
        condiciones.disable();
        accion.setVisible(false);*/
        
                try {
            restricciones = Integer.parseInt(condiciones.getText());
            variables = Integer.parseInt(jvariables.getText());

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setRowCount(restricciones + 1);
            modelo.setColumnCount(variables + restricciones + 2);
            array = new Object[variables + restricciones + 2];
            EtiquetaX = new Object[variables + restricciones];
            for (int i = 1; i < array.length - 1; i++) {
                if (i < variables + 1) {
                    array[i] = "X" + i;
                    EtiquetaX[i - 1] = "X" + i;
                } else {
                    array[i] = "S" + (i - variables);
                    EtiquetaX[i - 1] = "S" + (i - variables);
                }
            }
            //---------------------
            EtiquetaY = new Object[restricciones + 1];
            for (int i = 0; i < restricciones; i++) {
                modelo.setValueAt("S" + (i + 1), i, 0);
                EtiquetaY[i] = "S" + (i + 1);
            }
            modelo.setValueAt("Z", restricciones, 0);
            EtiquetaY[restricciones] = "Z";
            //----------------------
            array[array.length - 1] = "valor";
            modelo.setColumnIdentifiers(array);
            tablita.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
        contenedor.setVisible(true);
        jvariables.disable();
        condiciones.disable();
        accion.setVisible(false);
    }//GEN-LAST:event_accionActionPerformed
    private void jvariablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvariablesActionPerformed

    }//GEN-LAST:event_jvariablesActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        try {
            DefaultTableModel modeloSolucion = new DefaultTableModel();
            Matriz = new double[restricciones + 1][restricciones + variables + 1];
            for (int i = 0; i < (restricciones + 1); i++) {
                for (int j = 0; j < (restricciones + variables )+1; j++) {
                    Matriz[i][j] = Double.parseDouble(tablita.getValueAt(i, j + 1).toString());
                    System.out.println(tablita.getValueAt( i, j + 1 ));
                }
            }
            while (ComprobarResultado() != true) {
                System.out.println("Entra");
                EtiquetaY[FilaPivote()] = EtiquetaX[ColumnaPivote()];
                NuevaTabla(FilaPivote(), ColumnaPivote());
                modeloSolucion.setColumnCount(restricciones + variables + 2);
                modeloSolucion.setRowCount(restricciones + 1);
                //--------------------------
                modeloSolucion.setColumnIdentifiers(array);
                //---------------------------
                for (int i = 0; i < (restricciones + 1); i++) {
                    modeloSolucion.setValueAt(EtiquetaY[i], i, 0);
                    for (int j = 0; j < (restricciones + variables + 1); j++) {
                        modeloSolucion.setValueAt(Matriz[i][j], i, j + 1);
                    }
                }
                tablita_vista1.setModel(modeloSolucion);
                iteracion++;
            }
           
            System.out.println("Prueba");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
        
        
        
        
        
        /*Resultado_vista.setVisible(true);
        Resultado_vista.setSize(800, 400);*/
        
    }//GEN-LAST:event_resultadoActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new simplex_visual().setVisible(true);
            }
        });
    }
    int NumX;
    int restricciones;
    int variables;
    int iter = 0, iteracion = 0;
    Object array[]=null;
    Object EtiquetaX[]=null, EtiquetaY[]=null;
    double Matriz[][]=null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Resultado_vista;
    private javax.swing.JButton accion;
    private javax.swing.JTextField condiciones;
    private javax.swing.JLayeredPane contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jvariables;
    private javax.swing.JButton resultado;
    private javax.swing.JTable tablita;
    private javax.swing.JTable tablita_vista;
    public javax.swing.JTable tablita_vista1;
    // End of variables declaration//GEN-END:variables


  public int ColumnaPivote() {
        int pos = 0;
        double aux = Matriz[restricciones][0];
        for (int i = 1; i < restricciones + variables; i++) {
            if (aux > Matriz[restricciones][i]) {
                aux = Matriz[restricciones][i];
                pos = i;
            }
        }
        return pos;
    }

    public int FilaPivote() {
        int columna = ColumnaPivote();
        double temp = 0, razon = Matriz[0][variables + restricciones] / Matriz[0][columna];
        int pos = 0;
        for (int i = 1; i < restricciones; i++) {
            if (Matriz[i][columna] != 0) {
                temp = Matriz[i][variables + restricciones] / Matriz[i][columna];
                if (razon > temp && temp >= 0) {
                    razon = temp;
                    pos = i;
                }
            }   
        } 
        return pos;
    }

    public void NuevaTabla(int Fila, int Columna) {
        double pivote = Matriz[Fila][Columna], temp = 0;//--
        for (int i = 0; i < restricciones + variables + 1; i++) {
            Matriz[Fila][i] = Matriz[Fila][i] / pivote;
        }
        for (int i = 0; i < restricciones + 1; i++) {
            temp = Matriz[i][Columna];
            for (int j = 0; j < variables + restricciones + 1; j++) {
                if (i != Fila) {
                    Matriz[i][j] = Matriz[i][j] - temp * Matriz[Fila][j];
                } else {
                    break;
                }
            }
        }
    }

    public boolean ComprobarResultado() {
        boolean result = true;
        for (int i = 0; i < restricciones + variables; i++) {
            if (Matriz[restricciones][i] < 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
