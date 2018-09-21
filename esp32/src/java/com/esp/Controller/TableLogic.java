/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esp.Controller;

import com.esp.model.Table;
import com.esp.service.TableService;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.ReorderEvent;
import org.primefaces.event.RowEditEvent;

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

    @PostConstruct
    public void init() {
        tables = service.createTableList(8);

    }

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

    public void onRowEdit(RowEditEvent event) {

        Table t = (Table) event.getObject();
        String s = String.valueOf(t.getCell1());
        FacesMessage msg = new FacesMessage("item Edited", s);
        FacesContext.getCurrentInstance().addMessage(null, msg);

    }

    public void onRowCancel(RowEditEvent event) {
        Table t = (Table) event.getObject();
        String s = String.valueOf(t.getCell1());
        FacesMessage msg = new FacesMessage("Edit Cancelled", s);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();

        if (newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public void onRowReorder(ReorderEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Row Moved", "From: " + event.getFromIndex() + ", To:" + event.getToIndex());
        FacesContext.getCurrentInstance().addMessage(null, msg);

    }

    public void onAddNew() {
        List<Table> tables_tmp = new ArrayList<>();
        // Add one new car to the table:

        int listMax = tables.size() - 2;
        Table tableToAdd = service.createTableList(listMax).get(listMax - 1);
        tables.add(tableToAdd);

//        for (Table table : tables) {
//            tables_tmp.add(table);
//        }
//        tables.clear();
//        for (Table table : tables_tmp) {
//            tables.add(table);
//        }
    }

    public String compute() {
        System.out.println("HereCompute");
        return null;
    }

}
