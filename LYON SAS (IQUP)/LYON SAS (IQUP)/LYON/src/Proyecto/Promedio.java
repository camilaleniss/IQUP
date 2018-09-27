
package Proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Promedio extends javax.swing.JFrame {

        mysql con=new mysql();
        Connection cn= (Connection) con.conexion();
    
    public Promedio() {
        initComponents();
        setLocation(400,100);
        
        contTabla.setVisible(false);
        
        savebutton.setVisible(false);
        restartbutton.setVisible(false);
        showbutton.setVisible(true);
        resultado.setVisible(false);
        
        setSize(643, 585);
        transparenciaButton ();
        
        atras.setVisible(true);
        atras.setContentAreaFilled(false);
        atras.setBorderPainted (false);
        
       menub.setVisible(true);
        menub.setContentAreaFilled(false);
        menub.setBorderPainted (false);
        
        salir.setVisible(true);
        salir.setContentAreaFilled(false);
        salir.setBorderPainted (false);
       
        porcient.setVisible(true);
        porcient.setContentAreaFilled(false);
        porcient.setBorderPainted (false);
        
        seguir.setVisible(true);
        seguir.setContentAreaFilled(false);
        seguir.setBorderPainted (false);
        
        borrar.setVisible(false);
        borrar.setContentAreaFilled(false);
        borrar.setBorderPainted (false);
        

        
        dontshowbutton.setVisible(false);
        
        
        Statement st;
        ResultSet rs;
        String sql, matt;
        sql="SELECT * from materia";
                 try{
                    st= cn.createStatement();
                    rs=st.executeQuery(sql);

                    while(rs.next()){
                       matt=rs.getString(2);
                       comboboxmateria.addItem(""+matt);
                       
                    }    
                }catch (SQLException ex) {
                    Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                }  
                 
                 comprueba.setVisible(false);
    }
    
    public void transparenciaButton(){
    atras.setOpaque(false);
    menub.setOpaque(false);
    salir.setOpaque(false);
    porcient.setOpaque(false);
    seguir.setOpaque(false);
    borrar.setOpaque(false);
}

    private void setTittle(String promedio) {
        throw new UnsupportedOperationException("Promedio"); //To change body of generated methods, choose Tools | Templates.
    }
    
  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboboxmateria = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        porcient = new javax.swing.JCheckBox();
        seguir = new javax.swing.JButton();
        resultado = new javax.swing.JPanel();
        need = new javax.swing.JTextField();
        Final = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        nnotas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        menub = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        savebutton = new javax.swing.JButton();
        restartbutton = new javax.swing.JButton();
        showbutton = new javax.swing.JButton();
        dontshowbutton = new javax.swing.JButton();
        contTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaprom = new javax.swing.JTable();
        comprueba = new javax.swing.JTextField();
        borrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROMEDIO");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROMEDIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 212, 56));

        comboboxmateria.setEditable(true);
        comboboxmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxmateriaActionPerformed(evt);
            }
        });
        getContentPane().add(comboboxmateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 130, 30));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel2.setText("Materia");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 50, 20));

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel3.setText("Numero de notas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        porcient.setText("%");
        porcient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcientActionPerformed(evt);
            }
        });
        getContentPane().add(porcient, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        seguir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jugar (3).png"))); // NOI18N
        seguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seguirActionPerformed(evt);
            }
        });
        getContentPane().add(seguir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 70, 70));

        resultado.setBackground(new java.awt.Color(242, 113, 113));

        need.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        need.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                needActionPerformed(evt);
            }
        });

        Final.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        Final.setAutoscrolls(false);

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel4.setText("Necesitas");

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel5.setText("Final");

        javax.swing.GroupLayout resultadoLayout = new javax.swing.GroupLayout(resultado);
        resultado.setLayout(resultadoLayout);
        resultadoLayout.setHorizontalGroup(
            resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(need, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(resultadoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );

        resultadoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Final, need});

        resultadoLayout.setVerticalGroup(
            resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultadoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(need, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Final, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 972, -1, 28));
        getContentPane().add(nnotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 36, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuprom.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 80));

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras2.png"))); // NOI18N
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 60, 30));

        menub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/init.png"))); // NOI18N
        menub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubActionPerformed(evt);
            }
        });
        getContentPane().add(menub, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, -1, -1));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 30, -1));

        savebutton.setBackground(new java.awt.Color(204, 204, 204));
        savebutton.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        savebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disquete.png"))); // NOI18N
        savebutton.setText("  GUARDAR");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(savebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 190, 50));

        restartbutton.setBackground(new java.awt.Color(204, 204, 204));
        restartbutton.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        restartbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reanudar.png"))); // NOI18N
        restartbutton.setText("  REINICIAR");
        restartbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(restartbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 190, 50));

        showbutton.setBackground(new java.awt.Color(204, 204, 204));
        showbutton.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        showbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojo.png"))); // NOI18N
        showbutton.setText("  MOSTRAR NOTAS");
        showbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(showbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 190, 50));

        dontshowbutton.setBackground(new java.awt.Color(204, 204, 204));
        dontshowbutton.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        dontshowbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojo.png"))); // NOI18N
        dontshowbutton.setText("  OCULTAR NOTAS");
        dontshowbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dontshowbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(dontshowbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 190, 50));

        contTabla.setBackground(new java.awt.Color(255, 255, 255));
        contTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaprom.setBackground(new java.awt.Color(255, 204, 204));
        tablaprom.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        tablaprom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaprom);

        contTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 254, 169));

        getContentPane().add(contTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 270, 180));
        getContentPane().add(comprueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 60, 60));

        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar_1.png"))); // NOI18N
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        getContentPane().add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BASICO MEDIDAS.png"))); // NOI18N
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboboxmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxmateriaActionPerformed
       
        
        
    }//GEN-LAST:event_comboboxmateriaActionPerformed

    private void seguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seguirActionPerformed
try{
        
        
double notass;
        notass = Double.parseDouble(nnotas.getText());
double sum=0, num, prom,pacomula=0, pp, porcien=0;
int prueba=0,said;
if (porcient.isSelected()==true){
    
    while (prueba==0){
        
            for (int i=0; i<notass;i++){
                said=i+1;
                porcien=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del porcetaje de la nota "+said));
                pacomula=pacomula+porcien;
            }
            
            if (pacomula>100 || pacomula<100){
                JOptionPane.showMessageDialog(null,"La suma de los porcentajes no da 100");
                pacomula=0;
            }else{
                prueba=1;
            }
           
    }
    
    for (int e=0; e<notass; e++){
        
        num= Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota "));
        while (num>5 || num<0){
            num= Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota entre 0 y 5"));
        }
        pp=porcien/100;
        sum=sum+(num*pp);
    }
    prom=sum;
}else{
    for (int c=0; c<notass; c++){
    num= Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota "));
    while (num>5 || num<0){
            num= Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota entre 0 y 5"));
        }
    sum=sum+num;
    }
    prom=sum/notass;
}
// este fue todo el proceso para sacar el  promedio
if (prom<3){
    double nnt=notass+1;
    double prueb3, prueb4,prueb5;
    prueb3=(sum+3)/nnt;
    prueb4=(sum+4)/nnt;
    prueb5=(sum+5)/nnt;
    if (prueb3>=3){
        need.setText(" 3 ");
    } else if (prueb4>=3){
        need.setText(" 4 ");
    } else if (prueb5>=3){
        need.setText(" 5 ");
    }else{
        need.setText(" M ");
    }
}else{
    need.setText(" - ");
}

comprueba.setText(""+prom);

double promedio=prom;
DecimalFormat decimales = new DecimalFormat ("0.0");
Final.setText(""+decimales.format(promedio)); 



    savebutton.setVisible(true);
    restartbutton.setVisible(true);
    showbutton.setVisible(true);
    resultado.setVisible(true);
}catch (Exception e){
    JOptionPane.showMessageDialog(null, "Debe ingresar numero de notas");
}
        
       
    }//GEN-LAST:event_seguirActionPerformed

    private void porcientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_porcientActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void menubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubActionPerformed
new Ventana().setVisible(true);  
dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_menubActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
new Ventana().setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_atrasActionPerformed

    private void needActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_needActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_needActionPerformed

    private void restartbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartbuttonActionPerformed
nnotas.setText(null);
need.setText(null);
Final.setText(null);
porcient.setSelected(false);
        
// TODO add your handling code here:
    }//GEN-LAST:event_restartbuttonActionPerformed

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed

        String mmateria=(String) (comboboxmateria.getSelectedItem());
        double prom=Double.parseDouble(comprueba.getText());
        String ned=need.getText();
        String sql;
        Statement st;
// consulta cod de la materia
    int Cod=0;
    sql=("SELECT CodMateria FROM materia WHERE NomMateria='"+mmateria+"'");
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
        
        if (Cod==0){
            sql="INSERT INTO materia (NomMateria) VALUES (?)";
    
                try{
                    PreparedStatement pst=cn.prepareStatement(sql);
                    pst.setString(1,mmateria);
                    int n=pst.executeUpdate();
                    if (n>0){
                        JOptionPane.showMessageDialog(null,"Guardar Materia"); 
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                //consulta cod materia
                
                sql=("SELECT CodMateria FROM materia WHERE NomMateria='"+mmateria+"'");
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
        }
        
        //añadir promedio
        
        int recod=0;
        sql="SELECT CodPromedio from  promedio WHERE CodMateria="+Cod;
        try {
                    st= cn.createStatement();
                    ResultSet rs =st.executeQuery(sql);
                    while (rs.next()){
                        recod=rs.getInt(1);
                    }  
                    } catch (SQLException ex) {
                        Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
        switch (recod) {
            case 0:
                 sql="INSERT INTO promedio (CodMateria, Necesita, Final) VALUES (?,?,?)";
    
                try{
                    PreparedStatement pst=cn.prepareStatement(sql);
                    pst.setInt(1,Cod);
                    pst.setString(2, ned);
                    pst.setDouble(3, prom);
                    int n=pst.executeUpdate();
                    if (n>0){
                        JOptionPane.showMessageDialog(null,"Guardar Promedio"); 
                    }
        
                } catch (SQLException ex) {
                    Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
                }     
                break;
            default:
                try{
                   PreparedStatement pps= cn.prepareStatement("UPDATE promedio SET Necesita='"+ned+"', Final="+prom+" WHERE CodMateria="+Cod);
                   pps.executeUpdate();
                   JOptionPane.showMessageDialog(null, "Promedio actualizado");
                   mostrartabla();
               }catch (SQLException ex){
                   Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
               }
                break;
        }

    }//GEN-LAST:event_savebuttonActionPerformed

    void mostrartabla(){
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("Materia");
        modelo.addColumn("Necesita");
        modelo.addColumn("Promedio");
        tablaprom.setModel(modelo);
        String sql= "Select * from promedio";
        int c=0;
        Statement st;
        try{
            String datos[] =new String [3];
            st =cn.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(2);
                datos[1]=rs.getString(3);
                datos[2]=rs.getString(4);
                c++;
                modelo.addRow(datos);
            }
            tablaprom.setModel(modelo);
            
        }catch (SQLException ex){
            Logger.getLogger(Promedio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        int con=0;
        ResultSet rs1;
        String value, nom;
        while (con<c){
            value=(String) tablaprom.getValueAt(con, 0);
            sql="SELECT NomMateria from materia where CodMateria="+value;
            try{
                st=cn.createStatement();
                rs1=st.executeQuery(sql);
                while (rs1.next()){
                    nom=rs1.getString(1);  
                   tablaprom.setValueAt(nom, con, 0);
                } 
            }catch (SQLException ex){
                Logger.getLogger(Promedio.class.getName()).log(Level.SEVERE, null, ex);
            }
            con++;
        }
    }
    
    
    private void showbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbuttonActionPerformed
mostrartabla();
contTabla.setVisible(true);
dontshowbutton.setVisible(true);
showbutton.setVisible(false);
borrar.setVisible(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_showbuttonActionPerformed

    private void dontshowbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dontshowbuttonActionPerformed
contTabla.setVisible(false);
dontshowbutton.setVisible(false);
showbutton.setVisible(true);
borrar.setVisible(false);
        
// TODO add your handling code here:
    }//GEN-LAST:event_dontshowbuttonActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
try{
    
        DefaultTableModel tm = (DefaultTableModel) tablaprom.getModel();
        String dato=String.valueOf(tm.getValueAt(tablaprom.getSelectedRow(),0));
        
        int dat=0, dat2=0;
        ResultSet rs;
            Statement st;
            String sql = ("SELECT CodMateria from materia WHERE NomMateria='" + dato + "'");
            try {
                st = cn.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    dat = rs.getInt(1);
                }

            } catch (SQLException ex) {
                Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
            }
            sql = ("SELECT CodPromedio from promedio WHERE CodMateria='" + dat + "'");
            try {
                st = cn.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    dat2 = rs.getInt(1);
                }

            } catch (SQLException ex) {
                Logger.getLogger(ANota.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            //borrar
            
            try {
            PreparedStatement pps = cn.prepareStatement("DELETE FROM promedio WHERE CodPromedio=" + dat2);
            pps.executeUpdate();
            mostrartabla();
           
        } catch (SQLException ex) {
            Logger.getLogger(ERecor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

}catch (Exception e){
    JOptionPane.showMessageDialog(null, "Seleccione un promedio para borrar");
    dispose();
    new consulta().setVisible(true);
}
        


// TODO add your handling code here:
    }//GEN-LAST:event_borrarActionPerformed

    
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
            java.util.logging.Logger.getLogger(Promedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Promedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Promedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Promedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Promedio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Final;
    private javax.swing.JButton atras;
    private javax.swing.JButton borrar;
    public static javax.swing.JComboBox comboboxmateria;
    private javax.swing.JTextField comprueba;
    private javax.swing.JPanel contTabla;
    private javax.swing.JButton dontshowbutton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menub;
    private javax.swing.JTextField need;
    public static javax.swing.JTextField nnotas;
    private javax.swing.JCheckBox porcient;
    private javax.swing.JButton restartbutton;
    private javax.swing.JPanel resultado;
    private javax.swing.JButton salir;
    private javax.swing.JButton savebutton;
    private javax.swing.JButton seguir;
    private javax.swing.JButton showbutton;
    private javax.swing.JTable tablaprom;
    // End of variables declaration//GEN-END:variables
}
