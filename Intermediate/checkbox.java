import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class checkbox extends Frame implements ItemListener {

    private final Checkbox reading;
    private final Checkbox traveling;
    private final Checkbox gaming;
    private final CheckboxGroup genderGroup;
    private final Checkbox male;
    private final Checkbox female;
    private final Label hobbyStatus;
    private final Label genderStatus;

    public checkbox() {
        super("AWT Checkbox Demo");
        setSize(400, 250);
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        setBackground(new Color(245, 245, 245));

        add(new Label("Select hobbies:"));
        reading = new Checkbox("Reading");
        traveling = new Checkbox("Traveling");
        gaming = new Checkbox("Gaming");
        reading.addItemListener(this);
        traveling.addItemListener(this);
        gaming.addItemListener(this);
        add(reading);
        add(traveling);
        add(gaming);

        hobbyStatus = new Label("No hobbies selected");
        add(hobbyStatus);

        add(new Label("Select gender:"));
        genderGroup = new CheckboxGroup();
        male = new Checkbox("Male", genderGroup, true);
        female = new Checkbox("Female", genderGroup, false);
        male.addItemListener(this);
        female.addItemListener(this);
        add(male);
        add(female);

        genderStatus = new Label("Gender: Male");
        add(genderStatus);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        updateHobbyStatus();
        updateGenderStatus();
    }

    private void updateHobbyStatus() {
        StringBuilder sb = new StringBuilder("Hobbies: ");
        boolean hasSelection = false;

        if (reading.getState()) {
            sb.append("Reading ");
            hasSelection = true;
        }
        if (traveling.getState()) {
            sb.append("Traveling ");
            hasSelection = true;
        }
        if (gaming.getState()) {
            sb.append("Gaming ");
            hasSelection = true;
        }

        hobbyStatus.setText(hasSelection ? sb.toString().trim() : "No hobbies selected");
    }

    private void updateGenderStatus() {
        Checkbox selected = genderGroup.getSelectedCheckbox();
        genderStatus.setText("Gender: " + (selected != null ? selected.getLabel() : "Not selected"));
    }

    public static void main(String[] args) {
        new checkbox();
    }
}
