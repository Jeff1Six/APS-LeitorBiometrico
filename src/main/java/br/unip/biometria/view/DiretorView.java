package br.unip.biometria.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DiretorView extends javax.swing.JFrame {

    public DiretorView() {
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
        btnAgroLegal = new javax.swing.JButton();
        btnAgroIlegal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(73, 182, 117));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Ministério do Meio Ambiente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel2.setText("Você está logado como diretor.");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Ver empresas");
        jButton1.setHideActionText(true);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbEmpresaLeve.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbEmpresaLeve.setText("Empresas Agro-Leve");
        tbEmpresaLeve.setHideActionText(true);
        tbEmpresaLeve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbEmpresaLeve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEmpresaLeveActionPerformed(evt);
            }
        });

        tbEmpresaPesado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbEmpresaPesado.setText("Empresas Agro-Pesado");
        tbEmpresaPesado.setHideActionText(true);
        tbEmpresaPesado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbEmpresaPesado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEmpresaPesadoActionPerformed(evt);
            }
        });

        btnAgroLegal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAgroLegal.setText("Agrotóxicos Legais");
        btnAgroLegal.setHideActionText(true);
        btnAgroLegal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgroLegal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgroLegalActionPerformed(evt);
            }
        });

        btnAgroIlegal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAgroIlegal.setText("Agrotóxicos Ilegais");
        btnAgroIlegal.setHideActionText(true);
        btnAgroIlegal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgroIlegal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgroIlegalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tbEmpresaPesado)
                .addGap(34, 34, 34)
                .addComponent(tbEmpresaLeve)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnAgroLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnAgroIlegal, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbEmpresaLeve, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbEmpresaPesado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgroIlegal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgroLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void btnAgroLegalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgroLegalActionPerformed
        AgrotoxicosLegaisView agrotoxicosLegaisView = new AgrotoxicosLegaisView();
        agrotoxicosLegaisView.setVisible(true);
    }//GEN-LAST:event_btnAgroLegalActionPerformed

    private void btnAgroIlegalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgroIlegalActionPerformed
        AgrotoxicosIlegaisView agrotoxicosIlegaisView = new AgrotoxicosIlegaisView();
        agrotoxicosIlegaisView.setVisible(true);
    }//GEN-LAST:event_btnAgroIlegalActionPerformed

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
            new DiretorView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgroIlegal;
    private javax.swing.JButton btnAgroLegal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton tbEmpresaLeve;
    private javax.swing.JButton tbEmpresaPesado;
    // End of variables declaration//GEN-END:variables
}
