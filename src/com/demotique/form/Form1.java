/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demotique.form;

import com.demotique.chart.ModelChart;
import com.demotique.glasspanepopup.GlassPanePopup;
import java.awt.Color;

/**
 *
 * @author MSI LAPTOP
 */
public class Form1 extends javax.swing.JPanel {

    /**
     * Creates new form Form1
     */
    public Form1() {
        initComponents();
        setOpaque(false);
        init();
    }

    private void init(){
        lineChart.addLegend("Electricity", new Color(0, 92, 251), new Color(0, 92, 251));
        lineChart.addLegend("Gas", new Color(186, 37, 37), new Color(241, 100, 120));
        lineChart.addLegend("Water", new Color(5, 125, 0), new Color(95, 209, 69));
        lineChart.addData(new ModelChart("January", new double[]{190,280,81,200}));
        lineChart.addData(new ModelChart("February", new double[]{350,540,300,150}));
        lineChart.addData(new ModelChart("March", new double[]{200,350,460,900}));
        lineChart.addData(new ModelChart("April", new double[]{480,150,750,700}));
        lineChart.addData(new ModelChart("May", new double[]{600,750,460,900}));
        lineChart.addData(new ModelChart("June", new double[]{500,200,80,89}));
        lineChart.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bedroom1icon = new javax.swing.JLabel();
        bedroom1 = new javax.swing.JPanel();
        bedroom1icon1 = new javax.swing.JLabel();
        bedroom1button = new javax.swing.JButton();
        livingroom = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Livingroombutton3 = new javax.swing.JButton();
        bedroom2 = new javax.swing.JPanel();
        bedroom1icon2 = new javax.swing.JLabel();
        bedroom2button2 = new javax.swing.JButton();
        garage = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        gragebutton = new javax.swing.JButton();
        kitchen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Kitchenbutton = new javax.swing.JButton();
        bathroom = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BathRoombutton = new javax.swing.JButton();
        graphpanel = new javax.swing.JPanel();
        lineChart = new com.demotique.chart.LineChart();
        jLabel5 = new javax.swing.JLabel();

        bedroom1icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bedroom1icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demotique/form/minimalist-decor-ambient-lighting_926199-189298.jpg"))); // NOI18N

        bedroom1.setBackground(new java.awt.Color(3, 0, 21));
        bedroom1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        bedroom1.setPreferredSize(new java.awt.Dimension(180, 126));

        bedroom1icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bedroom1icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demotique/form/OIG.yTqAJ9N_f9GhEHd(1).jpg"))); // NOI18N

        bedroom1button.setBackground(new java.awt.Color(0, 0, 0));
        bedroom1button.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        bedroom1button.setForeground(new java.awt.Color(255, 255, 255));
        bedroom1button.setText("BedRoom1");
        bedroom1button.setFocusable(false);
        bedroom1button.setOpaque(false);
        bedroom1button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedroom1buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bedroom1Layout = new javax.swing.GroupLayout(bedroom1);
        bedroom1.setLayout(bedroom1Layout);
        bedroom1Layout.setHorizontalGroup(
            bedroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bedroom1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bedroom1icon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(bedroom1button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bedroom1Layout.setVerticalGroup(
            bedroom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bedroom1Layout.createSequentialGroup()
                .addComponent(bedroom1icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bedroom1button))
        );

        livingroom.setBackground(new java.awt.Color(3, 0, 21));
        livingroom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        livingroom.setPreferredSize(new java.awt.Dimension(220, 126));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demotique/form/interior-design-modern-house_951133-3748(1).jpg"))); // NOI18N

        Livingroombutton3.setBackground(new java.awt.Color(0, 0, 0));
        Livingroombutton3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Livingroombutton3.setForeground(new java.awt.Color(255, 255, 255));
        Livingroombutton3.setText("LivingRoom");
        Livingroombutton3.setFocusable(false);
        Livingroombutton3.setOpaque(false);
        Livingroombutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Livingroombutton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout livingroomLayout = new javax.swing.GroupLayout(livingroom);
        livingroom.setLayout(livingroomLayout);
        livingroomLayout.setHorizontalGroup(
            livingroomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Livingroombutton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, livingroomLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        livingroomLayout.setVerticalGroup(
            livingroomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(livingroomLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(Livingroombutton3, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
        );

        bedroom2.setBackground(new java.awt.Color(3, 0, 21));
        bedroom2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        bedroom2.setPreferredSize(new java.awt.Dimension(180, 126));

        bedroom1icon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bedroom1icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demotique/form/_3078f339-7d03-4ab5-81e4-0a0263b8fafa(1).jpg"))); // NOI18N

        bedroom2button2.setBackground(new java.awt.Color(0, 0, 0));
        bedroom2button2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        bedroom2button2.setForeground(new java.awt.Color(255, 255, 255));
        bedroom2button2.setText("BedRoom2");
        bedroom2button2.setFocusable(false);
        bedroom2button2.setOpaque(false);
        bedroom2button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedroom2button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bedroom2Layout = new javax.swing.GroupLayout(bedroom2);
        bedroom2.setLayout(bedroom2Layout);
        bedroom2Layout.setHorizontalGroup(
            bedroom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bedroom2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bedroom1icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(bedroom2button2, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );
        bedroom2Layout.setVerticalGroup(
            bedroom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bedroom2Layout.createSequentialGroup()
                .addComponent(bedroom1icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bedroom2button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        garage.setBackground(new java.awt.Color(3, 0, 21));
        garage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        garage.setPreferredSize(new java.awt.Dimension(180, 126));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demotique/form/_3d74ee8f-8740-442e-b9f1-0018dd084bcb.jpg"))); // NOI18N

        gragebutton.setBackground(new java.awt.Color(0, 0, 0));
        gragebutton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        gragebutton.setForeground(new java.awt.Color(255, 255, 255));
        gragebutton.setText("Garage");
        gragebutton.setFocusable(false);
        gragebutton.setOpaque(false);
        gragebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gragebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout garageLayout = new javax.swing.GroupLayout(garage);
        garage.setLayout(garageLayout);
        garageLayout.setHorizontalGroup(
            garageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gragebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        garageLayout.setVerticalGroup(
            garageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(garageLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(gragebutton))
        );

        kitchen.setBackground(new java.awt.Color(3, 0, 21));
        kitchen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        kitchen.setPreferredSize(new java.awt.Dimension(180, 126));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demotique/form/photo-beautiful-kitchen-with-golden-details-luxurious-furniture_7023-33522(2).jpg"))); // NOI18N

        Kitchenbutton.setBackground(new java.awt.Color(0, 0, 0));
        Kitchenbutton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Kitchenbutton.setForeground(new java.awt.Color(255, 255, 255));
        Kitchenbutton.setText("Kitchen");
        Kitchenbutton.setFocusable(false);
        Kitchenbutton.setOpaque(false);
        Kitchenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KitchenbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kitchenLayout = new javax.swing.GroupLayout(kitchen);
        kitchen.setLayout(kitchenLayout);
        kitchenLayout.setHorizontalGroup(
            kitchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kitchenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(Kitchenbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kitchenLayout.setVerticalGroup(
            kitchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kitchenLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kitchenbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bathroom.setBackground(new java.awt.Color(3, 0, 21));
        bathroom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        bathroom.setPreferredSize(new java.awt.Dimension(180, 126));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demotique/form/photo-luxury-modern-design-bathroom_787705-6051(2).jpg"))); // NOI18N

        BathRoombutton.setBackground(new java.awt.Color(0, 0, 0));
        BathRoombutton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        BathRoombutton.setForeground(new java.awt.Color(255, 255, 255));
        BathRoombutton.setText("BathRoom");
        BathRoombutton.setFocusable(false);
        BathRoombutton.setOpaque(false);
        BathRoombutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BathRoombuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bathroomLayout = new javax.swing.GroupLayout(bathroom);
        bathroom.setLayout(bathroomLayout);
        bathroomLayout.setHorizontalGroup(
            bathroomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bathroomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(BathRoombutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bathroomLayout.setVerticalGroup(
            bathroomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bathroomLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BathRoombutton)
                .addGap(0, 0, 0))
        );

        graphpanel.setBackground(new java.awt.Color(3, 0, 21));
        graphpanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        graphpanel.setPreferredSize(new java.awt.Dimension(180, 126));

        javax.swing.GroupLayout graphpanelLayout = new javax.swing.GroupLayout(graphpanel);
        graphpanel.setLayout(graphpanelLayout);
        graphpanelLayout.setHorizontalGroup(
            graphpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lineChart, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
        );
        graphpanelLayout.setVerticalGroup(
            graphpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lineChart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(200, 191, 231));
        jLabel5.setText("Energie Chart");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kitchen, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bedroom1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bedroom2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bathroom, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(livingroom, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(garage, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(graphpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(livingroom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                        .addComponent(bedroom2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                    .addComponent(bedroom1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(garage, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kitchen, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bathroom, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(graphpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bedroom1buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedroom1buttonActionPerformed
        // TODO add your handling code here:
        GlassPanePopup.showPopup(new Devises(1));
    }//GEN-LAST:event_bedroom1buttonActionPerformed

    private void bedroom2button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedroom2button2ActionPerformed
        // TODO add your handling code here:
        GlassPanePopup.showPopup(new Devises(2));
    }//GEN-LAST:event_bedroom2button2ActionPerformed

    private void Livingroombutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Livingroombutton3ActionPerformed
        // TODO add your handling code here:
        GlassPanePopup.showPopup(new Devises(3));
    }//GEN-LAST:event_Livingroombutton3ActionPerformed

    private void KitchenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KitchenbuttonActionPerformed
        // TODO add your handling code here:
        GlassPanePopup.showPopup(new Devises(4));
    }//GEN-LAST:event_KitchenbuttonActionPerformed

    private void BathRoombuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BathRoombuttonActionPerformed
        // TODO add your handling code here:
        GlassPanePopup.showPopup(new Devises(5));
    }//GEN-LAST:event_BathRoombuttonActionPerformed

    private void gragebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gragebuttonActionPerformed
        // TODO add your handling code here:
        GlassPanePopup.showPopup(new Devises(6));
    }//GEN-LAST:event_gragebuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BathRoombutton;
    private javax.swing.JButton Kitchenbutton;
    private javax.swing.JButton Livingroombutton3;
    private javax.swing.JPanel bathroom;
    private javax.swing.JPanel bedroom1;
    private javax.swing.JButton bedroom1button;
    private javax.swing.JLabel bedroom1icon;
    private javax.swing.JLabel bedroom1icon1;
    private javax.swing.JLabel bedroom1icon2;
    private javax.swing.JPanel bedroom2;
    private javax.swing.JButton bedroom2button2;
    private javax.swing.JPanel garage;
    private javax.swing.JButton gragebutton;
    private javax.swing.JPanel graphpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel kitchen;
    private com.demotique.chart.LineChart lineChart;
    private javax.swing.JPanel livingroom;
    // End of variables declaration//GEN-END:variables
}
