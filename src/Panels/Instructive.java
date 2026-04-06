package Panels;

import javax.swing.JFrame;
import numberrandomgame.Background;

public class Instructive extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Instructive.class.getName());
    Background bg = new Background();
    public Instructive(){
        configureWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Instructive = new javax.swing.JPanel();
        Tutorial = new javax.swing.JPanel();
        Text = new javax.swing.JLabel();
        Buttons = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        NextButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        Frame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Instructive.setOpaque(false);
        Instructive.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tutorial.setMaximumSize(new java.awt.Dimension(1400, 900));
        Tutorial.setOpaque(false);
        Tutorial.setLayout(new javax.swing.BoxLayout(Tutorial, javax.swing.BoxLayout.Y_AXIS));

        Text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TextTutorial.png"))); // NOI18N
        Text.setAlignmentX(0.5F);
        Tutorial.add(Text);

        Buttons.setOpaque(false);
        Buttons.setLayout(new javax.swing.BoxLayout(Buttons, javax.swing.BoxLayout.LINE_AXIS));

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackButton.png"))); // NOI18N
        BackButton.setBorder(null);
        BackButton.setContentAreaFilled(false);
        BackButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackButtonGray.png"))); // NOI18N
        BackButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackButtonGray.png"))); // NOI18N
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BackButtonMouseReleased(evt);
            }
        });
        BackButton.addActionListener(this::BackButtonActionPerformed);
        Buttons.add(BackButton);
        Buttons.add(filler2);

        NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NextButton.png"))); // NOI18N
        NextButton.setAlignmentX(0.5F);
        NextButton.setAlignmentY(0.52F);
        NextButton.setBorder(null);
        NextButton.setContentAreaFilled(false);
        NextButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NextButtonGray.png"))); // NOI18N
        NextButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NextButtonGray.png"))); // NOI18N
        NextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NextButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                NextButtonMouseReleased(evt);
            }
        });
        NextButton.addActionListener(this::NextButtonActionPerformed);
        Buttons.add(NextButton);

        Tutorial.add(Buttons);
        Tutorial.add(filler1);

        Instructive.add(Tutorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 149, 1360, 720));

        Frame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PrincipalFrame.png"))); // NOI18N
        Frame.setAlignmentX(0.5F);
        Instructive.add(Frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, -10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Instructive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Instructive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonMouseClicked

    private void BackButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMousePressed
        BackButton.setLocation(BackButton.getX(), BackButton.getY() + 2);
    }//GEN-LAST:event_BackButtonMousePressed

    private void BackButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseReleased
        BackButton.setLocation(BackButton.getX(), BackButton.getY() - 2);
    }//GEN-LAST:event_BackButtonMouseReleased

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        try {
            new Home().setVisible(true);
        } catch (Exception ex) {
            System.getLogger(Instructive.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_BackButtonActionPerformed

    private void NextButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMousePressed
        NextButton.setLocation(NextButton.getX(), NextButton.getY() + 2);
    }//GEN-LAST:event_NextButtonMousePressed

    private void NextButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseReleased
        NextButton.setLocation(NextButton.getX(), NextButton.getY() - 2);
    }//GEN-LAST:event_NextButtonMouseReleased

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        new Game().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NextButtonActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Instructive().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel Buttons;
    private javax.swing.JLabel Frame;
    private javax.swing.JPanel Instructive;
    private javax.swing.JButton NextButton;
    private javax.swing.JLabel Text;
    private javax.swing.JPanel Tutorial;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    // End of variables declaration//GEN-END:variables
private void configureWindow() {
    setUndecorated(true);
    initComponents();
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    bg.setLayout(new java.awt.BorderLayout());
    bg.add(Instructive);
    setContentPane(bg);
}
}
