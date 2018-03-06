/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.MemberOrganization;
import Business.Person.Person;
import Business.Role.MemberRole;
import Business.UserAccount.UserAccount;
import UserInterface.MemberOrganization.Member.MemberRoleWorkAreaJPanel;
//import com.sun.xml.internal.ws.util.StringUtils;
import java.awt.CardLayout;
import static java.awt.PageAttributes.MediaType.A;
import java.util.Random;
import java.util.regex.Pattern;
import static javafx.scene.input.KeyCode.Z;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author sowjanya
 */
public class RegisterUserAccountJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private MemberOrganization memberOrganization;
    private Enterprise enterprise;
    private Person person;
    private UserAccount account;
    private String password;
    private int flag=0;


    RegisterUserAccountJPanel(JPanel userProcessContainer, MemberOrganization memberOrganization, Person p, Enterprise enterprise, EcoSystem system) {
      initComponents();
      this.system = system;
      this.userProcessContainer = userProcessContainer;
      this.memberOrganization = memberOrganization;
      this.enterprise = enterprise;
      this.person =p;
      account = new UserAccount();
      
      String captcha = createCaptcha();
      captchaLabel.setText(captcha);
      
    }

    public String createCaptcha() {

        Random random = new Random();
        int length = 7 + (Math.abs(random.nextInt()) % 3);
        StringBuffer captchaBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int basecharacterNumber = (Math.abs(random.nextInt())) % 62;
            int characterNumber = 0;
            if (basecharacterNumber < 26) {
                characterNumber = 65 + basecharacterNumber;
            } else if (basecharacterNumber < 52) {
                characterNumber = 97 + (basecharacterNumber - 26);
            } else {
                characterNumber = 48 + (basecharacterNumber - 52);

            }
            captchaBuffer.append((char) characterNumber);
        }
        return captchaBuffer.toString();

    }
    
 //  UserAccount account = org.getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtConfirmPassword.getText(), p, new MemberRole());
//   account.getPerson().setImageURL(path);
//    account.getPerson().setImageIcon(icon);
//   ua = account;
//
//   System.out.println(account + "Here is the account");
//   System.out.println(org + "Hello here is the organization");
     //CardLayout layout = (CardLayout) userProcessContainer.getLayout();
     // userProcessContainer.add("RequestLabTestJPanel", new MemberRoleWorkAreaJPanel(userProcessContainer, (MemberOrganization) org, account, enterprise, system));
    //layout.next(userProcessContainer);
               // p.setEmailID(name);
                           // p.setEmailID(txtEmail.getText());
                         //  p.setMblNo(Integer.parseInt(txtMobileNbr.getText()));  
    
    
    //identificationTxtField  emailIdTxtField  phoneNumberTxtField userNameTextField pwdTextField pwdConfirmTxtField agreeCheckBox
    //captchaTextField
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        identificationTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailIdTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        phoneNumberTxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        agreecheckBox = new javax.swing.JCheckBox();
        registerUserAccountBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        captchaLabel = new javax.swing.JLabel();
        captchaTextField = new javax.swing.JTextField();
        captchaBtn = new javax.swing.JButton();
        pwdTextField = new javax.swing.JPasswordField();
        pwdConfirmTxtField = new javax.swing.JPasswordField();
        pwdStrengthLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Create your Account Credentials");

        jLabel3.setText("Identification Proof");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Any Govt Authorized Identification");

        identificationTxtField.setBackground(new java.awt.Color(255, 255, 204));
        identificationTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                identificationTxtFieldKeyTyped(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/icons8_Gmail_48px.png"))); // NOI18N
        jLabel5.setText("      Email Id");

        emailIdTxtField.setBackground(new java.awt.Color(255, 255, 204));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/icons8_Cell_Phone_48px.png"))); // NOI18N
        jLabel7.setText("  Phone No");

        phoneNumberTxtField.setBackground(new java.awt.Color(255, 255, 204));
        phoneNumberTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTxtFieldActionPerformed(evt);
            }
        });
        phoneNumberTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneNumberTxtFieldKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Provide details to register your account ");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/icons8_Male_User_48px_1.png"))); // NOI18N
        jLabel9.setText("UserName");

        userNameTextField.setBackground(new java.awt.Color(255, 255, 204));
        userNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userNameTextFieldKeyTyped(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/icons8_Key_48px.png"))); // NOI18N
        jLabel10.setText("     Password");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("(UserName must be unique)");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/icons8_Key_2_48px.png"))); // NOI18N
        jLabel12.setText(" Confirm Password");

        agreecheckBox.setText("By continuing, I agree to the terms of service and privacy policy.");

        registerUserAccountBtn.setText("Register and Smile");
        registerUserAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerUserAccountBtnActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/icons8_CAPTCHA_48px.png"))); // NOI18N
        jLabel13.setText("   You are not a Robot");

        captchaLabel.setBackground(new java.awt.Color(255, 255, 204));
        captchaLabel.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        captchaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                captchaLabelMouseClicked(evt);
            }
        });

        captchaTextField.setBackground(new java.awt.Color(255, 255, 204));
        captchaTextField.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        captchaBtn.setText("New Captcha");
        captchaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                captchaBtnActionPerformed(evt);
            }
        });

        pwdTextField.setBackground(new java.awt.Color(255, 255, 204));
        pwdTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwdTextFieldKeyReleased(evt);
            }
        });

        pwdConfirmTxtField.setBackground(new java.awt.Color(255, 255, 204));
        pwdConfirmTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwdConfirmTxtFieldFocusLost(evt);
            }
        });
        pwdConfirmTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwdConfirmTxtFieldKeyReleased(evt);
            }
        });

        pwdStrengthLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pwdStrengthLabel.setText(".");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(captchaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(identificationTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(emailIdTxtField))
                            .addComponent(phoneNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(captchaBtn)
                                    .addGap(100, 100, 100))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(67, 67, 67)))
                            .addComponent(captchaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(88, 88, 88)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(140, 140, 140)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(72, 72, 72)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(pwdStrengthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(userNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(pwdTextField)
                                    .addComponent(pwdConfirmTxtField)))
                            .addGap(15, 15, 15)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(registerUserAccountBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(agreecheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(256, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(identificationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(pwdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(pwdConfirmTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(pwdStrengthLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(captchaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(captchaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(captchaBtn)
                        .addGap(53, 53, 53)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agreecheckBox)
                .addGap(8, 8, 8)
                .addComponent(registerUserAccountBtn))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jLabel8)
                    .addContainerGap(560, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Register Your Account");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("                                    Yay! You are almost done");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerUserAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerUserAccountBtnActionPerformed
        // TODO add your handling code here:
    if (!(identificationTxtField.getText().equals("") || emailIdTxtField.getText().equals("") || phoneNumberTxtField.getText().equals("") || userNameTextField.getText().equals("")|| pwdTextField.getText().equals(""))){  

      if ((Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{6,15}", pwdTextField.getText()))){
        if ((Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{6,15}", pwdConfirmTxtField.getText()))){
        //  if (!(Pattern.matches("^[_a-zA-Z0-9]+([@]{1}+[_a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", emailIdTxtField.getText()))){
     
             person.setIdentity(identificationTxtField.getText());
             person.setEmailID(emailIdTxtField.getText());
             person.setMblNo(phoneNumberTxtField.getText());
       
             char[] passwordCharArray = pwdTextField.getPassword();
             char[] confirmPasswordCharArray = pwdConfirmTxtField.getPassword();
          
             String pasword = String.valueOf(passwordCharArray);
             String confirmPassword = String.valueOf(confirmPasswordCharArray);
           
             if(pasword.equals(confirmPassword)){ 
              password = confirmPassword;        
               }
             else{
             JOptionPane.showMessageDialog(null, "The passwords you entered did not matach");
              }   
    
          if (captchaTextField.getText().equalsIgnoreCase(captchaLabel.getText())){
            if(agreecheckBox.isSelected()){     
                  UserAccount account = memberOrganization.getUserAccountDirectory().createUserAccount(userNameTextField.getText(), password, person, new MemberRole());           
                  userProcessContainer.add("RequestLabTestJPanel", new MemberRoleWorkAreaJPanel(userProcessContainer, memberOrganization, account, enterprise, system));
                  CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                  layout.next(userProcessContainer);    
              }
            else 
               {
                 JOptionPane.showMessageDialog(null, "Please agree to the terms of service and Register");
               }
             }
          else {
                 JOptionPane.showMessageDialog(null, "Please enter the correct captcha");
               }       
        //    }
//          else{
//              JOptionPane.showMessageDialog(null, "Please enter a valid email address","Error",JOptionPane.ERROR_MESSAGE);
//          }
          
         }
         
        else{
         JOptionPane.showMessageDialog(null, "Please enter a valid Password. Password must contain atleast one special character,number, upper and lower case","Error",JOptionPane.ERROR_MESSAGE);   
           }
        } 
      else{
      JOptionPane.showMessageDialog(null, "Please enter a valid Password. Password must contain atleast one special character,number, upper and lower case","Error",JOptionPane.ERROR_MESSAGE);  
      }   
    }
    else {
        JOptionPane.showMessageDialog(null, "Please enter the values in all the required fields");
       }
    }//GEN-LAST:event_registerUserAccountBtnActionPerformed

    private void captchaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_captchaLabelMouseClicked
        // TODO add your handling code here:
        String captcha = createCaptcha();
        captchaLabel.setText(captcha);
        captchaTextField.setText("");
        
    }//GEN-LAST:event_captchaLabelMouseClicked

    private void captchaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_captchaBtnActionPerformed
        // TODO add your handling code here:
        
       String captcha = createCaptcha();
        captchaLabel.setText(captcha);
        captchaTextField.setText("");
    }//GEN-LAST:event_captchaBtnActionPerformed

    private void pwdTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdTextFieldKeyReleased
        // TODO add your handling code here:
        if((pwdTextField.getText().length()==8)){
            pwdStrengthLabel.setText("");
            pwdStrengthLabel.setText("Medium");
           }
        else if(  ((pwdTextField.getText().length())<8)  ){
            pwdStrengthLabel.setText("");
            pwdStrengthLabel.setText("Weak");
        }
        else if((pwdTextField.getText().length()>8)){
            pwdStrengthLabel.setText("");
            pwdStrengthLabel.setText("Strong"); 
        }
        
      if(pwdTextField.getText().length()>=15) {  
             evt.consume();
          } 
        
    }//GEN-LAST:event_pwdTextFieldKeyReleased

    private void identificationTxtFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_identificationTxtFieldKeyTyped
        // TODO add your handling code here:
       if(identificationTxtField.getText().length()>=8) {  
       JOptionPane.showMessageDialog(null, "Only 8 characters are allowed"); 
       evt.consume();
 }
        
    }//GEN-LAST:event_identificationTxtFieldKeyTyped

    private void userNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameTextFieldKeyTyped
        // TODO add your handling code here:
      if(userNameTextField.getText().length()>=8) {  
       JOptionPane.showMessageDialog(null, "Only 8 characters are allowed");   
       evt.consume();
      }
    }//GEN-LAST:event_userNameTextFieldKeyTyped

    private void pwdConfirmTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdConfirmTxtFieldKeyReleased
        // TODO add your handling code here:
                // TODO add your handling code here:
        if((pwdConfirmTxtField.getText().length()==8)){
            pwdStrengthLabel.setText("");
            pwdStrengthLabel.setText("Medium");
           }
        else if(((pwdConfirmTxtField.getText().length())<8)  ){
            pwdStrengthLabel.setText("");
            pwdStrengthLabel.setText("Weak");
        }
        else if((pwdConfirmTxtField.getText().length()>8)){
            pwdStrengthLabel.setText("");
            pwdStrengthLabel.setText("Strong"); 
        }
    }//GEN-LAST:event_pwdConfirmTxtFieldKeyReleased

    private void phoneNumberTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTxtFieldActionPerformed
        // TODO add your handling code here:
       if((Pattern.matches("[a-zA-Z]+",phoneNumberTxtField.getText()))){
         JOptionPane.showMessageDialog(null, "Only Numnbers are allowed","Error",JOptionPane.ERROR_MESSAGE);
         
      }
    }//GEN-LAST:event_phoneNumberTxtFieldActionPerformed

    private void phoneNumberTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberTxtFieldKeyPressed
        // TODO add your handling code here:
     if((Pattern.matches("[a-zA-Z]+",phoneNumberTxtField.getText()))){
         JOptionPane.showMessageDialog(null, "Only Numnbers are allowed","Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_phoneNumberTxtFieldKeyPressed

    private void pwdConfirmTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdConfirmTxtFieldFocusLost
        // TODO add your handling code here:
        pwdStrengthLabel.setText("");
    }//GEN-LAST:event_pwdConfirmTxtFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agreecheckBox;
    private javax.swing.JButton captchaBtn;
    private javax.swing.JLabel captchaLabel;
    private javax.swing.JTextField captchaTextField;
    private javax.swing.JTextField emailIdTxtField;
    private javax.swing.JTextField identificationTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField phoneNumberTxtField;
    private javax.swing.JPasswordField pwdConfirmTxtField;
    private javax.swing.JLabel pwdStrengthLabel;
    private javax.swing.JPasswordField pwdTextField;
    private javax.swing.JButton registerUserAccountBtn;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}