/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;
import static Proyecto.Repasar.nott;
import static Proyecto.Repasar.te;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alumno
 */
public class consulta extends javax.swing.JFrame {

    mysql con=new mysql();
    Connection cn= (Connection) con.conexion();
    /**
     * Creates new form consulta
     */
    public consulta() {
        initComponents();
        setLocation(400,100);
        setSize(650, 549);
        mostrartabla();

        atras.setVisible(true);
        atras.setContentAreaFilled(false);
        atras.setBorderPainted (false);
        
       menub.setVisible(true);
        menub.setContentAreaFilled(false);
        menub.setBorderPainted (false);
        
        salir.setVisible(true);
        salir.setContentAreaFilled(false);
        salir.setBorderPainted (false);
        
        
        plus.setVisible(true);
        plus.setContentAreaFilled(false);
        plus.setBorderPainted (false);
        
        plus1.setVisible(true);
        plus1.setContentAreaFilled(false);
        plus1.setBorderPainted (false);
        
        transparenciaButton();
        epa.setVisible(false);
        plus1.setVisible(false);

    }

    public void transparenciaButton (){
         atras.setOpaque(false);
         menub.setOpaque(false);
         salir.setOpaque(false);
         plus.setOpaque(false);
         plus1.setOpaque(false);

        }
    
    void mostrartabla(){
        String materia, tema;
        materia=nott.getText();
        tema=te.getText();
        String sql, contn;
        Statement st;
        ResultSet rs;
        int codm=0, codt=0;
        sql=("SELECT CodMateria from materia WHERE NomMateria='"+materia+"'");
        try{
                    st= cn.createStatement();
                    rs=st.executeQuery(sql);
                    while(rs.next()){
                        codm=rs.getInt(1);
                    }    
                }catch (SQLException ex) {
                    Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                }
sql=("SELECT CodTema from tema WHERE NomTema='"+tema+"'");
try{
                    st= cn.createStatement();
                    rs=st.executeQuery(sql);
                    while(rs.next()){
                        codt=rs.getInt(1);
                    }    
                }catch (SQLException ex) {
                    Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                }

//aqui deberia insertarse el tema y materia para la tabla examen 


DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("Nota");
        notaaar.setModel(modelo);
        sql="SELECT Contenido from notar WHERE CodMateria="+codm +" AND CodTema="+codt+";";
        try{
                    st= cn.createStatement();
                    rs=st.executeQuery(sql);
                    String datos[] =new String [1];
                    while(rs.next()){ 
                       datos[0]=rs.getString(1);
                       modelo.addRow(datos);
                    } 
                    notaaar.setModel(modelo);
                }catch (SQLException ex) {
                    Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atras = new javax.swing.JButton();
        menub = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        restartbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        notaaar = new javax.swing.JTable();
        plus = new javax.swing.JButton();
        epa = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        view = new javax.swing.JTextArea();
        plus1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        jLabel3.setText("REPASAR EXAMEN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libro-abierto.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REPA.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        restartbutton.setBackground(new java.awt.Color(204, 204, 204));
        restartbutton.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        restartbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reanudar.png"))); // NOI18N
        restartbutton.setText("NUEVA CONSULTA");
        restartbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(restartbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, 50));

        notaaar.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        notaaar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(notaaar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 440, 210));

        plus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/visibilidad (1).png"))); // NOI18N
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        getContentPane().add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 80, 70));

        epa.setBackground(new java.awt.Color(255, 255, 255));
        epa.setLayout(null);

        view.setColumns(20);
        view.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        view.setRows(5);
        jScrollPane2.setViewportView(view);

        epa.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 580, 90);

        getContentPane().add(epa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 610, 110));

        plus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/visibilidad (1).png"))); // NOI18N
        plus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus1ActionPerformed(evt);
            }
        });
        getContentPane().add(plus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 80, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BASICO MEDIDAS.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 660, -1));

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

    private void restartbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartbuttonActionPerformed
        new Repasar().setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_restartbuttonActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
try{
    
        DefaultTableModel tm = (DefaultTableModel) notaaar.getModel();
        String dato=String.valueOf(tm.getValueAt(notaaar.getSelectedRow(),0));
        view.setText(""+dato);
        epa.setVisible(true);
        plus1.setVisible(true);
        plus.setVisible(false);

}catch (Exception e){
    JOptionPane.showMessageDialog(null, "Seleccione una nota para expandir");
    dispose();
    new consulta().setVisible(true);
}       
        
    }//GEN-LAST:event_plusActionPerformed

    private void plus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus1ActionPerformed

        plus.setVisible(true);
        plus1.setVisible(false);
        epa.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_plus1ActionPerformed

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
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JPanel epa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton menub;
    private javax.swing.JTable notaaar;
    private javax.swing.JButton plus;
    private javax.swing.JButton plus1;
    private javax.swing.JButton restartbutton;
    private javax.swing.JButton salir;
    private javax.swing.JTextArea view;
    // End of variables declaration//GEN-END:variables
}
