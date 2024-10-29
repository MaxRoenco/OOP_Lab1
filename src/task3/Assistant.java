package task3;

import task1.Display;
import java.util.ArrayList;
import java.util.List;

public class Assistant {
    private String assistantName;
    private List<Display> assignedDisplays = new ArrayList<>(); // Initialize the list

    public void assignDisplay(Display d) {
        assignedDisplays.add(d);
    }

    public void assist() {
        for (int i = 0; i < assignedDisplays.size(); i++) {
            for (int j = i + 1; j < assignedDisplays.size(); j++) {
                assignedDisplays.get(i).compareWithMonitor(assignedDisplays.get(j));
            }
        }
    }

    public Display buyDisplay(Display d) {
        if (assignedDisplays.contains(d)) {
            assignedDisplays.remove(d);
            System.out.println("Height: " + d.getHeight() + "\n Width: " + d.getWidth() + "\n PPI: " + d.getPpi() + "\n Model: " + d.getModel());
            return d;
        }
        return null;
    }

    public void showAssignedDisplays() {
        for (Display display : assignedDisplays) {
            System.out.println(display.getModel());
        }
    }
}
