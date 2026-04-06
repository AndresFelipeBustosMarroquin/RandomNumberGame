package Panels;

import java.awt.HeadlessException;
import java.time.LocalDate;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import numberrandomgame.Background;
import numberrandomgame.Drive;

public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());
    Background bg = new Background();
    public Login(){
        configureWindow();
Day.addKeyListener(new java.awt.event.KeyAdapter() {
    @Override
    public void keyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || Day.getText().length() >= 2) {
            evt.consume();
        }
    }
});

Month.addKeyListener(new java.awt.event.KeyAdapter() {
    @Override
    public void keyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || Month.getText().length() >= 2) {
            evt.consume();
        }
    }
});

Year.addKeyListener(new java.awt.event.KeyAdapter() {
    @Override
    public void keyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || Year.getText().length() >= 4) {
            evt.consume();
        }
    }
});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Instructive = new javax.swing.JPanel();
        Tutorial = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        NameText = new javax.swing.JLabel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 25), new java.awt.Dimension(0, 25), new java.awt.Dimension(32767, 25));
        UserName = new javax.swing.JTextField();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        NameText1 = new javax.swing.JLabel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 25), new java.awt.Dimension(0, 25), new java.awt.Dimension(32767, 25));
        Date = new javax.swing.JPanel();
        DayText = new javax.swing.JLabel();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0));
        Day = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0));
        MonthText = new javax.swing.JLabel();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0));
        Month = new javax.swing.JTextField();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(250, 0), new java.awt.Dimension(250, 0), new java.awt.Dimension(100, 0));
        MonthText1 = new javax.swing.JLabel();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0));
        Year = new javax.swing.JTextField();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        Buttons = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        ExitButton = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        NextButton = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Frame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Instructive.setOpaque(false);
        Instructive.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tutorial.setMaximumSize(new java.awt.Dimension(1400, 900));
        Tutorial.setOpaque(false);
        Tutorial.setLayout(new javax.swing.BoxLayout(Tutorial, javax.swing.BoxLayout.Y_AXIS));

        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Data.png"))); // NOI18N
        Title.setAlignmentX(0.5F);
        Title.setAlignmentY(0.0F);
        Tutorial.add(Title);

        NameText.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        NameText.setText("Nombre");
        NameText.setAlignmentX(0.5F);
        Tutorial.add(NameText);
        Tutorial.add(filler9);

        UserName.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        UserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        UserName.setMaximumSize(new java.awt.Dimension(600, 150));
        UserName.addActionListener(this::UserNameActionPerformed);
        Tutorial.add(UserName);
        Tutorial.add(filler7);

        NameText1.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        NameText1.setText("Fecha de nacimiento");
        NameText1.setAlignmentX(0.5F);
        Tutorial.add(NameText1);
        Tutorial.add(filler8);

        Date.setOpaque(false);
        Date.setLayout(new javax.swing.BoxLayout(Date, javax.swing.BoxLayout.LINE_AXIS));

        DayText.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        DayText.setText("Dia");
        DayText.setAlignmentX(0.5F);
        Date.add(DayText);
        Date.add(filler11);

        Day.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        Day.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Day.setAlignmentX(1.0F);
        Day.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        Day.setMaximumSize(new java.awt.Dimension(125, 100));
        Day.addActionListener(this::DayActionPerformed);
        Day.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DayKeyTyped(evt);
            }
        });
        Date.add(Day);
        Date.add(filler1);

        MonthText.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        MonthText.setText("Mes");
        MonthText.setAlignmentX(0.5F);
        Date.add(MonthText);
        Date.add(filler10);

        Month.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        Month.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Month.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        Month.setMaximumSize(new java.awt.Dimension(125, 100));
        Month.addActionListener(this::MonthActionPerformed);
        Date.add(Month);
        Date.add(filler5);

        MonthText1.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        MonthText1.setText("Año");
        MonthText1.setAlignmentX(0.5F);
        Date.add(MonthText1);
        Date.add(filler12);

        Year.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        Year.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Year.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        Year.setMaximumSize(new java.awt.Dimension(193, 100));
        Year.addActionListener(this::YearActionPerformed);
        Date.add(Year);

        Tutorial.add(Date);
        Tutorial.add(filler6);

        Buttons.setMaximumSize(new java.awt.Dimension(66284, 200));
        Buttons.setOpaque(false);
        Buttons.setLayout(new javax.swing.BoxLayout(Buttons, javax.swing.BoxLayout.LINE_AXIS));
        Buttons.add(filler2);

        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExitButton.png"))); // NOI18N
        ExitButton.setAlignmentY(0.4F);
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
        Buttons.add(ExitButton);
        Buttons.add(filler3);

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
        Buttons.add(filler4);

        Tutorial.add(Buttons);

        Instructive.add(Tutorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, -1, 1360, 840));

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

    private void NextButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMousePressed
        NextButton.setLocation(NextButton.getX(), NextButton.getY() + 2);
    }//GEN-LAST:event_NextButtonMousePressed

    private void NextButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseReleased
        NextButton.setLocation(NextButton.getX(), NextButton.getY() - 2);
    }//GEN-LAST:event_NextButtonMouseReleased

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        validateData();
    }//GEN-LAST:event_NextButtonActionPerformed

    private void ExitButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMousePressed
        ExitButton.setLocation(ExitButton.getX(), ExitButton.getY() + 2);
    }//GEN-LAST:event_ExitButtonMousePressed

    private void ExitButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseReleased
        ExitButton.setLocation(ExitButton.getX(), ExitButton.getY() - 2);
    }//GEN-LAST:event_ExitButtonMouseReleased

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        new Results().setVisible(true);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void DayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DayActionPerformed

    }//GEN-LAST:event_DayActionPerformed

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

    private void MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MonthActionPerformed

    private void YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearActionPerformed

    private void DayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DayKeyTyped
       
    }//GEN-LAST:event_DayKeyTyped

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
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Buttons;
    private javax.swing.JPanel Date;
    private javax.swing.JTextField Day;
    private javax.swing.JLabel DayText;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel Frame;
    private javax.swing.JPanel Instructive;
    private javax.swing.JTextField Month;
    private javax.swing.JLabel MonthText;
    private javax.swing.JLabel MonthText1;
    private javax.swing.JLabel NameText;
    private javax.swing.JLabel NameText1;
    private javax.swing.JButton NextButton;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel Tutorial;
    private javax.swing.JTextField UserName;
    private javax.swing.JTextField Year;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    // End of variables declaration//GEN-END:variables
private void validateData() {
    try {
        int day = Integer.parseInt(Day.getText());
        int month = Integer.parseInt(Month.getText());
        int year = Integer.parseInt(Year.getText());
        String name = UserName.getText();

        int currentYear = java.time.LocalDate.now().getYear();

        if (year < 1 || year > currentYear) {
            JOptionPane.showMessageDialog(this, "Año inválido");
            return;
        }

        if (month < 1 || month > 12) {
            JOptionPane.showMessageDialog(this, "Mes inválido");
            return;
        }

        int maxDays = 31;

        switch (month) {
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    maxDays = 29;
                } else {
                    maxDays = 28;
                }
                break;
        }

        if (day < 1 || day > maxDays) {
            JOptionPane.showMessageDialog(this, "Día inválido");
            return;
        }
        
        if ("".equals(name)){
            JOptionPane.showMessageDialog(this, "Nombre inválido");
            return;
        }
        
        Drive.isSaved = true;
        Drive.name = name;
        Drive.date = LocalDate.of(year, month, day);
        new Results().setVisible(true);

    } catch (HeadlessException | NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Completa todos los campos correctamente");
    }
}
private void configureWindow() {
    setUndecorated(true);
    initComponents();
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    bg.setLayout(new java.awt.BorderLayout());
    bg.add(Instructive);
    setContentPane(bg);
}
}
