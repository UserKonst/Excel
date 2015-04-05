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

        map1.put("key1", "value1");
        map1.put("key2", "value2");

        list1.add(map1);

        map2.put("key1", "value1");
        map2.put("key2", "value2");

        list2.add(map2);
        
        
        
       
        
        
        
        
        
        
        
        
        

    }

}
