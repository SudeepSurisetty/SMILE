package UserInterface.Philanthropist.FundDispenser;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Fund.Fund;
import Business.Fund.FundDispenser;
import Business.Fund.FundSupplier;
import Business.Organization.Organization;
import Business.Organization.WelfareFundDispenserOrganization;
import Business.Organization.WelfareOrganization;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.FundWorkRequest;
import Business.WorkQueue.SupplierFundWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sudeep
 */
public class FundDispenserWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private WelfareFundDispenserOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    //Supplier s;
    FundDispenser provider;

    /**
     * Creates new form FundDispenserWorkAreaJPanel
     */
    public FundDispenserWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, WelfareFundDispenserOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        this.organization = organization;
//        for (Supplier supplier : organization.getSupplierList().getSupplierList()) {
//            if(account.getEmployee().getName().equals(supplier.getSupplierName())){
//                s=supplier;
//                System.out.println("supplier name"+s.getSupplierName());
//            }
//        }
        //s=organization.getProvider();
        provider = organization.getDispenser();
        System.out.println("business " + business.getWorkQueue().getWorkRequestList().size());
        if (provider.getWorkQueue() == null) {
            WorkQueue w = new WorkQueue();
            provider.setWorkQueue(w);
        }

        populateCombo();
        populateSupCombo();
        populateWorkQueueTable();
        populateWorkQueueTable2();
        populateQuantity();
        populateAvailable();
    }

    public void populateCombo() {
        for (Fund fund : business.getFundList().getFundList()) {
            fundTypeComboBox.addItem(fund);
        }

    }

    public void populateSupCombo() {
        for (Organization organization1 : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization1 instanceof WelfareOrganization) {
                WelfareOrganization s = (WelfareOrganization) organization1;
                for (FundSupplier supplier : s.getSupplierList().getFundSupplierList()) {
                    comboSup.addItem(supplier);
                }

            }
        }
    }

    public void populateWorkQueueTable() {
        DefaultTableModel model = (DefaultTableModel) requestTable.getModel();

        model.setRowCount(0);

        for (WorkRequest work : business.getWorkQueue().getWorkRequestList()) {
            //if(work instanceof FundWorkRequest){ 
            Object[] row = new Object[5];
            row[0] = work.getFund().getFundName();
            //row[1] = ((FundWorkRequest) work).getRequestedFund();
            row[1] = work.getRequestedFund();
            row[2] = work;
            row[3] = work.getReceiver();
            row[4] = work.getSender();
            model.addRow(row);
            //}
        }
    }

    public void populateWorkQueueTable2() {
        DefaultTableModel model = (DefaultTableModel) requestTable1.getModel();

        model.setRowCount(0);

        for (WorkRequest work : provider.getWorkQueue().getWorkRequestList()) {
            if (work instanceof SupplierFundWorkRequest) {
                Object[] row = new Object[5];
                row[0] = work.getFund().getFundName();
                row[1] = ((SupplierFundWorkRequest) work).getRequestedFund();
                row[2] = work;
                row[3] = work.getReceiver();
                row[4] = work.getSender();
                //row[5] = ((SupplierFundWorkRequest) work).getSupplier();
                model.addRow(row);
            }
        }
    }

    public void populateAvailable() {
        DefaultTableModel model = (DefaultTableModel) availableTable.getModel();

        model.setRowCount(0);
        
        for (Fund fund : provider.getFundList().getFundList()) {

            Object[] row = new Object[2];
            row[0] = fund.getFundName();
            row[1] = fund.getFund();
            
            model.addRow(row);

        }
        
    }

    public void populateQuantity() {

        for (WorkRequest workRequest : provider.getWorkQueue().getWorkRequestList()) {
            // HashMap<WorkRequest,Integer> map = new HashMap<WorkRequest,Integer>();
            int temp = 0;
            SupplierFundWorkRequest p = (SupplierFundWorkRequest) workRequest;
            if (workRequest.getStatus().equals("Complete") && !p.isAdd()) { //&& add == false
                Fund f = workRequest.getFund();

                for (Fund fund : provider.getFundList().getFundList()) {
                    if (f.getFundName().equals(fund.getFundName())) {
                        temp = 1;
                        fund.setFund(p.getRequestedFund() + fund.getFund());
                    }

                }
                if (temp == 0) {
                    Fund fu = provider.getFundList().addFund();
                    fu.setFundName(f.getFundName());
                    fu.setFund(p.getRequestedFund());
                    //  organization.getP().getVaccine().getVaccineList().add(v);
                }
                p.setAdd(true);

            }
            //  account.getWorkQueue().getWorkRequestList().remove(workRequest);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnComplete = new javax.swing.JButton();
        reqBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        fundTypeComboBox = new javax.swing.JComboBox();
        fundsTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        refreshJButton = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        requestTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        reqBtn2 = new javax.swing.JButton();
        btnDelete2 = new javax.swing.JButton();
        comboSup = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Fund Dispenser Work Area");

        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        reqBtn.setText("Assign To Me");
        reqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtnActionPerformed(evt);
            }
        });

        availableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fund Type", "Amount"
            }
        ));
        jScrollPane1.setViewportView(availableTable);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Fund Requests received");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Available Funds");

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fund Type", "Amount", "Status", "Receiver", "Sender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(requestTable);

        fundTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundTypeComboBoxActionPerformed(evt);
            }
        });

        fundsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundsTextFieldActionPerformed(evt);
            }
        });
        fundsTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fundsTextFieldKeyPressed(evt);
            }
        });

        jLabel2.setText("Fund Type:");

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete request");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        requestTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fund Type", "Amount", "Status", "Receiver", "Sender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(requestTable1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Funds Requested to Welfare Organization");

        reqBtn2.setText("Request Funds");
        reqBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtn2ActionPerformed(evt);
            }
        });

        btnDelete2.setText("Delete request");
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter Amount($)");

        jLabel7.setText("Select Fund Supplier");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addGap(77, 77, 77)
                                .addComponent(reqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(380, 380, 380)
                                    .addComponent(btnDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(fundTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(refreshJButton))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fundsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(comboSup, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(reqBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete)
                            .addComponent(reqBtn)
                            .addComponent(btnComplete))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnDelete2)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fundTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fundsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reqBtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshJButton)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the request", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            //FundWorkRequest p=(FundWorkRequest) requestTable.getValueAt(selectedRow, 2);
            WorkRequest p = (WorkRequest) requestTable.getValueAt(selectedRow, 2);
            int temp = 0;
            if (p.getReceiver() != null) {
                if (p.getStatus().equals("Pending")) {
                    UserAccount a = p.getSender();
                    if (provider.getFundList().getFundList().size() <= 0) {
                        JOptionPane.showMessageDialog(null, "----No Funds available. Request from Supplier");
                        return;
                    }
                    //System.out.println(provider.getFundList().getFundList());
                    for (Fund v : provider.getFundList().getFundList()) {
                        System.out.println(v);
                        if (p.getFund().getFundName().equals(v.getFundName())) {
                            System.out.println(p.getFund().getFundName()+ "Name 1");
                            System.out.println(v.getFundName()+ "Name2");
                            if ((v.getFund() - p.getRequestedFund()) < 0) {
                                JOptionPane.showMessageDialog(null, "No enough Funds to complete request");
                                return;
                            }
                            temp = 1;
                            v.setFund(v.getFund() - p.getRequestedFund());
                            break;
                        }

                    }
                    if (temp == 0) {
                        JOptionPane.showMessageDialog(null, "No Funds available. Request from Supplier");
                        return;
                    }

                    p.setStatus("Complete");
                    JOptionPane.showMessageDialog(null, " Request successfully completed ");
                    populateAvailable();
                    populateWorkQueueTable();
                } else {
                    JOptionPane.showMessageDialog(null, "Operation cannot be performed again");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please assign first ");
            }

        }
    }//GEN-LAST:event_btnCompleteActionPerformed

    private void reqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtnActionPerformed
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            
            //FundWorkRequest f=(FundWorkRequest) requestTable.getValueAt(selectedRow, 2);
            WorkRequest f = (WorkRequest) requestTable.getValueAt(selectedRow, 2);
            if (!f.getStatus().equals("Pending") && !f.getStatus().equals("Complete")) {
            f.setStatus("Pending");
            f.setReceiver(account);

            populateWorkQueueTable();}
            else{JOptionPane.showMessageDialog(null,"Request already assigned");}

        }
//        SupplierWorkRequest request= new SupplierWorkRequest();
//        request.setVaccine((Vaccine)comboVaccine.getSelectedItem());
//        request.setQuantity(Integer.parseInt(txtquant.getText()));
//        request.setStatus("Requested");
//        request.setSender(account);
//        //organization.getWorkQueue().getWorkRequestList().add(request);
//        s.getWorkQueue().getWorkRequestList().add(request);
//        //populateWorkQueueTable();

    }//GEN-LAST:event_reqBtnActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed

        new FundDispenserWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            //FundWorkRequest p=(FundWorkRequest) requestTable.getValueAt(selectedRow, 2);
            WorkRequest p = (WorkRequest) requestTable.getValueAt(selectedRow, 2);
            if ( !p.getStatus().equals("Complete")) {
            business.getWorkQueue().getWorkRequestList().remove(p);

            //  business.getWorkQueue().getWorkRequestList().remove(p);
            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateWorkQueueTable();}
            else{JOptionPane.showMessageDialog(null,"Suggested not to be deleted as it is completed");}
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void reqBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtn2ActionPerformed
        if (!fundsTextField.getText().equals("") || !fundTypeComboBox.getSelectedItem().equals(null) || comboSup.getSelectedItem().equals(null)) {
            if(fundsTextField.getText().length() < 7){
            SupplierFundWorkRequest request = new SupplierFundWorkRequest();
            FundSupplier sup = (FundSupplier) comboSup.getSelectedItem();
            request.setFund((Fund) fundTypeComboBox.getSelectedItem());
            request.setRequestedFund(Integer.parseInt(fundsTextField.getText()));
            request.setStatus("Requested");
            request.setSender(account);
            request.setSupplier(sup);
            sup.getWorkQueue().getWorkRequestList().add(request);
            // organization.getWorkQueue().getWorkRequestList().add(request);
            provider.getWorkQueue().getWorkRequestList().add(request);
            
            int quant = Integer.parseInt(fundsTextField.getText());
            provider.setTotalAmt(provider.getTotalAmt()+ quant);
            account.setTotalAmt(provider.getTotalAmt());
            
            //account.getWorkQueue().getWorkRequestList().add(request);
            // business.getWorkQueue().getWorkRequestList().add(request);
            populateWorkQueueTable2();
        }
            else{
                JOptionPane.showMessageDialog(null, "For better results of bigger fund request divide it among different fund suppliers");
                fundsTextField.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_reqBtn2ActionPerformed

    private void btnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            WorkRequest p = (WorkRequest) requestTable1.getValueAt(selectedRow, 2);

            // s.getWorkQueue().getWorkRequestList().remove(p);
            provider.getWorkQueue().getWorkRequestList().remove(p);
            account.getWorkQueue().getWorkRequestList().remove(p);
            business.getWorkQueue().getWorkRequestList().remove(p);
            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateWorkQueueTable2();
        }
    }//GEN-LAST:event_btnDelete2ActionPerformed

    private void fundsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fundsTextFieldActionPerformed

    private void fundsTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fundsTextFieldKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if ((key >= KeyEvent.VK_0 && key <= KeyEvent.VK_9) || (key == KeyEvent.VK_NUM_LOCK) || (key == KeyEvent.VK_BACK_SPACE) || (key == KeyEvent.VK_SHIFT)) {
            fundsTextField.setEditable(true);
        } else {
            fundsTextField.setEditable(false);
            JOptionPane.showMessageDialog(null, "Only digits are allowed");
            fundsTextField.setText("");
        }
    }//GEN-LAST:event_fundsTextFieldKeyPressed

    private void fundTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fundTypeComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availableTable;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JComboBox comboSup;
    private javax.swing.JComboBox fundTypeComboBox;
    private javax.swing.JTextField fundsTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton reqBtn;
    private javax.swing.JButton reqBtn2;
    private javax.swing.JTable requestTable;
    private javax.swing.JTable requestTable1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}
