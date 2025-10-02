package homework.day5;

public class ParseLogNonStatic {
    public void parseLog(String log) {
        String[] lines = log.split("\\n");
        int l = lines.length;
        boolean[] counted = new boolean[l];

        for (int i = 0; i < l; i++) {
            if (counted[i]) continue;
            counted[i] = true;
            int counter = 1;
            String ip1 = lines[i].split(" ")[1];
            String status1 = lines[i].split(" ")[2];

            int okCounter = 0;
            int neOkCounter = 0;
            if (("granted".equals(status1))) {
                okCounter++;
            } else {
                neOkCounter++;
            }

            for (int j = i + 1; j < l; j++) {
                String ip2 = lines[j].split(" ")[1];
                String status2 = lines[j].split(" ")[2];

                if (ip1.equalsIgnoreCase(ip2)) {
                    counter++;
                    counted[j] = true;
                    if ((status2.equals("granted"))) {
                        okCounter++;
                    } else {
                        neOkCounter++;
                    }
                }
            }
            System.out.printf("ip %s: ok - %d, failed - %d", ip1, okCounter, neOkCounter);
            System.out.println();
        }
    }
}
