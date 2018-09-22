/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esp.Controller;

import com.esp.model.Table;
import com.esp.service.TableService;
import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;
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
        
        getResults();

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
    public String getResults() {
        List<String> column3 = tables.stream().map(Table::getCell3).collect(Collectors.toList());
        List<String> column4 = tables.stream().map(Table::getCell4).collect(Collectors.toList());
        List<String> column5 = tables.stream().map(Table::getCell5).collect(Collectors.toList());
        List<String> column6 = tables.stream().map(Table::getCell6).collect(Collectors.toList());
        List<String> column7 = tables.stream().map(Table::getCell7).collect(Collectors.toList());
        List<String> column8 = tables.stream().map(Table::getCell8).collect(Collectors.toList());

        List<String> column9 = tables.stream().map(Table::getCell9).collect(Collectors.toList());
        List<String> column10 = tables.stream().map(Table::getCell10).collect(Collectors.toList());
        List<String> column11 = tables.stream().map(Table::getCell11).collect(Collectors.toList());
        List<String> column12 = tables.stream().map(Table::getCell12).collect(Collectors.toList());
        List<String> column13 = tables.stream().map(Table::getCell13).collect(Collectors.toList());
        List<String> column14 = tables.stream().map(Table::getCell14).collect(Collectors.toList());
        List<String> column15 = tables.stream().map(Table::getCell15).collect(Collectors.toList());
        List<String> column16 = tables.stream().map(Table::getCell16).collect(Collectors.toList());
        List<String> column17 = tables.stream().map(Table::getCell17).collect(Collectors.toList());
        List<String> column18 = tables.stream().map(Table::getCell18).collect(Collectors.toList());
        List<String> column19 = tables.stream().map(Table::getCell19).collect(Collectors.toList());
        List<String> column20 = tables.stream().map(Table::getCell20).collect(Collectors.toList());
        List<String> column21 = tables.stream().map(Table::getCell21).collect(Collectors.toList());
        List<String> column22 = tables.stream().map(Table::getCell22).collect(Collectors.toList());
        List<String> column23 = tables.stream().map(Table::getCell23).collect(Collectors.toList());
        List<String> column24 = tables.stream().map(Table::getCell24).collect(Collectors.toList());
        List<String> column25 = tables.stream().map(Table::getCell25).collect(Collectors.toList());
        List<String> column26 = tables.stream().map(Table::getCell26).collect(Collectors.toList());
        List<String> column27 = tables.stream().map(Table::getCell27).collect(Collectors.toList());
        List<String> column28 = tables.stream().map(Table::getCell28).collect(Collectors.toList());
        List<String> column29 = tables.stream().map(Table::getCell29).collect(Collectors.toList());
        List<String> column30 = tables.stream().map(Table::getCell30).collect(Collectors.toList());
        List<String> column31 = tables.stream().map(Table::getCell31).collect(Collectors.toList());
        List<String> column32 = tables.stream().map(Table::getCell32).collect(Collectors.toList());
        List<String> column33 = tables.stream().map(Table::getCell33).collect(Collectors.toList());
        List<String> column34 = tables.stream().map(Table::getCell34).collect(Collectors.toList());
        List<String> column35 = tables.stream().map(Table::getCell35).collect(Collectors.toList());
        List<String> column36 = tables.stream().map(Table::getCell36).collect(Collectors.toList());
        List<String> column37 = tables.stream().map(Table::getCell37).collect(Collectors.toList());
        List<String> column38 = tables.stream().map(Table::getCell38).collect(Collectors.toList());
        List<String> column39 = tables.stream().map(Table::getCell39).collect(Collectors.toList());
        List<String> column40 = tables.stream().map(Table::getCell40).collect(Collectors.toList());
        List<String> column41 = tables.stream().map(Table::getCell41).collect(Collectors.toList());
        List<String> column42 = tables.stream().map(Table::getCell42).collect(Collectors.toList());
        List<String> column43 = tables.stream().map(Table::getCell43).collect(Collectors.toList());
        List<String> column44 = tables.stream().map(Table::getCell44).collect(Collectors.toList());
        List<String> column45 = tables.stream().map(Table::getCell45).collect(Collectors.toList());
        List<String> column46 = tables.stream().map(Table::getCell46).collect(Collectors.toList());
        List<String> column47 = tables.stream().map(Table::getCell47).collect(Collectors.toList());
        List<String> column48 = tables.stream().map(Table::getCell48).collect(Collectors.toList());
        List<String> column49 = tables.stream().map(Table::getCell49).collect(Collectors.toList());
        List<String> column50 = tables.stream().map(Table::getCell50).collect(Collectors.toList());
        List<String> column51 = tables.stream().map(Table::getCell51).collect(Collectors.toList());

        //DECIMAL
        tables.get(8).setCell3(service.binaryToDecimal(column3));
        tables.get(8).setCell4(service.binaryToDecimal(column4));
        tables.get(8).setCell5(service.binaryToDecimal(column5));
        tables.get(8).setCell6(service.binaryToDecimal(column6));
        tables.get(8).setCell7(service.binaryToDecimal(column7));
        tables.get(8).setCell8(service.binaryToDecimal(column8));
        tables.get(8).setCell9(service.binaryToDecimal(column9));
        tables.get(8).setCell10(service.binaryToDecimal(column10));
        tables.get(8).setCell11(service.binaryToDecimal(column11));
        tables.get(8).setCell12(service.binaryToDecimal(column12));
        tables.get(8).setCell13(service.binaryToDecimal(column13));
        tables.get(8).setCell14(service.binaryToDecimal(column14));
        tables.get(8).setCell15(service.binaryToDecimal(column15));
        tables.get(8).setCell16(service.binaryToDecimal(column16));
        tables.get(8).setCell17(service.binaryToDecimal(column17));
        tables.get(8).setCell18(service.binaryToDecimal(column18));
        tables.get(8).setCell19(service.binaryToDecimal(column19));
        tables.get(8).setCell20(service.binaryToDecimal(column20));
        tables.get(8).setCell21(service.binaryToDecimal(column21));
        tables.get(8).setCell22(service.binaryToDecimal(column22));
        tables.get(8).setCell23(service.binaryToDecimal(column23));
        tables.get(8).setCell24(service.binaryToDecimal(column24));
        tables.get(8).setCell25(service.binaryToDecimal(column25));
        tables.get(8).setCell26(service.binaryToDecimal(column26));
        tables.get(8).setCell27(service.binaryToDecimal(column27));
        tables.get(8).setCell28(service.binaryToDecimal(column28));
        tables.get(8).setCell29(service.binaryToDecimal(column29));
        tables.get(8).setCell30(service.binaryToDecimal(column30));
        tables.get(8).setCell31(service.binaryToDecimal(column31));
        tables.get(8).setCell32(service.binaryToDecimal(column32));
        tables.get(8).setCell33(service.binaryToDecimal(column33));
        tables.get(8).setCell34(service.binaryToDecimal(column34));
        tables.get(8).setCell35(service.binaryToDecimal(column35));
        tables.get(8).setCell36(service.binaryToDecimal(column36));
        tables.get(8).setCell37(service.binaryToDecimal(column37));
        tables.get(8).setCell38(service.binaryToDecimal(column38));
        tables.get(8).setCell39(service.binaryToDecimal(column39));
        tables.get(8).setCell40(service.binaryToDecimal(column40));
        tables.get(8).setCell41(service.binaryToDecimal(column41));
        tables.get(8).setCell42(service.binaryToDecimal(column42));
        tables.get(8).setCell43(service.binaryToDecimal(column43));
        tables.get(8).setCell44(service.binaryToDecimal(column44));
        tables.get(8).setCell45(service.binaryToDecimal(column45));
        tables.get(8).setCell46(service.binaryToDecimal(column46));
        tables.get(8).setCell47(service.binaryToDecimal(column47));
        tables.get(8).setCell48(service.binaryToDecimal(column48));
        tables.get(8).setCell49(service.binaryToDecimal(column49));
        tables.get(8).setCell50(service.binaryToDecimal(column50));
        tables.get(8).setCell51(service.binaryToDecimal(column51));

        //HEX
        tables.get(9).setCell3(service.binaryToHex(column3));
        tables.get(9).setCell4(service.binaryToHex(column4));
        tables.get(9).setCell5(service.binaryToHex(column5));
        tables.get(9).setCell6(service.binaryToHex(column6));
        tables.get(9).setCell7(service.binaryToHex(column7));
        tables.get(9).setCell9(service.binaryToHex(column9));
        tables.get(9).setCell9(service.binaryToHex(column9));
        tables.get(9).setCell10(service.binaryToHex(column10));
        tables.get(9).setCell11(service.binaryToHex(column11));
        tables.get(9).setCell12(service.binaryToHex(column12));
        tables.get(9).setCell13(service.binaryToHex(column13));
        tables.get(9).setCell14(service.binaryToHex(column14));
        tables.get(9).setCell15(service.binaryToHex(column15));
        tables.get(9).setCell16(service.binaryToHex(column16));
        tables.get(9).setCell17(service.binaryToHex(column17));
        tables.get(9).setCell19(service.binaryToHex(column19));
        tables.get(9).setCell19(service.binaryToHex(column19));
        tables.get(9).setCell20(service.binaryToHex(column20));
        tables.get(9).setCell21(service.binaryToHex(column21));
        tables.get(9).setCell22(service.binaryToHex(column22));
        tables.get(9).setCell23(service.binaryToHex(column23));
        tables.get(9).setCell24(service.binaryToHex(column24));
        tables.get(9).setCell25(service.binaryToHex(column25));
        tables.get(9).setCell26(service.binaryToHex(column26));
        tables.get(9).setCell27(service.binaryToHex(column27));
        tables.get(9).setCell29(service.binaryToHex(column29));
        tables.get(9).setCell29(service.binaryToHex(column29));
        tables.get(9).setCell30(service.binaryToHex(column30));
        tables.get(9).setCell31(service.binaryToHex(column31));
        tables.get(9).setCell32(service.binaryToHex(column32));
        tables.get(9).setCell33(service.binaryToHex(column33));
        tables.get(9).setCell34(service.binaryToHex(column34));
        tables.get(9).setCell35(service.binaryToHex(column35));
        tables.get(9).setCell36(service.binaryToHex(column36));
        tables.get(9).setCell37(service.binaryToHex(column37));
        tables.get(9).setCell39(service.binaryToHex(column39));
        tables.get(9).setCell39(service.binaryToHex(column39));
        tables.get(9).setCell40(service.binaryToHex(column40));
        tables.get(9).setCell41(service.binaryToHex(column41));
        tables.get(9).setCell42(service.binaryToHex(column42));
        tables.get(9).setCell43(service.binaryToHex(column43));
        tables.get(9).setCell44(service.binaryToHex(column44));
        tables.get(9).setCell45(service.binaryToHex(column45));
        tables.get(9).setCell46(service.binaryToHex(column46));
        tables.get(9).setCell47(service.binaryToHex(column47));
        tables.get(9).setCell49(service.binaryToHex(column49));
        tables.get(9).setCell49(service.binaryToHex(column49));
        tables.get(9).setCell50(service.binaryToHex(column50));
        tables.get(9).setCell51(service.binaryToHex(column51));

        return null;
    }
}
