package org.example.bms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FotoLogFilter {

    private static List<String> list = new ArrayList() {
        {
            add("TimeStamp Mismatch");
//            add("AGPS");
            add("Activation Sent");
            add("AGPS");
            //  add("AGPS Data Send Start");
//            add("TimeStamp Mismatch");
        }
    };

    private static String[] itemList = {"Activation Sent", "TimeStamp Mismatch", "AGPS"};

    private static void logFilter(BatchDetailsLog logDetails) {
        boolean b = list.stream().anyMatch(check -> check.contains(logDetails.getResponse()));
        System.out.println("AGPS".contains(logDetails.getResponse()));
        if (b)
            System.out.println("Hello");

    }

    public static boolean stringContainsItemFromList(String inputStr, String[] items) {
        return Arrays.stream(items).anyMatch(f -> {
          return   f.matches("(.*)" + inputStr + "(.*)");
        });
    }

    public static void main(String[] args) {
        BatchDetailsLog log = new BatchDetailsLog();
        log.setResponse("AGPS");

        logFilter(log);
        boolean agps = stringContainsItemFromList("AGPS", itemList);
        System.out.println(agps);

        String Str = new String("This is a test string");
        System.out.println(Str.matches("(.*)test(.*)"));
    }


}

class BatchDetailsLog {
    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}