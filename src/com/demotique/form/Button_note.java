/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demotique.form;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author MSI LAPTOP
 */
public class Button_note extends JButton{
    private boolean mousePress;
    public Button_note(){
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(7, 5, 7, 5));
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent me){
                if(SwingUtilities.isLeftMouseButton(me)){
                    mousePress = true;
                }
            }
            
            @Override
            public void mouseReleased(MouseEvent me){
                if(SwingUtilities.isLeftMouseButton(me)){
                    mousePress = false;
                }
            }
        });
        
    }
    @Override
    public void paint(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if(mousePress){
            g2.setColor(getBackground().darker());
        }else{
            g2.setColor(getBackground());
        }
        g2.fill(new RoundRectangle2D.Double(0, 0,getWidth(), getHeight(), getHeight(), getHeight()));
        g2.dispose();
        super.paint(grphcs);
      
    }
}
