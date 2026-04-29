package Panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.text.DocumentFilter;
import numberrandomgame.Background;
import numberrandomgame.Configuration;
import numberrandomgame.Drive;

public class Game extends javax.swing.JFrame {
    ImageIcon iconTrue = new ImageIcon(getClass().getResource("/Images/True.png"));
    ImageIcon iconFalse = new ImageIcon(getClass().getResource("/Images/False.png"));
    ImageIcon iconTrueGray = new ImageIcon(getClass().getResource("/Images/TrueGray.png"));
    ImageIcon iconFalseGray = new ImageIcon(getClass().getResource("/Images/FalseGray.png"));
    ImageIcon heartGray = new ImageIcon(getClass().getResource("/Images/HeartGray.png"));
    int timeForQuestion = Configuration.timeForQuestion;
    int timeGame = 0;
    int level = 0;
    int heart = Configuration.heart;
    Timer contador = new Timer(1000, null);
    Timer timerGame = new Timer(1000, null);
    Background bg = new Background(); 
    String numberSystem = "";
    int fails = 0;
    
    public Game() {
        configureWindow();
        Drive.clean();
        configureScroll();
        timerTotal();
        levelChangue();
        switch (Configuration.heart) {
        case 4 -> {
            Heart1.setIcon(heartGray);
            Heart1.setVisible(true);
            }

        case 3 -> {
            Heart1.setIcon(heartGray);
            Heart1.setVisible(true);
            Heart2.setIcon(heartGray);
            Heart2.setVisible(true);
            }

        case 2 -> {
            Heart1.setIcon(heartGray);
            Heart1.setVisible(true);
            Heart2.setIcon(heartGray);
            Heart2.setVisible(true);
            Heart3.setIcon(heartGray);
            Heart3.setVisible(true);
            
            }

        case 1 -> {
            Heart1.setIcon(heartGray);
            Heart1.setVisible(true);
            Heart2.setIcon(heartGray);
            Heart2.setVisible(true);
            Heart3.setIcon(heartGray);
            Heart3.setVisible(true);
            Heart4.setIcon(heartGray);
            Heart4.setVisible(true);
            
        }
    }
        
        ((javax.swing.text.PlainDocument) UserText.getDocument()).setDocumentFilter(new javax.swing.text.DocumentFilter() {
    @Override
    public void insertString(DocumentFilter.FilterBypass fb,int off,String str,javax.swing.text.AttributeSet a)throws javax.swing.text.BadLocationException{
        if(str.matches("\\d*")) {
            super.insertString(fb,off,str,a);
        }
    }
    @Override
    public void replace(DocumentFilter.FilterBypass fb,int off,int len,String str,javax.swing.text.AttributeSet a)throws javax.swing.text.BadLocationException{
        if(str.matches("\\d*")) { 
            super.replace(fb,off,len,str,a);
        }
    }
}); 
        randomNumber(Configuration.increment);
        Number.setText(numberSystem);
        TimerText.setText("Tiempo: " + String.valueOf(timeForQuestion));
        timer(
            () -> {
                TimerText.setText("Tiempo: " + String.valueOf(timeForQuestion));
            },
            () -> {
                Number.setText("? - ? - ?");
                TimerText.setText("Tiempo: ??");
                EnterNumberPanel.setVisible(true);
            },
                Configuration.timeForQuestion
        );
        
        
        javax.swing.SwingUtilities.invokeLater(() -> {
            UserText.requestFocusInWindow();
            UserText.selectAll();
        });
        EnterNumberPanel.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Game = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();
        Parameters = new javax.swing.JPanel();
        NextButtonVerify = new javax.swing.JButton();
        True = new javax.swing.JLabel();
        False = new javax.swing.JLabel();
        ValiderFrame = new javax.swing.JLabel();
        TimerText = new javax.swing.JLabel();
        LevelText = new javax.swing.JLabel();
        TimeFrame = new javax.swing.JLabel();
        LevelFrame = new javax.swing.JLabel();
        NumberPanel = new javax.swing.JPanel();
        Heart1 = new javax.swing.JLabel();
        Heart2 = new javax.swing.JLabel();
        Heart3 = new javax.swing.JLabel();
        Heart4 = new javax.swing.JLabel();
        Heart5 = new javax.swing.JLabel();
        ScrollNumber = new javax.swing.JScrollPane();
        Number = new javax.swing.JLabel();
        LevelNumberFrame = new javax.swing.JLabel();
        EnterNumberPanel = new javax.swing.JPanel();
        UserText = new javax.swing.JTextField();
        AcceptButtonUser = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        Frame1 = new javax.swing.JLabel();
        Frame2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Game.setOpaque(false);
        Game.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Game.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        Parameters.setOpaque(false);
        Parameters.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NextButtonVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AcceptButton.png"))); // NOI18N
        NextButtonVerify.setBorder(null);
        NextButtonVerify.setContentAreaFilled(false);
        NextButtonVerify.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AcceptButtonGray.png"))); // NOI18N
        NextButtonVerify.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AcceptButtonGray.png"))); // NOI18N
        NextButtonVerify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextButtonVerifyMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NextButtonVerifyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                NextButtonVerifyMouseReleased(evt);
            }
        });
        NextButtonVerify.addActionListener(this::NextButtonVerifyActionPerformed);
        Parameters.add(NextButtonVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 410, 320, 130));

        True.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TrueGray.png"))); // NOI18N
        Parameters.add(True, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 350, -1, -1));

        False.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FalseGray.png"))); // NOI18N
        Parameters.add(False, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 340, -1, -1));

        ValiderFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrameSimple.png"))); // NOI18N
        ValiderFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ValiderFrameMousePressed(evt);
            }
        });
        Parameters.add(ValiderFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 110, -1, 560));

        TimerText.setBackground(new java.awt.Color(255, 255, 255));
        TimerText.setFont(new java.awt.Font("Impact", 0, 45)); // NOI18N
        TimerText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimerText.setText("Tiempo:  ??");
        TimerText.setAutoscrolls(true);
        Parameters.add(TimerText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1123, 240, 290, 70));

        LevelText.setBackground(new java.awt.Color(255, 255, 255));
        LevelText.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        LevelText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LevelText.setText("Nivel:  ??");
        LevelText.setAutoscrolls(true);
        Parameters.add(LevelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 130, 290, -1));

        TimeFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrameSimple.png"))); // NOI18N
        Parameters.add(TimeFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 220, -1, -1));

        LevelFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrameSimple.png"))); // NOI18N
        Parameters.add(LevelFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 110, -1, -1));

        Game.add(Parameters, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1180));

        NumberPanel.setOpaque(false);
        NumberPanel.setPreferredSize(new java.awt.Dimension(900, 228));
        NumberPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Heart1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Heart.png"))); // NOI18N
        NumberPanel.add(Heart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 90, 90));

        Heart2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Heart.png"))); // NOI18N
        NumberPanel.add(Heart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 90, 90));

        Heart3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Heart.png"))); // NOI18N
        NumberPanel.add(Heart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 90, 90));

        Heart4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Heart.png"))); // NOI18N
        NumberPanel.add(Heart4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 90, 90));

        Heart5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Heart.png"))); // NOI18N
        NumberPanel.add(Heart5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 90, 90));

        ScrollNumber.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ScrollNumber.setOpaque(false);

        Number.setBackground(new java.awt.Color(255, 255, 255));
        Number.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        Number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Number.setText("???");
        Number.setAutoscrolls(true);
        ScrollNumber.setViewportView(Number);

        NumberPanel.add(ScrollNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 680, 90));

        LevelNumberFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrameCombo.png"))); // NOI18N
        NumberPanel.add(LevelNumberFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        Game.add(NumberPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1030, 690));

        EnterNumberPanel.setOpaque(false);
        EnterNumberPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserText.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        UserText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        UserText.addActionListener(this::UserTextActionPerformed);
        EnterNumberPanel.add(UserText, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, 630, 100));

        AcceptButtonUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AcceptButton.png"))); // NOI18N
        AcceptButtonUser.setBorder(null);
        AcceptButtonUser.setContentAreaFilled(false);
        AcceptButtonUser.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AcceptButtonGray.png"))); // NOI18N
        AcceptButtonUser.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AcceptButtonGray.png"))); // NOI18N
        AcceptButtonUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcceptButtonUserMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AcceptButtonUserMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AcceptButtonUserMouseReleased(evt);
            }
        });
        AcceptButtonUser.addActionListener(this::AcceptButtonUserActionPerformed);
        EnterNumberPanel.add(AcceptButtonUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 746, 310, 110));

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TextEnterNumber.png"))); // NOI18N
        Title.setAutoscrolls(true);
        EnterNumberPanel.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 650, 140));

        Frame1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MediumFrameTool.png"))); // NOI18N
        EnterNumberPanel.add(Frame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 770, 480));

        Frame2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MediumFrame.png"))); // NOI18N
        EnterNumberPanel.add(Frame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 390, 480));

        Game.add(EnterNumberPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Game, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Game, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTextActionPerformed
        EnterNumberPanel.setVisible(false);
        AcceptButtonUser.setVisible(false);
        NextButtonVerify.setVisible(true);
        enterNumber();
    }//GEN-LAST:event_UserTextActionPerformed

    private void ExitButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMousePressed
        ExitButton.setLocation(ExitButton.getX(), ExitButton.getY() + 2);
    }//GEN-LAST:event_ExitButtonMousePressed

    private void ExitButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseReleased
        ExitButton.setLocation(ExitButton.getX(), ExitButton.getY() - 2);
    }//GEN-LAST:event_ExitButtonMouseReleased

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        try {
            new Home().setVisible(true);
        } catch (Exception ex) {
            System.getLogger(Game.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void AcceptButtonUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcceptButtonUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AcceptButtonUserMouseClicked

    private void AcceptButtonUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcceptButtonUserMousePressed
        AcceptButtonUser.setLocation(AcceptButtonUser.getX(), AcceptButtonUser.getY() + 2);
    }//GEN-LAST:event_AcceptButtonUserMousePressed

    private void AcceptButtonUserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcceptButtonUserMouseReleased
        AcceptButtonUser.setLocation(AcceptButtonUser.getX(), AcceptButtonUser.getY() - 2);
    }//GEN-LAST:event_AcceptButtonUserMouseReleased

    private void AcceptButtonUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptButtonUserActionPerformed
        EnterNumberPanel.setVisible(false);
        AcceptButtonUser.setVisible(false); 
        NextButtonVerify.setVisible(true);
        enterNumber();
        
    }//GEN-LAST:event_AcceptButtonUserActionPerformed

    private void NextButtonVerifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonVerifyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NextButtonVerifyMouseClicked

    private void NextButtonVerifyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonVerifyMousePressed
        NextButtonVerify.setLocation(NextButtonVerify.getX(), NextButtonVerify.getY() + 2);
    }//GEN-LAST:event_NextButtonVerifyMousePressed

    private void NextButtonVerifyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonVerifyMouseReleased
       NextButtonVerify.setLocation(NextButtonVerify.getX(), NextButtonVerify.getY() - 2);
    }//GEN-LAST:event_NextButtonVerifyMouseReleased

    private void NextButtonVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonVerifyActionPerformed
                Number.setText("? - ? - ?");
                TimerText.setText("Tiempo: ??");
                EnterNumberPanel.setVisible(true);
                NextButtonVerify.setVisible(false);
                AcceptButtonUser.setVisible(true);
                contador.stop();
    }//GEN-LAST:event_NextButtonVerifyActionPerformed

    private void ValiderFrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValiderFrameMousePressed

    }//GEN-LAST:event_ValiderFrameMousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Game().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptButtonUser;
    private javax.swing.JPanel EnterNumberPanel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel False;
    private javax.swing.JLabel Frame1;
    private javax.swing.JLabel Frame2;
    private javax.swing.JPanel Game;
    private javax.swing.JLabel Heart1;
    private javax.swing.JLabel Heart2;
    private javax.swing.JLabel Heart3;
    private javax.swing.JLabel Heart4;
    private javax.swing.JLabel Heart5;
    private javax.swing.JLabel LevelFrame;
    private javax.swing.JLabel LevelNumberFrame;
    private javax.swing.JLabel LevelText;
    private javax.swing.JButton NextButtonVerify;
    private javax.swing.JLabel Number;
    private javax.swing.JPanel NumberPanel;
    private javax.swing.JPanel Parameters;
    private javax.swing.JScrollPane ScrollNumber;
    private javax.swing.JLabel TimeFrame;
    private javax.swing.JLabel TimerText;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel True;
    private javax.swing.JTextField UserText;
    private javax.swing.JLabel ValiderFrame;
    // End of variables declaration//GEN-END:variables
    private void timerTotal() {
    timerGame.stop();

    for (var l : timerGame.getActionListeners()) {
        timerGame.removeActionListener(l);
    }

    timerGame.addActionListener(e -> timeGame++);
    timerGame.start();
}

private void configureScroll() {
    ScrollNumber.setBorder(null);
    ScrollNumber.setViewportBorder(null);
    ScrollNumber.getViewport().setOpaque(false);

    ScrollNumber.getHorizontalScrollBar().setUI(new javax.swing.plaf.basic.BasicScrollBarUI() {

        @Override
        protected void configureScrollBarColors() {
            thumbColor = new Color(255, 120, 0);
            trackColor = new Color(0, 0, 0, 180);
        }

        @Override
        protected JButton createDecreaseButton(int orientation) {
            return createZeroButton();
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            return createZeroButton();
        }

        private JButton createZeroButton() {
            JButton btn = new JButton();
            btn.setPreferredSize(new Dimension(0, 0));
            return btn;
        }
    });
}

private void configureWindow() {
    setUndecorated(true);
    initComponents();
    setExtendedState(JFrame.MAXIMIZED_BOTH);

    bg.setLayout(new BorderLayout());
    bg.add(Game);

    setContentPane(bg);
}

private void timer(Runnable everyIteration, Runnable finish, int duration) {
    contador.stop();
    timeForQuestion = duration;

    for (var l : contador.getActionListeners()) {
        contador.removeActionListener(l);
    }
    everyIteration.run();

    contador.addActionListener(e -> {
        timeForQuestion--;
        everyIteration.run();

        if (timeForQuestion < 0) {
            finish.run();
            contador.stop();
        }
    });

    contador.start();
}

private void enterNumber() {

    boolean correct = UserText.getText().equals(numberSystem);

    if (correct) {
        True.setIcon(iconTrue);
        True.setVisible(true);

        levelChangue();
        randomNumber(Configuration.increment);
        Number.setText(numberSystem);

        timer(
            () -> TimerText.setText("Tiempo: " + timeForQuestion),
            () -> {
                Number.setText("? - ? - ?");
                TimerText.setText("Tiempo: ??");
                EnterNumberPanel.setVisible(true);
                AcceptButtonUser.setVisible(true);
                True.setIcon(iconTrueGray);
                focusInput();
            },
            Configuration.timeForQuestion
        );

        UserText.setText("");
        focusInput();

    } else {

        False.setIcon(iconFalse);
        False.setVisible(true);

        fails++;

        if (fails == Configuration.heart) {
            endGame();
            return;
        }

        Number.setText(numberSystem);

        switch (heart) {
            case 5 -> Heart1.setIcon(heartGray);
            case 4 -> Heart2.setIcon(heartGray);
            case 3 -> Heart3.setIcon(heartGray);
            case 2 -> Heart4.setIcon(heartGray);
            default -> {
                endGame();
                return;
            }
        }

        heart--;

        timer(
            () -> {},
            () -> {
                Number.setText("? - ? - ?");
                False.setIcon(iconFalseGray);
            },
            Configuration.timeForQuestion
        );

        EnterNumberPanel.setVisible(false);
        AcceptButtonUser.setVisible(false);

        timer(
            () -> TimerText.setText("Tiempo: " + timeForQuestion),
            () -> {
                Number.setText("? - ? - ?");
                TimerText.setText("Tiempo: ??");
                EnterNumberPanel.setVisible(true);
                AcceptButtonUser.setVisible(true);
                False.setIcon(iconFalseGray);
                focusInput();
            },
            Configuration.timeForQuestion
        );

        focusInput();
    }
}

private void focusInput() {
    javax.swing.SwingUtilities.invokeLater(() -> {
        UserText.requestFocusInWindow();
        UserText.selectAll();
    });
}

private void endGame() {
    Drive.timeTotal = timeGame;
    Drive.level = level;
    new Results().setVisible(true);
}

private void randomNumber(int cantidad) {
    for (int i = 0; i < cantidad; i++) {
        numberSystem += (int) (Math.random() * 10);
    }
}

private void levelChangue() {
    level++;
    LevelText.setText("Nivel: " + level);
}
}