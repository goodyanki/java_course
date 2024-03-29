/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingquad;

import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Hani
 */
public class DrawingForm extends javax.swing.JFrame {
    
    private ArrayRect arrayRect = new ArrayRect(); 
    /**
     * Creates new form DrawingForm
     */
    public DrawingForm() 
    {
        initComponents();
        
        cmbQuad.removeAllItems();
        cmbQuad.addItem("Quadrilateral");
        cmbQuad.addItem("Rectangle");
        cmbQuad.addItem("Square");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        cmbQuad = new javax.swing.JComboBox<>();
        btnDraw = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtWidth = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        radioSortWidth = new javax.swing.JRadioButton();
        radioSortHeight = new javax.swing.JRadioButton();
        chkSortDescending = new javax.swing.JCheckBox();
        btnAddToArray = new javax.swing.JButton();
        btnSortArray = new javax.swing.JButton();
        btnDrawArray = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbQuad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbQuad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbQuadActionPerformed(evt);
            }
        });

        btnDraw.setText("Draw");
        btnDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawActionPerformed(evt);
            }
        });

        jLabel1.setText("Width");

        jLabel2.setText("Height");

        buttonGroup1.add(radioSortWidth);
        radioSortWidth.setText("Sort by Width");

        buttonGroup1.add(radioSortHeight);
        radioSortHeight.setText("Sort by Height");

        chkSortDescending.setText("Sort Descending");

        btnAddToArray.setText("Add to array");
        btnAddToArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToArrayActionPerformed(evt);
            }
        });

        btnSortArray.setText("Sort array");
        btnSortArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortArrayActionPerformed(evt);
            }
        });

        btnDrawArray.setText("Draw array");
        btnDrawArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawArrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbQuad, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHeight, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(txtWidth))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(581, 581, 581)
                                .addComponent(btnDrawArray, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(radioSortWidth)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioSortHeight)
                                .addGap(18, 18, 18)
                                .addComponent(chkSortDescending)
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddToArray, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSortArray, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cmbQuad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnDraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioSortWidth)
                            .addComponent(chkSortDescending)
                            .addComponent(radioSortHeight)
                            .addComponent(btnAddToArray))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSortArray)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDrawArray)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(549, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrawActionPerformed
        // TODO add your handling code here:
        Graphics g = this.getGraphics();
        
        String cmbText = cmbQuad.getItemAt(cmbQuad.getSelectedIndex());
        
        clear();
        
        // Draw the appropriate polygon depending on the value of cmbText
        // Is it "Quadrilateral"?
        if(cmbText.equals("Quadrilateral"))
        {
            Quadrilateral quad = new Quadrilateral();
            quad.draw(g);
        }
        else if(cmbText.equals("Rectangle"))
        {
            String widthText = txtWidth.getText();
            String heightText = txtHeight.getText();
            if (widthText.length() != 0 && heightText.length() != 0)
            {
		int width = Integer.parseInt(widthText);
		int height = Integer.parseInt(heightText);
		Rectangle rect = new Rectangle(width, height);
		rect.draw(g);
            }
            else
            {
		JOptionPane.showMessageDialog(null, "Please enter width and height for the rectangle.");
            }
        }
        else if(cmbText.equals("Square"))
        {
            String sideText = txtWidth.getText();
            if (sideText.length() != 0)
            {
		int side = Integer.parseInt(sideText);
		Square square = new Square(side);
		square.draw(g);
            }
            else
            {
		JOptionPane.showMessageDialog(null, "Please enter the side length for the square.");
            }
        } 
        
        // Is it "Rectangle"?
        
        
        // Is it "Square"?
    }//GEN-LAST:event_btnDrawActionPerformed

    private void cmbQuadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbQuadActionPerformed
        // TODO add your handling code here:
        
        // WARNING: DON'T CHANGE THIS METHOD!
        
        try
        {
            String cmbText = cmbQuad.getItemAt(cmbQuad.getSelectedIndex());
        
        
            if(cmbText.equals("Quadrilateral"))
            {
                txtWidth.setEnabled(false);
                txtHeight.setEnabled(false);
            }

            if(cmbText.equals("Rectangle"))
            {
                txtWidth.setEnabled(true);
                txtHeight.setEnabled(true);
            }

            if(cmbText.equals("Square"))
            {
                txtWidth.setEnabled(true);
                txtHeight.setEnabled(false);
            }
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_cmbQuadActionPerformed

    private void btnAddToArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToArrayActionPerformed
        // TODO add your handling code here:

            int width = Integer.parseInt(txtWidth.getText());
            int height = Integer.parseInt(txtHeight.getText());
            
            boolean isSquareSelected = cmbQuad.getSelectedItem().equals("Square");
        
            Rectangle rectangle;
            if (isSquareSelected == true) 
            {
                rectangle = new Square(width);
            }
            else 
            {
                rectangle = new Rectangle(width, height);
            }

            if (arrayRect.add(rectangle) == false) 
            {
                JOptionPane.showMessageDialog(this, "Array is full.");
            }

    }//GEN-LAST:event_btnAddToArrayActionPerformed

    private void btnSortArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortArrayActionPerformed
        // TODO add your handling code here:
     
        boolean descending = chkSortDescending.isSelected();
        boolean sortByWidth = radioSortWidth.isSelected(); 
        arrayRect.setSortByWidth(sortByWidth);

        arrayRect.selectionSort(descending); 
        
        btnDrawArrayActionPerformed(null); 
    }//GEN-LAST:event_btnSortArrayActionPerformed

    private void btnDrawArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrawArrayActionPerformed
        // TODO add your handling code here:
        Graphics g = getGraphics();
        clear();
        arrayRect.drawArray(g);

    }//GEN-LAST:event_btnDrawArrayActionPerformed

    private void clear() 
    {
        // DON'T CHANGE THIS METHOD!
        // Call it before you draw any polygon so it erases the window
        Graphics g = this.getGraphics();
        g.clearRect(50, 150, 1000, 550);
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DrawingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrawingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrawingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrawingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrawingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToArray;
    private javax.swing.JButton btnDraw;
    private javax.swing.JButton btnDrawArray;
    private javax.swing.JButton btnSortArray;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkSortDescending;
    private javax.swing.JComboBox<String> cmbQuad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton radioSortHeight;
    private javax.swing.JRadioButton radioSortWidth;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables
}
