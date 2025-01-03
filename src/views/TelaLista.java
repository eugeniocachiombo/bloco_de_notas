
package views;

import classes.Nota;
import dao.NotaDao;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class TelaLista extends javax.swing.JFrame {
    
    public static int idNotaSelecionada;
    
    public TelaLista() {
        initComponents();
        this.listarDados();
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/icon.png"));
        setIconImage(icon.getImage());
        idNotaSelecionada = 0; // Variavel estatica
    }
    
    void listarDados() {
        ArrayList<Nota> listaNotas = new ArrayList<>();
        NotaDao notaDao = new NotaDao();
        listaNotas = notaDao.listar();
           
        DefaultListModel model =  new DefaultListModel<>();
        
        for (Nota nota : listaNotas) {
            model.addElement(nota);
        }
        
        if(listaNotas.isEmpty()){
           model.addElement("Nenhuma anotação foi feita!"); 
        }
        jList1.setModel(model);
    }
    
    void listarDadosConsultando(String conulta){
        ArrayList<Nota> listaNotas = new ArrayList<>();
        NotaDao notaDao = new NotaDao();
        listaNotas = notaDao.consultar(conulta);
           
        DefaultListModel model =  new DefaultListModel<>();
        
        for (Nota nota : listaNotas) {
            model.addElement(nota);
        }
        
        if(listaNotas.isEmpty()){
           model.addElement("Consulta não encontrada!"); 
        }
        jList1.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        consultarTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        fundoAdicionar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listagem de Notas");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        consultarTxt.setBackground(new java.awt.Color(51, 51, 51));
        consultarTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        consultarTxt.setForeground(new java.awt.Color(255, 255, 255));
        consultarTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                consultarTxtKeyTyped(evt);
            }
        });
        jPanel1.add(consultarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 250, 40));

        jLabel3.setFont(new java.awt.Font("Black Ryder Demo", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pesquisar:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, -1, 40));

        jLabel1.setFont(new java.awt.Font("Black Ryder Demo", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listagem das notas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jToggleButton2.setBackground(new java.awt.Color(51, 51, 51));
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("Adicionar");
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 100, -1));

        jList1.setBackground(new java.awt.Color(51, 51, 51));
        jList1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 0));
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jList1.setFocusable(false);
        jList1.setMinimumSize(new java.awt.Dimension(45, 0));
        jList1.setSelectionBackground(new java.awt.Color(0, 102, 204));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jList1MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jList1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 450, 400));

        fundoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.jpg"))); // NOI18N
        jPanel1.add(fundoAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        DefaultListModel modelos = (DefaultListModel) jList1.getModel();
        int indice = jList1.getSelectedIndex();
        Object modelo = modelos.get(indice);
        Nota nota = (Nota) modelo;
        idNotaSelecionada = nota.getId(); // Variavel estatica
        
        TelaActualizar telaActualizar = new TelaActualizar();
        telaActualizar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jList1MouseClicked

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        TelaAdicionar tAdd = new TelaAdicionar();
        tAdd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jList1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseEntered
       
    }//GEN-LAST:event_jList1MouseEntered

    private void jList1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseReleased
   
    }//GEN-LAST:event_jList1MouseReleased

    private void consultarTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultarTxtKeyTyped
        String textoConsulta = consultarTxt.getText();
        this.listarDadosConsultando(textoConsulta);
    }//GEN-LAST:event_consultarTxtKeyTyped

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
            java.util.logging.Logger.getLogger(TelaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                this.abrirDesigner();
                new TelaLista().setVisible(true);
            }
            
            public void abrirDesigner() {
                try {
                    UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField consultarTxt;
    private javax.swing.JLabel fundoAdicionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
