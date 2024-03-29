package lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ColorChanger extends JFrame implements ActionListener {
    private JComboBox<Integer> redComboBox, greenComboBox, blueComboBox;
    private JButton showOutputButton;
    private JPanel colorPanel;

    public ColorChanger() {
        setTitle("Color Changer App");
        setSize(300, 150);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel dropdownPanel = new JPanel(new GridLayout(3, 2));

        JLabel redLabel = new JLabel("Red:");
        dropdownPanel.add(redLabel);

        redComboBox = new JComboBox<>();
        for (int i = 0; i <= 255; i++) {
            redComboBox.addItem(i);
        }
        dropdownPanel.add(redComboBox);

        JLabel greenLabel = new JLabel("Green:");
        dropdownPanel.add(greenLabel);

        greenComboBox = new JComboBox<>();
        for (int i = 0; i <= 255; i++) {
            greenComboBox.addItem(i);
        }
        dropdownPanel.add(greenComboBox);

        JLabel blueLabel = new JLabel("Blue:");
        dropdownPanel.add(blueLabel);

        blueComboBox = new JComboBox<>();
        for (int i = 0; i <= 255; i++) {
            blueComboBox.addItem(i);
        }
        dropdownPanel.add(blueComboBox);

        add(dropdownPanel, BorderLayout.CENTER);

        showOutputButton = new JButton("Show Output");
        showOutputButton.addActionListener(this);
        add(showOutputButton, BorderLayout.SOUTH);

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.BLACK); // Initial background color
        add(colorPanel, BorderLayout.NORTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == showOutputButton) {
            int redValue = (int) redComboBox.getSelectedItem();
            int greenValue = (int) greenComboBox.getSelectedItem();
            int blueValue = (int) blueComboBox.getSelectedItem();

            colorPanel.setBackground(new Color(redValue, greenValue, blueValue));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new lab9.ColorChanger());
    }
}
