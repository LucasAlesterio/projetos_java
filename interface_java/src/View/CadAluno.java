
package View;
import View.salvar;
import javax.swing.JOptionPane;

public class CadAluno extends javax.swing.JFrame {


    public CadAluno() {
        initComponents();
        salvar b = new salvar();
                String str;
                b.lerquantA();
                str=Integer.toString(b.quantidadeAluno);
                cadastrados.setText(str);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        nome = new javax.swing.JLabel();
        textnome = new javax.swing.JTextField();
        matricula = new javax.swing.JLabel();
        textmatricula = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textsit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textcurso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textcod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textinst = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textdatai = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textdataf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textend = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textcpf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        texttel = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textemail = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cadastrados = new javax.swing.JLabel();
        g = new javax.swing.JRadioButton();
        pg = new javax.swing.JRadioButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nome.setText("Nome");

        textnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnomeActionPerformed(evt);
            }
        });

        matricula.setText("Matricula");

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/arrow-back-icon.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel1.setText("Situação");

        jLabel2.setText("Curso");

        textcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcursoActionPerformed(evt);
            }
        });

        jLabel3.setText("Código do curso");

        jLabel4.setText("Instituição");

        jLabel5.setText("Data de Inicio");

        jLabel6.setText("Data prevista de fim");

        jLabel7.setText("Endereço");

        jLabel8.setText("CPF");

        jLabel9.setText("Telefone");

        jLabel10.setText("email");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Quantidade de alunos cadastrados: ");

        cadastrados.setText("99999");

        buttonGroup1.add(g);
        g.setText("Graduação");
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });

        buttonGroup1.add(pg);
        pg.setText("Pós-graduação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(g)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(matricula)
                                    .addComponent(nome)
                                    .addComponent(textmatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(textsit)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(textcurso)
                                    .addComponent(textcod)
                                    .addComponent(textinst)
                                    .addComponent(textnome))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cadastrados)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(textdatai)
                                        .addComponent(textdataf)
                                        .addComponent(textend)
                                        .addComponent(textcpf)
                                        .addComponent(texttel)
                                        .addComponent(textemail, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)
                        .addComponent(cadastrados)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textdatai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(matricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textdataf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textsit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textinst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(g)
                    .addComponent(pg))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
new Cad().setVisible(true);
        dispose();       
    }//GEN-LAST:event_backActionPerformed

    private void textcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcursoActionPerformed
        
    }//GEN-LAST:event_textcursoActionPerformed

    private void textnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnomeActionPerformed
       
    }//GEN-LAST:event_textnomeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        salvar b = new salvar();
        Arquivo c = new Arquivo();
        String str;
        b.lerquantA();
        b.nome=textnome.getText();
        b.matricula=(textmatricula.getText());
        b.codigo=(textcod.getText());
        b.cpf=(textcpf.getText());
        b.dataf=(textdataf.getText());
        b.datai=(textdatai.getText());
        b.email=(textemail.getText());
        b.endereco=(textend.getText());
        b.instituicao=(textinst.getText());
        b.situacao=(textsit.getText());
        b.telefone=(texttel.getText());
        b.curso=(textcurso.getText());
        if(b.nome.equals("")||b.matricula.equals("")||b.codigo.equals("")||b.cpf.equals("")||b.curso.equals("")||b.dataf.equals("")||b.datai.equals("")||b.endereco.equals("")||b.instituicao.equals("")||b.situacao.equals("")||b.telefone.equals("")||b.email.equals("")){
            b.teste=false;
            JOptionPane.showMessageDialog(null,"Campos não preenchidos!");
        }
        else{
            b.teste=true;
        }
        if(g.isSelected()||pg.isSelected()){
        if(g.isSelected()){
            b.pg=true;
        }else{
            b.pg=false;
        }}
        else{
            b.teste=false;
            JOptionPane.showMessageDialog(null,"Campos não preenchidos!");
        }

        str=Integer.toString(b.quantidadeAluno+1);

        if(b.teste==true){
            b.quantidadeAluno=b.quantidadeAluno+1;
            Arquivo.Write("quantA.txt", str);
        JOptionPane.showMessageDialog(null,"Aluno salvo com sucesso!");
        b.gravarAluno(str,"aluno.txt");
          cadastrados.setText(str);
        textnome.setText("");
        textmatricula.setText("");
        textcod.setText("");
        textcpf.setText("");
        textdataf.setText("");
        textdatai.setText("");
        textemail.setText("");
        textend.setText("");
        textinst.setText("");
        textsit.setText("");
        texttel.setText("");
        textcurso.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
      
    }//GEN-LAST:event_gActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new CadAluno().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel cadastrados;
    private javax.swing.JRadioButton g;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel matricula;
    private javax.swing.JLabel nome;
    private javax.swing.JRadioButton pg;
    private javax.swing.JTextField textcod;
    private javax.swing.JTextField textcpf;
    private javax.swing.JTextField textcurso;
    private javax.swing.JTextField textdataf;
    private javax.swing.JTextField textdatai;
    private javax.swing.JTextField textemail;
    private javax.swing.JTextField textend;
    private javax.swing.JTextField textinst;
    private javax.swing.JTextField textmatricula;
    private javax.swing.JTextField textnome;
    private javax.swing.JTextField textsit;
    private javax.swing.JTextField texttel;
    // End of variables declaration//GEN-END:variables
}
