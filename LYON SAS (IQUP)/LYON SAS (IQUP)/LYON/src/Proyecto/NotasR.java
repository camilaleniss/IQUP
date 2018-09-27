package Proyecto;

import Proyecto.ANota;
import Proyecto.Ventana;
import Proyecto.mysql;
import Proyecto.tareas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner.DefaultEditor;

public class NotasR extends javax.swing.JFrame {
    
    mysql con=new mysql();
    Connection cn= (Connection) con.conexion();

    public NotasR() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(649, 548);
        
        EDII.setVisible(false);
        
        panelañade.setVisible(false);         
        
        atras.setVisible(true);
        atras.setContentAreaFilled(false);
        atras.setBorderPainted (false);
        
       menub.setVisible(true);
        menub.setContentAreaFilled(false);
        menub.setBorderPainted (false);
        
        salir.setVisible(true);
        salir.setContentAreaFilled(false);
        salir.setBorderPainted (false);
        
        box.setVisible(true);
        box.setContentAreaFilled(false);
        box.setBorderPainted (false);
        
        back.setContentAreaFilled(false);
        back.setBorderPainted (false);
       
        añadir.setVisible(true);
        
        transparenciaButton();
    }
    
    public void transparenciaButton (){
         atras.setOpaque(false);
         menub.setOpaque(false);
         salir.setOpaque(false);
         box.setOpaque(false);        
         back.setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        atras = new javax.swing.JButton();
        menub = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelañade = new javax.swing.JPanel();
        tareaa = new javax.swing.JTextField();
        saveadd = new javax.swing.JButton();
        box = new javax.swing.JCheckBox();
        diaa = new javax.swing.JSpinner();
        mess = new javax.swing.JComboBox();
        añoo = new javax.swing.JSpinner();
        back = new javax.swing.JButton();
        añadir = new javax.swing.JButton();
        showbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        EDII = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras2.png"))); // NOI18N
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 60, 30));

        menub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/init.png"))); // NOI18N
        menub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubActionPerformed(evt);
            }
        });
        getContentPane().add(menub, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, -1, -1));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 30, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TAREAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 170, 56));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RECORMENU.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 80));

        panelañade.setBackground(new java.awt.Color(255, 255, 255));
        panelañade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelañade.setLayout(null);

        tareaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tareaaActionPerformed(evt);
            }
        });
        panelañade.add(tareaa);
        tareaa.setBounds(20, 20, 570, 30);

        saveadd.setBackground(new java.awt.Color(204, 204, 204));
        saveadd.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        saveadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disquete.png"))); // NOI18N
        saveadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveaddActionPerformed(evt);
            }
        });
        panelañade.add(saveadd);
        saveadd.setBounds(530, 60, 60, 50);
        panelañade.add(box);
        box.setBounds(290, 80, 20, 20);

        diaa.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        panelañade.add(diaa);
        diaa.setBounds(100, 80, 40, 20);

        mess.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre ", "Noviembre", "Diciembre" }));
        panelañade.add(mess);
        mess.setBounds(150, 80, 70, 20);

        añoo.setModel(new javax.swing.SpinnerNumberModel(2017, 2017, 2020, 1));
        añoo.setToolTipText("");
        panelañade.add(añoo);
        añoo.setBounds(230, 80, 50, 20);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/espalda.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        panelañade.add(back);
        back.setBounds(0, 80, 50, 40);

        getContentPane().add(panelañade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 600, 120));

        añadir.setBackground(new java.awt.Color(204, 204, 204));
        añadir.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/añade.png"))); // NOI18N
        añadir.setText(" AÑADIR RECORDATORIO");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });
        getContentPane().add(añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, 50));

        showbutton.setBackground(new java.awt.Color(204, 204, 204));
        showbutton.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        showbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojo.png"))); // NOI18N
        showbutton.setText("MOSTAR RECORDATORIOS");
        showbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(showbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 240, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BASICO MEDIDAS.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 560));

        EDII.setText("jTextField1");
        getContentPane().add(EDII, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        new Ventana().setVisible(true);  
        //new tareas().setVisible(false);
        //new ERecor().setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void menubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubActionPerformed
        new Ventana().setVisible(true); 
        //new tareas().setVisible(false);
        //new ERecor().setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_menubActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void tareaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tareaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tareaaActionPerformed

    private void showbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbuttonActionPerformed

        añadir.setVisible(false);     
        showbutton.setVisible(false);
        new tareas().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_showbuttonActionPerformed

    
    
    private void saveaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveaddActionPerformed
añadir.setVisible(true);

String descrip, mes, mm="ene", fecha, check, sql;
int dia, año;

descrip=tareaa.getText();
mes=(String) (mess.getSelectedItem());
switch (mes){
    case "Enero":
        mm="ene";
        break;
    case "Febrero":
        mm="feb";
        break;
    case "Marzo":
        mm="mar";
        break;
    case "Abril":
        mm="abr";
        break;
    case "Mayo":
        mm="may";
        break;
    case "Junio":
        mm="jun";
        break;
    case "Julio":
        mm="jul";
        break;
    case "Agosto":
        mm="ago";
        break;
    case "Septiembre":
        mm="sep";
        break;
    case "Octubre":
        mm="oct";
        break;
    case "Noviembre":
        mm="nov";
        break;
    case "Diciembre":
        mm="dic";  
        break;       
}

dia=(int) diaa.getValue();
año=(int) añoo.getValue();

if ("feb".equals(mm) && dia>28){
    dia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dia menor a 28"));
    while (dia>28){
        dia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dia menor a 28"));  
    }
}

if (("abr".equals(mm) || "jun".equals(mm) || "sep".equals(mm) || "nov".equals(mm)) && dia>30){
    dia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dia menor a 30"));
    while (dia>30){
        dia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dia menor a 30"));  
    }
}

fecha=(dia+"-"+mm+"-"+año);

if (box.isSelected()==true){
    check="SI";
}else{
    check="NO";
}

sql="INSERT INTO tareas (Descripcion, Fecha, Verificacion) VALUES (?,?,?)";
    
                try{
                    PreparedStatement pst=cn.prepareStatement(sql);
                    pst.setString(1,descrip);
                    pst.setString(2, fecha);
                    pst.setString(3, check);
                    int n=pst.executeUpdate();
                    if (n>0){
                        JOptionPane.showMessageDialog(null,"Tarea guardada"); 
                    }
        
                } catch (SQLException ex) {
                    Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                } 
                
                panelañade.setVisible(false);
        
    }//GEN-LAST:event_saveaddActionPerformed

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed


panelañade.setVisible(true);
añadir.setVisible(false);


        
// TODO add your handling code here:
    }//GEN-LAST:event_añadirActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
panelañade.setVisible(false);
añadir.setVisible(true);
showbutton.setVisible(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotasR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EDII;
    private javax.swing.JButton atras;
    private javax.swing.JButton añadir;
    private javax.swing.JSpinner añoo;
    private javax.swing.JButton back;
    private javax.swing.JCheckBox box;
    private javax.swing.JSpinner diaa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton menub;
    private javax.swing.JComboBox mess;
    private javax.swing.JPanel panelañade;
    private javax.swing.JButton salir;
    private javax.swing.JButton saveadd;
    private javax.swing.JButton showbutton;
    private javax.swing.JTextField tareaa;
    // End of variables declaration//GEN-END:variables
}
