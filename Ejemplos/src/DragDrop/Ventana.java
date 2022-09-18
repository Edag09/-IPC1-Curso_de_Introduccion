package DragDrop;

import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        this.setTitle("Ventana Principal"); //Para titulo
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Para que no finalice al terminar una acción
        //this.setBounds(500, 200,600, 200); // x, y para colocarlo en la pantalla  ancho y alto de la ventana
        this.setLocationRelativeTo(null); // Para colocarlo en el centro
        this.setResizable(false); //Para que no se pueda manipular su tamaño
    }
    
     String ct = "";
     String nb = "";
     String reg1 = "Eduardo";
     int reg2 = 123;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Presion1 = new javax.swing.JButton();
        Presion2 = new javax.swing.JButton();
        Nombre = new javax.swing.JTextField();
        Mostrar = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        Contrasenia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setBackground(new java.awt.Color(0, 255, 102));
        Titulo.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 102));
        Titulo.setText("Esta es mi primera ventana");

        Presion1.setBackground(new java.awt.Color(0, 102, 51));
        Presion1.setFont(new java.awt.Font("DejaVu Serif", 3, 15)); // NOI18N
        Presion1.setText("Boton 1");
        Presion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Presion1ActionPerformed(evt);
            }
        });

        Presion2.setBackground(new java.awt.Color(0, 102, 102));
        Presion2.setFont(new java.awt.Font("Old English Text MT", 3, 15)); // NOI18N
        Presion2.setText("Boton 2");
        Presion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Presion2ActionPerformed(evt);
            }
        });

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(Titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230)
                        .addComponent(Contrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(Mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Presion1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Presion2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Presion1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Presion2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Titulo)
                        .addGap(117, 117, 117)))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mostrar))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contrasenia))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Presion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Presion2ActionPerformed
        //Titulo.setVisible(true);
    }//GEN-LAST:event_Presion2ActionPerformed

    private void Presion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Presion1ActionPerformed
        //Titulo.setVisible(false);
        nb = Nombre.getText();
        //Nombre.setText("");
        //Mostrar.setText(nb);

        ct = Password.getText();
        //Password.setText("");
        //Contrasenia.setText(ct);
        int contra = Integer.parseInt(ct);

        if (reg1.equals(nb) && contra == reg2) {
            Nombre.setText("");
            Mostrar.setText(nb);
            Password.setText("");
            Contrasenia.setText(ct);
            JOptionPane.showMessageDialog(null, "Bienvenido "+nb);
        }else{
            //System.out.println("Por favor, ingrese sus credenciales correctas.");
            JOptionPane.showMessageDialog(null, "Equivocado");
            Nombre.setText("");
            Password.setText("");
        }
        
        
    }//GEN-LAST:event_Presion1ActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contrasenia;
    private javax.swing.JLabel Mostrar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Presion1;
    private javax.swing.JButton Presion2;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
