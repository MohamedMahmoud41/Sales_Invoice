/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice_Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author DELL
 */
public class InvoiceHeaderTableModel extends AbstractTableModel {

    private ArrayList<InvoiceHeader> invoicesList;
    private String[] columns = {"Invoice Num", "Invoice Date", "Customer Name", "Invoice Total"};
    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

    public InvoiceHeaderTableModel(ArrayList<InvoiceHeader> invoicesList) {
        this.invoicesList = invoicesList;
    }

    public ArrayList<InvoiceHeader> getInvoicesList() {
        return invoicesList;
    }

    public void setInvoicesList(ArrayList<InvoiceHeader> invoicesList) {
        this.invoicesList = invoicesList;
    }
    
    
  

    @Override
    public int getRowCount() {
        return invoicesList.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceHeader inv = invoicesList.get(rowIndex);
        switch (columnIndex) {
            case 0: return inv.getInvNum();
            case 1: return df.format(inv.getInvDate());
            case 2: return inv.getCustomerName();
            case 3: return inv.getInvTotal();
        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
}
