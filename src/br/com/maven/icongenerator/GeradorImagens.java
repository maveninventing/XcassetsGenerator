/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.maven.icongenerator;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author marison
 */
public class GeradorImagens extends javax.swing.JFrame {

    /**
     * Creates new form GeradorImagens
     */
    public GeradorImagens() {
        initComponents();
        setTitle("Gerador de imagens de aplicativos");
        SystemLog.register(log);
        applyChooser(botao1, logo);
        applyChooser(botao2, portrait);
        applyChooser(botao3, landscape);
        setSize(500, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void applyChooser(final JButton button, final JFormattedTextField campo) {
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JFileChooser arquivo = new JFileChooser();
                int retorno = arquivo.showOpenDialog(null);
                if (retorno == JFileChooser.APPROVE_OPTION) {
                    campo.setText(arquivo.getSelectedFile().getAbsolutePath());
                }
                arquivo.setFileFilter(new javax.swing.filechooser.FileFilter() {

                    public boolean accept(File f) {
                        return f.getName().toLowerCase().endsWith(".png") || f.isDirectory();
                    }

                    public String getDescription() {
                        return "Arquivos de imagem (.jpg)";
                    }
                });
            }
        });
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
        name = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logo = new javax.swing.JFormattedTextField();
        botao1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        portrait = new javax.swing.JFormattedTextField();
        botao2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        landscape = new javax.swing.JFormattedTextField();
        botao3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        log = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Custom name:");

        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });

        jLabel2.setText("ex: opapel");

        jLabel3.setText("Logo PNG em 1024x1024 EXATO");

        botao1.setText("...");

        jLabel4.setText("Splash portrait - M�nimo 768x1024");

        botao2.setText("...");

        jLabel5.setText("Splash landscape - M�nimo 1024x768");

        botao3.setText("...");

        jButton4.setText("Gerar imagens");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2))
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botao1))
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(portrait, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botao2))
                        .addComponent(jLabel5)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(landscape, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botao3))
                        .addComponent(jButton4))
                    .addContainerGap(117, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botao1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(portrait, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botao2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(landscape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botao3))
                    .addGap(18, 18, 18)
                    .addComponent(jButton4)
                    .addContainerGap(70, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Log"));
        jPanel2.setLayout(new java.awt.BorderLayout());

        log.setColumns(20);
        log.setRows(5);
        jScrollPane1.setViewportView(log);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        final String projeto = name.getText();
        String logoimg = logo.getText();
        String portraitimg = portrait.getText();
        String landsimg = landscape.getText();
        if (StringUtils.isBlank(projeto) || StringUtils.isBlank(logoimg) || StringUtils.isBlank(portraitimg) || StringUtils.isBlank(landsimg)) {
            JOptionPane.showMessageDialog(this, "Todos os campos s�o obrigat�rios");
            return;
        }
        final File logofile = new File(logoimg);
        if (!logofile.exists() || !logofile.isFile() || !logofile.getName().toLowerCase().endsWith(".png")) {
            JOptionPane.showMessageDialog(this, "Logotipo errado. Deve ser um arquivo png de 1024x1024");
            return;
        }
        final File portraitfile = new File(portraitimg);
        if (!portraitfile.exists() || !portraitfile.isFile() || !portraitfile.getName().toLowerCase().endsWith(".png")) {
            JOptionPane.showMessageDialog(this, "Portrait errado. Deve ser um arquivo png");
            return;
        }
        final File landsfile = new File(landsimg);
        if (!landsfile.exists() || !landsfile.isFile() || !landsfile.getName().toLowerCase().endsWith(".png")) {
            JOptionPane.showMessageDialog(this, "Landscape errado. Deve ser um arquivo png");
            return;
        }
        new Thread() {

            public void run() {

                try {
                    IconResizer.inicia(projeto, logofile, portraitfile, landsfile);
                    File path = new File("projetos\\" + projeto);
                    JOptionPane.showMessageDialog(GeradorImagens.this, "Arquivos gerados em " + path.getAbsolutePath());
                    Desktop.getDesktop().open(path);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(GeradorImagens.this, ex.getMessage());
                    ex.printStackTrace(System.out);
                }
            }
        }.start();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        if (StringUtils.isNotBlank(name.getText())) {
            File path = new File("projetos\\" + name.getText());
            logo.setText(path.getAbsolutePath() + File.separator + "icon.png");
            portrait.setText(path.getAbsolutePath() + File.separator + "portrait.png");
            landscape.setText(path.getAbsolutePath() + File.separator + "landscape.png");
        }
    }//GEN-LAST:event_nameFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GeradorImagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeradorImagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeradorImagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeradorImagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GeradorImagens().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField landscape;
    private javax.swing.JTextArea log;
    private javax.swing.JFormattedTextField logo;
    private javax.swing.JFormattedTextField name;
    private javax.swing.JFormattedTextField portrait;
    // End of variables declaration//GEN-END:variables
}