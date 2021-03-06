package no.hiof.nhutnp.forms;

import no.hiof.nhutnp.models.Person;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreatePersonGUI extends JFrame {

    private JPanel mainPanel;
    private JTextField fullNameField;
    private JTextField ageField;
    private JButton createPersonButton;
    private JLabel outputLabel;
    private JList<Person> personJList;
    private JButton editPersonButton;
    private JButton deletePersonButton;

    private DefaultListModel<Person> personListModel = new DefaultListModel<>();

    public CreatePersonGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        personJList.setModel(personListModel);

        createPersonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    String fullName = fullNameField.getText();
                    int age = Integer.parseInt(ageField.getText());

                    Person createdPerson = new Person(fullName, age);

                    outputLabel.setText(createdPerson.toString());

                    personListModel.addElement(createdPerson);

                }catch(NumberFormatException e1){
                    outputLabel.setText("Enter a number");
                }
            }
        });
        editPersonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Person editPerson = personJList.getSelectedValue();
                    String fullName = fullNameField.getText();
                    int age = Integer.parseInt(ageField.getText());

                    Person selectedPerson = personJList.getSelectedValue();

                    selectedPerson.setFullName(fullName);
                    selectedPerson.setAge(age);

                    personJList.updateUI();
                } catch (NullPointerException n1)
                {
                    JFrame jFrame = new JFrame();
                    JOptionPane.showMessageDialog(jFrame, "NO object selected!");
                } catch(NumberFormatException n1){
                    JFrame jFrame = new JFrame();
                    JOptionPane.showMessageDialog(jFrame, "You must enter an int value for Age!");
                }
                }
        });
        deletePersonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Person selectedPerson = personJList.getSelectedValue();
                int selectedIndex = personJList.getSelectedIndex();

                personListModel.remove(selectedIndex);
                personJList.updateUI();
            }
        });

        personJList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                Person selectedPerson = personJList.getSelectedValue();

                fullNameField.setText(selectedPerson.getFullName());
                ageField.setText(Integer.toString(selectedPerson.getAge()));
                outputLabel.setText(selectedPerson.toString());
            }catch (NullPointerException n1) {
                    System.out.println("");
                }
                }
        });
    }
}
