
package lab9;
import javax.swing.*;
import java.awt.*;

class RegistrationForm extends JFrame {
    public RegistrationForm() {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(7, 2, 5, 5));

        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel addressLabel = new JLabel("Address:");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel skillsLabel = new JLabel("Skills:");
        JLabel agreementLabel = new JLabel("Agree to terms:");
        JLabel imageLabel = new JLabel("Profile Image:");

        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JTextArea addressArea = new JTextArea(3, 20);
        JCheckBox agreeCheckBox = new JCheckBox();

        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        JButton submitButton = new JButton("Submit");
        ImageIcon profileImage = new ImageIcon("profile.png");
        JLabel image = new JLabel(profileImage);

        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(emailLabel);
        formPanel.add(emailField);
        formPanel.add(addressLabel);
        formPanel.add(new JScrollPane(addressArea));
        formPanel.add(genderLabel);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        formPanel.add(genderPanel);
        formPanel.add(skillsLabel);
        formPanel.add(new JTextField());
        formPanel.add(agreementLabel);
        formPanel.add(agreeCheckBox);
        formPanel.add(imageLabel);
        formPanel.add(image);

        add(formPanel, BorderLayout.CENTER);
        add(submitButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RegistrationForm());
    }
}


