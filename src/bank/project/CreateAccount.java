/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank.project;
import java.awt.*;
import java.io.*;
import java.sql.*;
import java.text.*;


import java.util.regex.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author gulshaneng
 */
public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
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

        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        prename = new javax.swing.JComboBox();
        firstname = new javax.swing.JTextField();
        middlename = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        nationality = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        country = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        prefather = new javax.swing.JComboBox();
        firstfathername = new javax.swing.JTextField();
        middlefathername = new javax.swing.JTextField();
        lastfathername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        same = new javax.swing.JComboBox();
        localstate = new javax.swing.JComboBox();
        day = new javax.swing.JComboBox();
        month = new javax.swing.JComboBox();
        branch = new javax.swing.JComboBox();
        localstreet = new javax.swing.JTextField();
        localDistrict = new javax.swing.JTextField();
        localEmail = new javax.swing.JTextField();
        localMobile = new javax.swing.JTextField();
        localCountry = new javax.swing.JTextField();
        paramDistrict = new javax.swing.JTextField();
        paramEmail = new javax.swing.JTextField();
        paramMobile = new javax.swing.JTextField();
        paramCountry = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        paramCity = new javax.swing.JComboBox();
        paramState = new javax.swing.JComboBox();
        paramStreet = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        localCity = new javax.swing.JComboBox();
        paramPin = new javax.swing.JTextField();
        localPin = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        year = new javax.swing.JComboBox();
        publik = new javax.swing.JRadioButton();
        staff = new javax.swing.JRadioButton();
        citision = new javax.swing.JCheckBox();
        minor = new javax.swing.JCheckBox();
        localmailerror = new javax.swing.JLabel();
        parammailerror = new javax.swing.JLabel();

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Submit");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Customer Type");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 93, -1, -1));

        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 133, -1, -1));

        prename.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr.", "Mrs.", "Ms.", "Other" }));
        getContentPane().add(prename, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 130, 60, -1));
        getContentPane().add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 130, 100, -1));
        getContentPane().add(middlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 120, -1));
        getContentPane().add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 120, -1));

        jLabel3.setText("Date of Birth");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 168, -1, -1));

        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 218, -1, -1));

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 215, -1, -1));

        jLabel5.setText("Nationality");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 256, -1, -1));

        nationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationalityActionPerformed(evt);
            }
        });
        getContentPane().add(nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 253, 60, -1));

        jLabel6.setText("Country Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 100, -1));
        getContentPane().add(country, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 120, -1));

        jLabel7.setText("Name of Father");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 294, -1, -1));

        prefather.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr.", "Mrs.", "Ms.", "Other" }));
        getContentPane().add(prefather, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 291, 60, -1));
        getContentPane().add(firstfathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 291, 100, -1));
        getContentPane().add(middlefathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 120, -1));

        lastfathername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastfathernameActionPerformed(evt);
            }
        });
        getContentPane().add(lastfathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 120, -1));

        jLabel8.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        jLabel8.setText("Correspondence/Local Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 494, -1));

        jLabel9.setText("PIN");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        jLabel10.setText("City");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        jLabel11.setText("Landmark / Street");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 403, -1, -1));

        jLabel13.setText("District");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 482, -1, -1));

        jLabel14.setText("State");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jLabel15.setText("Email Address");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, -1));

        jLabel16.setText("Country Name");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, -1, -1));

        jLabel17.setText("Mobile Number");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 444, -1, -1));

        same.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        same.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sameActionPerformed(evt);
            }
        });
        getContentPane().add(same, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 400, 90, -1));

        localstate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(localstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 115, -1));

        day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 168, 60, -1));

        month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 168, 100, -1));

        branch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Parbatta", "Bhagalpur", "Khagaria", "Patna", "Jamalpur", " " }));
        getContentPane().add(branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 120, -1));

        localstreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localstreetActionPerformed(evt);
            }
        });
        getContentPane().add(localstreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 240, -1));
        getContentPane().add(localDistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 115, -1));

        localEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                localEmailFocusLost(evt);
            }
        });
        localEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                localEmailKeyTyped(evt);
            }
        });
        getContentPane().add(localEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 115, -1));

        localMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                localMobileKeyTyped(evt);
            }
        });
        getContentPane().add(localMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 441, 115, -1));
        getContentPane().add(localCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 115, -1));
        getContentPane().add(paramDistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 510, 115, -1));

        paramEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                paramEmailFocusLost(evt);
            }
        });
        getContentPane().add(paramEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 530, 115, -1));

        paramMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paramMobileKeyTyped(evt);
            }
        });
        getContentPane().add(paramMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 480, 115, -1));
        getContentPane().add(paramCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 590, 115, -1));

        jLabel18.setText("PIN");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 550, -1, -1));

        jLabel19.setText("City");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, -1, -1));

        jLabel20.setText("Landmark / Street");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, -1, -1));

        jLabel22.setText("District");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, -1, -1));

        jLabel23.setText("State");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, -1, -1));

        jLabel24.setText("Email Address");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 530, -1, -1));

        jLabel25.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        jLabel25.setText("Permanent Address");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, 494, -1));

        jLabel26.setText("Country Name");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 590, -1, -1));

        jLabel27.setText("Mobile Number");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 480, -1, -1));

        paramCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(paramCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 590, 115, -1));

        paramState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(paramState, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 470, 115, -1));
        getContentPane().add(paramStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, 240, -1));

        jLabel28.setText("Same as Correspondence ");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 255, 0));
        jLabel29.setText("Application Form");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 376, -1));

        localCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(localCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 115, -1));

        paramPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paramPinKeyTyped(evt);
            }
        });
        getContentPane().add(paramPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 115, -1));

        localPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                localPinKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                localPinKeyTyped(evt);
            }
        });
        getContentPane().add(localPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 115, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 640, 140, -1));

        jButton3.setText("Add Photo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 280, -1, -1));
        getContentPane().add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, 170, 170));

        jLabel12.setText("Branch Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 100, -1));

        year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1990", "1991", "1992", " " }));
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 120, -1));

        buttonGroup2.add(publik);
        publik.setText("Public");
        publik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publikActionPerformed(evt);
            }
        });
        getContentPane().add(publik, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        buttonGroup2.add(staff);
        staff.setText("Staff");
        getContentPane().add(staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        citision.setText("Senior Citizen");
        citision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citisionActionPerformed(evt);
            }
        });
        getContentPane().add(citision, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        minor.setText("\t Minor");
        getContentPane().add(minor, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        localmailerror.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(localmailerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 110, -1));

        parammailerror.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(parammailerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 560, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void publikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publikActionPerformed

    private void nationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationalityActionPerformed

    private void lastfathernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastfathernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastfathernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Connection con;
      Statement st;
      ResultSet rs;
      String customerType=null;
                 if(publik.isSelected())
                     customerType=publik.getText();
		  else if(staff.isSelected())
                      customerType=staff.getText();
                   if(citision.isSelected())
                     customerType+=","+citision.getText();
		  if(minor.isSelected())
                      customerType+=","+minor.getText();
      String sDate1=day.getSelectedItem()+"/"+month.getSelectedItem()+"/"+year.getSelectedItem(); 
      DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
      java.util.Date date = null;
      java.util.Date dateobj =new java.util.Date(); 
        try {
           date=df.parse(sDate1);
          
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        java.sql.Date sqldate=new java.sql.Date(date.getTime());//change date to sql date
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","jaihanuman");
                st=con.createStatement();
		FileInputStream fis=new FileInputStream(f);
                int len=(int)f.length();
                
                      
		String query="insert into account (customer_type,name,dob,gender,nationality,country_name,father_name,image,apply_date)"+" values (?,?,?,?,?,?,?,?,?)";
		//to insert we have to create prepareStatement object wih prepareStatement() method
		 PreparedStatement preparedStmt = con.prepareStatement(query);
                 
                 preparedStmt.setString(1,customerType);
                 preparedStmt.setString(2,prename.getSelectedItem()+" "+firstname.getText()+" "+middlename.getText()+" "+lastname.getText());
		 preparedStmt.setDate(3,sqldate);
		preparedStmt.setString(4,gender.getSelectedItem()+"");
                preparedStmt.setString(5,nationality.getText());
                preparedStmt.setString(6,country.getText());
                preparedStmt.setString(7,prefather.getSelectedItem()+" "+firstfathername.getText()+" "+middlefathername.getText()+" "+lastfathername.getText());
                preparedStmt.setBinaryStream(8, fis,len);
                 preparedStmt.setDate(9, new java.sql.Date(dateobj.getTime()));
		preparedStmt.execute();
              
                String localadrs="insert into local_address (street ,state,district,pin,city,mobile,email,country,account_number)"+" values "
                        + "(?,?,?,?,?,?,?,?,(select account_number from account order by account_number desc limit 1))";
		//to insert we have to create prepareStatement object wih prepareStatement() method
		 PreparedStatement localaddress = con.prepareStatement(localadrs);
		 localaddress.setString(1,localstreet.getText());
                 localaddress.setString(2,localstate.getSelectedItem()+"");
		localaddress.setString(3,localDistrict.getText());
                localaddress.setString(4,localPin.getText());
                localaddress.setString(5,localCity.getSelectedItem()+"");
                localaddress.setString(6,localMobile.getText());
                localaddress.setString(7,localEmail.getText());
                localaddress.setString(8,localCountry.getText());
		localaddress.execute();
                
                 String prmadrs="insert into parmanent_address (same,street ,state,district,pin,city,mobile,email,country,account_number)"
                         +" values (?,?,?,?,?,?,?,?,?,(select account_number from account order by account_number desc limit 1))";
		//to insert we have to create prepareStatement object wih prepareStatement() method
		 PreparedStatement parmaddress = con.prepareStatement(prmadrs);
		 parmaddress.setString(1,same.getSelectedItem()+"");
                 parmaddress.setString(2,paramStreet.getText());
		parmaddress.setString(3,paramState.getSelectedItem()+"");
                parmaddress.setString(4,paramDistrict.getText());
                parmaddress.setString(5,paramPin.getText());
                parmaddress.setString(6,paramCity.getSelectedItem()+"");
                parmaddress.setString(7,paramMobile.getText());
                parmaddress.setString(8,paramEmail.getText());
                 parmaddress.setString(9,paramCountry.getText());
		parmaddress.execute();
                
		JOptionPane.showMessageDialog(null,"Successfully Save");
                con.close();
		this.dispose();
               Admin c=new Admin();
                c.setVisible(true);
		}
		catch(Exception e2)
		{
			JOptionPane.showMessageDialog(null,e2);
		}
						
    }//GEN-LAST:event_jButton2ActionPerformed
 File f;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.setCurrentDirectory(new File("C:\\"));
         chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter fileExtension=new FileNameExtensionFilter("*.jpg","png","bmp");
        chooser.addChoosableFileFilter(fileExtension);
        int result=chooser.showOpenDialog(null);
        if(result==JFileChooser.APPROVE_OPTION)
        {
        f=chooser.getSelectedFile();
         String filename=f.getAbsolutePath();
        ImageIcon image=new ImageIcon(filename);
            Rectangle rec=imageLabel.getBounds();
            Image scaledImage=image.getImage().getScaledInstance(rec.width,rec.height,Image.SCALE_DEFAULT);
       image=new ImageIcon(scaledImage);
        imageLabel.setIcon(image);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Cancel by user");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void sameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sameActionPerformed
    if(same.getSelectedItem()=="Yes")
       {
           paramStreet.setText(localstreet.getText());
           paramStreet.setEditable(false);
           paramState.setSelectedItem(localstate.getSelectedItem());
           paramState.setEditable(false);
           paramDistrict.setText(localDistrict.getText());
           paramDistrict.setEditable(false);
           paramPin.setText(localPin.getText());
           paramPin.setEditable(false);
           paramCity.setSelectedItem(localCity.getSelectedItem());
           paramCity.setEditable(false);
           paramMobile.setText(localMobile.getText());
           paramMobile.setEditable(false);
           paramEmail.setText(localEmail.getText());
           paramEmail.setEditable(false);
           paramCountry.setText(localCountry.getText());
           paramCountry.setEditable(false);
       }
       else
       {
          paramStreet.setText("");
           paramStreet.setEditable(true);
           paramState.setSelectedItem("");
            paramState.setEditable(true);
           paramDistrict.setText("");
            paramDistrict.setEditable(true);
           paramPin.setText("");
            paramPin.setEditable(true);
           paramCity.setSelectedItem("");
            paramCity.setEditable(true);
           paramMobile.setText("");
            paramMobile.setEditable(true);
           paramEmail.setText("");
            paramEmail.setEditable(true);
           paramCountry.setText(""); 
           paramCountry.setEditable(true);
       }        // TODO add your handling code here:
    }//GEN-LAST:event_sameActionPerformed

    private void localstreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localstreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localstreetActionPerformed

    private void citisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_citisionActionPerformed

    private void localPinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_localPinKeyPressed
       
               
        
    }//GEN-LAST:event_localPinKeyPressed

    private void localPinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_localPinKeyTyped
     char key=evt.getKeyChar();
         if (!Character.isDigit(key))
             evt.consume(); // consume() metod not to allow
         if(localPin.getText().length()>5)
             evt.consume();
    }//GEN-LAST:event_localPinKeyTyped

    private void paramPinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paramPinKeyTyped
char key=evt.getKeyChar();
         if (!Character.isDigit(key))
             evt.consume(); // consume() metod not to allow
         if(paramPin.getText().length()>5)
             evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_paramPinKeyTyped

    private void localMobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_localMobileKeyTyped
        char key=evt.getKeyChar();
         if (!Character.isDigit(key))
             evt.consume(); // consume() metod not to allow
         if(localMobile.getText().length()>9)
             evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_localMobileKeyTyped

    private void paramMobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paramMobileKeyTyped
 char key=evt.getKeyChar();
         if (!Character.isDigit(key))
             evt.consume(); // consume() metod not to allow
         if(paramMobile.getText().length()>9)
             evt.consume();         // TODO add your handling code here:
    }//GEN-LAST:event_paramMobileKeyTyped

    private void localEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_localEmailKeyTyped
       
    }//GEN-LAST:event_localEmailKeyTyped

    private void localEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_localEmailFocusLost
        Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9]*@gmail[.]com");
       Matcher m=p.matcher(localEmail.getText());
       if(!m.find())
       {
          localmailerror.setText("Invalid Ex :xyz@gmail.com");
      
       }
       else
         localmailerror.setText("");  
    }//GEN-LAST:event_localEmailFocusLost

    private void paramEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paramEmailFocusLost
Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9]*@gmail[.]com");
       Matcher m=p.matcher(localEmail.getText());
       if(!m.find())
          parammailerror.setText("Invalid Ex: xyz@gmail.com");
       else
         parammailerror.setText("");          
    }//GEN-LAST:event_paramEmailFocusLost

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
Admin c=new Admin();
    c.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox branch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JCheckBox citision;
    private javax.swing.JTextField country;
    private javax.swing.JComboBox day;
    private javax.swing.JTextField firstfathername;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox gender;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastfathername;
    private javax.swing.JTextField lastname;
    private javax.swing.JComboBox localCity;
    private javax.swing.JTextField localCountry;
    private javax.swing.JTextField localDistrict;
    private javax.swing.JTextField localEmail;
    private javax.swing.JTextField localMobile;
    private javax.swing.JTextField localPin;
    private javax.swing.JLabel localmailerror;
    private javax.swing.JComboBox localstate;
    private javax.swing.JTextField localstreet;
    private javax.swing.JTextField middlefathername;
    private javax.swing.JTextField middlename;
    private javax.swing.JCheckBox minor;
    private javax.swing.JComboBox month;
    private javax.swing.JTextField nationality;
    private javax.swing.JComboBox paramCity;
    private javax.swing.JTextField paramCountry;
    private javax.swing.JTextField paramDistrict;
    private javax.swing.JTextField paramEmail;
    private javax.swing.JTextField paramMobile;
    private javax.swing.JTextField paramPin;
    private javax.swing.JComboBox paramState;
    private javax.swing.JTextField paramStreet;
    private javax.swing.JLabel parammailerror;
    private javax.swing.JComboBox prefather;
    private javax.swing.JComboBox prename;
    private javax.swing.JRadioButton publik;
    private javax.swing.JComboBox same;
    private javax.swing.JRadioButton staff;
    private javax.swing.JComboBox year;
    // End of variables declaration//GEN-END:variables
}
