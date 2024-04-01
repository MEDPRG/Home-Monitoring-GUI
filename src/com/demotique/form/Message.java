/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demotique.form;

import com.demotique.glasspanepopup.GlassPanePopup;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
/**
 *
 * @author MSI LAPTOP
 */
public class Message extends javax.swing.JPanel {

    /**
     * Creates new form Message
     */
   
    
    public Message(int index) {
        initComponents();
        setOpaque(false);
        switch(index){
            case 1:
                jLabel2.setIcon(new ImageIcon("F:/Demotique/src/com/demotique/icon/Notification1.jpg"));
                break;
            case 2:
                jLabel2.setIcon(new ImageIcon("F:/Demotique/src/com/demotique/icon/Notification2.jpg"));
                break;
            case 3:
                jLabel2.setIcon(new ImageIcon("F:/Demotique/src/com/demotique/icon/Notification3.jpg"));
                break;
            case 4:
                jLabel2.setIcon(new ImageIcon("F:/Demotique/src/com/demotique/icon/Notification4.jpg"));
                break;
            case 5:
                jLabel2.setIcon(new ImageIcon("F:/Demotique/src/com/demotique/icon/Notification5.jpg"));
                break;
            case 6:
                jLabel2.setIcon(new ImageIcon("F:/Demotique/src/com/demotique/icon/Notification6.jpg"));
                break;
        }
        
    }
    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D)grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);        
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));
        g2.dispose();        
        super.paintComponent(grphcs);  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        button_note2 = new com.demotique.form.Button_note();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(3, 0, 21));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(25, 25, 25, 25));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Notification");

        button_note2.setBackground(new java.awt.Color(68, 198, 51));
        button_note2.setText("Cancel");
        button_note2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        button_note2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_note2ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demotique/form/Notification1.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button_note2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_note2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button_note2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_note2ActionPerformed
        // TODO add your handling code here:
        GlassPanePopup.closePopupLast();
        
    }//GEN-LAST:event_button_note2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.demotique.form.Button_note button_note2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
