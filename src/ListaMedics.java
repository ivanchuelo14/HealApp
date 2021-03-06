
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class ListaMedics extends javax.swing.JFrame {

    private Connection con = null;
    private Statement stmt = null;
    private JFrame inicio;

    public ListaMedics(Connection con, Statement st, JFrame i) {
        initComponents();
        this.con = con;
        this.stmt = st;
        this.inicio = i;

        setTitle("Registro y Control");
        setSize(1000, 600);
        this.setLocationRelativeTo(null);
        mostrardatos("");

    }

    void mostrardatos(String Valor) {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CEDULA");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("ESPECIALIDAD");
        modelo.addColumn("EDAD");
        modelo.addColumn("GENERO");
        modelo.addColumn("CONTRASEÑA");     
        modelo.addColumn("TELEFONO");
        TableMedic.setModel(modelo);

        String sql = "";
        if (Valor.equals("")) {
            sql = "SELECT * FROM medicos";
        } else {
            sql = "SELECT * FROM  medicos WHERE  Cedula ='" + Valor + "'";
        }

        String[] datos = new String[7];
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
               datos[6] = rs.getString(7);
                modelo.addRow(datos);
            }
            TableMedic.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MainUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableMedic = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(null);

        TableMedic.setBackground(new java.awt.Color(255, 102, 102));
        TableMedic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TableMedic);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 130, 790, 390);

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTA DE MEDICOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 10, 310, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setText("Cedula");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 70, 100, 14);

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        getContentPane().add(ID);
        ID.setBounds(300, 90, 150, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("BUSCAR MEDICO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(480, 90, 170, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 0));
        jButton2.setText("MOSTRAR TODOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(670, 90, 180, 30);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 102, 0));
        jButton3.setText("MODIFICAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(100, 90, 130, 30);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tekton Pro Cond", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 0, 51));
        jButton4.setText("CERRAR VENTANA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 530, 180, 27);

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/24785204_1563663693710403_7709920035003599462_o.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(-140, -890, 4000, 2423);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrardatos(ID.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrardatos("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            
       RegisMedics re = new  RegisMedics(con, stmt, this);
       re.setVisible(true);     
       re.Cargardatos(ID.getText());
       re.habilitar();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTable TableMedic;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
