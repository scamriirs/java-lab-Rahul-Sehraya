import java.awt.*;
import java.awt.event.*;

public class ListScroll extends Frame implements ItemListener, AdjustmentListener, WindowListener {

    private final List colorList;
    private final Scrollbar sizeScrollbar;
    private final Label previewLabel;
    private final Panel previewPanel;

    public ListScroll() {
        super("AWT List & Scrollbar Demo");
        setSize(400, 300);
        setLayout(new BorderLayout(10, 10));
        addWindowListener(this);

        colorList = new List(6, false);
        String[] colors = {"Red", "Green", "Blue", "Orange", "Magenta", "Cyan", "Gray", "Black"};
        for (String color : colors) {
            colorList.add(color);
        }
        colorList.addItemListener(this);
        add(colorList, BorderLayout.WEST);

        previewPanel = new Panel(new GridBagLayout());
        previewLabel = new Label("Select a color & size");
        previewLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        previewPanel.add(previewLabel);
        add(previewPanel, BorderLayout.CENTER);

        sizeScrollbar = new Scrollbar(Scrollbar.VERTICAL, 16, 1, 10, 40);
        sizeScrollbar.addAdjustmentListener(this);
        add(sizeScrollbar, BorderLayout.EAST);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String selected = colorList.getSelectedItem();
        if (selected != null) {
            previewPanel.setBackground(getColorFromName(selected));
            previewLabel.setText("Color: " + selected);
        }
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        int fontSize = e.getValue();
        previewLabel.setFont(new Font("SansSerif", Font.BOLD, fontSize));
        previewLabel.setText(previewLabel.getText().split("\\|")[0] + " | Size: " + fontSize);
    }

    private Color getColorFromName(String name) {
        switch (name) {
            case "Red":
                return Color.RED;
            case "Green":
                return Color.GREEN;
            case "Blue":
                return Color.BLUE;
            case "Orange":
                return Color.ORANGE;
            case "Magenta":
                return Color.MAGENTA;
            case "Cyan":
                return Color.CYAN;
            case "Gray":
                return Color.GRAY;
            case "Black":
                return Color.BLACK;
            default:
                return getBackground();
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            ListScroll demo = new ListScroll();
            demo.setVisible(true);
        });
    }
}

