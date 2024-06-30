/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POS;

/**
 *
 * @author Tomamac
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TestFrame extends JFrame {
    private JDialog secondFrame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TestFrame().setVisible(true);
        });
    }

    public TestFrame() {
        super("Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());
        initializeSecondFrame();

        JButton button = new JButton("Show \"Second Frame\".");
        button.addActionListener(e -> {
            secondFrame.setVisible(true);
        });
        getContentPane().add(button);
        setSize(300, 300);
        JButton buttonn = new JButton("<html><div text-align:center>View Config File" + "<br/>Be careful of any changes made</div></html>");
        getContentPane().add(buttonn);
    }

    private void initializeSecondFrame() {
        secondFrame = new JDialog(this);
        // When "X" button is presed, dialog does nothing.
        secondFrame.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        secondFrame.getContentPane().setLayout(new FlowLayout());
        JTextField textField = new JTextField(10);
        secondFrame.getContentPane().add(textField);
        secondFrame.setSize(300, 300);
    }
}
