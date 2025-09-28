package homework.day5;

public class ParseLog {
    public static void parseLog(String log) {
        String[] lines = log.split("\\n");
        int l = lines.length;
        boolean[] counted = new boolean[l];
        int counter;
        String[] uniqueIp;

        for (int i = 0; i < l; i++) {
            if (counted[i]) {
                continue;
            }
            counted[i] = true;
            counter = 1;
            String ip = lines[i].split(" ")[1];
            for (int j = i + 1; j < l; j++) {
                if (lines[i].equalsIgnoreCase(lines[j])) {
                    counter++;
                    counted[j] = true;
                }
            }


        }
        String status = lines.split(" ")[2];
    }
}
