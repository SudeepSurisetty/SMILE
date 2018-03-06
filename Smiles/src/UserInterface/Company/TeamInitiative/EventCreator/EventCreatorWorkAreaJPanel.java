/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Company.TeamInitiative.EventCreator;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.TeamInitiativeOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.MemberOrganization.Member.EditProfileJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author JAI
 */
public class EventCreatorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EventCreatorWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private TeamInitiativeOrganization teamInitiativeOrganization;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem business;
    
    

    public EventCreatorWorkAreaJPanel(JPanel userProcessContainer, TeamInitiativeOrganization teamInitiativeOrganization, UserAccount account, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.teamInitiativeOrganization = teamInitiativeOrganization;
        this.account = account;
        this.enterprise = enterprise;
        this.business = business;
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
        jLabel4 = new javax.swing.JLabel();
        lblRequestorName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        createEventBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        performanceReviewBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        editProfileBtn = new javax.swing.JButton();
        manageMyEventsBtn = new javax.swing.JButton();
        imgJPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Event Creator Work Area");

        jLabel4.setText("Name :");

        lblRequestorName.setText("<Requestor Name>");

        jLabel5.setText("Age :");

        createEventBtn.setText("Create Event");
        createEventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEventBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("<Requestor Age>");

        jLabel7.setText("Smiles :");

        performanceReviewBtn.setText("Performance Review");
        performanceReviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                performanceReviewBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("<Smiles>");

        editProfileBtn.setText("Edit Profile");
        editProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileBtnActionPerformed(evt);
            }
        });

        manageMyEventsBtn.setText("Manage My Events");
        manageMyEventsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMyEventsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout imgJPanelLayout = new javax.swing.GroupLayout(imgJPanel);
        imgJPanel.setLayout(imgJPanelLayout);
        imgJPanelLayout.setHorizontalGroup(
            imgJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imgJPanelLayout.setVerticalGroup(
            imgJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel3.setText("(Photo)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRequestorName)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))))
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(editProfileBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manageMyEventsBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(performanceReviewBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createEventBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblRequestorName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addComponent(editProfileBtn)
                .addGap(18, 18, 18)
                .addComponent(createEventBtn)
                .addGap(18, 18, 18)
                .addComponent(manageMyEventsBtn)
                .addGap(18, 18, 18)
                .addComponent(performanceReviewBtn)
                .addContainerGap(270, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileBtnActionPerformed
        // TODO add your handling code here:
        EditProfileJPanel editProfileJPanel = new EditProfileJPanel(userProcessContainer,account);
        userProcessContainer.add("EditProfileJPanel", editProfileJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_editProfileBtnActionPerformed

    private void manageMyEventsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMyEventsBtnActionPerformed
        // TODO add your handling code here:
        ManageMyEventsJPanel manageMyEventsJPanel = new ManageMyEventsJPanel(userProcessContainer,account);
        userProcessContainer.add("ManageMyEventsJPanel", manageMyEventsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageMyEventsBtnActionPerformed

    private void createEventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEventBtnActionPerformed
        // TODO add your handling code here:
        CreateEventJPanel createEventJPanel = new CreateEventJPanel(userProcessContainer,teamInitiativeOrganization,account, enterprise,business);
        userProcessContainer.add("CreateEventJPanel", createEventJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createEventBtnActionPerformed

    private void performanceReviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_performanceReviewBtnActionPerformed
        // TODO add your handling code here:
        PerformanceReviewJPanel performanceReviewJPanel = new PerformanceReviewJPanel(userProcessContainer,account);
        userProcessContainer.add("PerformanceReviewJPanel", performanceReviewJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_performanceReviewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createEventBtn;
    private javax.swing.JButton editProfileBtn;
    private javax.swing.JPanel imgJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblRequestorName;
    private javax.swing.JButton manageMyEventsBtn;
    private javax.swing.JButton performanceReviewBtn;
    // End of variables declaration//GEN-END:variables
}
