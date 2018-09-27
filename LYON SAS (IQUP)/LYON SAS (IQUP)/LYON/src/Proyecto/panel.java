/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class panel {
       public static JPanel creaPanel() {
        String titulo = MenuBD.titulo.getText();
        JPanel panel=new JPanel();
        panel.setSize(385, 272);
        panel.setBackground(new java.awt.Color(255, 255, 255));
        JScrollPane scroll = new JScrollPane();
        scroll.setBounds(627, 0, 20, 410);
        panel.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 0, 20, 410));
        return( panel );
       }
       

       

    
}
