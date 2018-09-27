
package Proyecto;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import  javax.swing.JOptionPane;


public class Ventana extends javax.swing.JFrame {

    mysql con = new mysql();
    Connection cn = (Connection) con.conexion();

    public Ventana() {
        initComponents();
        transparenciaButton();
        setLocationRelativeTo(null);
        setSize(645, 554);

        menu.setVisible(true);
        menu.setContentAreaFilled(false);
        menu.setBorderPainted(false);

        añadir.setVisible(false);
        añadir.setContentAreaFilled(false);
        añadir.setBorderPainted(false);

        estudiar.setVisible(false);
        estudiar.setContentAreaFilled(false);
        estudiar.setBorderPainted(false);

        jButton4.setVisible(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setBorderPainted(false);

        calendario.setVisible(true);
        calendario.setContentAreaFilled(false);
        calendario.setBorderPainted(false);

        atras.setVisible(true);
        atras.setContentAreaFilled(false);
        atras.setBorderPainted(false);

        menub.setVisible(true);
        menub.setContentAreaFilled(false);
        menub.setBorderPainted(false);

        salir.setVisible(true);
        salir.setContentAreaFilled(false);
        salir.setBorderPainted(false);

        feis.setVisible(true);
        feis.setContentAreaFilled(false);
        feis.setBorderPainted(false);

        tuiter.setVisible(true);
        tuiter.setContentAreaFilled(false);
        tuiter.setBorderPainted(false);
        help.setVisible(true);
        help.setContentAreaFilled(false);
        help.setBorderPainted(false);

        Statement st, st1, st2, st3;
        ResultSet rs, rs1, rs2, rs3;
        int matt, ex1 = 0, ex2 = 0, codt = 0, yes2=0;
        String sql, sql1, sql2, sql3;

        try {
            sql = "SELECT * from materia";
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                matt = rs.getInt(1);
               ex1=0;
               ex2=0;
                yes2=0;

                try {
                    sql1 = "SELECT * from notar WHERE CodMateria=" + matt;
                    st1 = cn.createStatement();
                    rs1 = st1.executeQuery(sql1);
                    while (rs1.next()) {
                        ex1 = rs1.getInt(1);
                        yes2++;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (yes2 == 0) {

                    try {
                        sql3 = "SELECT * FROM tema WHERE CodMateria=" + matt;
                        st3 = cn.createStatement();
                        rs3 = st3.executeQuery(sql3);
                        while (rs3.next()) {
                            codt = rs3.getInt(1);
                            try {
                                PreparedStatement pps1 = cn.prepareStatement("DELETE FROM tema WHERE CodTema=" + codt);
                                pps1.executeUpdate();
                            } catch (SQLException ex) {
                                Logger.getLogger(ERecor.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                    }       

                }

                try {
                    sql2 = "SELECT * from promedio WHERE CodMateria=" + matt;
                    st2 = cn.createStatement();
                    rs2 = st2.executeQuery(sql2);
                    while (rs2.next()) {
                        ex2 = rs2.getInt(1);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                //borrar
                if (ex1==0 && ex2==0) {
                    
                    try {
                        PreparedStatement pps = cn.prepareStatement("DELETE FROM materia WHERE CodMateria=" + matt);
                        pps.executeUpdate();
                    } catch (SQLException ex) {
                        Logger.getLogger(ERecor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //borra tema
        
        
        
        
        try {
            sql = "SELECT * from tema";
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                matt = rs.getInt(1);
               ex1=0;
               ex2=0;
                yes2=0;

                try {
                    sql1 = "SELECT * from notar WHERE CodTema=" + matt;
                    st1 = cn.createStatement();
                    rs1 = st1.executeQuery(sql1);
                    while (rs1.next()) {
                        ex1 = rs1.getInt(1);
                        yes2++;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (yes2 == 0) {
                            try {
                                PreparedStatement pps1 = cn.prepareStatement("DELETE FROM tema WHERE CodTema=" + matt);
                                pps1.executeUpdate();
                            } catch (SQLException ex) {
                                Logger.getLogger(ERecor.class.getName()).log(Level.SEVERE, null, ex);
                            }
                         

                }


            }
        } catch (SQLException ex) {
            Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void transparenciaButton() {
        menu.setOpaque(false);
        promedio.setOpaque(false);
        calendario.setOpaque(false);
        añadir.setOpaque(false);
        estudiar.setOpaque(false);
        jButton3.setOpaque(false);
        jButton4.setOpaque(false);
        atras.setOpaque(false);
        menub.setOpaque(false);
        salir.setOpaque(false);
        feis.setOpaque(false);
        tuiter.setOpaque(false);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        calendario = new javax.swing.JButton();
        promedio = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        añadir = new javax.swing.JButton();
        estudiar = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        menub = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        feis = new javax.swing.JButton();
        tuiter = new javax.swing.JButton();
        help = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(653, 560));
        setUndecorated(true);
        getContentPane().setLayout(null);

        calendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calenicon.png"))); // NOI18N
        calendario.setBorder(null);
        calendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calendarioActionPerformed(evt);
            }
        });
        getContentPane().add(calendario);
        calendario.setBounds(140, 80, 180, 160);

        promedio.setBackground(new java.awt.Color(255, 255, 255));
        promedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/abaco (2).png"))); // NOI18N
        promedio.setBorder(null);
        promedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promedioActionPerformed(evt);
            }
        });
        getContentPane().add(promedio);
        promedio.setBounds(370, 80, 140, 160);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pulss.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(510, 380, 100, 100);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pulss.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(510, 380, 100, 100);

        añadir.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lapiz (1).png"))); // NOI18N
        añadir.setText("  AÑADIR NOTA");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });
        getContentPane().add(añadir);
        añadir.setBounds(140, 310, 240, 73);

        estudiar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        estudiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libro-abierto.png"))); // NOI18N
        estudiar.setText("  REPASAR EXAMEN");
        estudiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudiarActionPerformed(evt);
            }
        });
        getContentPane().add(estudiar);
        estudiar.setBounds(140, 390, 290, 70);

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu (1).png"))); // NOI18N
        menu.setBorder(null);
        menu.setBorderPainted(false);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu);
        menu.setBounds(0, 0, 100, 80);

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras2.png"))); // NOI18N
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras);
        atras.setBounds(120, 530, 30, 30);

        menub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/init.png"))); // NOI18N
        menub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubActionPerformed(evt);
            }
        });
        getContentPane().add(menub);
        menub.setBounds(290, 530, 50, 30);

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(490, 530, 40, 30);

        jLabel2.setBackground(new java.awt.Color(85, 191, 220));
        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IQ UP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 10, 110, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MENUU.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 655, 80);

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel4.setText("RECORDATORIOS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 240, 130, 14);

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel5.setText("PROMEDIO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 240, 80, 14);

        feis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facebook.png"))); // NOI18N
        feis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feisActionPerformed(evt);
            }
        });
        getContentPane().add(feis);
        feis.setBounds(10, 360, 70, 70);

        tuiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gorjeo.png"))); // NOI18N
        tuiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuiterActionPerformed(evt);
            }
        });
        getContentPane().add(tuiter);
        tuiter.setBounds(10, 440, 70, 70);

        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/question.png"))); // NOI18N
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        getContentPane().add(help);
        help.setBounds(10, 280, 70, 70);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BASICO MEDIDAS.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 570);
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jButton4.setVisible(true);
        añadir.setVisible(true);
        estudiar.setVisible(true);
        jButton3.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setVisible(false);
        añadir.setVisible(false);
        estudiar.setVisible(false);
        jButton3.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void promedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promedioActionPerformed

        new Promedio().setVisible(true);
        dispose();

    }//GEN-LAST:event_promedioActionPerformed

    private void calendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarioActionPerformed
        new NotasR().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_calendarioActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        new MenuBD().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_menuActionPerformed

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        new ANota().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_añadirActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);

// TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void menubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_menubActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_atrasActionPerformed

    private void estudiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudiarActionPerformed
        new Repasar().setVisible(true);
        dispose();
        this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_estudiarActionPerformed

    private void feisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feisActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/Lyon-Corporation-291586574595573/?fref=ts"));

        } catch (URISyntaxException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error");
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_feisActionPerformed

    private void tuiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuiterActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://www.twitter.com"));

        } catch (URISyntaxException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error");
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_tuiterActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        // TODO add your handling code here:
        new help().setVisible(true);
        dispose();
        this.setVisible(false);
                
    }//GEN-LAST:event_helpActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton añadir;
    private javax.swing.JButton calendario;
    private javax.swing.JButton estudiar;
    private javax.swing.JButton feis;
    private javax.swing.JButton help;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton menu;
    private javax.swing.JButton menub;
    private javax.swing.JButton promedio;
    private javax.swing.JButton salir;
    private javax.swing.JButton tuiter;
    // End of variables declaration//GEN-END:variables
}
