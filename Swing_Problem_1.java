import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing_Problem_1 {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Button Frame Example");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create a label
        JLabel label = new JLabel("Press a button");

        // Create buttons
        JButton yesButton = new JButton("Yes");
        JButton noButton = new JButton("No");
        JButton closeButton = new JButton("Close");

        // Add action listeners
        yesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Yes is pressed");
            }
        });

        noButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button No is pressed");
            }
        });

        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Closes the frame
            }
        });

        // Add components to the frame
        frame.add(yesButton);
        frame.add(noButton);
        frame.add(closeButton);
        frame.add(label);

        // Set frame visibility
        frame.setVisible(true);
    }
}
