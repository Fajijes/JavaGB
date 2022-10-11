package Seminar6;

import java.util.*;

public class store {
    public static void main(String[] args) {
        Notebook n1 = new Notebook();
        n1.brandName = "Ноутбук1";
        n1.seriaType = "SX-1200";
        n1.price = 30000;
        n1.RAM = "1,5 МГц";
        n1.operationSys = "Linux";
        n1.color = "Gray";
        n1.capacity = "1 Тб";
        n1.id = 1;

        Notebook n2 = new Notebook();
        n2.brandName = "Ноутбук2";
        n2.seriaType = "TX-1300";
        n2.price = 36000;
        n2.RAM = "2 МГц";
        n2.operationSys = "Windows";
        n2.color = "Black";
        n2.capacity = "500 Гб";
        n2.id = 2;

        Notebook n3 = new Notebook();
        n3.brandName = "Ноутбук3";
        n3.seriaType = "TF-1100";
        n3.price = 40000;
        n3.RAM = "1,4 МГц";
        n3.operationSys = "Linux";
        n3.color = "White";
        n3.capacity = "1,5 Тб";
        n3.id = 3;

        Notebook n4 = new Notebook();
        n4.brandName = "Ноутбук4";
        n4.seriaType = "TX-1350";
        n4.price = 30000;
        n4.RAM = "1,2 МГц";
        n4.operationSys = "MacOS";
        n4.color = "Black";
        n4.capacity = "1 Тб";
        n4.id = 4;

        System.out.println(n1.toString());
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);

        Scanner scanner = new Scanner(System.in);
        System.out.print(String.format(
                "Введите цифру, соответствующую необходимому критерию: %n1 - Стоимость %n2 - Операционная система %n3 - Цвет %n%n"));
        int a = scanner.nextInt();
        System.out.printf("Your number: %d \n", a);
        scanner.close();

        if (a == 1) {
            Map<Integer, String> originMap = new HashMap<>();
            originMap.put(30000, "Ноутбук1");
            originMap.put(36000, "Ноутбук2");
            originMap.put(40000, "Ноутбук3");
            originMap.put(30000, "Ноутбук4");

            Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
            for (Map.Entry<Integer, String> noteBook : originMap.entrySet()) {
                if (noteBook.getKey() > 30000) {
                    linkedHashMap.put(noteBook.getValue(), noteBook.getKey());
                }
            }

            System.out.println("Товары отсортированы по цене: " + linkedHashMap);

        } else if (a == 2) {
            Map<String, String> originMap = new HashMap<>();
            originMap.put("Linux", "Ноутбук1");
            originMap.put("Windows", "Ноутбук2");
            originMap.put("Linux", "Ноутбук3");
            originMap.put("MacOS", "Ноутбук4");

            Map<String, String> linkedHashMap = new LinkedHashMap<>();
            for (Map.Entry<String, String> noteBook : originMap.entrySet()) {
                if (noteBook.getKey() == "Windows") {
                    linkedHashMap.put(noteBook.getKey(), noteBook.getValue());
                }
                
            }
            System.out.println("Товары отсортированы по операционной системе: " + linkedHashMap);

        } else if (a == 3) {
            Map<String, String> originMap = new HashMap<>();
            originMap.put("Gray", "Ноутбук1");
            originMap.put("Black", "Ноутбук2");
            originMap.put("White", "Ноутбук3");
            originMap.put("Black", "Ноутбук4");

            Map<String, String> linkedHashMap = new LinkedHashMap<>();
            for (Map.Entry<String, String> noteBook : originMap.entrySet()) {
                if (noteBook.getKey() == "White") {
                    linkedHashMap.put(noteBook.getKey(), noteBook.getValue());
                }
                
            }
            System.out.println("Товары отсортированы по цвету: " + linkedHashMap);
        }
    }

}
