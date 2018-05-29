
import com.mysql.jdbc.PreparedStatement;
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
public class Diseases extends javax.swing.JFrame {

    private Connection con = null;
    private Statement stmt = null;
    private JFrame inicio;
    PreparedStatement ps;
    ResultSet rs;

    public Diseases(Connection con, Statement st, JFrame i) {

        initComponents();
        this.con = con;
        this.stmt = st;
        this.inicio = i;

        setTitle("Registro y Control");
        setSize(700, 350);
        mostrardatos("");
        this.setLocationRelativeTo(null);
        b.setVisible(false);

        String sql = "SELECT idSintomas FROM Sintomas ORDER  BY idSintomas ASC";
        try {
            boolean ex = st.execute(sql);
            //JOptionPane.showMessageDialog(null, con.getCatalog() + " ex= " +  ex);
            ResultSet salida = st.getResultSet();
            while (salida.next()) {
                int sig = salida.getInt(1);
                //JOptionPane.showMessageDialog(null, salida.getInt(1) + " sig " + sig);
                Key.setText(String.valueOf(sig));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error consulta max " + ex.getMessage());
        }

    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/IconoSands.jpg"));
        return retValue;
    }

     void habilitar() {
        b.setVisible(true);
        jButton5.setVisible(false);
    }
    void mostrardatos(String Valor) {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("idSintoma");
        modelo.addColumn("SINTOMA");

        TablaSintomas.setModel(modelo);

        String sql = "";
        if (Valor.equals("")) {
            sql = "SELECT * FROM  healapp.Sintomas";
        } else {
            sql = "SELECT * FROM Sintomas WHERE idSintomas ='" + Valor + "'";
        }

        String[] datos = new String[8];
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);

                modelo.addRow(datos);
            }
            TablaSintomas.setModel(modelo);
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

        jLabel1 = new javax.swing.JLabel();
        Register = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Key = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        b = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaSintomas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 0, 36)); // NOI18N
        jLabel1.setText("Registro de Sintomas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 420, 60));

        Register.setBackground(new java.awt.Color(102, 0, 102));
        Register.setFont(new java.awt.Font("Tekton Pro Cond", 0, 18)); // NOI18N
        Register.setText("Registrar");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        getContentPane().add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 120, 40));

        jButton5.setFont(new java.awt.Font("Tekton Pro Cond", 0, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back-iloveimg-resized.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 40, 30));
        getContentPane().add(Key, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 130, 30));
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 130, 30));

        jLabel2.setFont(new java.awt.Font("Tekton Pro Cond", 0, 18)); // NOI18N
        jLabel2.setText("CLAVE ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tekton Pro Cond", 0, 18)); // NOI18N
        jLabel3.setText("NOMBRE DEL SINTOMA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, 20));

        Delete.setBackground(new java.awt.Color(102, 0, 102));
        Delete.setFont(new java.awt.Font("Tekton Pro Cond", 0, 18)); // NOI18N
        Delete.setText("BORRAR");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 100, 40));

        b.setText("Atras");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        jButton3.setBackground(new java.awt.Color(102, 0, 102));
        jButton3.setFont(new java.awt.Font("Tekton Pro Cond", 0, 18)); // NOI18N
        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 100, 30));

        TablaSintomas.setBackground(new java.awt.Color(255, 102, 102));
        TablaSintomas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaSintomas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 340, 190));

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Tekton Pro Cond", 0, 18)); // NOI18N
        jButton1.setText("MOSTRAR TODOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 160, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mask_001.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, -170, 960, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed

        int delete;

        try {

            delete = Integer.parseInt(Key.getText().trim());
            String sql = "DELETE FROM Sintomas WHERE  idSintomas = " + delete + "";
            System.out.println("sql= " + sql);
            int x = this.stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Mensaje: modificados " + x);

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        String Nombre;
        int Clave;

        try {
            Clave = Integer.parseInt(Key.getText().trim());
            Nombre = Name.getText().trim();

            String sql = "INSERT INTO Sintomas(idSintomas,Enfermedad) VAlUES (" + Clave + ",'" + Nombre + "')";
            System.out.println("sql= " + sql);
            int x = this.stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Mensaje: modificados " + x);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_RegisterActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mostrardatos(Key.getText());
    }//GEN-LAST:event_jButton3ActionPerformed


    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrardatos("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Administrativo previus = new Administrativo(con, stmt, this);
        previus.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        Administrativo ad = new Administrativo(con, stmt, this);
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Key;
    private javax.swing.JTextField Name;
    private javax.swing.JButton Register;
    private javax.swing.JTable TablaSintomas;
    private javax.swing.JButton b;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}