/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Company.TeamInitiative.EventCreator;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Fund.Fund;
import Business.Organization.CompanyFinanceOrganization;
import Business.Organization.CompanyMemberOrganization;
import Business.Organization.Organization;
import Business.Organization.TeamInitiativeOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FundWorkRequest;
import Business.WorkQueue.InitiativeWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JAI
 */
public class CreateEventJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateEventJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount account;
    private TeamInitiativeOrganization teamInitiativeOrganization;
    private Enterprise enterprise;
    

    public CreateEventJPanel(JPanel userProcessContainer,TeamInitiativeOrganization teamInitiativeOrganization, UserAccount account,Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.teamInitiativeOrganization=teamInitiativeOrganization;
        this.enterprise=enterprise;
        this.business = business;
        populateCombo();
        //System.out.println(business.getFundList().getFundList());
    }

    public void populateCombo(){
        for(Fund f : business.getFundList().getFundList()){
            comboFund.addItem(f);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaCompleteDesc = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        btnCreateEvent = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtShortDescription = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboEventType = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtOtherType = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        spinnerNbrOfPeopleReqd = new javax.swing.JSpinner();
        backBtn = new javax.swing.JButton();
        dateChooser_Validity = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        fundTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboFund = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create an Event");

        txtAreaCompleteDesc.setColumns(20);
        txtAreaCompleteDesc.setRows(5);
        jScrollPane1.setViewportView(txtAreaCompleteDesc);

        jLabel12.setText("Step 6:");

        btnCreateEvent.setText("Create Event");
        btnCreateEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEventActionPerformed(evt);
            }
        });

        jLabel13.setText("Enter Short Description :");

        txtShortDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShortDescriptionActionPerformed(evt);
            }
        });

        jLabel14.setText("Step 4:");

        jLabel15.setText("Enter Validity of Request");

        jLabel16.setText("Valid Till :");

        jLabel7.setText("Step 1:");

        jLabel8.setText("Enter Type of Event");

        jLabel9.setText("Type :");

        comboEventType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meet up", "Social Cause", "Others" }));
        comboEventType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEventTypeActionPerformed(evt);
            }
        });

        jLabel10.setText("Step 3:");

        jLabel11.setText("Enter Complete Description :");

        txtOtherType.setText("<Other>");
        txtOtherType.setEnabled(false);

        jLabel20.setText("Enter Number of people Required to initiate the Event");

        jLabel21.setText("Number of People Required :");

        jLabel22.setText("Step 2:");

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Step 5:");

        jLabel3.setText("Enter Funds($) Required for the event");

        jLabel4.setText("Fund Type:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboEventType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtOtherType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spinnerNbrOfPeopleReqd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtShortDescription, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(236, 236, 236))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dateChooser_Validity, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(94, 94, 94)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(fundTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCreateEvent))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboFund, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboEventType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOtherType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(dateChooser_Validity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(spinnerNbrOfPeopleReqd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtShortDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(12, 12, 12)
                                .addComponent(jLabel11))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboFund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(fundTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addComponent(btnCreateEvent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtShortDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShortDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShortDescriptionActionPerformed

    private void btnCreateEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEventActionPerformed
        
        if(spinnerNbrOfPeopleReqd.getValue().equals(null) || txtShortDescription.getText().equals("") || txtAreaCompleteDesc.getText().equals("") || dateChooser_Validity.getCalendar().equals("") || fundTextField.getText().equals("") || comboFund.getSelectedItem().equals(null)){
        JOptionPane.showMessageDialog(null, "Please enter all values");}
        else{
        int flag = 0;
        String eventType;      
        if(txtOtherType.isEnabled())
            eventType=txtOtherType.getText();
        else eventType=(String)comboEventType.getSelectedItem();
        
        int nbrOfPeopleRequired=(Integer)spinnerNbrOfPeopleReqd.getValue();
             if(nbrOfPeopleRequired<=1)
             {
               JOptionPane.showMessageDialog(null, "Number of people cannot be less than 2");    
             return;
             }
        String shortDescription=txtShortDescription.getText();
        String completeDescription=txtAreaCompleteDesc.getText();
        
        Calendar cal = dateChooser_Validity.getCalendar();
            int datevar = cal.get(Calendar.DATE);
            int monthvar = cal.get(Calendar.MONTH)+1;
            int yearvar = cal.get(Calendar.YEAR);
            String date = monthvar+"/"+datevar+"/"+yearvar ;
            String timeStamp = new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());
            Date validityDate;
            Date requestDate;
            
            //WorkRequest wr = new WorkRequest();
            InitiativeWorkRequest request=new InitiativeWorkRequest();
            //InitiativeWorkRequest request = (InitiativeWorkRequest)wr;
            request.setRequestType("Team Event");
            request.setSender(account);
            
            request.setType(eventType);
            request.setNbrOfPeopleRequired(nbrOfPeopleRequired);
            request.setShrtDescription(shortDescription);
            request.setLngDescription(completeDescription);
            try {
                validityDate=new SimpleDateFormat("MM/dd/yyyy").parse(date);
                requestDate=new SimpleDateFormat("MM/dd/yyyy").parse(timeStamp);
                request.setValidityDate(validityDate);
                request.setRequestDate(requestDate);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Error with Validity Date");
            }
            request.setStatus("New Event");
            request.setFundStatus("Quotation Sent");
            
            if(request.getValidityDate().before(request.getRequestDate()))
           {
               JOptionPane.showMessageDialog(null, "Validity Date cannot be less than today's date");
               flag=1;
           }
            
            request.setFund((Fund)comboFund.getSelectedItem());
            request.setRequestedFund(Integer.parseInt(fundTextField.getText()));
            
            Organization org1 = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof CompanyFinanceOrganization){
                org1 = organization;
                break;
            }
        }
        
            Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof CompanyMemberOrganization){
                org = organization;
                break;
            }
        }
        Organization org2 = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof TeamInitiativeOrganization){
                org2 = organization;
                break;
            }
        }
        
        if(flag ==0){
        if (org1!=null){
            org1.getWorkQueue().getWorkRequestList().add(request);
            //business.getWorkQueue().getWorkRequestList().add(wr);
        }
        if (org2!=null){
            org2.getWorkQueue().getWorkRequestList().add(request);
            //business.getWorkQueue().getWorkRequestList().add(wr);
        }    

        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            
            //account.getWorkQueue().getWorkRequestList().add(request);
        }
        
        
        //org1.getWorkQueue().getWorkRequestList().add(request);
        account.getWorkQueue().getWorkRequestList().add(request);
        
        
        JOptionPane.showMessageDialog(null, "Request message sent");
        
        comboEventType.setEnabled(false);
        spinnerNbrOfPeopleReqd.setEnabled(false);
        txtShortDescription.setEnabled(false);
        txtAreaCompleteDesc.setEnabled(false);
        dateChooser_Validity.setEnabled(false);
        fundTextField.setEnabled(false);
        comboFund.setEnabled(false);
        btnCreateEvent.setEnabled(false);
        txtOtherType.setEnabled(false);
        
        }
        }     
    }//GEN-LAST:event_btnCreateEventActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void comboEventTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEventTypeActionPerformed
        String selectedItem= (String)comboEventType.getSelectedItem();
        if(selectedItem.equalsIgnoreCase("Others"))
        {
            txtOtherType.setEnabled(true);
            txtOtherType.setEditable(true);
        }
        else
        {
            txtOtherType.setEnabled(false);
            txtOtherType.setEditable(false);
        }
            
    }//GEN-LAST:event_comboEventTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnCreateEvent;
    private javax.swing.JComboBox<String> comboEventType;
    private javax.swing.JComboBox comboFund;
    private com.toedter.calendar.JDateChooser dateChooser_Validity;
    private javax.swing.JTextField fundTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinnerNbrOfPeopleReqd;
    private javax.swing.JTextArea txtAreaCompleteDesc;
    private javax.swing.JTextField txtOtherType;
    private javax.swing.JTextField txtShortDescription;
    // End of variables declaration//GEN-END:variables
}