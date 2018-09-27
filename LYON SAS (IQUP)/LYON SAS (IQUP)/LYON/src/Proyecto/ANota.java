
package Proyecto;


import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ANota extends javax.swing.JFrame {

    mysql con=new mysql();
    Connection cn= (Connection) con.conexion();
    
    public ANota() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(654, 540);
        
        atras.setVisible(true);
        atras.setContentAreaFilled(false);
        atras.setBorderPainted (false);
        
       menub.setVisible(true);
        menub.setContentAreaFilled(false);
        menub.setBorderPainted (false);
        
        salir.setVisible(true);
        salir.setContentAreaFilled(false);
        salir.setBorderPainted (false);
        
        seguirr.setVisible(true);
        seguirr.setContentAreaFilled(false);
        seguirr.setBorderPainted (false);
        
        savebutton.setVisible(false);
        combotema.setVisible(false);
        combotema.setEditable(true);
        
        Statement st;
        ResultSet rs;
        String sql, matt;
        sql="SELECT * from materia";
                 try{
                    st= cn.createStatement();
                    rs=st.executeQuery(sql);

                    while(rs.next()){
                       matt=rs.getString(2);
                       combomateria.addItem(""+matt);
                       
                    }    
                }catch (SQLException ex) {
                    Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                }
        
    }
    
    
    
    public void transparenciaButton (){
        atras.setOpaque(false);
         menub.setOpaque(false);
         salir.setOpaque(false);
         seguirr.setOpaque(false);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combotema = new javax.swing.JComboBox();
        combomateria = new javax.swing.JComboBox();
        savebutton = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        menub = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        seguirr = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Arec = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        combotema.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tema" }));
        combotema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotemaActionPerformed(evt);
            }
        });
        getContentPane().add(combotema, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 90, -1));

        combomateria.setEditable(true);
        combomateria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Materia" }));
        combomateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomateriaActionPerformed(evt);
            }
        });
        getContentPane().add(combomateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 100, -1));

        savebutton.setBackground(new java.awt.Color(204, 204, 204));
        savebutton.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        savebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disquete.png"))); // NOI18N
        savebutton.setText("  GUARDAR");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(savebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 190, 50));

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras2.png"))); // NOI18N
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 30, -1));

        menub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/init.png"))); // NOI18N
        menub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubActionPerformed(evt);
            }
        });
        getContentPane().add(menub, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, -1, -1));

        seguirr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proximo (3).png"))); // NOI18N
        seguirr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seguirrActionPerformed(evt);
            }
        });
        getContentPane().add(seguirr, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 80, 70));

        Arec.setColumns(20);
        Arec.setRows(5);
        jScrollPane1.setViewportView(Arec);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 580, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BASICO MEDIDAS.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
    
    //materia
    String añamateria;
    String sql;

    añamateria= (String) (combomateria.getSelectedItem());
    sql=("SELECT NomMateria FROM materia WHERE NomMateria='"+añamateria+"'");
    Statement st;
     String a="";
        try {
            st= cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while (rs.next()){
               a=rs.getString(1);
            }
            
            if ("".equals(a)){
             sql="INSERT INTO materia (NomMateria) VALUES (?)";
    
                try{
                    PreparedStatement pst=cn.prepareStatement(sql);
                    pst.setString(1,añamateria);
                    int n=pst.executeUpdate();
                    if (n>0){
                        JOptionPane.showMessageDialog(null,"Guardar Materia"); 
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
        }
        
// consulta cod de la materia
    int Cod=1;
    sql=("SELECT CodMateria FROM materia WHERE NomMateria='"+añamateria+"'");
    String datos[] = new String [1];
        try {
            st= cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while (rs.next()){
                datos[0]=rs.getString(1);
                Cod=Integer.parseInt(datos[0]);
            }  
            
        } catch (SQLException ex) {
            Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    //tema
    String añatema;
    añatema= (String) (combotema.getSelectedItem());
    
    if ("Tema".equals(añatema)){
        JOptionPane.showMessageDialog(null, "Ingrese un tema valido");
    }else{
            sql=("SELECT NomTema FROM tema WHERE NomTema='"+añatema+"'");
    String b="";
        try {
            st= cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while (rs.next()){
               b=rs.getString(1);
            }
            
            if ("".equals(b)){
                //GUADAR TEMA
    
                sql="INSERT INTO tema (NomTema, CodMateria) VALUES (?,?)";
    
                try{
                    PreparedStatement pst=cn.prepareStatement(sql);
                    pst.setString(1,añatema);
                    pst.setInt(2, Cod);
                    int n=pst.executeUpdate();
                    if (n>0){
                        JOptionPane.showMessageDialog(null,"Guardar Tema"); 
                    }
        
                } catch (SQLException ex) {
                    Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                }                          
            }
        } catch (SQLException ex) {
            Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        //consultar cod tema
    int CodTema=1;
    String datost[] = new String [1];
    sql=("SELECT CodTema FROM tema WHERE NomTema='"+añatema+"'");
        try {
            st= cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                datost[0]=rs.getString(1);
                CodTema=Integer.parseInt(datost[0]); 
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    //GUARDAR NOTA
    String content=Arec.getText();
    sql="INSERT INTO notar (Contenido, CodTema, CodMateria) VALUES (?,?,?)";
    
                try{
                    PreparedStatement pst=cn.prepareStatement(sql);
                    pst.setString(1,content);
                    pst.setInt(2, CodTema);
                    pst.setInt(3, Cod);
                    int n=pst.executeUpdate();
                    if (n>0){
                        JOptionPane.showMessageDialog(null,"Guardar Nota Recordatorio"); 
                    }
        
                } catch (SQLException ex) {
                    Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                }     
     //FIN
     
     
        String nota,temaa;
        nota=this.Arec.getText();
        
        this.Arec.setText("");
        
        
        new MenuBD().setVisible(true);
        this.setVisible(false);
    }
   
    }//GEN-LAST:event_savebuttonActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        new Ventana().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void menubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubActionPerformed
        new Ventana().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menubActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void combomateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combomateriaActionPerformed

    private void combotemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotemaActionPerformed

    }//GEN-LAST:event_combotemaActionPerformed

    private void seguirrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seguirrActionPerformed

        Statement st;
        ResultSet rs;
        int matt=0;
        String sql, temmm;
        String materia = (String) (combomateria.getSelectedItem());
        
        if ("Materia".equals(materia)){
            JOptionPane.showMessageDialog (null, "Ingrese materia de nuevo");
        }else{
            savebutton.setVisible(true);
            combotema.setVisible(true);
                         sql="SELECT CodMateria from materia WHERE NomMateria='"+materia+"'";
                 try{
                    st= cn.createStatement();
                    rs=st.executeQuery(sql);

                    while(rs.next()){
                       matt=rs.getInt(1);
                    }    
                }catch (SQLException ex) {
                    Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                }  
        sql="SELECT NomTema from tema WHERE CodMateria="+matt;
                 try{
                    st= cn.createStatement();
                    rs=st.executeQuery(sql);
                    while(rs.next()){
                        temmm=rs.getString(1);
                        combotema.addItem(""+temmm);
                    }    
                }catch (SQLException ex) {
                    Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                }  
        combotema.setEditable(true);
        }
       
        
       
        

    }//GEN-LAST:event_seguirrActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ANota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Arec;
    private javax.swing.JButton atras;
    private javax.swing.JComboBox combomateria;
    private javax.swing.JComboBox combotema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menub;
    private javax.swing.JButton salir;
    private javax.swing.JButton savebutton;
    public static javax.swing.JButton seguirr;
    // End of variables declaration//GEN-END:variables
}
