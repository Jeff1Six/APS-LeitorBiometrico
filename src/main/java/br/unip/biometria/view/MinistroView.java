package br.unip.biometria.view;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MinistroView extends javax.swing.JFrame {

    public MinistroView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tbEmpresaLeve = new javax.swing.JButton();
        tbEmpresaPesado = new javax.swing.JButton();
        btEmpresaMargem = new javax.swing.JButton();
        btnAgroLegal1 = new javax.swing.JButton();
        btnAgroIlegal1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.BLACK);
        jLabel1.setText("AREA DO MINISTRO DO MEIO AMBIENTE");
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);

        
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        

        jButton1.setFont(new java.awt.Font("Courier", 0, 12)); // NOI18N
        jButton1.setText("Ver empresas");
        jButton1.setHideActionText(true);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbEmpresaLeve.setFont(new java.awt.Font("Courier", 0, 12)); // NOI18N
        tbEmpresaLeve.setText("Empresas Agro-Leve");
        tbEmpresaLeve.setHideActionText(true);
        tbEmpresaLeve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbEmpresaLeve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEmpresaLeveActionPerformed(evt);
            }
        });

        tbEmpresaPesado.setFont(new java.awt.Font("Courier", 0, 12)); // NOI18N
        tbEmpresaPesado.setText("Empresas Agro-Pesado");
        tbEmpresaPesado.setHideActionText(true);
        tbEmpresaPesado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbEmpresaPesado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEmpresaPesadoActionPerformed(evt);
            }
        });

        btEmpresaMargem.setFont(new java.awt.Font("Courier", 0, 12)); // NOI18N
        btEmpresaMargem.setText("Empresas em margens");
        btEmpresaMargem.setHideActionText(true);
        btEmpresaMargem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEmpresaMargem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmpresaMargemActionPerformed(evt);
            }
        });

        btnAgroLegal1.setFont(new java.awt.Font("Courier", 0, 12)); // NOI18N
        btnAgroLegal1.setText("Agrotóxicos Legais");
        btnAgroLegal1.setHideActionText(true);
        btnAgroLegal1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgroLegal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgroLegal1ActionPerformed(evt);
            }
        });

        btnAgroIlegal1.setFont(new java.awt.Font("Courier", 0, 12)); // NOI18N
        btnAgroIlegal1.setText("Agrotóxicos Ilegais");
        btnAgroIlegal1.setHideActionText(true);
        btnAgroIlegal1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgroIlegal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgroIlegal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgroLegal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbEmpresaPesado)
                            .addComponent(btnAgroIlegal1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(tbEmpresaLeve, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(btEmpresaMargem)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbEmpresaLeve, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbEmpresaPesado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgroIlegal1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgroLegal1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEmpresaMargem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EmpresasView empresasView = new EmpresasView();
        empresasView.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbEmpresaLeveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEmpresaLeveActionPerformed
        EmpresaLeveView empresaLeveView = new EmpresaLeveView();
        empresaLeveView.setVisible(true);
    }//GEN-LAST:event_tbEmpresaLeveActionPerformed

    private void tbEmpresaPesadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEmpresaPesadoActionPerformed
       EmpresaPesadoView empresaPesadoView = new EmpresaPesadoView();
        empresaPesadoView.setVisible(true);
    }//GEN-LAST:event_tbEmpresaPesadoActionPerformed

    private void btEmpresaMargemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmpresaMargemActionPerformed
       EmpresaMargemView empresaMargemView = new EmpresaMargemView();
       empresaMargemView.setVisible(true);
    }//GEN-LAST:event_btEmpresaMargemActionPerformed

    private void btnAgroLegal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgroLegal1ActionPerformed
        AgrotoxicosLegaisView agrotoxicosLegaisView = new AgrotoxicosLegaisView();
        agrotoxicosLegaisView.setVisible(true);
    }//GEN-LAST:event_btnAgroLegal1ActionPerformed

    private void btnAgroIlegal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgroIlegal1ActionPerformed
        AgrotoxicosIlegaisView agrotoxicosIlegaisView = new AgrotoxicosIlegaisView();
        agrotoxicosIlegaisView.setVisible(true);
    }//GEN-LAST:event_btnAgroIlegal1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                new HomeView().setVisible(true);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(HomeView.class.getName()).log(Level.SEVERE, null, ex);
            }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MinistroView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEmpresaMargem;
    private javax.swing.JButton btnAgroIlegal1;
    private javax.swing.JButton btnAgroLegal1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton tbEmpresaLeve;
    private javax.swing.JButton tbEmpresaPesado;
    // End of variables declaration//GEN-END:variables
}
