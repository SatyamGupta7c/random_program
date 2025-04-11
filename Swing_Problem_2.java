import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing_Problem_2 {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("User Form");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        // Create labels and text fields
        JLabel firstNameLabel = new JLabel("First Name:");
        JTextField firstNameField = new JTextField();

        JLabel lastNameLabel = new JLabel("Last Name:");
        JTextField lastNameField = new JTextField();

        JLabel dobLabel = new JLabel("Date of Birth (DD/MM/YYYY):");
        JTextField dobField = new JTextField();

        // Create a submit button
        JButton submitButton = new JButton("Submit");

        // Label to show message
        JLabel messageLabel = new JLabel("");

        // Action listener for submit button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String dob = dobField.getText();

                messageLabel.setText("Name: " + firstName + " " + lastName + ", DOB: " + dob);
            }
        });

        // Add components to frame
        frame.add(firstNameLabel);
        frame.add(firstNameField);

        frame.add(lastNameLabel);
        frame.add(lastNameField);

        frame.add(dobLabel);
        frame.add(dobField);

        frame.add(new JLabel()); // empty cell
        frame.add(submitButton);

        frame.add(new JLabel()); // empty cell
        frame.add(messageLabel);

        frame.setVisible(true);
    }
}
