package fasade.videoUtils;

import java.util.ArrayList;
import java.util.List;

public class Video {
    private List<String> tasks;

    public Video(String sourceVideo) {
        this.tasks = new ArrayList<>();
        this.tasks.add(sourceVideo);
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(tasks.get(0)).append(" : {\n");
        for (String t : tasks) {
            if (!tasks.get(0).equals(t)) {
                sb.append(t).append("\n");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
