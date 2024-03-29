package lab10;

import java.awt.*;
import java.awt.event.*;

public class a3 extends Frame implements ActionListener {
    private Label timeLabel;
    private Button startButton, stopButton, resetButton;
    private long startTime;
    private boolean running;

    public a3() {
        setSize(300, 150);
        setTitle("Stopwatch");
        setLayout(new FlowLayout());

        timeLabel = new Label("00:00:00");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(timeLabel);

        startButton = new Button("Start");
        startButton.addActionListener(this);
        add(startButton);

        stopButton = new Button("Stop");
        stopButton.addActionListener(this);
        add(stopButton);

        resetButton = new Button("Reset");
        resetButton.addActionListener(this);
        add(resetButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (!running) {
                startTime = System.currentTimeMillis();
                running = true;
                new Thread(() -> {
                    while (running) {
                        long elapsedTime = System.currentTimeMillis() - startTime;
                        updateTimer(elapsedTime);
                        try {
                            Thread.sleep(1000); // Update every second
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                }).start();
            }
        } else if (e.getSource() == stopButton) {
            running = false;
        } else if (e.getSource() == resetButton) {
            running = false;
            updateTimer(0);
        }
    }

    private void updateTimer(long elapsedTime) {
        long seconds = (elapsedTime / 1000) % 60;
        long minutes = (elapsedTime / (1000 * 60)) % 60;
        long hours = (elapsedTime / (1000 * 60 * 60)) % 24;
        String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        timeLabel.setText(time);
    }

    public static void main(String[] args) {
        new a3();
    }
}
