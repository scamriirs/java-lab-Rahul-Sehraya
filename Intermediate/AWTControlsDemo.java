import java.awt.*;
import java.awt.event.*;

public class AWTControlsDemo extends Frame implements ActionListener {

    Label statusLabel;
    Button btnHello;
    Button btnReset;
    Button btnExit;

    public AWTControlsDemo() {
        super("AWT: Labels & Buttons Demo");

        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        statusLabel = new Label("Press a button...", Label.CENTER);
        statusLabel.setPreferredSize(new Dimension(300, 30));

        btnHello = new Button("Say Hello");
        btnReset = new Button("Reset");
        btnExit  = new Button("Exit");

        btnHello.addActionListener(this);
        btnReset.addActionListener(this);
        btnExit.addActionListener(this);

        add(statusLabel);
        add(btnHello);
        add(btnReset);
        add(btnExit);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        setSize(380, 160);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == btnHello) {
            statusLabel.setText("Hello! Welcome to AWT controls demo.");
        } else if (src == btnReset) {
            statusLabel.setText("Press a button...");
        } else if (src == btnExit) {
            dispose();
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            AWTControlsDemo demo = new AWTControlsDemo();
            demo.setVisible(true);
        });
    }
}
