package assignment;

import javax.swing.*;
import java.awt.*;

public class frmGioiThieu extends JFrame {

    private JPanel mainPanel;
    private JLabel lblClassName, lblCourseName, lblAuthor, lblJavaLogo;

    public frmGioiThieu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        mainPanel = new JPanel();
        lblClassName = new JLabel();
        lblCourseName = new JLabel();
        lblAuthor = new JLabel();
        lblJavaLogo = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        mainPanel.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblClassName.setFont(new Font("Tahoma", Font.BOLD, 36));
        lblClassName.setForeground(SystemColor.activeCaption);
        lblClassName.setText("Lớp: OOP-N01");

        lblCourseName.setFont(new Font("Tahoma", Font.BOLD, 36));
        lblCourseName.setForeground(SystemColor.activeCaption);
        lblCourseName.setText("Lập trình Java");

        lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 36));
        lblAuthor.setForeground(SystemColor.activeCaption);
        lblAuthor.setText("Hoàng Hà-Nguyên Thắng");

        lblJavaLogo.setIcon(new ImageIcon(getClass().getResource("/assignment/image/java.png"))); 
        
        GroupLayout panelLayout = new GroupLayout(mainPanel);
        mainPanel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(lblJavaLogo))
                .addGroup(panelLayout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(lblAuthor))
                .addGroup(panelLayout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(lblClassName))
                .addGroup(panelLayout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(lblCourseName))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblJavaLogo)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblAuthor)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblClassName)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblCourseName)
                    .addContainerGap(20, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(mainPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        EventQueue.invokeLater(() -> new frmGioiThieu().setVisible(true));
    }
}
