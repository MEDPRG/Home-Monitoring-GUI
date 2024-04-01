/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demotique.form;

import com.demotique.glasspanepopup.GlassPanePopup;
import com.demotique.swing.scrollbar.ScrollBarCustom;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
/**
 *
 * @author MSI LAPTOP
 */
public class Devises extends javax.swing.JPanel {

    /**
     * Creates new form Message
     */
   
    
    public Devises(int index) {
        initComponents();
        setOpaque(false);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        scroll.setHorizontalScrollBar(new ScrollBarCustom());
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        switch(index){
            case 1:
                body.removeAll();
                body.add(new BedRooms());
                body.revalidate();
                body.repaint();
                break;
            case 2:
                body.removeAll();
                body.add(new BedRooms());
                body.revalidate();
                body.repaint();
                break;
            case 3:
                body.removeAll();
                body.add(new LivingRoom());
                body.revalidate();
                body.repaint();
                break;
            case 4:
                body.removeAll();
                body.add(new Kitchen());
                body.revalidate();
                body.repaint();
                break;
            case 5:
                body.removeAll();
                body.add(new BathRoom());
                body.revalidate();
                body.repaint();
                break;
            case 6:
                body.removeAll();
                body.add(new Garage());
                body.revalidate();
                body.repaint();
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

        button_note2 = new com.demotique.form.Button_note();
        scroll = new javax.swing.JScrollPane();
        body = new javax.swing.JPanel();
        bedRooms1 = new com.demotique.form.BedRooms();

        setBackground(new java.awt.Color(3, 0, 21));
        setForeground(new java.awt.Color(255, 255, 255));

        button_note2.setBackground(new java.awt.Color(68, 198, 51));
        button_note2.setText("Back");
        button_note2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        button_note2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_note2ActionPerformed(evt);
            }
        });

        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setOpaque(false);

        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());
        body.add(bedRooms1, java.awt.BorderLayout.CENTER);

        scroll.setViewportView(body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_note2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_note2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button_note2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_note2ActionPerformed
        // TODO add your handling code here:
        GlassPanePopup.closePopupLast();
    }//GEN-LAST:event_button_note2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.demotique.form.BedRooms bedRooms1;
    private javax.swing.JPanel body;
    private com.demotique.form.Button_note button_note2;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
