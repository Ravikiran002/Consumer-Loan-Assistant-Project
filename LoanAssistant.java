package ConsumerLoanAssistant;


import java.awt.Color;
import static java.util.logging.Logger.global;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mkkrv
 */
public class LoanAssistant extends javax.swing.JFrame {
    
   private Object computePayment;
    
    double loan;
    double interest;
    double month;
    double payment;
    double monthlypayment;
    double monthlypayment1;
    double npayments;
    
    private boolean computeButton;
    
    
    public LoanAssistant() {
        initComponents();
        AnalysisButton.setEnabled(false);
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BalanceField = new javax.swing.JTextField();
        InterestField = new javax.swing.JTextField();
        PaymentsField = new javax.swing.JTextField();
        MonthlyPaymentField = new javax.swing.JTextField();
        ComputeButton = new javax.swing.JButton();
        AnalysisButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        xPaymentsButton = new javax.swing.JButton();
        xMonthlyPaymentButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loan Assistant");
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Loan Balance");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Interest Rate");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Number of Payments");
        jLabel3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabel3FocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Monthly Payment");

        BalanceField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        BalanceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceFieldActionPerformed(evt);
            }
        });

        InterestField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        PaymentsField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        MonthlyPaymentField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        MonthlyPaymentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthlyPaymentFieldActionPerformed(evt);
            }
        });

        ComputeButton.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ComputeButton.setText("Compute Monthly Payment");
        ComputeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputeButtonActionPerformed(evt);
            }
        });

        AnalysisButton.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        AnalysisButton.setText("New Loan Analysis");
        AnalysisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalysisButtonActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Loan Analysis");

        xPaymentsButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        xPaymentsButton.setText("x");
        xPaymentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xPaymentsButtonActionPerformed(evt);
            }
        });

        xMonthlyPaymentButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        xMonthlyPaymentButton.setText("x");
        xMonthlyPaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMonthlyPaymentButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addGap(121, 121, 121))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(72, 72, 72)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(100, 100, 100)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MonthlyPaymentField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(PaymentsField)
                            .addComponent(BalanceField)
                            .addComponent(InterestField))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xPaymentsButton)
                            .addComponent(xMonthlyPaymentButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(ComputeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(AnalysisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BalanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(InterestField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(PaymentsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xPaymentsButton))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(MonthlyPaymentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xMonthlyPaymentButton))
                        .addGap(80, 80, 80)
                        .addComponent(ComputeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AnalysisButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3FocusLost

    private void BalanceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BalanceFieldActionPerformed

    private void ComputeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputeButtonActionPerformed
        String iMonthlyPaymentButton = String.format(PaymentsField.getText());
        if(BalanceField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"You Must Enter Amount of Balance","Loan System",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            loan=Double.parseDouble(BalanceField.getText());
            String Balance=String.format(BalanceField.getText());
        }
        if(InterestField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"You Must Enter interest rate","Loan System",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            interest=Double.parseDouble(InterestField.getText());
            String Balance=String.format(InterestField.getText());
        }
        if(xPaymentsButton.isEnabled()){
                       month= Double.parseDouble(PaymentsField.getText());
                    payment=loan+((loan*interest)/100);
        monthlypayment=payment/month;
        
        String PayMonth=String.format("%.2f",monthlypayment);
        MonthlyPaymentField.setText(PayMonth);
        
        
        textArea.append("\t\n Loan Assistant :\n\n"
                        +"Loan Balance:  $"+loan+
                        "\nInterest Rate:  "+interest+"%"+
                        "\n\n\nNo of Payments:  "+month+
                        "\nMonthly Payment:  $"+PayMonth+
                        "\nTotal Payment:  $"+payment);
        AnalysisButton.setEnabled(true);
        ComputeButton.setEnabled(false);
        }
        if(xMonthlyPaymentButton.isEnabled()){
   monthlypayment1= Double.parseDouble(MonthlyPaymentField.getText());
                    payment=loan+((loan*interest)/100);
        npayments=payment/monthlypayment1;
        
        String PayMonth=String.format("%.2f",npayments);
        PaymentsField.setText(PayMonth);
        
        
        textArea.append("\t\n Loan Assistant :\n\n"
                        +"Loan Balance:  $"+loan+
                        "\nInterest Rate:  "+interest+"%"+
                        "\n\n\nNo of Payments:  "+PayMonth+
                        "\nMonthly Payment:  $"+monthlypayment1+
                        "\nTotal Payment:  $"+payment);
        AnalysisButton.setEnabled(true);
        ComputeButton.setEnabled(false);
        }

        

        
        
        
        
    }//GEN-LAST:event_ComputeButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void AnalysisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalysisButtonActionPerformed
       BalanceField.setText("");
       InterestField.setText("");
       PaymentsField.setText("");
       MonthlyPaymentField.setText("");
       textArea.setText("");
       xPaymentsButton.setEnabled(true);
       xPaymentsButton.setVisible(true);
       xMonthlyPaymentButton.setEnabled(true);
       xMonthlyPaymentButton.setVisible(true);
       MonthlyPaymentField.setBackground(Color.white);
       PaymentsField.setBackground(Color.white);
       AnalysisButton.setEnabled(false);
       ComputeButton.setEnabled(true);
    }//GEN-LAST:event_AnalysisButtonActionPerformed

    private void MonthlyPaymentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthlyPaymentFieldActionPerformed
        
    }//GEN-LAST:event_MonthlyPaymentFieldActionPerformed

    private void xPaymentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xPaymentsButtonActionPerformed
        computeButton=true;
        xPaymentsButton.setVisible(true);
        xMonthlyPaymentButton.setVisible(false);
        PaymentsField.setEditable(true);
        PaymentsField.setBackground(Color.white);
        PaymentsField.setFocusable(true);
        MonthlyPaymentField.setEditable(false);
        MonthlyPaymentField.setBackground(Color.yellow);
        MonthlyPaymentField.setFocusable(false);
        BalanceField.requestFocus();
        xPaymentsButton.setEnabled(true);
        xMonthlyPaymentButton.setEnabled(false);
       
       
        
        
        
        

    }//GEN-LAST:event_xPaymentsButtonActionPerformed

    private void xMonthlyPaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMonthlyPaymentButtonActionPerformed
        computeButton=false;
        xPaymentsButton.setVisible(false);
        xMonthlyPaymentButton.setVisible(true);
        PaymentsField.setEditable(false);
        PaymentsField.setBackground(Color.yellow);
        PaymentsField.setFocusable(false);
        MonthlyPaymentField.setEditable(true);
        MonthlyPaymentField.setBackground(Color.white);
        MonthlyPaymentField.setFocusable(true);
        BalanceField.requestFocus();
        ComputeButton.setVisible(true);
        xPaymentsButton.setEnabled(false);
        xMonthlyPaymentButton.setEnabled(true);

      

        
     
        
        
    }//GEN-LAST:event_xMonthlyPaymentButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanAssistant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnalysisButton;
    private javax.swing.JTextField BalanceField;
    private javax.swing.JButton ComputeButton;
    private javax.swing.JTextField InterestField;
    private javax.swing.JTextField MonthlyPaymentField;
    private javax.swing.JTextField PaymentsField;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textArea;
    private javax.swing.JButton xMonthlyPaymentButton;
    private javax.swing.JButton xPaymentsButton;
    // End of variables declaration//GEN-END:variables
}
