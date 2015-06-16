/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.readexcel;

import java.io.IOException;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;

/**
 *
 * @author konst
 */
public class Run {
    
    public static void main(String[] args) throws IOException, BiffException, WriteException {
        new Reader().updateCell("server1", "a", "aaaaaaaaaaaaaaaaa");
    }
    
}
