package minhacalculadora;

public class MinhaCalculadora extends javax.swing.JFrame {

    public MinhaCalculadora() {
        initComponents();
    }
    Double PrimeiroNum, SegundoNum ;
    String Operacao;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tela = new javax.swing.JTextField();
        botaoIgual = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botaoadicao = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botaoSubtracao = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botaoMultiplicacao = new javax.swing.JButton();
        botao0 = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoPonto = new javax.swing.JToggleButton();
        botaoDivisao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tela.setBackground(new java.awt.Color(0, 153, 153));
        Tela.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Tela.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Tela.setMargin(new java.awt.Insets(10, 50, 10, 50));
        Tela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaActionPerformed(evt);
            }
        });
        getContentPane().add(Tela, java.awt.BorderLayout.PAGE_START);

        botaoIgual.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botaoIgual.setText("=");
        botaoIgual.setMargin(new java.awt.Insets(10, 20, 10, 20));
        botaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIgualActionPerformed(evt);
            }
        });
        getContentPane().add(botaoIgual, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.GridLayout(4, 4));

        botao1.setText("1");
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });
        jPanel1.add(botao1);

        botao2.setText("2");
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });
        jPanel1.add(botao2);

        botao3.setText("3");
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });
        jPanel1.add(botao3);

        botaoadicao.setText("+");
        botaoadicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoadicaoActionPerformed(evt);
            }
        });
        jPanel1.add(botaoadicao);

        botao4.setText("4");
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });
        jPanel1.add(botao4);

        botao5.setText("5");
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });
        jPanel1.add(botao5);

        botao6.setText("6");
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });
        jPanel1.add(botao6);

        botaoSubtracao.setText("-");
        botaoSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubtracaoActionPerformed(evt);
            }
        });
        jPanel1.add(botaoSubtracao);

        botao7.setText("7");
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });
        jPanel1.add(botao7);

        botao8.setText("8");
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });
        jPanel1.add(botao8);

        botao9.setText("9");
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });
        jPanel1.add(botao9);

        botaoMultiplicacao.setText("*");
        botaoMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMultiplicacaoActionPerformed(evt);
            }
        });
        jPanel1.add(botaoMultiplicacao);

        botao0.setText("0");
        botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });
        jPanel1.add(botao0);

        botaoLimpar.setText("C");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });
        jPanel1.add(botaoLimpar);

        botaoPonto.setText(".");
        botaoPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPontoActionPerformed(evt);
            }
        });
        jPanel1.add(botaoPonto);

        botaoDivisao.setText("/");
        botaoDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDivisaoActionPerformed(evt);
            }
        });
        jPanel1.add(botaoDivisao);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelaActionPerformed
        // Não tem que escrever nada aqui...
        
    }//GEN-LAST:event_TelaActionPerformed
    
    private void botaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIgualActionPerformed
        SegundoNum=Double.parseDouble(Tela.getText());
          if(Operacao == "botaoadicao"){
              Tela.setText(String.valueOf(PrimeiroNum+SegundoNum));
          }
          if(Operacao == "botaoSubtracao"){
              Tela.setText(String.valueOf(PrimeiroNum-SegundoNum));
          }
          if(Operacao == "botaoMultiplicacao"){
              Tela.setText(String.valueOf(PrimeiroNum*SegundoNum));
          }
          if(Operacao == "botaoDivisao"){
              Tela.setText(String.valueOf(PrimeiroNum/SegundoNum));
          }
    }//GEN-LAST:event_botaoIgualActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        Tela.setText(Tela.getText() + "2");
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        Tela.setText(Tela.getText() +  "1");
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
         Tela.setText(Tela.getText() + "3");
    }//GEN-LAST:event_botao3ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        Tela.setText(Tela.getText() + "4");
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        Tela.setText(Tela.getText() + "5");
    }//GEN-LAST:event_botao5ActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
        Tela.setText(Tela.getText() + "6");
    }//GEN-LAST:event_botao6ActionPerformed

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
        Tela.setText(Tela.getText() + "7");
    }//GEN-LAST:event_botao7ActionPerformed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
        Tela.setText(Tela.getText() + "8");
    }//GEN-LAST:event_botao8ActionPerformed

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
        Tela.setText(Tela.getText() + "9");
    }//GEN-LAST:event_botao9ActionPerformed

    private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao0ActionPerformed
        Tela.setText(Tela.getText() + "0");
    }//GEN-LAST:event_botao0ActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
         Tela.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPontoActionPerformed
        Tela.setText(Tela.getText() + ".");
    }//GEN-LAST:event_botaoPontoActionPerformed

    private void botaoadicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoadicaoActionPerformed
        PrimeiroNum=Double.parseDouble(Tela.getText()); 
          Tela.setText("");
          Operacao="botaoadicao";
          
    }//GEN-LAST:event_botaoadicaoActionPerformed

    private void botaoSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubtracaoActionPerformed
        PrimeiroNum=Double.parseDouble(Tela.getText()); 
          Tela.setText("");
          Operacao="botaoSubtracao";
    }//GEN-LAST:event_botaoSubtracaoActionPerformed

    private void botaoMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMultiplicacaoActionPerformed
        PrimeiroNum=Double.parseDouble(Tela.getText()); 
          Tela.setText("");
          Operacao="botaoMultiplicacao";
    }//GEN-LAST:event_botaoMultiplicacaoActionPerformed

    private void botaoDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDivisaoActionPerformed
        PrimeiroNum=Double.parseDouble(Tela.getText()); 
          Tela.setText("");
          Operacao="botaoDivisao";
    }//GEN-LAST:event_botaoDivisaoActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinhaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

 
        java.awt.EventQueue.invokeLater(() -> {
            new MinhaCalculadora().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tela;
    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton botaoDivisao;
    private javax.swing.JButton botaoIgual;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoMultiplicacao;
    private javax.swing.JToggleButton botaoPonto;
    private javax.swing.JButton botaoSubtracao;
    private javax.swing.JButton botaoadicao;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
