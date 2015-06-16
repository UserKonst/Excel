/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author konst
 */
public class Reader {

    String path = "./src/main/resources/data/ex.xls";

    public void read() throws IOException, BiffException, WriteException {

        Workbook workbook = Workbook.getWorkbook(new File(path));
        WritableWorkbook copy = Workbook.createWorkbook(new File(path), workbook);

        WritableSheet sheet2 = copy.getSheet(0);

        Label label = new Label(0, 0, "A label record");
        sheet2.addCell(label);

        copy.write();
        copy.close();
        workbook.close();

    }

    public void updateCell(String colName, String rowName, String newValue) throws IOException, BiffException, WriteException {

        Cell cell = findCell(colName, rowName);

        Workbook workbook = Workbook.getWorkbook(new File(path));
        WritableWorkbook copy = Workbook.createWorkbook(new File(path), workbook);

        WritableSheet sheet2 = copy.getSheet(0);

        Label label = new Label(cell.getColumn(), cell.getRow(), newValue);
        sheet2.addCell(label);

        copy.write();
        copy.close();
        workbook.close();

    }

    public List<String> findEmpty(String vid) {
        List<String> servers = new ArrayList<>();
        List<String> values = getRowValues(vid);

        for (String value : values) {
            if (value.isEmpty()) {
                System.out.println("empty");

            }
        }

        return servers;
    }

    public List<String> getRowValues(String rowName) {

        List<String> values = new ArrayList<>();
        Workbook book = null;
        try (FileInputStream stream = new FileInputStream(path)) {

            book = Workbook.getWorkbook(stream);
            Sheet sheet = book.getSheet(0);

            Cell cell = sheet.findCell(rowName);
            if (cell == null) {
                throw new Exception("Not found row with name '" + rowName + "'");
            }

            int row = cell.getRow();

            Cell[] cells = sheet.getRow(row);
            for (int i = 1; i < cells.length; i++) {

                String exval = cells[i].getContents();
                values.add(exval);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            book.close();
        }
        return values;
    }

    public List<String> getColumnValues(String colName) {

        List<String> values = new ArrayList<>();
        Workbook book = null;
        try (FileInputStream stream = new FileInputStream(path)) {

            book = Workbook.getWorkbook(stream);
            Sheet sheet = book.getSheet(0);

            Cell cell = sheet.findCell(colName);
            if (cell == null) {
                throw new Exception("Not found row with name '" + colName + "'");
            }

            int col = cell.getColumn();

            Cell[] cells = sheet.getColumn(col);
            for (int i = 1; i < cells.length; i++) {

                String exval = cells[i].getContents();
                values.add(exval);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            book.close();
        }
        System.out.println(values);
        return values;
    }

    public String getValue(String colName, String rowName) {

        Cell cell = findCell(colName, rowName);
        return cell.getContents();
    }

    //=========================================================================
    private Cell findCell(String colName, String rowName) {

        Cell cell = null;
        Workbook book = null;
        try (FileInputStream stream = new FileInputStream(path)) {

            book = Workbook.getWorkbook(stream);
            Sheet sheet = book.getSheet(0);

            Cell colCell = sheet.findCell(colName);
            Cell rowCell = sheet.findCell(rowName);

            if (colCell == null || rowCell == null) {
                throw new Exception("Column '" + colName + "' or row '" + rowName + "' not found");
            }

            int needCol = colCell.getColumn();
            int needRow = rowCell.getRow();

            cell = sheet.getCell(needCol, needRow);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            book.close();
        }

        return cell;
    }
}
