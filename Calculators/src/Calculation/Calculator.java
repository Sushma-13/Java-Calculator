package Calculation;
/**
 * @author SUSHMA
 */
public class Calculator extends javax.swing.JFrame {
    double firstnum;
    double secondnum;
    double result;
    String operations;

    public Calculator() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtdisplay = new javax.swing.JTextField();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtn10 = new javax.swing.JButton();
        jBtn11 = new javax.swing.JButton();
        jBtn12 = new javax.swing.JButton();
        jBtn13 = new javax.swing.JButton();
        jBtn14 = new javax.swing.JButton();
        jBtn15 = new javax.swing.JButton();
        jBtn16 = new javax.swing.JButton();
        jBtn19 = new javax.swing.JButton();
        jBtn20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxtdisplay.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jtxtdisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtn10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn10.setText("0");
        jBtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn10ActionPerformed(evt);
            }
        });

        jBtn11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn11.setText("+");
        jBtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn11ActionPerformed(evt);
            }
        });

        jBtn12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn12.setText("-");
        jBtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn12ActionPerformed(evt);
            }
        });

        jBtn13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn13.setText("/");
        jBtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn13ActionPerformed(evt);
            }
        });

        jBtn14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn14.setText("*");
        jBtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn14ActionPerformed(evt);
            }
        });

        jBtn15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn15.setText("+-");
        jBtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn15ActionPerformed(evt);
            }
        });

        jBtn16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn16.setText(".");
        jBtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn16ActionPerformed(evt);
            }
        });

        jBtn19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn19.setText("C");
        jBtn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn19ActionPerformed(evt);
            }
        });

        jBtn20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn20.setText("=");
        jBtn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtxtdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addComponent(jBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addComponent(jBtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jBtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtn19, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jBtn20, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jtxtdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn19, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jBtn20, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        String Enternumber= jtxtdisplay.getText()+jBtn5.getText();
        jtxtdisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
       String Enternumber= jtxtdisplay.getText()+jBtn7.getText();
        jtxtdisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        String Enternumber= jtxtdisplay.getText()+jBtn3.getText();
        jtxtdisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        String Enternumber= jtxtdisplay.getText()+jBtn1.getText();
        jtxtdisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        String Enternumber= jtxtdisplay.getText()+jBtn2.getText();
        jtxtdisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        String Enternumber= jtxtdisplay.getText()+jBtn4.getText();
        jtxtdisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
       String Enternumber= jtxtdisplay.getText()+jBtn6.getText();
        jtxtdisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        String Enternumber= jtxtdisplay.getText()+jBtn8.getText();
        jtxtdisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        String Enternumber= jtxtdisplay.getText()+jBtn9.getText();
        jtxtdisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn10ActionPerformed
        String Enternumber= jtxtdisplay.getText()+jBtn10.getText();
        jtxtdisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn10ActionPerformed

    private void jBtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn11ActionPerformed
        firstnum=Double.parseDouble(jtxtdisplay.getText());
        jtxtdisplay.setText("+");
        operations="+";
        
    }//GEN-LAST:event_jBtn11ActionPerformed

    private void jBtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn12ActionPerformed
        firstnum=Double.parseDouble(jtxtdisplay.getText());
        jtxtdisplay.setText("");
        operations="-";
    }//GEN-LAST:event_jBtn12ActionPerformed

    private void jBtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn13ActionPerformed
        firstnum=Double.parseDouble(jtxtdisplay.getText());
        jtxtdisplay.setText("");
        operations="/";
    }//GEN-LAST:event_jBtn13ActionPerformed

    private void jBtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn14ActionPerformed
        firstnum=Double.parseDouble(jtxtdisplay.getText());
        jtxtdisplay.setText("");
        operations="*";
    }//GEN-LAST:event_jBtn14ActionPerformed

    private void jBtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn16ActionPerformed
       String EnterNumber=jtxtdisplay.getText()+jBtn16.getText();
       jtxtdisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn16ActionPerformed

    private void jBtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn15ActionPerformed
        double ops=Double.parseDouble(String.valueOf(jtxtdisplay.getText()));
        ops=ops*(-1);
        jtxtdisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtn15ActionPerformed

    private void jBtn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn20ActionPerformed
        String answer;
        secondnum=Double.parseDouble(jtxtdisplay.getText());
        if(operations=="+"){
            result=firstnum+secondnum;
            answer=String.format("%.0f",result);
            jtxtdisplay.setText(answer);
        }
        else if(operations=="-"){
            result=firstnum-secondnum;
            answer=String.format("%.0f",result);
            jtxtdisplay.setText(answer);
        }
        else if(operations=="*"){
            result=firstnum*secondnum;
            answer=String.format("%.0f",result);
            jtxtdisplay.setText(answer);
        }
         else if(operations=="/"){
            result=firstnum/secondnum;
            answer=String.format("%.0f",result);
            jtxtdisplay.setText(answer);
        }
    }//GEN-LAST:event_jBtn20ActionPerformed

    private void jBtn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn19ActionPerformed
        jtxtdisplay.setText("");
    }//GEN-LAST:event_jBtn19ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn10;
    private javax.swing.JButton jBtn11;
    private javax.swing.JButton jBtn12;
    private javax.swing.JButton jBtn13;
    private javax.swing.JButton jBtn14;
    private javax.swing.JButton jBtn15;
    private javax.swing.JButton jBtn16;
    private javax.swing.JButton jBtn19;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn20;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JTextField jtxtdisplay;
    // End of variables declaration//GEN-END:variables
}
