package org.example.core.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpliVaultParser {
    public static void main(String[] args) {
        List<Colums> columsList = new ArrayList<>();
        List<List<String>> recordList = new ArrayList<>();

        ArrayList<HashMap<String, String>> test = new ArrayList<HashMap<String, String>>();

        columsList.add(new Colums("Data Source"));
        columsList.add(new Colums("PropertyType"));
        columsList.add(new Colums("PropertyCount"));

        recordList.add(new ArrayList<String>() {
            {
                add("simplivault-wvm-uat");
                add("SERVERS");
                add("3");
            }
        });
        recordList.add(new ArrayList<String>() {
            {
                add("simplivault-wvm-uat");
                add("VMS");
                add("2");
            }
        });

        //  System.out.println(recordList);
        int size = columsList.size();
//        int i = 0;
//        List<Stream<KeyValue>> collect = recordList.stream()
//                .map(s -> s.stream()
//                        .map(f -> {
//                            return new KeyValue(columsList.get(i).getName(), f);
//                        })
//                ).collect(Collectors.toList());
//
//        collect.forEach(f -> f.map(s -> {
//            System.out.println("in foreach");
//            System.out.println(s.getKey() + " : " + s.getValue());
//            return null;
//        }));

//        for (int i = 0; i < size; i++) {


        for (List<String> list : recordList) {
//            System.out.println(list);
            for (int i = 0; i < list.size(); i++) {
                String value = list.get(i);
//                KeyValue keyValue = new KeyValue(columsList.get(i).getName(), value);
                HashMap<String, String> map = new HashMap<>();
                map.put(columsList.get(i).getName(), value);
//                System.out.println(map);
                test.add(map);


            }

        }
        System.out.println(test);

//        }


    }


}

class Colums {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Colums(String name) {
        this.name = name;
    }
}

class KeyValue {
    private String key;
    private String value;


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public KeyValue(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyValue{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}