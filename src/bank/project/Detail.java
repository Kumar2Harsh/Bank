/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.project;


public  class Detail extends javax.swing.JFrame {

    /**
     * Creates new form Detail
     */
    public Detail() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        yesno = new javax.swing.JLabel();
        paramstreet = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        ctype = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        country = new javax.swing.JTextField();
        fathername = new javax.swing.JTextField();
        nationality = new javax.swing.JTextField();
        localCountry = new javax.swing.JTextField();
        localMobile = new javax.swing.JTextField();
        localEmail = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        localCity = new javax.swing.JTextField();
        localDistrict = new javax.swing.JTextField();
        localPin = new javax.swing.JTextField();
        localstreet = new javax.swing.JTextField();
        localstate = new javax.swing.JTextField();
        paramCity = new javax.swing.JTextField();
        paramDistrict = new javax.swing.JTextField();
        paramPin = new javax.swing.JTextField();
        same = new javax.swing.JTextField();
        paramState = new javax.swing.JTextField();
        paramstreet2 = new javax.swing.JTextField();
        localCountry1 = new javax.swing.JTextField();
        localMobile1 = new javax.swing.JTextField();
        localEmail1 = new javax.swing.JTextField();
        paramCountry = new javax.swing.JTextField();
        paramMobile = new javax.swing.JTextField();
        paramEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Detail");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Customer Type");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 93, -1, -1));

        jLabel2.setText("Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 133, -1, -1));

        jLabel3.setText("Date of Birth :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel4.setText("Gender :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel5.setText("Nationality :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jLabel6.setText("Country Name :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        jLabel7.setText("Father's Name :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        jLabel8.setText("Your full detail");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 494, -1));

        jLabel15.setText("Email Address :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 450, -1, -1));

        jLabel16.setText("Country Name :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 490, -1, -1));

        jLabel17.setText("Mobile Number :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 410, -1, -1));

        jLabel25.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        jLabel25.setText("Permanent Address");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 494, -1));

        jLabel28.setText("Same as Correspondence  :");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, -1, -1));
        getContentPane().add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 90, 170, 170));

        jLabel9.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        jLabel9.setText("Correspondence/Local Address");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 494, -1));
        getContentPane().add(yesno, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 330, 170, -1));
        getContentPane().add(paramstreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, 150, -1));

        jLabel34.setText("Landmark / Street :");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel35.setText("District :");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        jLabel36.setText("State :");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel37.setText("Pin Code :");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jLabel38.setText("City :");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        jLabel39.setText("Landmark / Street :");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 364, 140, 20));

        jLabel40.setText("District :");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, -1, -1));

        jLabel41.setText("State :");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, -1));

        jLabel42.setText("Pin Code :");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, -1, -1));

        jLabel43.setText("City :");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, -1, -1));
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 150, -1));

        jLabel18.setText("Email Address :");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        jLabel19.setText("Country Name :");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        jLabel20.setText("Mobile Number :");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Available Balance");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, 150, -1));

        balance.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        balance.setForeground(new java.awt.Color(51, 255, 0));
        balance.setToolTipText("");
        getContentPane().add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, -1, -1));

        gender.setEditable(false);
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 150, -1));

        ctype.setEditable(false);
        getContentPane().add(ctype, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 150, -1));

        dob.setEditable(false);
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 150, -1));

        country.setEditable(false);
        getContentPane().add(country, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 150, -1));

        fathername.setEditable(false);
        getContentPane().add(fathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 150, -1));

        nationality.setEditable(false);
        getContentPane().add(nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 150, -1));

        localCountry.setEditable(false);
        getContentPane().add(localCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 150, -1));

        localMobile.setEditable(false);
        getContentPane().add(localMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 150, -1));

        localEmail.setEditable(false);
        getContentPane().add(localEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 150, -1));

        name.setEditable(false);
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 150, -1));

        localCity.setEditable(false);
        getContentPane().add(localCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 150, -1));

        localDistrict.setEditable(false);
        getContentPane().add(localDistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 150, -1));

        localPin.setEditable(false);
        getContentPane().add(localPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 150, -1));

        localstreet.setEditable(false);
        getContentPane().add(localstreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 150, -1));

        localstate.setEditable(false);
        getContentPane().add(localstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 150, -1));

        paramCity.setEditable(false);
        getContentPane().add(paramCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 520, 150, -1));

        paramDistrict.setEditable(false);
        getContentPane().add(paramDistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 440, 150, -1));

        paramPin.setEditable(false);
        getContentPane().add(paramPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 480, 150, -1));

        same.setEditable(false);
        getContentPane().add(same, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, 150, -1));

        paramState.setEditable(false);
        getContentPane().add(paramState, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 400, 150, -1));

        paramstreet2.setEditable(false);
        getContentPane().add(paramstreet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 360, 150, -1));

        localCountry1.setEditable(false);
        getContentPane().add(localCountry1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 150, -1));

        localMobile1.setEditable(false);
        getContentPane().add(localMobile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 150, -1));

        localEmail1.setEditable(false);
        getContentPane().add(localEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 150, -1));

        paramCountry.setEditable(false);
        getContentPane().add(paramCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 490, 150, -1));

        paramMobile.setEditable(false);
        getContentPane().add(paramMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 410, 150, -1));

        paramEmail.setEditable(false);
        getContentPane().add(paramEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 450, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Admin c = new Admin();
        c.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel balance;
    public javax.swing.JTextField country;
    public javax.swing.JTextField ctype;
    public javax.swing.JTextField dob;
    public javax.swing.JTextField fathername;
    public javax.swing.JTextField gender;
    public javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField localCity;
    public javax.swing.JTextField localCountry;
    public javax.swing.JTextField localCountry1;
    public javax.swing.JTextField localDistrict;
    public javax.swing.JTextField localEmail;
    public javax.swing.JTextField localEmail1;
    public javax.swing.JTextField localMobile;
    public javax.swing.JTextField localMobile1;
    public javax.swing.JTextField localPin;
    public javax.swing.JTextField localstate;
    public javax.swing.JTextField localstreet;
    public javax.swing.JTextField name;
    public javax.swing.JTextField nationality;
    public javax.swing.JTextField paramCity;
    public javax.swing.JTextField paramCountry;
    public javax.swing.JTextField paramDistrict;
    public javax.swing.JTextField paramEmail;
    public javax.swing.JTextField paramMobile;
    public javax.swing.JTextField paramPin;
    public javax.swing.JTextField paramState;
    public javax.swing.JLabel paramstreet;
    public javax.swing.JTextField paramstreet2;
    public javax.swing.JTextField same;
    public javax.swing.JLabel type;
    public javax.swing.JLabel yesno;
    // End of variables declaration//GEN-END:variables

}
