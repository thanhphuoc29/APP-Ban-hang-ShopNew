/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package APP.view;

import APP.model.product;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Item extends javax.swing.JPanel {

    /**
     * Creates new form Item
     */
    public Item(product a) {
        initComponents();
        //setSize(220,280);
        name.setText(a.getName());
        price.setText(" "+String.valueOf(a.getPrice()));
        size.setText(a.getSize());
        image.setIcon(new ImageIcon(new ImageIcon(a.getSrc()).getImage().getScaledInstance(166,97, Image.SCALE_DEFAULT)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        size = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        buy = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(221, 281));
        setMinimumSize(new java.awt.Dimension(220, 280));
        setPreferredSize(new java.awt.Dimension(220, 280));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/APP/image/shoe1.jpg"))); // NOI18N
        add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, 182, 105));

        name.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(51, 0, 51));
        name.setText("Ao polo");
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 127, -1, -1));

        size.setText("Size S");
        add(size, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 159, 52, 33));

        price.setBackground(new java.awt.Color(255, 0, 0));
        price.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setText("  100000");
        price.setOpaque(true);
        add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 210, 64, 35));

        buy.setBackground(new java.awt.Color(0, 153, 51));
        buy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buy.setForeground(new java.awt.Color(255, 255, 255));
        buy.setText("Mua");
        buy.setBorderPainted(false);
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });
        add(buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 210, 69, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed
        String num=JOptionPane.showInputDialog("Nh???p s??? l?????ng");
        JOptionPane.showMessageDialog(null, "???? th??m v??o gi??? h??ng");
    }//GEN-LAST:event_buyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buy;
    private javax.swing.JLabel image;
    private javax.swing.JLabel name;
    private javax.swing.JLabel price;
    private javax.swing.JLabel size;
    // End of variables declaration//GEN-END:variables
}
