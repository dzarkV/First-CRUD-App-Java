/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.EquipoController;
import static controller.EquipoController.updateCombo;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author dzark
 */
public class DeleteView extends javax.swing.JFrame {
    
    private ArrayList<String> equipos;

    /**
     * Creates new form DeleteView
     */
    public DeleteView() {
        initComponents();
        this.setLocationRelativeTo(null); //para centrar la ventana
        
        /* Inicialización de la ventana con cada equipo de la BD 
        como opción en el combobox */
        equipos = updateCombo();
        equipos.forEach((s) -> {
            ComboBoxDeleteView.addItem(s);      
        });
        String url = "img/alert_icon.png" ; 
        ImageIcon imgAlert = new ImageIcon(url );
        AlertImg.setIcon(imgAlert);
        
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
        backView = new javax.swing.JButton();
        ComboBoxDeleteView = new javax.swing.JComboBox<>();
        buttonDeleteViewTeam = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Labelghost = new javax.swing.JLabel();
        AlertImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Borrar", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Fira Mono", 1, 14))); // NOI18N

        backView.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        backView.setText("Volver");
        backView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backViewActionPerformed(evt);
            }
        });

        ComboBoxDeleteView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxDeleteViewActionPerformed(evt);
            }
        });

        buttonDeleteViewTeam.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonDeleteViewTeam.setText("Borrar equipo");
        buttonDeleteViewTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteViewTeamActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione el equipo que desea borrar");

        jLabel1.setText("Se borrarán los datos del equipo,");

        jLabel3.setText("del director técnico  y  de los jugadores");

        jLabel4.setText("asociados.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Labelghost)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(AlertImg, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(backView)
                        .addGap(42, 42, 42)
                        .addComponent(buttonDeleteViewTeam))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxDeleteView, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboBoxDeleteView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(Labelghost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(AlertImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backView)
                    .addComponent(buttonDeleteViewTeam))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backViewActionPerformed
        TournamentView tournamentview = new TournamentView();
        tournamentview.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backViewActionPerformed

    private void ComboBoxDeleteViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxDeleteViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxDeleteViewActionPerformed

    /**
     * Método para borrar equipo seleccionado
     * @param evt 
     */
    private void buttonDeleteViewTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteViewTeamActionPerformed

        String selection = ComboBoxDeleteView.getSelectedItem().toString();
        
        int resp = JOptionPane.showConfirmDialog(null, "¿Seguro desea borrar al equipo " + selection + "?");
        
        if(resp == JOptionPane.YES_OPTION){
            /**
            * Proceso para borrar un equipo, según selección en combobox
            */
            EquipoController eqc = new EquipoController();
        
            eqc.DeleteWholeEquipo(selection);
            
            DefaultComboBoxModel m = (DefaultComboBoxModel) ComboBoxDeleteView.getModel() ;
       
            m.removeAllElements() ;
        
            equipos = updateCombo();
            equipos.forEach((s) -> {
            ComboBoxDeleteView.addItem(s);      
            });
        }
    }//GEN-LAST:event_buttonDeleteViewTeamActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlertImg;
    private javax.swing.JComboBox<String> ComboBoxDeleteView;
    private javax.swing.JLabel Labelghost;
    private javax.swing.JButton backView;
    private javax.swing.JButton buttonDeleteViewTeam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}