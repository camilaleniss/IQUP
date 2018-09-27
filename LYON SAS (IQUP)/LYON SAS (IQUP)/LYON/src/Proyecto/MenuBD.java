package Proyecto;

import java.awt.Dimension;
import java.awt.ScrollPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MenuBD extends javax.swing.JFrame {

    mysql con=new mysql();
    Connection cn= (Connection) con.conexion();
    
    
    public MenuBD() {
        initComponents();
        generatabbed();
        setLocationRelativeTo(null);
        setSize(644, 540);
        menu.setVisible(true);
        menu.setContentAreaFilled(false);
        menu.setBorderPainted (false);

        atras.setVisible(true);
        atras.setContentAreaFilled(false);
        atras.setBorderPainted(false);

        menub.setVisible(true);
        menub.setContentAreaFilled(false);
        menub.setBorderPainted(false);

        salir.setVisible(true);
        salir.setContentAreaFilled(false);
        salir.setBorderPainted(false);
        
        titulo.setVisible(false);
        codi.setVisible(false);
        temm.setVisible(false);

        
    }

    void generatabbed(){
    //se consulta las materias existentes
    int Cont=0;
    Statement st;
    String sql;
    ResultSet rs, rs2, rs3, rs4; 
    sql=("SELECT NomMateria from Materia");
        try {
            st= cn.createStatement();
            rs =st.executeQuery(sql);
            while(rs.next()){
                Cont=Cont+1; 
            }
            String datost[] = new String [Cont];
                
        } catch (SQLException ex) {
            Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    String nombre;
        sql=("SELECT * from Materia");
        try {
            st= cn.createStatement();
            rs =st.executeQuery(sql);
            while(rs.next()){
                nombre=rs.getString(2);
                titulo.setText(""+nombre);
                JPanel ejecuta=Proyecto.panel.creaPanel();
                Materiastabbed.addTab(nombre, ejecuta);
                //ScrollPane scroll = new ScrollPane(ejecuta);
                //scroll.setBounds(627, 0, 20, 410);
                
                //ejecuta.setPreferredSize(new Dimension (385, 400));
                //hallar el cod de materia para crear las notas segun el
                int codmat=0;
                sql=("SELECT CodMateria from materia where NomMateria='"+nombre+"'");
                try{
                    st= cn.createStatement();
                    rs2 =st.executeQuery(sql);
                    while(rs2.next()){
                       codmat=rs2.getInt(1);
                    }    
                }catch (SQLException ex) {
                    Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                }  
                //añadir cada nota
                sql="SELECT * from notar where CodMateria="+codmat;
                int tema=0;
                String cont;
                int f=0;
                try{
                    st= cn.createStatement();
                    rs3 =st.executeQuery(sql);
                    while(rs3.next()){ 
                        f=0;
                        cont=rs3.getString(2);
                        tema=rs3.getInt(3);
                        codi.setText(""+cont);
                        
                        sql="SELECT NomTema from tema WHERE CodTema="+tema;
                        String nombretema="";
                        try{
                            st=cn.createStatement();
                            rs4=st.executeQuery(sql);
                            while(rs4.next()){
                                nombretema=rs4.getString(1);
                                temm.setText(""+nombretema);
                            }
                        }catch (SQLException ex){
                            Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);  
                        }
                        
                        //crea panelcito
                        JPanel panelp = Proyecto.notita.creapanelcito(); 
                        ejecuta.add(panelp);
                        f++;
                    }    
                }catch (SQLException ex) {
                    Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if (f == 0) {
                    JLabel aviso = new JLabel();
                    aviso.setFont(new java.awt.Font("Bookman Old Style", 0, 16));
                    aviso.setText("Tienes notas guardadas en promedio");
                    ejecuta.add(aviso);
                }
            }  
            
        } catch (SQLException ex) {
            Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}

        
    public void transparenciaButton() {
        atras.setOpaque(false);
        menub.setOpaque(false);
        salir.setOpaque(false);
        menu.setOpaque(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        menub = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        Materiastabbed = new javax.swing.JTabbedPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        codi = new javax.swing.JTextField();
        temm = new javax.swing.JTextField();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras2.png"))); // NOI18N
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 30, -1));

        menub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/init.png"))); // NOI18N
        menub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubActionPerformed(evt);
            }
        });
        getContentPane().add(menub, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, -1, -1));

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu (1).png"))); // NOI18N
        menu.setBorder(null);
        menu.setBorderPainted(false);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, -1, -1));
        getContentPane().add(Materiastabbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 650, 430));

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MENU DE NOTAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menudelmenu.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BASICO MEDIDAS.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 650, 560));
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));
        getContentPane().add(codi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));
        getContentPane().add(temm, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        new Ventana().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void menubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubActionPerformed
        new Ventana().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menubActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        new Ventana().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_menuActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTabbedPane Materiastabbed;
    private javax.swing.JButton atras;
    public static javax.swing.JTextField codi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton menu;
    private javax.swing.JButton menub;
    private javax.swing.JButton salir;
    public static javax.swing.JTextField temm;
    public static javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
