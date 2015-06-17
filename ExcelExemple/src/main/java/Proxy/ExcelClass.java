/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jxl.read.biff.BiffException;

/**
 *
 * @author konst
 */
public class ExcelClass {

    public static void main(String[] args) throws IOException, BiffException {

        // ReadFile.readXML("E:\\test.xls");
        List<Map<String, String>> list1 = new ArrayList<>();
        List<Map<String, String>> list2 = new ArrayList<>();

        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        map1.put("key1", "vat");
        map1.put("key2", "value2");

        Map<String, String> map3 = new HashMap<>();

        map3.put("vasdfsdft", "vat");

        list1.add(map1);
        list1.add(map3);

        map2.put("key1", "vat");
        map2.put("key2", "value2");

        list2.add(map2);
        int record = 0;
        for (Map<String, String> listMap1 : list1) {

            for (Map<String, String> listMap2 : list2) {

                for (Map.Entry<String, String> entrySet : listMap1.entrySet()) {
                    record++;
                    String key = entrySet.getKey();
                    String value = entrySet.getValue();

                    String valueinmap2 = listMap2.get(key);

                    if (!value.equals(valueinmap2)) {
                        System.out.println("ошибка \n");
                        System.out.println("value: " + value);
                        System.out.println("и");
                        System.out.println("value: " + valueinmap2);
                        System.out.println("");

                        System.out.println("key " + key + " in table list map1 is: " + value);
                        System.out.println("but in table listmap2 this key is: " + valueinmap2);
                        System.out.println("and this is: " + record + " record");

                    }

                }

            }

        }

    }

}
