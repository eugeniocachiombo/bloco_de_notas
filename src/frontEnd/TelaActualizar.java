/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontEnd;

import classes.Nota;
import dao.NotaDao;
import static frontEnd.TelaLista.idNotaSelecionada;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaActualizar extends javax.swing.JFrame {

    public TelaActualizar() {
        initComponents();
        ImageIcon icon = new ImageIcon("src/images/icon.png");
        setIconImage(icon.getImage());
        this.buscarDadosNotaSelecionada();
    }

    void limparCampos() {
        tituloTxt2.setText("");
        descTxt2.setText("");
    }

    void buscarDadosNotaSelecionada() {
        int idNota = idNotaSelecionada;
        System.out.println(idNota);
        NotaDao notaDao = new NotaDao();
        Nota nota = new Nota();
        nota = notaDao.listarPorId(idNota);
        tituloTxt2.setText(nota.getTitulo());
        descTxt2.setText(nota.getDesc());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tituloTxt2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descTxt2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        fundoAdicionar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(17, 13, 13));
        jPanel1.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Black Ryder Demo", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Actualizar nota");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tituloTxt2.setBackground(new java.awt.Color(38, 92, 74));
        tituloTxt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tituloTxt2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tituloTxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 327, 40));

        jLabel2.setFont(new java.awt.Font("Black Ryder Demo", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descrição:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        descTxt2.setBackground(new java.awt.Color(38, 92, 74));
        descTxt2.setColumns(20);
        descTxt2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        descTxt2.setForeground(new java.awt.Color(255, 255, 255));
        descTxt2.setLineWrap(true);
        descTxt2.setRows(5);
        descTxt2.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descTxt2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 327, 215));

        jLabel3.setFont(new java.awt.Font("Black Ryder Demo", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Título: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jToggleButton1.setBackground(new java.awt.Color(38, 92, 74));
        jToggleButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Actualizar Nota");
        jToggleButton1.setAlignmentX(10.0F);
        jToggleButton1.setAlignmentY(50.0F);
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 327, 42));

        jToggleButton2.setBackground(new java.awt.Color(51, 51, 51));
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("Listar");
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 90, -1));

        jToggleButton3.setBackground(new java.awt.Color(51, 51, 51));
        jToggleButton3.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton3.setText("Eliminar");
        jToggleButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 90, -1));

        fundoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.jpg"))); // NOI18N
        jPanel1.add(fundoAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        String titulo = tituloTxt2.getText();
        String desc = descTxt2.getText();
        boolean executado;
        int idNota = idNotaSelecionada; // Variavel estatica

        Nota nota = new Nota();
        nota.setId(idNota);
        nota.setTitulo(titulo);
        nota.setDesc(desc);

        NotaDao notaDao = new NotaDao();
        executado = notaDao.actualizar(nota);

        if (executado) {
            JOptionPane.showMessageDialog(null, "Nota Actualizada");
            this.limparCampos();
            TelaLista tLista = new TelaLista();
            tLista.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar");
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        TelaLista tLista = new TelaLista();
        tLista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
      
        boolean executado;
        int idNota = idNotaSelecionada; // Variavel estatica
        NotaDao notaDao = new NotaDao();
        executado = notaDao.eliminar(idNota);

        if (executado) {
            JOptionPane.showMessageDialog(null, "Nota Eliminada");
            this.limparCampos();
            TelaLista tLista = new TelaLista();
            tLista.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao eliminar");
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaActualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descTxt2;
    private javax.swing.JLabel fundoAdicionar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JTextField tituloTxt2;
    // End of variables declaration//GEN-END:variables
}
