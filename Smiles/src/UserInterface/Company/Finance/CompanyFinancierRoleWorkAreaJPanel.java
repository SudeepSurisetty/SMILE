package UserInterface.Company.Finance;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Financier.Financier;
import Business.Fund.Fund;
import Business.Organization.CompanyFinanceOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InitiativeWorkRequest;
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
public class CompanyFinancierRoleWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private CompanyFinanceOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    
    Financier financier;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public CompanyFinancierRoleWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, CompanyFinanceOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        this.organization = organization;
        
        financier=organization.getF();
        if (financier.getWorkQueue() == null) {
            WorkQueue w = new WorkQueue();
            financier.setWorkQueue(w);
        }
        
        populateCombo();
        populateQuantity();
        populateWorkQueueTable();
        populateWorkQueueTable2();
        populateAvailable();

    }

    public void populateCombo() {
        for (Fund fund : business.getFundList().getFundList()) {
            fundTypeCombo.addItem(fund);
        }

    }

    public void populateWorkQueueTable() {
        DefaultTableModel model = (DefaultTableModel) requestTable.getModel();

        model.setRowCount(0);

        for (WorkRequest work : organization.getWorkQueue().getWorkRequestList()) {
            if(work instanceof InitiativeWorkRequest){ 
            Object[] row = new Object[6];
            row[0] = work.getFund().getFundName();
            row[1] = ((InitiativeWorkRequest) work).getRequestedFund();
            //row[1] = work.getRequestedFund();
            row[2] = work;
            row[3] = ((InitiativeWorkRequest) work).getFundStatus();
            row[4] = work.getReceiver();
            row[5] = work.getSender();
            model.addRow(row);
            }
        }
    }

    
    public void populateWorkQueueTable2() {
        DefaultTableModel model = (DefaultTableModel) requestTable2.getModel();

        model.setRowCount(0);

        for (WorkRequest work : financier.getWorkQueue().getWorkRequestList()) {
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
    
    public void populateAvailable() {
        DefaultTableModel model = (DefaultTableModel) availableTable.getModel();

        model.setRowCount(0);
        
        
        Financier f = organization.getF();
        System.out.println("Financier" + f.getFundList().getFundList().size());
        for (Fund fund : f.getFundList().getFundList()) {

            Object[] row = new Object[2];
            row[0] = fund.getFundName();
            row[1] = fund.getFund();
            model.addRow(row);

        }
        /*for (WorkRequest work : financier.getWorkQueue().getWorkRequestList()) {
             
            Object[] row = new Object[2];
            row[0] = work.getFund().getFundName();
            row[1] = work.getRequestedFund();            
            model.addRow(row);
            //}
        }*/
    }

    public void populateQuantity() {

        for (WorkRequest workRequest : financier.getWorkQueue().getWorkRequestList()) {
            // HashMap<WorkRequest,Integer> map = new HashMap<WorkRequest,Integer>();
            int temp = 0;
            WorkRequest p = (WorkRequest) workRequest;
            if (workRequest.getStatus().equals("Complete") && !p.isAdd()) { //&& add == false
                Fund f = workRequest.getFund();

                for (Fund fund : financier.getFundList().getFundList()) {
                    if (f.getFundName().equals(fund.getFundName())) {
                        temp = 1;
                        fund.setFund(p.getRequestedFund() + fund.getFund());
                    }

                }
                if (temp == 0) {
                    Fund fu = financier.getFundList().addFund();
                    fu.setFundName(f.getFundName());
                    fu.setFund(p.getRequestedFund());
                }
                p.setAdd(true);
            }
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
        reqBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        fundTypeCombo = new javax.swing.JComboBox();
        fundsTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        requestTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnDelete2 = new javax.swing.JButton();
        assignToButton = new javax.swing.JButton();
        completeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Financier Work Area ");

        reqBtn.setText("Request Funds");
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
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(availableTable);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Funds Requested");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Funds Available");

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fund type", "Amount", "Name", "Status", "Receiver", "Sender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(requestTable);

        fundsTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fundsTextFieldKeyPressed(evt);
            }
        });

        jLabel2.setText("Fund Type :");

        backJButton.setText("Refresh");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete request");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        requestTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fund Type", "Amount", "Status", "Receiver", "Sender"
            }
        ));
        jScrollPane3.setViewportView(requestTable2);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Funds Requested received");

        btnDelete2.setText("Delete Request");
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete2ActionPerformed(evt);
            }
        });

        assignToButton.setText("Assign to me");
        assignToButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToButtonActionPerformed(evt);
            }
        });

        completeButton.setText("Complete ");
        completeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Amount($)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fundTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnDelete)
                                                .addGap(74, 74, 74)
                                                .addComponent(assignToButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(69, 69, 69)))
                                        .addComponent(completeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJButton)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(fundsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(reqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backJButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(assignToButton)
                            .addComponent(completeButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fundTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fundsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(reqBtn)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtnActionPerformed
        if (!fundsTextField.getText().equals("")) {
            //FundWorkRequest request= new FundWorkRequest();
            WorkRequest request = new WorkRequest();
            request.setFund((Fund) fundTypeCombo.getSelectedItem());
            request.setRequestedFund(Integer.parseInt(fundsTextField.getText()));
            request.setStatus("Requested");
            request.setSender(account);
            //organization.getWorkQueue().getWorkRequestList().add(request);
            financier.getWorkQueue().getWorkRequestList().add(request);
            business.getWorkQueue().getWorkRequestList().add(request);
            
            populateWorkQueueTable2();
            JOptionPane.showMessageDialog(null, "Request for Funds submitted");
            fundTypeCombo.setSelectedItem(null);
            fundsTextField.setText("");
            
        } else {
            JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_reqBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        new CompanyFinancierRoleWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            WorkRequest p = (WorkRequest) requestTable.getValueAt(selectedRow, 2);
            if (  !p.getStatus().equals("Complete")) {
            // s.getWorkQueue().getWorkRequestList().remove(p);
            organization.getWorkQueue().getWorkRequestList().remove(p);
            account.getWorkQueue().getWorkRequestList().remove(p);
            //business.getWorkQueue().getWorkRequestList().remove(p);
            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateWorkQueueTable();}
            else{JOptionPane.showMessageDialog(null,"Suggested not to be deleted as it is assigend or completed");}
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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

    private void btnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            WorkRequest p = (WorkRequest) requestTable.getValueAt(selectedRow, 2);

            // s.getWorkQueue().getWorkRequestList().remove(p);
            //organization.getWorkQueue().getWorkRequestList().remove(p);
            account.getWorkQueue().getWorkRequestList().remove(p);
            business.getWorkQueue().getWorkRequestList().remove(p);
            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateWorkQueueTable();
        }
    }//GEN-LAST:event_btnDelete2ActionPerformed

    private void assignToButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToButtonActionPerformed
        // TODO add your handling code here:
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
            else{JOptionPane.showMessageDialog(null,"Request already assigned or completed ");}
        }
    }//GEN-LAST:event_assignToButtonActionPerformed

    private void completeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the request", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            InitiativeWorkRequest p=(InitiativeWorkRequest) requestTable.getValueAt(selectedRow, 2);
            //WorkRequest p = (WorkRequest) requestTable.getValueAt(selectedRow, 2);
            int temp = 0;
            if (p.getReceiver() != null) {
                if (!p.getFundStatus().equals("Approved")) {
                    UserAccount a = p.getSender();
                    if (financier.getFundList().getFundList().size() <= 0) {
                        JOptionPane.showMessageDialog(null, "----No Funds available. Request from Supplier");
                        return;
                    }
                    //System.out.println(provider.getFundList().getFundList());
                    for (Fund v : financier.getFundList().getFundList()) {
                        System.out.println(v);
                        if (p.getFund().getFundName().equals(v.getFundName())) {
                            System.out.println(p.getFund().getFundName()+ "Name1");
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

                    //p.setStatus("Complete");
                    p.setFundStatus("Approved");
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
    }//GEN-LAST:event_completeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToButton;
    private javax.swing.JTable availableTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton completeButton;
    private javax.swing.JComboBox fundTypeCombo;
    private javax.swing.JTextField fundsTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton reqBtn;
    private javax.swing.JTable requestTable;
    private javax.swing.JTable requestTable2;
    // End of variables declaration//GEN-END:variables

}
