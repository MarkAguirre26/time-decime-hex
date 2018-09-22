/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esp.service;

import com.esp.model.Table;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author AGUIRREMR
 */
@ManagedBean(name = "tableService")
@ApplicationScoped
public class TableService {

    public List<Table> createTableList(int size) {

        List<Table> list = new ArrayList<Table>();
        for (int i = 0; i < size; i++) {
//            System.out.println(i);
            list.add(new Table("Bit" + (i + 1), "Output" + (i + 1), "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"));
        }
        // list.add(new Table("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
        list.add(new Table("", "Decimal:", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
        list.add(new Table("", "Hex:", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

        return list;
    }

    public String binaryToDecimal(List<String> list) {

        String[] valueArray = new String[8];
        for (int i = 0; i < 8; i++) {
            valueArray[i] = list.get(i);
        }

        String columnResult = "";
        for (String string : valueArray) {
            columnResult += string;
        }

        int decimal = Integer.parseInt(columnResult, 2);
        System.out.println(columnResult + " " + decimal);
        return String.valueOf(decimal);
    }

    public String binaryToHex(List<String> list) {

        String decimal = binaryToDecimal(list);

        String hexStr = Integer.toString(Integer.parseInt(decimal), 16);

        return String.valueOf(hexStr);
    }

}
