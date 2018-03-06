/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.MemberOrganization.Member;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.MemberOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.IndividualWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sowjanya
 */
public class MemberDashBoardJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount account;
    private Enterprise enterprise;
    private MemberOrganization memberOrganization;

    MemberDashBoardJPanel(JPanel userProcessContainer, MemberOrganization memberOrganization, UserAccount account, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
        this.enterprise = enterprise;
        this.memberOrganization = memberOrganization;
    }

    
    public void populateRequestTable(){
        /*
//        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
//        
//        model.setRowCount(0);
//        for (WorkRequest request : memberOrganization.getWorkQueue().getWorkRequestList()){
//            Object[] row = new Object[4];
//            row[0] = ((IndividualWorkRequest) request);
//            row[1] = request.getSender();
//            row[2] = request.getStatus();
//            row[3] = request.getReceiver() == null ? null : request.getReceiver().getPerson().getFirstName();
////            row[3] = ((IndividualWorkRequest) request).getHelptype();
//            
////            String result = ((IndividualWorkRequest) request).getHelptype();
////            row[3] = request.getSender();
////            row
//            //row[3] = result == null ? "Waiting" : result;
//            
//            model.addRow(row);
//        }
         DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        Organization org = null;
      for(Organization organi: enterprise.getOrganizationDirectory().getOrganizationList()){
          if(organi instanceof MemberOrganization)
          {
              org = organi;
             IndividualWorkRequest req = null; 
           for (WorkRequest request : org.getWorkQueue().getWorkRequestList()){
            if( request instanceof IndividualWorkRequest)
            {
            req =(IndividualWorkRequest)request;
            Object[] row = new Object[4];
            row[0] = (request);
            row[1] = request.getSender();
            row[2] = request.getStatus();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getPerson().getFirstName();
//            row[3] = ((IndividualWorkRequest) request).getHelptype();
            
//            String result = ((IndividualWorkRequest) request).getHelptype();
//            row[3] = request.getSender();
//            row
            //row[3] = result == null ? "Waiting" : result;
            
            model.addRow(row);
            }
          }
        }
      }  


      
      
       DefaultTableModel model = (DefaultTableModel) tblRequestWorkqueue1.getModel();
        model.setRowCount(0);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {

            if (request.isComplete() ) {
                //if(request.getSender().equals(account.getUsername())&& ( !(request.isParticipate()) || (request.isComplete()) ||(request.isParticipate())) ){
                Object[] row = new Object[4];
                row[1] = request.getSender();
                row[0] = ((IndividualWorkRequest) request);
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getPerson().getFirstName();
                row[3] = request.getStatus();
//            row[3] = ((IndividualWorkRequest) request).getHelptype();
//            String result = ((IndividualWorkRequest) request).getHelptype();
//            row[3] = request.getSender();
//            row
                //row[3] = result == null ? "Waiting" : result;

                model.addRow(row);
            }
            //}
        }
      

*/
    }
   
    
    public void populateRequestsTable(){
        
        DefaultTableModel model = (DefaultTableModel) tblRequestWorkqueue.getModel();
        model.setRowCount(0);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
            //if (!(request.getStatus().equals("Completed"))) {
                // if(request.getSender().equals(account.getUsername())&& !(request.isComplete())){
                if(request.isParticipate() || !(request.isComplete())){
                Object[] row = new Object[4];
                row[1] = request.getSender();
                row[0] = ((IndividualWorkRequest) request);
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getPerson().getFirstName();
                row[3] = request.getStatus();
                
                 model.addRow(row);
                }
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
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRequestWorkqueue = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRequestWorkqueue1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("                   YOUR ACTIVITY");

        jButton1.setText("<<Back");

        tblRequestWorkqueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Short Description", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblRequestWorkqueue);

        tblRequestWorkqueue1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ShortDescription", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblRequestWorkqueue1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1027, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblRequestWorkqueue;
    private javax.swing.JTable tblRequestWorkqueue1;
    // End of variables declaration//GEN-END:variables
}
