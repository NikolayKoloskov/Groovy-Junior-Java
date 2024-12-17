import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaTask {
    public String countNums(List<Integer> list) {
        Map<Integer, Integer> counts = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int num : list) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        for (int key : counts.keySet()) {
            sb.append(key + ":" + counts.get(key) + ",");
        }
        if (sb.length() > 3) {
            sb.replace(sb.length() - 1, sb.length(), "");
        }
        sb.append("}");
        return sb.toString();
    }
}
