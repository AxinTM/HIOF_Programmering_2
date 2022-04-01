package no.hiof.nhutnp.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoonWeightGUI extends JFrame{

    private JPanel mainPanel;
    private JTextField weightOnEarthField;
    private JButton convertButton;
    private JLabel weightOnTheMoonLabel;

    public MoonWeightGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Button pressed!");

                try {
                    String weightOnEarthText = weightOnEarthField.getText();
                    //System.out.println(weightOnEarthText);
                    double weightOnEarth = Double.parseDouble(weightOnEarthText);


                    double weightOnTheMoon = weightOnEarth * 0.165;
                    //System.out.println(weightOnTheMoon);
                    String something = Double.toString(weightOnTheMoon);
                    weightOnTheMoonLabel.setText(something);
                }catch (NumberFormatException numberFormatException){
                    weightOnTheMoonLabel.setText("Enter a Number");
                }

            }
        });
    }
}
