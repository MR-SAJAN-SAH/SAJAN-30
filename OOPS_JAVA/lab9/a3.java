package lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ColorChangerApp extends JFrame {
    private JPanel colorPanel;
    private String[] colorNames = {"Red", "Green", "Blue", "Yellow"};

    public ColorChangerApp() {
        setTitle("Color Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200); // Fixed window size
        setResizable(false); // Prevent resizing
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create components
        JLabel selectLabel = new JLabel("Select a color:");
        JComboBox<String> colorListBox = new JComboBox<>(colorNames);
        JButton changeColorButton = new JButton("Change Color");
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);

        // Add action listener to the button
        changeColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = (String) colorListBox.getSelectedItem();
                changePanelColor(selectedColor);
            }
        });

        // Create panel for label, list box, and button
        JPanel controlPanel = new JPanel(new FlowLayout());
        controlPanel.add(selectLabel);
        controlPanel.add(colorListBox);
        controlPanel.add(changeColorButton);

        // Add components to the frame
        setLayout(new BorderLayout());
        add(controlPanel, BorderLayout.NORTH);
        add(colorPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void changePanelColor(String colorName) {
        Color color;
        switch (colorName.toLowerCase()) {
            case "red":
                color = Color.RED;
                break;
            case "green":
                color = Color.GREEN;
                break;
            case "blue":
                color = Color.BLUE;
                break;
            case "yellow":
                color = Color.YELLOW;
                break;
            default:
                color = Color.WHITE;
                break;
        }
        colorPanel.setBackground(color);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ColorChangerApp::new);
    }
}

