/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author konst
 */
public class Work {
    
     public static void readXML(String path) {

        try (FileInputStream inputStream = new FileInputStream(path)) {
            Workbook wb = Workbook.getWorkbook(inputStream);
            Sheet sh = wb.getSheet("bro");

            List<Map<String, String>> listmap = new ArrayList<>();
            Map<String, String> map;

            int colums = sh.getColumns();
            int rows = sh.getRows();

            for (int i = 0; i < rows - 1; i++) {
                map = new HashMap<>();
                for (int j = 0; j < colums; j++) {
                    String name = sh.getCell(j, 0).getContents();
                    String value = sh.getCell(j, i + 1).getContents();
                    map.put(name, value);
                }
                listmap.add(map);
            }

            System.out.println("size: " + listmap.size());

        } catch (FileNotFoundException ex) { 
             Logger.getLogger(Work.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException | BiffException ex) {
             Logger.getLogger(Work.class.getName()).log(Level.SEVERE, null, ex);
         } 
    }
    
}
