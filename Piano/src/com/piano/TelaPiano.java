/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.piano;

import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author McLOVIN
 */
public class TelaPiano extends javax.swing.JFrame {
 DefaultListModel lista = new DefaultListModel();
    /**
     * Creates new form TelaPiano
     */
    public TelaPiano() {
        initComponents();
        panResultado.setVisible(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panResultado = new javax.swing.JPanel();
        lblR = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstNomes = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        lblRegra = new javax.swing.JLabel();
        btnRegra = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtRegra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Escreva um nome");

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jLabel2.setText("Donizete toca piano");

        jLabel3.setText("Mirela toca piano");

        jLabel4.setText("Quem mais toca?");

        lblR.setText("jLabel5");

        lstNomes.setModel(lista);
        jScrollPane1.setViewportView(lstNomes);

        scrollPane1.add(jScrollPane1);

        jLabel5.setText("Nomes ja testados");

        lblRegra.setText("?????");

        javax.swing.GroupLayout panResultadoLayout = new javax.swing.GroupLayout(panResultado);
        panResultado.setLayout(panResultadoLayout);
        panResultadoLayout.setHorizontalGroup(
            panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadoLayout.createSequentialGroup()
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panResultadoLayout.createSequentialGroup()
                        .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panResultadoLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel6))
                            .addGroup(panResultadoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblRegra, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panResultadoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblR)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panResultadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(96, 96, 96))
        );
        panResultadoLayout.setVerticalGroup(
            panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panResultadoLayout.createSequentialGroup()
                .addGap(0, 53, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblR)
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRegra)
                .addContainerGap())
        );

        btnRegra.setText("Verifica Regra");
        btnRegra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegraActionPerformed(evt);
            }
        });

        jLabel7.setText("Qual a regra do jogo?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(btnVerificar))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnRegra)
                                    .addGap(19, 19, 19)))
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(txtRegra, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(panResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27)
                        .addComponent(txtRegra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegra))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        panResultado.setVisible(true);
        String nome = txtNome.getText();
        String nomes[] = new String[1];
        String letra = nome.substring(0,2);
        String letra3 = nome.substring(0,3);
        int c;
        for(c = 0; c<nomes.length;c++){
            nomes[c]=nome;
            lista.addElement(nomes[c]);
            
        }
        if(letra.equalsIgnoreCase("do")|| letra.equalsIgnoreCase("re") || letra.equalsIgnoreCase("mi")||
                letra.equalsIgnoreCase("fa")||letra3.equalsIgnoreCase("sol")||letra.equalsIgnoreCase("la")
                || letra.equalsIgnoreCase("si")){
        lblR.setText(nome + " toca piano.");
        
        } else{
        lblR.setText(nome + " não toca piano.");
        
        }
       
        
   
        
        
        //
        
        
        
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnRegraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegraActionPerformed
        // TODO add your handling code here:
        String regra = txtRegra.getText();
        String regra1 = "Digitar nomes que começam com notas musicais";
        String regra5 = "Digitar nomes que começam com notas musicais";
        String regra2 = "nomes que comecem com notas musicais";
        String regra3 = "nomes que começam com notas musicais";
        String regra4 = "notas musicais";
        if(regra.equalsIgnoreCase(regra1) || regra.equalsIgnoreCase(regra2)
                || regra.equalsIgnoreCase(regra4)|| regra.equalsIgnoreCase(regra3)
                || regra.equalsIgnoreCase(regra5)){
            lblRegra.setText("Acertou a regra");
        }else if(regra.equalsIgnoreCase("aa")){
            lblRegra.setText("Errou a regra");
        }
        else{
            int i = 1;
        while (i > 0) {
            i++;
            System.out.println("eae");
            JOptionPane.showMessageDialog(null, "VIRUS MORTAL!!!!!!");
            switch (i) {
                case 1:
                    JOptionPane.showMessageDialog(null, "VOCÊ CAIU NO VIRUS MALUCO HAHAHAHAHAHAHHAA");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"ROUBANDO DADOS DO SEU PC HAHAHAHHAHA");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"DESTRAVA AI CUZÃO VAI HAHAHAHAHHAHAA");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"É O HEXA NÃO TEM JEITOOOOOOOO");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"TCHAU TCHAU AMIGO");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,"VOCÊ ACHA QUE SEU PC É BOM???????");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,"ENTÃO SENTE A PRESSÃO NENEM");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"UUUUUUUUUUUUUUUUUUUUUUUUU");
                    i=1;
                    break;

            }
        }
        }
    }//GEN-LAST:event_btnRegraActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPiano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegra;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblR;
    private javax.swing.JLabel lblRegra;
    private javax.swing.JList<String> lstNomes;
    private javax.swing.JPanel panResultado;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRegra;
    // End of variables declaration//GEN-END:variables
}