/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etudiants;

import javax.swing.JOptionPane;


/**
 *
 * @author Mr.SAAD
 */
public class frameEtudiant2 extends javax.swing.JFrame {

    
    /**
     * Creates new form etudiant
     */
    public frameEtudiant2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        lstEtudiants = new MyList();
        txtCNE = new java.awt.TextField();
        txtNom = new java.awt.TextField();
        txtPrenom = new java.awt.TextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        btnAjouter = new java.awt.Button();
        btnAfficher = new java.awt.Button();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        bm = new javax.swing.JRadioButton();
        bf = new javax.swing.JRadioButton();
        combfiliere = new javax.swing.JComboBox();
        combsemestre = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Etudiants");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstEtudiants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstEtudiantsActionPerformed(evt);
            }
        });

        label1.setAlignment(java.awt.Label.RIGHT);
        label1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label1.setText("CNE:");

        label2.setAlignment(java.awt.Label.RIGHT);
        label2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label2.setText("Nom:");

        label3.setAlignment(java.awt.Label.RIGHT);
        label3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label3.setText("Prenom:");

        label4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label4.setText("Liste des CNE");

        btnAjouter.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAjouter.setLabel("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnAfficher.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAfficher.setLabel("Afficher");
        btnAfficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfficherActionPerformed(evt);
            }
        });

        label5.setAlignment(java.awt.Label.RIGHT);
        label5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label5.setText("fili�re:");

        label6.setAlignment(java.awt.Label.RIGHT);
        label6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label6.setText("semestre:");

        label7.setAlignment(java.awt.Label.RIGHT);
        label7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label7.setText("sex:");

        buttonGroup.add(bm);
        bm.setText("M");
        bm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmActionPerformed(evt);
            }
        });

        buttonGroup.add(bf);
        bf.setText("F");
        bf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfActionPerformed(evt);
            }
        });

        combfiliere.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SMI", "SMA", "SMP", "SMC", "SVU" }));
        combfiliere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combfiliereActionPerformed(evt);
            }
        });

        combsemestre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "S1", "S2", "S3", "S4", "S5", "S6" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAfficher, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combfiliere, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCNE, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addComponent(txtNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPrenom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bm)
                                .addGap(18, 18, 18)
                                .addComponent(bf))
                            .addComponent(combsemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(138, 138, 138)
                        .addComponent(lstEtudiants, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCNE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bm)
                                .addComponent(bf)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combfiliere, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combsemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lstEtudiants, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAjouter, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnAfficher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>                        

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        String CIN = txtCNE.getText();
        String Nom = txtNom.getText();
        String Prenom = txtPrenom.getText();
        String sex="";
        String filiere=(String) combfiliere.getSelectedItem();
        String semestre=(String) combsemestre.getSelectedItem();
        if(bm.isSelected())
            sex="male";
        if(bf.isSelected())
            sex="female";
        if(CIN.isEmpty() || Nom.isEmpty() || Prenom.isEmpty() || sex.isEmpty() || filiere.isEmpty() || semestre.isEmpty())
            JOptionPane.showMessageDialog(null, "tous les champs sont obligatoires");
        else{
        Etudiant etudiant= new Etudiant(CIN, Nom, Prenom, sex, filiere, semestre);
        lstEtudiants.AjouterEtudiant(etudiant);
        }
           

    }                                          

    private void btnAfficherActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        Etudiant e = lstEtudiants.getSelectedEtudiant();
        txtCNE.setText(e.getCNE());
        txtNom.setText(e.getNom());
        txtPrenom.setText(e.getPrenom());
        if(e.getSex().equals("male"))
            bm.setSelected(rootPaneCheckingEnabled);
        if(e.getSex().equals("female"))
            bf.setSelected(rootPaneCheckingEnabled);
        combfiliere.setSelectedItem(e.getFiliere());
        combsemestre.setSelectedItem(e.getSemestre());

    }                                           

    private void lstEtudiantsActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void bfActionPerformed(java.awt.event.ActionEvent evt) {                                   
       
        
    }                                  

    private void bmActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void combfiliereActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

   
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
            java.util.logging.Logger.getLogger(frameEtudiant2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameEtudiant2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameEtudiant2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameEtudiant2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameEtudiant2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton bf;
    private javax.swing.JRadioButton bm;
    private java.awt.Button btnAfficher;
    private java.awt.Button btnAjouter;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JComboBox combfiliere;
    private javax.swing.JComboBox combsemestre;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private MyList lstEtudiants;
    private java.awt.TextField txtCNE;
    private java.awt.TextField txtNom;
    private java.awt.TextField txtPrenom;
    // End of variables declaration                   
}
