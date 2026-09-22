package org.example.coding;

import java.util.ArrayList;
import java.util.List;

public class NullCheckInString {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1233");
        list.add("M12234567");
        list.add(null);
        cleintPaylaodFormat(list);
    }

    public static String cleintPaylaodFormat(List formattedPayload) {
        StringBuilder payloadData = new StringBuilder();
        for (int i = 0; i < formattedPayload.size(); i++) {
            payloadData.append(formattedPayload.get(i) != null ? formattedPayload.get(i).toString() : "null");
            if (i != formattedPayload.size() - 1) {
                payloadData.append(",");
            }
        }
        String format = "^TMBMS," + payloadData + "|#";
        System.out.println(format);
        return format;
    }
}




