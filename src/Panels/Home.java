package Panels;

import javax.swing.JFrame;
import numberrandomgame.AudioManager;
import numberrandomgame.Background;
import numberrandomgame.Drive;


public class Home extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Home.class.getName());
    public Home() throws Exception {
        Drive.clean(); 
        configureWindow();
        AudioManager.cargarSonido("src/Sounds/SoundTrack.wav");
        AudioManager.reproducir();
        AudioManager.setVolumen(AudioManager.getVolumen());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Home = new javax.swing.JPanel();
        FirstSpacer = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40));
        TopButtons = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0));
        ExitButton = new javax.swing.JButton();
        SpacerTop = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Logo = new javax.swing.JLabel();
        SpacerTop1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        SettingsButton = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0));
        SecondSpace = new javax.swing.Box.Filler(new java.awt.Dimension(0, 25), new java.awt.Dimension(0, 25), new java.awt.Dimension(32767, 25));
        CenterButtons = new javax.swing.JPanel();
        PlayButton = new javax.swing.JButton();
        TirdSpace = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0));
        ScoreButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Home.setOpaque(false);
        Home.setPreferredSize(new java.awt.Dimension(1920, 1080));
        Home.setLayout(new javax.swing.BoxLayout(Home, javax.swing.BoxLayout.Y_AXIS));
        Home.add(FirstSpacer);

        TopButtons.setOpaque(false);
        TopButtons.setLayout(new javax.swing.BoxLayout(TopButtons, javax.swing.BoxLayout.X_AXIS));
        TopButtons.add(filler1);

        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExitButton.png"))); // NOI18N
        ExitButton.setAlignmentY(1.0F);
        ExitButton.setBorder(null);
        ExitButton.setContentAreaFilled(false);
        ExitButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExitButtonGray.png"))); // NOI18N
        ExitButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExitButtonGray.png"))); // NOI18N
        ExitButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExitButtonGray.png"))); // NOI18N
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ExitButtonMouseReleased(evt);
            }
        });
        ExitButton.addActionListener(this::ExitButtonActionPerformed);
        TopButtons.add(ExitButton);
        TopButtons.add(SpacerTop);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N
        Logo.setAlignmentX(0.5F);
        Logo.setAlignmentY(0.2F);
        TopButtons.add(Logo);
        TopButtons.add(SpacerTop1);

        SettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SettingsButton.png"))); // NOI18N
        SettingsButton.setAlignmentY(1.0F);
        SettingsButton.setBorder(null);
        SettingsButton.setContentAreaFilled(false);
        SettingsButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SettingsButtonGray.png"))); // NOI18N
        SettingsButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SettingsButtonGray.png"))); // NOI18N
        SettingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingsButtonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SettingsButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SettingsButtonMouseReleased(evt);
            }
        });
        SettingsButton.addActionListener(this::SettingsButtonActionPerformed);
        TopButtons.add(SettingsButton);
        TopButtons.add(filler2);

        Home.add(TopButtons);
        Home.add(SecondSpace);

        CenterButtons.setOpaque(false);
        CenterButtons.setLayout(new javax.swing.BoxLayout(CenterButtons, javax.swing.BoxLayout.X_AXIS));

        PlayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PlayButton.png"))); // NOI18N
        PlayButton.setBorder(null);
        PlayButton.setContentAreaFilled(false);
        PlayButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PlayButtonGray.png"))); // NOI18N
        PlayButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PlayButtonGray.png"))); // NOI18N
        PlayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PlayButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PlayButtonMouseReleased(evt);
            }
        });
        PlayButton.addActionListener(this::PlayButtonActionPerformed);
        CenterButtons.add(PlayButton);
        CenterButtons.add(TirdSpace);

        ScoreButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ScoreButton.png"))); // NOI18N
        ScoreButton.setAlignmentY(0.525F);
        ScoreButton.setBorder(null);
        ScoreButton.setContentAreaFilled(false);
        ScoreButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ScoreButtonGray.png"))); // NOI18N
        ScoreButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ScoreButtonGray.png"))); // NOI18N
        ScoreButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ScoreButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ScoreButtonMouseReleased(evt);
            }
        });
        ScoreButton.addActionListener(this::ScoreButtonActionPerformed);
        CenterButtons.add(ScoreButton);

        Home.add(CenterButtons);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMousePressed
        ExitButton.setLocation(ExitButton.getX(), ExitButton.getY() + 2);
    }//GEN-LAST:event_ExitButtonMousePressed

    private void ExitButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseReleased
        ExitButton.setLocation(ExitButton.getX(), ExitButton.getY() - 2);
    }//GEN-LAST:event_ExitButtonMouseReleased

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void SettingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SettingsButtonMouseClicked

    private void SettingsButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsButtonMousePressed
        SettingsButton.setLocation(SettingsButton.getX(), SettingsButton.getY() + 2);
    }//GEN-LAST:event_SettingsButtonMousePressed

    private void SettingsButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsButtonMouseReleased
        SettingsButton.setLocation(SettingsButton.getX(), SettingsButton.getY() - 2);
    }//GEN-LAST:event_SettingsButtonMouseReleased

    private void PlayButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayButtonMousePressed
        PlayButton.setLocation(PlayButton.getX(), PlayButton.getY() + 2);
    }//GEN-LAST:event_PlayButtonMousePressed

    private void PlayButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayButtonMouseReleased
        PlayButton.setLocation(PlayButton.getX(), PlayButton.getY() - 2);
    }//GEN-LAST:event_PlayButtonMouseReleased

    private void PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayButtonActionPerformed
        new Instructive().setVisible(true);
    }//GEN-LAST:event_PlayButtonActionPerformed

    private void ScoreButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScoreButtonMousePressed
        ScoreButton.setLocation(ScoreButton.getX(), ScoreButton.getY() + 2);
    }//GEN-LAST:event_ScoreButtonMousePressed

    private void ScoreButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScoreButtonMouseReleased
        ScoreButton.setLocation(ScoreButton.getX(), ScoreButton.getY() - 2);
    }//GEN-LAST:event_ScoreButtonMouseReleased

    private void ScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoreButtonActionPerformed

    }//GEN-LAST:event_ScoreButtonActionPerformed

    private void SettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsButtonActionPerformed
        new Settings().setVisible(true);
    }//GEN-LAST:event_SettingsButtonActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Home().setVisible(true);
            } catch (Exception ex) {
                System.getLogger(Home.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CenterButtons;
    private javax.swing.JButton ExitButton;
    private javax.swing.Box.Filler FirstSpacer;
    private javax.swing.JPanel Home;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton PlayButton;
    private javax.swing.JButton ScoreButton;
    private javax.swing.Box.Filler SecondSpace;
    private javax.swing.JButton SettingsButton;
    private javax.swing.Box.Filler SpacerTop;
    private javax.swing.Box.Filler SpacerTop1;
    private javax.swing.Box.Filler TirdSpace;
    private javax.swing.JPanel TopButtons;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    // End of variables declaration//GEN-END:variables
private void configureWindow() {
    Background bg = new Background();
    setUndecorated(true);
    initComponents();
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    bg.setLayout(new java.awt.BorderLayout());
    bg.add(Home);
    setContentPane(bg);
    {
}
}
}
