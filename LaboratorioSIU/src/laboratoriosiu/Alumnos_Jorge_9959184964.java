/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriosiu;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author jorgi
 */
public class Alumnos_Jorge_9959184964 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Alumnos_Jorge_9959184964
     */
    public Alumnos_Jorge_9959184964() {
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

        jLabel3 = new javax.swing.JLabel();
        txt_direccionalumno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_telefonoalumno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_correoalumno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_estadoalumno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_idcarrera = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_idfac = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_idseccion = new javax.swing.JTextField();
        btn_ingresaralumno = new javax.swing.JButton();
        btn_modificaralumno = new javax.swing.JButton();
        btn_eliminaralumno = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_buscaralumno = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_idalumno = new javax.swing.JTextField();
        txt_nombrealumno = new javax.swing.JTextField();
        label_statusalumno = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setVisible(true);

        jLabel3.setText("Ingrse la Direccion del Alumno");

        jLabel4.setText("Ingrese el telefono del Alumno");

        txt_telefonoalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoalumnoActionPerformed(evt);
            }
        });

        jLabel5.setText("Ingrese el Email del Alumno");

        jLabel6.setText("Ingrese el Estado del Alumno");

        jLabel7.setText("Ingrese el ID de la carrera");

        txt_idcarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idcarreraActionPerformed(evt);
            }
        });

        jLabel8.setText("Ingrese el ID de la facultad");

        jLabel9.setText("Ingrese el ID de la seccion");

        btn_ingresaralumno.setText("INGRESAR");
        btn_ingresaralumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresaralumnoActionPerformed(evt);
            }
        });

        btn_modificaralumno.setText("MODIFICAR");
        btn_modificaralumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificaralumnoActionPerformed(evt);
            }
        });

        btn_eliminaralumno.setText("ELIMINAR");
        btn_eliminaralumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminaralumnoActionPerformed(evt);
            }
        });

        jLabel10.setText("INGRESE ID ALUMNO");

        jButton4.setText("BUSCAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese ID del Alumno");

        jLabel2.setText("Ingrese Nombre del Alumno");

        txt_idalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idalumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(txt_idalumno)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_nombrealumno)
                            .addComponent(txt_direccionalumno)
                            .addComponent(txt_telefonoalumno)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_correoalumno)
                            .addComponent(jLabel6)
                            .addComponent(txt_estadoalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(txt_idcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_idfac, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_idseccion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(label_statusalumno))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_ingresaralumno)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modificaralumno)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminaralumno))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buscaralumno, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton4)))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_idalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_idcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombrealumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_idfac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_direccionalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_idseccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_telefonoalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_correoalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_estadoalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label_statusalumno)
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresaralumno)
                    .addComponent(btn_modificaralumno)
                    .addComponent(btn_eliminaralumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_buscaralumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_telefonoalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoalumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoalumnoActionPerformed

    private void txt_idcarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idcarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idcarreraActionPerformed

    private void btn_ingresaralumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresaralumnoActionPerformed
        // TODO add your handling code here:
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("insert into Alumno values(?,?,?,?)");

            pst.setString(1, txt_idalumno.getText().trim());
            pst.setString(2, txt_nombrealumno.getText().trim());
            pst.setString(3, txt_direccionalumno.getText().trim());
            pst.setString(4, txt_telefonoalumno.getText().trim());
            pst.setString(5, txt_correoalumno.getText().trim());
            pst.setString(6, txt_estadoalumno.getText().trim());
            pst.setString(7, txt_idcarrera.getText().trim());
            pst.setString(8, txt_idfac.getText().trim());
            pst.setString(9, txt_idseccion.getText().trim());
            pst.executeUpdate();

            txt_idalumno.setText("");
            txt_nombrealumno.setText("");
            txt_direccionalumno.setText("");
            txt_telefonoalumno.setText("");
            txt_correoalumno.setText("");
            txt_estadoalumno.setText("");
            txt_idcarrera.setText("");
            txt_idfac.setText("");
            txt_idseccion.setText("");
            label_statusalumno.setText("Registro exitoso.");
        }catch (Exception e){

        }
    }//GEN-LAST:event_btn_ingresaralumnoActionPerformed

    private void btn_modificaralumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificaralumnoActionPerformed
        // TODO add your handling code here:
        try {
            String ID = txt_buscaralumno.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("update Alumno set carnet_Alumnos = ?, nombre_Alumnos=?, direccion_Alumnos=?, telefono_Alumnos=?,email_Alumnos=?,estatus_Alumno=?,codigo_carreras=?,codigo_facultad, codigo_secciones=? where carnet_Alumnos = " + ID);

            pst.setString(1, txt_idalumno.getText().trim());
            pst.setString(2, txt_nombrealumno.getText().trim());
            pst.setString(3, txt_direccionalumno.getText().trim());
            pst.setString(4, txt_telefonoalumno.getText().trim());
            pst.setString(5, txt_correoalumno.getText().trim());
            pst.setString(6, txt_estadoalumno.getText().trim());
            pst.setString(7, txt_idcarrera.getText().trim());
            pst.setString(8, txt_idfac.getText().trim());
            pst.setString(9, txt_idseccion.getText().trim());
            pst.executeUpdate();

            label_statusalumno.setText("Modificación exitosa.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_modificaralumnoActionPerformed

    private void btn_eliminaralumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminaralumnoActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("delete from Alumno where carnet_Alumnos = ?");

            pst.setString(1, txt_buscaralumno.getText().trim());
            pst.executeUpdate();

            txt_idalumno.setText("");
            txt_nombrealumno.setText("");
            txt_direccionalumno.setText("");
            txt_telefonoalumno.setText("");
            txt_correoalumno.setText("");
            txt_estadoalumno.setText("");
            txt_idcarrera.setText("");
            txt_idfac.setText("");
            txt_idseccion.setText("");
            jButton4.setText("");

            label_statusalumno.setText("Registro eliminado.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_eliminaralumnoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("select * from Autor where carnet_Alumnos = ?");
            pst.setString(1, txt_buscaralumno.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txt_idalumno.setText(rs.getString("carnet_Alumnos"));
                txt_nombrealumno.setText(rs.getString("nombre_Alumnos"));
                txt_direccionalumno.setText(rs.getString("direccion_Alumnos"));
                txt_telefonoalumno.setText(rs.getString("telefono_Alumnos"));
                txt_correoalumno.setText(rs.getString("email_Alumnos"));
                txt_estadoalumno.setText(rs.getString("estatus_Alumno"));
                txt_idcarrera.setText(rs.getString("codigo_carreras"));
                txt_idfac.setText(rs.getString("codigo_facultad"));
                txt_idseccion.setText(rs.getString("codigo_secciones"));
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no registrado.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt_idalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idalumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idalumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminaralumno;
    private javax.swing.JButton btn_ingresaralumno;
    private javax.swing.JButton btn_modificaralumno;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label_statusalumno;
    private javax.swing.JTextField txt_buscaralumno;
    private javax.swing.JTextField txt_correoalumno;
    private javax.swing.JTextField txt_direccionalumno;
    private javax.swing.JTextField txt_estadoalumno;
    private javax.swing.JTextField txt_idalumno;
    private javax.swing.JTextField txt_idcarrera;
    private javax.swing.JTextField txt_idfac;
    private javax.swing.JTextField txt_idseccion;
    private javax.swing.JTextField txt_nombrealumno;
    private javax.swing.JTextField txt_telefonoalumno;
    // End of variables declaration//GEN-END:variables
}
