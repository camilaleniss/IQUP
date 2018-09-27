package Proyecto;

import static Proyecto.MenuBD.codi;
import static Proyecto.MenuBD.temm;
import static Proyecto.ENota.notita;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class notita {

    public static JPanel creapanelcito() {
        String cod = codi.getText();
        String temaa = temm.getText();

        String titulo = MenuBD.titulo.getText();
        titulo = titulo.substring(titulo.lastIndexOf('.') + 1);
        JPanel panel = new JPanel();
        panel.setBackground(new java.awt.Color(255, 255, 255));

        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel.setBounds(30, 20, 600, 110);
        panel.setVisible(true);

        JTextField txt = new JTextField();
        txt.setFont(new java.awt.Font("Cambria", 0, 14));
        txt.setText("" + cod);
        final String des;
        des = txt.getText();
        panel.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 460, 50));

        JLabel tema = new JLabel();
        tema.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12));
        tema.setText("" + temaa);
        panel.add(tema, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 75, -1, -1));

        JButton DELETE = new JButton();
        ImageIcon icono = new ImageIcon("/Imagenes/opciones.png");
        DELETE.setIcon(icono);
        DELETE.setSize(50, 50);
        DELETE.setBounds(100, 500, 500, 100);

        DELETE.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new ENota().setVisible(true);
                notita.setText("" + des);
            }

        });
        panel.add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 45, -1, -1));
        return (panel);
    }

}

    
    

