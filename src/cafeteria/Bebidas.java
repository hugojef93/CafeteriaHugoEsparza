/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;


import java.awt.FlowLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hugo J Esparza F
 */
public class Bebidas extends javax.swing.JPanel {

    /**
     * Creates new form Bebidas
     */
    public Bebidas() {
        initComponents();
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cocacola_button = new javax.swing.JButton();
        fantalimon_button = new javax.swing.JButton();
        fantanaranja_button = new javax.swing.JButton();
        mahou_button = new javax.swing.JButton();
        nestea_nbutton = new javax.swing.JButton();
        radler_button = new javax.swing.JButton();
        sprite_button = new javax.swing.JButton();
        zumofresa_button = new javax.swing.JButton();
        zumolimon_button = new javax.swing.JButton();
        zumonaranja_button = new javax.swing.JButton();
        zumosandia_button = new javax.swing.JButton();
        cafeleche_button = new javax.swing.JButton();
        cafesolo_button = new javax.swing.JButton();
        chocolate_button = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(630, 460));
        setPreferredSize(new java.awt.Dimension(630, 460));

        cocacola_button.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        cocacola_button.setForeground(new java.awt.Color(0, 0, 0));
        cocacola_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/cocacolab.png"))); // NOI18N
        cocacola_button.setText("COCACOLA");
        cocacola_button.setBorder(null);
        cocacola_button.setContentAreaFilled(false);
        cocacola_button.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cocacola_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cocacola_button.setPreferredSize(new java.awt.Dimension(100, 120));
        cocacola_button.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cocacola_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cocacola_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocacola_buttonActionPerformed(evt);
            }
        });
        add(cocacola_button);

        fantalimon_button.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        fantalimon_button.setForeground(new java.awt.Color(0, 0, 0));
        fantalimon_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/fantalimonb.png"))); // NOI18N
        fantalimon_button.setText("FANTA L.");
        fantalimon_button.setBorder(null);
        fantalimon_button.setContentAreaFilled(false);
        fantalimon_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fantalimon_button.setPreferredSize(new java.awt.Dimension(100, 120));
        fantalimon_button.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fantalimon_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        fantalimon_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fantalimon_buttonActionPerformed(evt);
            }
        });
        add(fantalimon_button);

        fantanaranja_button.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        fantanaranja_button.setForeground(new java.awt.Color(0, 0, 0));
        fantanaranja_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/fantanaranjab.png"))); // NOI18N
        fantanaranja_button.setText("FANTA N.");
        fantanaranja_button.setBorder(null);
        fantanaranja_button.setContentAreaFilled(false);
        fantanaranja_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fantanaranja_button.setPreferredSize(new java.awt.Dimension(100, 120));
        fantanaranja_button.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fantanaranja_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        fantanaranja_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fantanaranja_buttonActionPerformed(evt);
            }
        });
        add(fantanaranja_button);

        mahou_button.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        mahou_button.setForeground(new java.awt.Color(0, 0, 0));
        mahou_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/mahoub.png"))); // NOI18N
        mahou_button.setText("MAHOU");
        mahou_button.setBorder(null);
        mahou_button.setContentAreaFilled(false);
        mahou_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mahou_button.setPreferredSize(new java.awt.Dimension(100, 120));
        mahou_button.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        mahou_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mahou_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mahou_buttonActionPerformed(evt);
            }
        });
        add(mahou_button);

        nestea_nbutton.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        nestea_nbutton.setForeground(new java.awt.Color(0, 0, 0));
        nestea_nbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/nesteab.png"))); // NOI18N
        nestea_nbutton.setText("NESTEA");
        nestea_nbutton.setBorder(null);
        nestea_nbutton.setContentAreaFilled(false);
        nestea_nbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nestea_nbutton.setPreferredSize(new java.awt.Dimension(100, 120));
        nestea_nbutton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        nestea_nbutton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nestea_nbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nestea_nbuttonActionPerformed(evt);
            }
        });
        add(nestea_nbutton);

        radler_button.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        radler_button.setForeground(new java.awt.Color(0, 0, 0));
        radler_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/radlerb.png"))); // NOI18N
        radler_button.setText("RADLER");
        radler_button.setBorder(null);
        radler_button.setContentAreaFilled(false);
        radler_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        radler_button.setPreferredSize(new java.awt.Dimension(100, 120));
        radler_button.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        radler_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        radler_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radler_buttonActionPerformed(evt);
            }
        });
        add(radler_button);

        sprite_button.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        sprite_button.setForeground(new java.awt.Color(0, 0, 0));
        sprite_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/spriteb.png"))); // NOI18N
        sprite_button.setText("SPRITE");
        sprite_button.setBorder(null);
        sprite_button.setContentAreaFilled(false);
        sprite_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sprite_button.setPreferredSize(new java.awt.Dimension(100, 120));
        sprite_button.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        sprite_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sprite_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sprite_buttonActionPerformed(evt);
            }
        });
        add(sprite_button);

        zumofresa_button.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        zumofresa_button.setForeground(new java.awt.Color(0, 0, 0));
        zumofresa_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/zumofresab.png"))); // NOI18N
        zumofresa_button.setText("Z.FRESA");
        zumofresa_button.setBorder(null);
        zumofresa_button.setContentAreaFilled(false);
        zumofresa_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        zumofresa_button.setPreferredSize(new java.awt.Dimension(100, 120));
        zumofresa_button.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        zumofresa_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        zumofresa_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zumofresa_buttonActionPerformed(evt);
            }
        });
        add(zumofresa_button);

        zumolimon_button.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        zumolimon_button.setForeground(new java.awt.Color(0, 0, 0));
        zumolimon_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/zumolimonb.png"))); // NOI18N
        zumolimon_button.setText("Z.LIMÓN");
        zumolimon_button.setBorder(null);
        zumolimon_button.setContentAreaFilled(false);
        zumolimon_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        zumolimon_button.setPreferredSize(new java.awt.Dimension(100, 120));
        zumolimon_button.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        zumolimon_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        zumolimon_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zumolimon_buttonActionPerformed(evt);
            }
        });
        add(zumolimon_button);

        zumonaranja_button.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        zumonaranja_button.setForeground(new java.awt.Color(0, 0, 0));
        zumonaranja_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/zumonaranjab.png"))); // NOI18N
        zumonaranja_button.setText("Z.NARANJA");
        zumonaranja_button.setBorder(null);
        zumonaranja_button.setContentAreaFilled(false);
        zumonaranja_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        zumonaranja_button.setPreferredSize(new java.awt.Dimension(100, 120));
        zumonaranja_button.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        zumonaranja_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        zumonaranja_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zumonaranja_buttonActionPerformed(evt);
            }
        });
        add(zumonaranja_button);

        zumosandia_button.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        zumosandia_button.setForeground(new java.awt.Color(0, 0, 0));
        zumosandia_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/zumosandiab.png"))); // NOI18N
        zumosandia_button.setText("Z.SANDÍA");
        zumosandia_button.setBorder(null);
        zumosandia_button.setContentAreaFilled(false);
        zumosandia_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        zumosandia_button.setPreferredSize(new java.awt.Dimension(100, 120));
        zumosandia_button.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        zumosandia_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        zumosandia_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zumosandia_buttonActionPerformed(evt);
            }
        });
        add(zumosandia_button);

        cafeleche_button.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        cafeleche_button.setForeground(new java.awt.Color(0, 0, 0));
        cafeleche_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/cafeconlecheb.png"))); // NOI18N
        cafeleche_button.setText("CAFÉ LECHE");
        cafeleche_button.setBorder(null);
        cafeleche_button.setContentAreaFilled(false);
        cafeleche_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cafeleche_button.setPreferredSize(new java.awt.Dimension(100, 120));
        cafeleche_button.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cafeleche_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cafeleche_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafeleche_buttonActionPerformed(evt);
            }
        });
        add(cafeleche_button);

        cafesolo_button.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        cafesolo_button.setForeground(new java.awt.Color(0, 0, 0));
        cafesolo_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/cafesolob.png"))); // NOI18N
        cafesolo_button.setText("CAFÉ SOLO");
        cafesolo_button.setBorder(null);
        cafesolo_button.setContentAreaFilled(false);
        cafesolo_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cafesolo_button.setPreferredSize(new java.awt.Dimension(100, 120));
        cafesolo_button.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cafesolo_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cafesolo_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafesolo_buttonActionPerformed(evt);
            }
        });
        add(cafesolo_button);

        chocolate_button.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        chocolate_button.setForeground(new java.awt.Color(0, 0, 0));
        chocolate_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/chocolateb.png"))); // NOI18N
        chocolate_button.setText("CHOCOLATE");
        chocolate_button.setBorder(null);
        chocolate_button.setContentAreaFilled(false);
        chocolate_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        chocolate_button.setPreferredSize(new java.awt.Dimension(100, 120));
        chocolate_button.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        chocolate_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        chocolate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocolate_buttonActionPerformed(evt);
            }
        });
        add(chocolate_button);
    }// </editor-fold>//GEN-END:initComponents

    private void fantalimon_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fantalimon_buttonActionPerformed
        // TODO add your handling code here:
        try {
            Productos.agregarProducto("Fanta_limon");
        } catch (SQLException sqe) {
            System.out.println("Consulta fallida:" + sqe.getMessage() + "");
        }
    }//GEN-LAST:event_fantalimon_buttonActionPerformed
 
    private void cocacola_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cocacola_buttonActionPerformed
        // TODO add your handling code here:

        try {
            Productos.agregarProducto("Cocacola");
        } catch (SQLException sqe) {
            System.out.println("Consulta fallida:" + sqe.getMessage() + "");
        }


        
    }//GEN-LAST:event_cocacola_buttonActionPerformed

    private void fantanaranja_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fantanaranja_buttonActionPerformed
        // TODO add your handling code here:
        try {
            Productos.agregarProducto("Fanta_naranja");
        } catch (SQLException sqe) {
            System.out.println("Consulta fallida:" + sqe.getMessage() + "");
        }
    }//GEN-LAST:event_fantanaranja_buttonActionPerformed

    private void mahou_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mahou_buttonActionPerformed
        // TODO add your handling code here:
        try {
            Productos.agregarProducto("mahou");
        } catch (SQLException sqe) {
            System.out.println("Consulta fallida:" + sqe.getMessage() + "");
        }
    }//GEN-LAST:event_mahou_buttonActionPerformed

    private void nestea_nbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nestea_nbuttonActionPerformed
        // TODO add your handling code here:
        try {
            Productos.agregarProducto("nestea");
        } catch (SQLException sqe) {
            System.out.println("Consulta fallida:" + sqe.getMessage() + "");
        }
    }//GEN-LAST:event_nestea_nbuttonActionPerformed

    private void radler_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radler_buttonActionPerformed
        // TODO add your handling code here:
        try {
            Productos.agregarProducto("radler");
        } catch (SQLException sqe) {
            System.out.println("Consulta fallida:" + sqe.getMessage() + "");
        }
    }//GEN-LAST:event_radler_buttonActionPerformed

    private void sprite_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sprite_buttonActionPerformed
        // TODO add your handling code here:
        try {
            Productos.agregarProducto("sprite");
        } catch (SQLException sqe) {
            System.out.println("Consulta fallida:" + sqe.getMessage() + "");
        }
    }//GEN-LAST:event_sprite_buttonActionPerformed

    private void zumofresa_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zumofresa_buttonActionPerformed
        // TODO add your handling code here:
        try {
            Productos.agregarProducto("Zumo_de_fresa");
        } catch (SQLException sqe) {
            System.out.println("Consulta fallida:" + sqe.getMessage() + "");
        }
    }//GEN-LAST:event_zumofresa_buttonActionPerformed

    private void zumolimon_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zumolimon_buttonActionPerformed
        // TODO add your handling code here:
        try {
            Productos.agregarProducto("Zumo_de_limon");
        } catch (SQLException sqe) {
            System.out.println("Consulta fallida:" + sqe.getMessage() + "");
        }
    }//GEN-LAST:event_zumolimon_buttonActionPerformed

    private void zumonaranja_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zumonaranja_buttonActionPerformed
        // TODO add your handling code here:
        try {
            Productos.agregarProducto("Zumo_de_naranja");
        } catch (SQLException sqe) {
            System.out.println("Consulta fallida:" + sqe.getMessage() + "");
        }
    }//GEN-LAST:event_zumonaranja_buttonActionPerformed

    private void zumosandia_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zumosandia_buttonActionPerformed
        // TODO add your handling code here:
        try {
            Productos.agregarProducto("Zumo_de_sandia");
        } catch (SQLException sqe) {
            System.out.println("Consulta fallida:" + sqe.getMessage() + "");
        }
    }//GEN-LAST:event_zumosandia_buttonActionPerformed

    private void cafeleche_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafeleche_buttonActionPerformed
        // TODO add your handling code here:
        try {
            Productos.agregarProducto("cafe_leche");
        } catch (SQLException sqe) {
            System.out.println("Consulta fallida:" + sqe.getMessage() + "");
        }
    }//GEN-LAST:event_cafeleche_buttonActionPerformed

    private void cafesolo_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafesolo_buttonActionPerformed
        // TODO add your handling code here:
        try {
            Productos.agregarProducto("cafe_solo");
        } catch (SQLException sqe) {
            System.out.println("Consulta fallida:" + sqe.getMessage() + "");
        }
    }//GEN-LAST:event_cafesolo_buttonActionPerformed

    private void chocolate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocolate_buttonActionPerformed
        // TODO add your handling code here:
        try {
            Productos.agregarProducto("chocolate");
        } catch (SQLException sqe) {
            System.out.println("Consulta fallida:" + sqe.getMessage() + "");
        }
    }//GEN-LAST:event_chocolate_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cafeleche_button;
    private javax.swing.JButton cafesolo_button;
    private javax.swing.JButton chocolate_button;
    private javax.swing.JButton cocacola_button;
    private javax.swing.JButton fantalimon_button;
    private javax.swing.JButton fantanaranja_button;
    private javax.swing.JButton mahou_button;
    private javax.swing.JButton nestea_nbutton;
    private javax.swing.JButton radler_button;
    private javax.swing.JButton sprite_button;
    private javax.swing.JButton zumofresa_button;
    private javax.swing.JButton zumolimon_button;
    private javax.swing.JButton zumonaranja_button;
    private javax.swing.JButton zumosandia_button;
    // End of variables declaration//GEN-END:variables
}
