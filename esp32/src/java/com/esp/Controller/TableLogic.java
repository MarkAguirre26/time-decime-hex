/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esp.Controller;

import com.esp.model.Table;
import com.esp.service.TableService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.CellEditEvent;

/**
 *
 * @author AGUIRREMR
 */
@ManagedBean(name = "tableView")
@SessionScoped
public class TableLogic {

    @ManagedProperty("#{tableService}")
    private TableService service;
    private List<Table> tables;
//    private String sample;

    

    @PostConstruct
    public void init() {
        tables = service.createTableList(8);
//sample = "Here";
    }
//    
//    public String getSample() {
//        return sample;
//    }
//
//    public void setSample(String sample) {
//        this.sample = sample;
//    }
    

    public TableService getService() {
        return service;
    }

    public void setService(TableService service) {
        this.service = service;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

//    public void onRowEdit(RowEditEvent event) {
//
//        Table t = (Table) event.getObject();
//        String s = String.valueOf(t.getCell1());
//        FacesMessage msg = new FacesMessage("item Edited", s);
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//
//    }
//
//    public void onRowCancel(RowEditEvent event) {
//        Table t = (Table) event.getObject();
//        String s = String.valueOf(t.getCell1());
//        FacesMessage msg = new FacesMessage("Edit Cancelled", s);
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//    }
    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();

        if (newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
        
                

//        tables.get(8).setCell3("255");
//        tables.get(9).setCell3("0");
//        String[] cellStrings = new String[7];
        String cellString = "";
        for (int i = 0; i < 8; i++) {
            String cellValue = tables.get(i).getCell3();
            if(cellValue.equals("")){
                cellValue = "0";
            }
            cellString += cellValue;
        }        
       
        tables.get(8).setCell3(service.binaryToDecimal(cellString));

    }

//    public void onRowReorder(ReorderEvent event) {
//        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Row Moved", "From: " + event.getFromIndex() + ", To:" + event.getToIndex());
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//
//    }
//
//    public void onAddNew() {
//        
//        // Add one new car to the table:
//
//        int listMax = tables.size() - 1;
//        Table tableToAdd = service.createTableList(listMax).get(listMax - 1);
//        tables.add(tableToAdd);
//
////        for (Table table : tables) {
////            tables_tmp.add(table);
////        }
////        tables.clear();
////        for (Table table : tables_tmp) {
////            tables.add(table);
////        }
//    }
//    public String compute() {
//         FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Result", tables.get(8).getCell3());
//            FacesContext.getCurrentInstance().addMessage(null, msg);
//        return null;
//    }
}
