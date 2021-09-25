/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author dzark
 */
public class TournamentView extends javax.swing.JFrame {

    /**
     * Creates new form TournamentView
     */
    public TournamentView() {
        initComponents();
        this.setLocationRelativeTo(null); //para centrar la ventana
        InitIcons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Crear = new javax.swing.JButton();
        createIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Ver = new javax.swing.JButton();
        checkIcon = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Actualizar = new javax.swing.JButton();
        updateIcon = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Borrar = new javax.swing.JButton();
        deleteIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear equipo", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Fira Mono", 0, 16))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(186, 20));

        Crear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Crear.setText("Crear");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Crear, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(createIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Dialog", 1, 18)), "Ver equipo", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Fira Mono", 0, 16))); // NOI18N

        Ver.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Ver.setText("Ver");
        Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(checkIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Ver, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(checkIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Ver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actualizar equipo", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Fira Mono", 0, 16))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(186, 20));

        Actualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Actualizar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(updateIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(updateIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Borrar equipo", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Fira Mono", 0, 16))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(186, 20));

        Borrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Borrar))
                .addGap(36, 36, 36))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(deleteIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro del torneo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método para abrir ventana de creación
     * @param evt 
     */
    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        CreateView createview = new CreateView();
        createview.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CrearActionPerformed

    /**
     * Método para establecer los iconos en cada JLabel
     */
    private void InitIcons(){
        String icon1 = "img/create_icon.png" ; 
        String icon2 = "img/check_icon.png" ;
        String icon3 = "img/update_icon.png" ;
        String icon4 = "img/delete_icon.png";
        ImageIcon imgCreate = new ImageIcon(icon1 );
        ImageIcon imgRead = new ImageIcon(icon2 );
        ImageIcon imgUpdate = new ImageIcon(icon3 );
        ImageIcon imgDelete = new ImageIcon(icon4 );
        createIcon.setIcon(imgCreate);
        checkIcon.setIcon(imgRead);
        updateIcon.setIcon(imgUpdate);
        deleteIcon.setIcon(imgDelete);
    }
    /**
     * Método para abrir ventana de lectura
     * @param evt 
     */
    private void VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerActionPerformed
        ReadView readview = new ReadView();
        readview.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VerActionPerformed

    /**
     * Método para abrir ventana de actualización
     * @param evt 
     */
    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        
        UpdateView updateview = new UpdateView();
        updateview.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ActualizarActionPerformed

    /**
     * Método para abrir ventana de borrado
     * @param evt 
     */
    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        DeleteView deleteview = new DeleteView();
        deleteview.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BorrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the system's look and feel */
         /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CreateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CreateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CreateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CreateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        
        
        
        /* Look and feel del sistema  */
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (Exception e) {
//            e.printStackTrace();
//        } 
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TournamentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Crear;
    private javax.swing.JButton Ver;
    private javax.swing.JLabel checkIcon;
    private javax.swing.JLabel createIcon;
    private javax.swing.JLabel deleteIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel updateIcon;
    // End of variables declaration//GEN-END:variables
}