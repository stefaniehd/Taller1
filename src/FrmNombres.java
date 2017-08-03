/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tefa-PC
 */
public class FrmNombres extends javax.swing.JFrame {

    /**
     * Creates new form FrmNombres
     */
   
    private Logic log; //instancia de Logic
    
    /**
     * Creates new form FrmMain
     */
    public FrmNombres() {
        initComponents();
        setLocationRelativeTo(null);
        log = new Logic(); //inicializa la instancia
    }
    
     private void position(){
        //log.getMatriz()[0][0]; --> dato en posicion 0,0 en el arreglo
        if(log.getMatriz()[0][0].equals("")){//valida si el dato está vacío
        }
        Object o = log.getMatriz()[0][0];//guarda dato en una variable
    }
    
    private void createMatriz(){
        if (log.getMatriz()==null) { //valida si matriz no está creada
            log.createMatriz(5, 5);//llama al método crear matriz en Logic
            lblMessage.setText("Matriz creada!");
        }else{//si la matriz está creada
            lblMessage.setText("La matriz ya fue creada");
        }
    }
    
    //llena una posicion de la matriz
    private void add(int row, int column, Object data){
        if (log.getMatriz()!=null) {//valida si matriz está creada
            if (!data.equals("")) {//valida si el dato no está vacío
                log.addData(row, column, data);
                lblMessage.setText("Dato correcto!");
            }else{//si el dato está vacío
                lblMessage.setText("Ingrese un dato");
            }
        }else{//si la matriz no está creada
            lblMessage.setText("No se ha creado la matriz!");
        }
    }
    
    /**
     * limpia la matriz
     */
    private void cleanMatriz(){
        if (log.getMatriz()!=null) {//valida si matriz está creada
            log.cleanMatriz();//llama al método limpiar matriz en Logic
            lblMessage.setText("Matriz limpia!");
            cleanInterface();
        }else{
            lblMessage.setText("No hay matriz para limpiar");
        }
    }
    
    private void removeData(){
        txtDato.setText("");
    }
    
     private void cleanInterface(){
         btn0_0.setText("");
         btn0_1.setText("");
         btn0_2.setText("");
         btn1_0.setText("");
         btn1_1.setText("");
         btn1_2.setText("");
         btn2_0.setText("");
         btn2_1.setText("");
         btn2_2.setText("");
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDelete = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btn1_2 = new javax.swing.JButton();
        btn2_2 = new javax.swing.JButton();
        btn2_1 = new javax.swing.JButton();
        btn1_1 = new javax.swing.JButton();
        btn0_1 = new javax.swing.JButton();
        btn0_2 = new javax.swing.JButton();
        btn0_0 = new javax.swing.JButton();
        btn1_0 = new javax.swing.JButton();
        btn2_0 = new javax.swing.JButton();
        txtDato = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnClean1 = new javax.swing.JButton();
        btnCreate1 = new javax.swing.JButton();
        lblMessage = new javax.swing.JTextField();

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClean.setText("Clean");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1_2.setBackground(new java.awt.Color(102, 102, 102));
        btn1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_2ActionPerformed(evt);
            }
        });

        btn2_2.setBackground(new java.awt.Color(102, 102, 102));
        btn2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_2ActionPerformed(evt);
            }
        });

        btn2_1.setBackground(new java.awt.Color(102, 102, 102));
        btn2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_1ActionPerformed(evt);
            }
        });

        btn1_1.setBackground(new java.awt.Color(102, 102, 102));
        btn1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_1ActionPerformed(evt);
            }
        });

        btn0_1.setBackground(new java.awt.Color(102, 102, 102));
        btn0_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0_1ActionPerformed(evt);
            }
        });

        btn0_2.setBackground(new java.awt.Color(102, 102, 102));
        btn0_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0_2ActionPerformed(evt);
            }
        });

        btn0_0.setBackground(new java.awt.Color(102, 102, 102));
        btn0_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0_0ActionPerformed(evt);
            }
        });

        btn1_0.setBackground(new java.awt.Color(102, 102, 102));
        btn1_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_0ActionPerformed(evt);
            }
        });

        btn2_0.setBackground(new java.awt.Color(102, 102, 102));
        btn2_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_0ActionPerformed(evt);
            }
        });

        txtDato.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese un nombre");

        btnClean1.setBackground(new java.awt.Color(0, 204, 204));
        btnClean1.setText("Limpiar Matriz");
        btnClean1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClean1ActionPerformed(evt);
            }
        });

        btnCreate1.setBackground(new java.awt.Color(0, 204, 204));
        btnCreate1.setText("Crear Matriz");
        btnCreate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn0_0, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(btn1_0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn2_0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn0_1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(btn1_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn2_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn0_2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(btn1_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn2_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreate1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClean1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn0_1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn0_0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn0_2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCreate1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClean1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_2ActionPerformed
        add(1, 2, txtDato.getText().trim());
        btn1_2.setText(txtDato.getText().trim());
        removeData();
    }//GEN-LAST:event_btn1_2ActionPerformed

    private void btn2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_2ActionPerformed
        add(2, 2, txtDato.getText().trim());
        btn2_2.setText(txtDato.getText().trim());
        removeData();
    }//GEN-LAST:event_btn2_2ActionPerformed

    private void btn2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_1ActionPerformed
        add(2, 1, txtDato.getText().trim());
        btn2_1.setText(txtDato.getText().trim());
        removeData();
    }//GEN-LAST:event_btn2_1ActionPerformed

    private void btn1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_1ActionPerformed
        add(1, 1, txtDato.getText().trim());
        btn1_1.setText(txtDato.getText().trim());
        removeData();
    }//GEN-LAST:event_btn1_1ActionPerformed

    private void btn0_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0_1ActionPerformed
        add(0, 1, txtDato.getText().trim());
        btn0_1.setText(txtDato.getText().trim());
        removeData();
    }//GEN-LAST:event_btn0_1ActionPerformed

    private void btn0_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0_2ActionPerformed
        add(0, 2, txtDato.getText().trim());
        btn0_2.setText(txtDato.getText().trim());
        removeData();
    }//GEN-LAST:event_btn0_2ActionPerformed

    private void btn0_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0_0ActionPerformed
        add(0, 0, txtDato.getText().trim());// añade el dato a la posición
        btn0_0.setText(txtDato.getText().trim());//añade el dato al boton
        removeData();//llama al método que limpia el textfield
        /**
        * el código anterior se repite en todos los botones, sólo cambia la posición
        */
    }//GEN-LAST:event_btn0_0ActionPerformed

    private void btn1_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_0ActionPerformed
        add(1, 0, txtDato.getText().trim());
        btn1_0.setText(txtDato.getText().trim());
        removeData();
    }//GEN-LAST:event_btn1_0ActionPerformed

    private void btn2_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_0ActionPerformed
        add(2, 0, txtDato.getText().trim());
        btn2_0.setText(txtDato.getText().trim());
    }//GEN-LAST:event_btn2_0ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //llama al método eliminar matriz
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        cleanMatriz();//llama al método limpiar matriz
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        createMatriz();//llama al método crear matriz
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnClean1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClean1ActionPerformed
        cleanMatriz();//llama al método limpiar matriz
    }//GEN-LAST:event_btnClean1ActionPerformed

    private void btnCreate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreate1ActionPerformed
        createMatriz();//llama al método crear matriz
    }//GEN-LAST:event_btnCreate1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNombres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0_0;
    private javax.swing.JButton btn0_1;
    private javax.swing.JButton btn0_2;
    private javax.swing.JButton btn1_0;
    private javax.swing.JButton btn1_1;
    private javax.swing.JButton btn1_2;
    private javax.swing.JButton btn2_0;
    private javax.swing.JButton btn2_1;
    private javax.swing.JButton btn2_2;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnClean1;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnCreate1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lblMessage;
    private javax.swing.JTextField txtDato;
    // End of variables declaration//GEN-END:variables

    

}
