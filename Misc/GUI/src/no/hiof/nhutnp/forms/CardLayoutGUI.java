package no.hiof.nhutnp.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutGUI extends JFrame{
    private JPanel mainPanel;
    private JPanel cardLayoutPanel;
    private JPanel page1Panel;
    private JPanel page2Panel;
    private JButton navigateToPage1Button;
    private JButton navigateToPage2Button;

    public CardLayoutGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        navigateToPage2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel.removeAll();
                cardLayoutPanel.add(page2Panel);
                cardLayoutPanel.repaint();
                cardLayoutPanel.revalidate();
            }
        });
        navigateToPage1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel.removeAll();
                cardLayoutPanel.add(page1Panel);
                cardLayoutPanel.repaint();
                cardLayoutPanel.revalidate();
            }
        });
    }
}
