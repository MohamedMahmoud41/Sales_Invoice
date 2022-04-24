/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice_Controller;


import INvoice_View.InvoiceFrame;
import Invoice_Model.InvoiceHeader;
import Invoice_Model.InvoiceLine;
import Invoice_Model.InvoiceLineTableModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author moham
 */
public class OnSelectionListener implements ListSelectionListener {

    private InvoiceFrame invoiceFrame;
    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    public OnSelectionListener(InvoiceFrame frame) {
        this.invoiceFrame = frame;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int selectedInvIndex = invoiceFrame.getHTbl().getSelectedRow();
        if (selectedInvIndex != -1) {
            InvoiceHeader selectedInv = invoiceFrame.getInvoiceList().get(selectedInvIndex);
            ArrayList<InvoiceLine> lines = selectedInv.getLines();
            InvoiceLineTableModel lineTableModel = new InvoiceLineTableModel(lines);
            invoiceFrame.setLinesList(lines);
            invoiceFrame.getLTbl().setModel(lineTableModel);
            invoiceFrame.getCustName().setText(selectedInv.getCustomerName());
            invoiceFrame.getInvNumber().setText("" + selectedInv.getInvNum());
            invoiceFrame.getInvTotal().setText("" + selectedInv.getInvTotal());
            invoiceFrame.getInvDate().setText(df.format(selectedInv.getInvDate()));
        }
    }

}
