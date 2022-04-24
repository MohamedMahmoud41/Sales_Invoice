/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INvoice_View;

import Invoice_Model.InvoiceHeader;
import Invoice_Model.InvoiceHeaderTableModel;
import Invoice_Model.InvoiceLine;
import Invoice_Model.InvoiceLineTableModel;
import Invoice_Controller.AllActionsListener;
import Invoice_Controller.OnSelectionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author moham
 */
public class InvoiceFrame extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceFrame
     */
    public InvoiceFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HTbl = new javax.swing.JTable();
        CreateBtn = new javax.swing.JButton();
        CreateBtn.addActionListener(actionListener);
        DeleteBtn = new javax.swing.JButton();
        DeleteBtn.addActionListener(actionListener);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        InvNumLbl = new javax.swing.JLabel();
        InvTolLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        LTbl = new javax.swing.JTable();
        SaveBtn = new javax.swing.JButton();
        SaveBtn.addActionListener(actionListener);
        CancelBtn = new javax.swing.JButton();
        CancelBtn.addActionListener(actionListener);
        invNumber = new javax.swing.JLabel();
        InvDate = new javax.swing.JLabel();
        custName = new javax.swing.JLabel();
        invTotal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadItem = new javax.swing.JMenuItem();
        LoadItem.addActionListener(actionListener);
        SaveItem = new javax.swing.JMenuItem();
        SaveItem.addActionListener(actionListener);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("InvoicesTable"));

        HTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        HTbl.getSelectionModel().addListSelectionListener(onSelectionListener);
        jScrollPane1.setViewportView(HTbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );

        CreateBtn.setText("Create New Invoice");

        DeleteBtn.setText("Delete Invoice");

        jLabel1.setText("Invoice Num:");

        jLabel2.setText("Invoice Date:");

        jLabel3.setText("Customer Name:");

        jLabel4.setText("Invoice Total:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Invoice Items"));

        LTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(LTbl);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap())
        );

        SaveBtn.setText("New Line");

        CancelBtn.setText("Delete Line");

        jMenu1.setText("File");

        LoadItem.setText("Load File");
        jMenu1.add(LoadItem);

        SaveItem.setText("Save File");
        jMenu1.add(SaveItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(67, 67, 67)
                                        .addComponent(invTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(68, 68, 68)
                                        .addComponent(invNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(238, 238, 238)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InvTolLbl)
                                    .addComponent(InvNumLbl)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(InvDate, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(49, 49, 49)
                                    .addComponent(custName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(8, 8, 8))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(CreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180)
                .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(InvNumLbl)
                            .addComponent(invNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(InvDate))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(custName))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(InvTolLbl)
                            .addComponent(invTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CreateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SaveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTable HTbl;
    private javax.swing.JLabel InvDate;
    private javax.swing.JLabel InvNumLbl;
    private javax.swing.JLabel InvTolLbl;
    private javax.swing.JTable LTbl;
    private javax.swing.JMenuItem LoadItem;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JMenuItem SaveItem;
    private javax.swing.JLabel custName;
    private javax.swing.JLabel invNumber;
    private javax.swing.JLabel invTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    private List<InvoiceHeader> invoiceList = new ArrayList<>();
    private ArrayList<InvoiceLine> linesList;
    private AllActionsListener actionListener = new AllActionsListener(this);
    private OnSelectionListener onSelectionListener = new OnSelectionListener(this);
    private InvoiceHeaderTableModel invoiceHeaderTableModel;
    private InvoiceLineTableModel invoiceLineTableModel;
    
    
    
    public List<InvoiceHeader> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<InvoiceHeader> invoiceList) {
        this.invoiceList = invoiceList;
    }

    public ArrayList<InvoiceLine> getLinesList() {
        return linesList;
    }

    public void setLinesList(ArrayList<InvoiceLine> linesList) {
        this.linesList = linesList;
    }

    public AllActionsListener getActionListener() {
        return actionListener;
    }

    public void setActionListener(AllActionsListener actionListener) {
        this.actionListener = actionListener;
    }
    
    public InvoiceHeader getInvObject(int code) {
        for (InvoiceHeader inv : invoiceList) {
            if (inv.getInvNum() == code) {
                return inv;
            }
        }
        return null;
    }

    public JTable getHTbl() {
        return HTbl;
    }

    public void setHTbl(JTable HTbl) {
        this.HTbl = HTbl;
    }

    public JTable getLTbl() {
        return LTbl;
    }

    public void setLTbl(JTable LTbl) {
        this.LTbl = LTbl;
    }

    public InvoiceHeaderTableModel getInvoiceHeaderTableModel() {
        return invoiceHeaderTableModel;
    }

    public void setInvoiceHeaderTableModel(InvoiceHeaderTableModel invoiceHeaderTableModel) {
        this.invoiceHeaderTableModel = invoiceHeaderTableModel;
    }

    public InvoiceLineTableModel getInvoiceLineTableModel() {
        return invoiceLineTableModel;
    }

    public void setInvoiceLineTableModel(InvoiceLineTableModel invoiceLineTableModel) {
        this.invoiceLineTableModel = invoiceLineTableModel;
    }

    public JLabel getInvDate() {
        return InvDate;
    }

    public void setInvDate(JLabel InvDate) {
        this.InvDate = InvDate;
    }

    public JLabel getCustName() {
        return custName;
    }

    public void setCustName(JLabel custName) {
        this.custName = custName;
    }

    public JLabel getInvNumber() {
        return invNumber;
    }

    public void setInvNumber(JLabel invNumber) {
        this.invNumber = invNumber;
    }

    public JLabel getInvTotal() {
        return invTotal;
    }

    public void setInvTotal(JLabel invTotal) {
        this.invTotal = invTotal;
    }

}
