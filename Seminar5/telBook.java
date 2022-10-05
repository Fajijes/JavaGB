package Seminar5;

import java.util.*;

public class telBook {
    public static void main(String[] args) {
     
        Directory directory = new Directory();
        
        directory.add("Body1", "99999999999");
        directory.add("Body1", "88888888888");
        directory.add("Body1", "98989898989");
        directory.add("Body2", "77777777777");
        directory.add("Body2", "66666666666");
        directory.add("Body3", "55555555555");
        directory.add("Body3", "44444444444");
        directory.add("Body4", "33333333333");
        directory.add("Body5", "22222222222");
        directory.add("Body6", "11111111111");

        System.out.println(directory.get("Body1"));
        System.out.println(directory.get("Body2"));
        System.out.println(directory.get("Body3"));
        System.out.println(directory.get("Body4"));
        System.out.println(directory.get("Body5"));
        System.out.println(directory.get("Body6"));
    }
}

    class Directory {
        private Map<String, List<String>> directoryHm = new HashMap<>();
        private List<String> phoneNumberList;

        public void add(String surname, String phone_number) {
            if (directoryHm.containsKey(surname)) {
                phoneNumberList = directoryHm.get(surname);
                phoneNumberList.add(phone_number);
                directoryHm.put(surname, phoneNumberList);
            } else {
                phoneNumberList = new ArrayList<>();
                phoneNumberList.add(surname);
                phoneNumberList.add(phone_number);
                directoryHm.put(surname, phoneNumberList);
                
            }
    
        }

        public List<String> get(String surname) {
            return directoryHm.get(surname);
        }

    }

