package Vista;
import Logica.Logic;
import Clases.Alumno;
import Clases.Profesor;
import Clases.Objeto;
import javax.swing.table.DefaultTableModel;
public class Prestar_objeto extends javax.swing.JFrame {
DefaultTableModel model = new DefaultTableModel();
    Alumno buscar;
    Profesor profesor;
    public Prestar_objeto(Profesor profesor) {
        initComponents();
        this.profesor = profesor;
        model.addColumn("Nombre");
        model.addColumn("Profesor");
    }
    
    public void prestado_estudiante(Alumno estudiante){
        String[] agregar = new String[2];

        int tamaño;
        try {
            tamaño = estudiante.getImplemento_prestado().size();
        } catch (Exception e) {
            tamaño = 0;
        }

        for (int i = 0; i < tamaño; i++) {
            agregar[0] = estudiante.getImplemento_prestado().get(i).getNombre();
            agregar[1] = estudiante.getImplemento_prestado().get(i).getProfesor().getNombre();
            model.addRow(agregar);
        }
        this.datos_estudiante.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Button_buscarEstudiante = new javax.swing.JButton();
        txtDocumento_estudiante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre_objeto = new javax.swing.JTextField();
        prestar_objeto = new javax.swing.JButton();
        nombre_estudiante = new javax.swing.JLabel();
        curso_estudiante = new javax.swing.JLabel();
        Button_endSesion = new javax.swing.JButton();
        Button_volver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos_estudiante = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        Button_buscarEstudiante.setText("Buscar");
        Button_buscarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_buscarEstudianteActionPerformed(evt);
            }
        });

        jLabel2.setText("Documento:");

        jLabel3.setText("Curso:");

        jLabel4.setText("Nombre del objeto:");

        prestar_objeto.setText("Prestar");
        prestar_objeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestar_objetoActionPerformed(evt);
            }
        });

        Button_endSesion.setText("Cerar sesion");
        Button_endSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_endSesionActionPerformed(evt);
            }
        });

        Button_volver.setText("Volver");
        Button_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDocumento_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button_buscarEstudiante))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre_estudiante)
                                    .addComponent(curso_estudiante)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre_objeto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prestar_objeto)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(Button_volver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_endSesion)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_volver)
                    .addComponent(Button_endSesion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_buscarEstudiante)
                    .addComponent(txtDocumento_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre_estudiante))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(curso_estudiante))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre_objeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prestar_objeto)))
        );

        datos_estudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(datos_estudiante);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_buscarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_buscarEstudianteActionPerformed
        buscar = Logic.consulta_estuiante(txtDocumento_estudiante.getText());
        nombre_estudiante.setText(buscar.getNombre());
        curso_estudiante.setText(buscar.getCurso());
        this.datos_estudiante.clearSelection();
        prestado_estudiante(buscar);
    }//GEN-LAST:event_Button_buscarEstudianteActionPerformed

    private void prestar_objetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestar_objetoActionPerformed
        Objeto nuevo = new Objeto(txtNombre_objeto.getText(),profesor,buscar);
        System.out.println(nuevo.getNombre());
        Logic.prestar_estudiante(buscar.getDocumento(),nuevo);
        this.datos_estudiante.clearSelection();
        prestado_estudiante(Logic.consulta_estuiante(buscar.getDocumento()));
    }//GEN-LAST:event_prestar_objetoActionPerformed

    private void Button_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_volverActionPerformed
        Menu_profesor abrir = new Menu_profesor(profesor);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Button_volverActionPerformed

    private void Button_endSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_endSesionActionPerformed
       Login abrir = new Login();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Button_endSesionActionPerformed

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
            java.util.logging.Logger.getLogger(Prestar_objeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prestar_objeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prestar_objeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prestar_objeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Prestar_objeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_buscarEstudiante;
    private javax.swing.JButton Button_endSesion;
    private javax.swing.JButton Button_volver;
    private javax.swing.JLabel curso_estudiante;
    private javax.swing.JTable datos_estudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre_estudiante;
    private javax.swing.JButton prestar_objeto;
    private javax.swing.JTextField txtDocumento_estudiante;
    private javax.swing.JTextField txtNombre_objeto;
    // End of variables declaration//GEN-END:variables
}
