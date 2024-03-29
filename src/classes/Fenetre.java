/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author poste
 */
public class Fenetre extends javax.swing.JFrame {

     ArrayList<véhicule> véhicules;
     DefaultListModel modéleList;
     
     File fichier ;
     FileWriter fw;
     PrintWriter pw;
     public Fenetre() {
        initComponents();
        véhicules=new ArrayList<>();
        modéleList=new DefaultListModel();
        fichier = new File("fichier.veh");
        
         try {
             fw=new FileWriter(fichier);
             pw=new PrintWriter(fw);
         } catch (IOException ex) {
             ex.printStackTrace();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        listeVéhicule = new javax.swing.JList();
        btnAjouter = new javax.swing.JButton();
        BtnFermer = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        BtnEnregister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listeVéhicule);

        btnAjouter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        BtnFermer.setBackground(new java.awt.Color(255, 51, 0));
        BtnFermer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnFermer.setText("Fermer");
        BtnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFermerActionPerformed(evt);
            }
        });

        btnModifier.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnSupprimer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        BtnEnregister.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnEnregister.setText("enregistrer");
        BtnEnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnregisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnSupprimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEnregister)
                        .addGap(18, 18, 18)
                        .addComponent(BtnFermer, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAjouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnFermer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSupprimer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEnregister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFermerActionPerformed
       int choix= JOptionPane.showConfirmDialog(this, "etes vous sur de vouloir sortir", "Confirmation", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       if (choix==0){
           System.exit(0);
       }
      
    }//GEN-LAST:event_BtnFermerActionPerformed

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
    véhicule véhicule=null;
    String marque,modéle,immatriculation,type;
    int nombrePortes,vitesseMax,choix;
    boolean remorque;
    
    type=JOptionPane.showInputDialog(this, "Donner le type du véhicule (Voiture/Camion/Moto)", "Type", JOptionPane.PLAIN_MESSAGE);
     if (type==null){
       
    }
    else if(type.equalsIgnoreCase("Voiture"))
    {
         marque=JOptionPane.showInputDialog(this, "Donner la marque du véhicule", "Marque", JOptionPane.PLAIN_MESSAGE);
         modéle=JOptionPane.showInputDialog(this, "Donner le modéle de véhicule", "Modéle", JOptionPane.PLAIN_MESSAGE);
         immatriculation=JOptionPane.showInputDialog(this, "Donner l'immatriculation de véhicule", "Immatriculation", JOptionPane.PLAIN_MESSAGE);
         nombrePortes=Integer.parseInt(JOptionPane.showInputDialog(this, "Donner le nombre de portes", "Nombre Portes", JOptionPane.PLAIN_MESSAGE));
         véhicule=new Voiture(marque, modéle, immatriculation, nombrePortes);
         
    }
    else if (type.equalsIgnoreCase("Moto")){
         marque=JOptionPane.showInputDialog(this, "Donner la marque du véhicule", "Marque", JOptionPane.PLAIN_MESSAGE);
         modéle=JOptionPane.showInputDialog(this, "Donner le modéle de véhicule", "Modéle", JOptionPane.PLAIN_MESSAGE);
         immatriculation=JOptionPane.showInputDialog(this, "Donner l'immatriculation de véhicule", "Immatriculation", JOptionPane.PLAIN_MESSAGE);
         vitesseMax=Integer.parseInt(JOptionPane.showInputDialog(this, "Donner la vitesse maximale", "Vitesse", JOptionPane.PLAIN_MESSAGE));
         véhicule=new Moto(marque, modéle, immatriculation, vitesseMax);  
    }
    else if (type.equalsIgnoreCase("Camion")){
         marque=JOptionPane.showInputDialog(this, "Donner la marque du véhicule", "Marque", JOptionPane.PLAIN_MESSAGE);
         modéle=JOptionPane.showInputDialog(this, "Donner le modéle de véhicule", "Modéle", JOptionPane.PLAIN_MESSAGE);
         immatriculation=JOptionPane.showInputDialog(this, "Donner l'immatriculation de véhicule", "Immatriculation", JOptionPane.PLAIN_MESSAGE);
         choix=JOptionPane.showConfirmDialog(this, "le camion a t'il une remorque", "remorque", JOptionPane.YES_NO_OPTION);
        if (choix==0){
           remorque=true; 
        }
        else remorque=false;
        véhicule =new Camion(marque, modéle, immatriculation, remorque);
        
    }
    else{
        JOptionPane.showMessageDialog(this, "Votre choix est incorrect", "choix incorrect", JOptionPane.OK_OPTION);
    }
    véhicules.add(véhicule);
    modéleList.add(0,véhicule);
    listeVéhicule.setModel(modéleList);
    
      
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void BtnEnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnregisterActionPerformed

    for(véhicule v:véhicules){
        pw.println(v); 
    }
    pw.close();
    }//GEN-LAST:event_BtnEnregisterActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        if(listeVéhicule.isSelectionEmpty())
     
            JOptionPane.showMessageDialog(this, "Sélectionner un véhicule à supprimer", "Pas de sélection", JOptionPane.ERROR_MESSAGE);
        else{
            int indice=listeVéhicule.getSelectedIndex();
            modéleList.remove(indice);
            véhicules.remove(indice);
        }
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        String marque,modéle,immatriculation;
        int nombrePortes,vitesseMax,remorque;
        
         if(listeVéhicule.isSelectionEmpty())
     
            JOptionPane.showMessageDialog(this, "Sélectionner un véhicule à modifier", "Pas de sélection", JOptionPane.ERROR_MESSAGE);
         else{
             int indice=listeVéhicule.getSelectedIndex();
             véhicule v =véhicules.get(indice);
             marque=JOptionPane.showInputDialog(this,"Changer la marque",v.getMarque());
             v.setMarque(marque);
             modéle=JOptionPane.showInputDialog(this,"Changer le modéle",v.getModéle());
             v.setModéle(modéle);
             immatriculation=JOptionPane.showInputDialog(this,"Changer l'immatriculation",v.getImmatriculation());
             v.setImmatriculation(immatriculation);
             
             if(v instanceof Voiture)
             {
                 nombrePortes=Integer.valueOf(JOptionPane.showInputDialog(this,"Changer le nombre de portes",
                         ((Voiture)v).getNombrePorte()));
              ((Voiture)v).setNombrePorte(nombrePortes);
             }
             else if(v instanceof Camion){
                   remorque=JOptionPane.showConfirmDialog(this, "le camion a t'il une remorque", "remorque", JOptionPane.YES_NO_OPTION);
              boolean choix=true;
              if(remorque==JOptionPane.NO_OPTION){
                  choix=false;
              }
              ((Camion) v).setRemorque(choix);
                     
              }
             else if(v instanceof Moto){
              vitesseMax=Integer.valueOf(JOptionPane.showInputDialog(this,"Changer le vitesse",
                         ((Moto)v).getVitesseMax()));
              ((Moto)v).setVitesseMax(vitesseMax);
             }
             
             else{
                 JOptionPane.showConfirmDialog(this,"Erreur inconnue", "ERREUR",JOptionPane.ERROR_MESSAGE);
             }
             listeVéhicule.setModel(modéleList);
                     
         }
    }//GEN-LAST:event_btnModifierActionPerformed

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
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Fenetre f= new Fenetre();
               f.setVisible(true);
               f.setTitle("La gestion d'un parking");
               f.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEnregister;
    private javax.swing.JButton BtnFermer;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listeVéhicule;
    // End of variables declaration//GEN-END:variables
}
