
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David
 */
public class Ventana extends javax.swing.JFrame {

    public static String cedulau;
    
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(300, 300);

    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/iconoSands.jpg"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_password = new javax.swing.JLabel();
        jl_nombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_login = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btm_conectar = new javax.swing.JButton();
        Register = new javax.swing.JButton();
        Admin = new javax.swing.JButton();
        btm_salir = new javax.swing.JButton();
        jlabelFondo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(500, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 50));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_password.setText("Password :");
        getContentPane().add(jl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jl_nombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_nombre.setText("Cedula:");
        getContentPane().add(jl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("// PROYECTO  APPMEDICA IVAN  GUERRA AND MIGUEL ORJUELA//");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 310, 30));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trajan Pro", 1, 18), new java.awt.Color(153, 0, 153))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 410, 130));

        jLabel3.setFont(new java.awt.Font("Yu Mincho Light", 1, 54)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("welcome");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 250, 50));

        txt_login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_loginActionPerformed(evt);
            }
        });
        getContentPane().add(txt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 140, -1));

        txt_password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 140, -1));

        btm_conectar.setBackground(new java.awt.Color(102, 0, 102));
        btm_conectar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btm_conectar.setText("Conectar");
        btm_conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_conectarActionPerformed(evt);
            }
        });
        getContentPane().add(btm_conectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        Register.setBackground(new java.awt.Color(102, 0, 102));
        Register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Register.setText("Registro");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        getContentPane().add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/asesoria.png"))); // NOI18N
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        getContentPane().add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 60, 60));

        btm_salir.setBackground(new java.awt.Color(102, 0, 102));
        btm_salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btm_salir.setText("Salir");
        btm_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btm_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 90, 20));

        jlabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_del_módulo_de_bienvenida.png"))); // NOI18N
        getContentPane().add(jlabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, 880, 520));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 380, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_loginActionPerformed

    private void btm_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btm_salirActionPerformed

    private void btm_conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_conectarActionPerformed
        // TODO add your handling code here:

        String url = "jdbc:mysql://localhost:3306/healapp";
        String usuario = "root";
        String contrasena = "1234";
        Connection con = null;
        try {

            Statement stmt = null;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, usuario, contrasena);
            if (con != null) {
                stmt = con.createStatement();
                System.out.println("Se ha establecido una conexión a la base de datos\n " + url);

            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }

        String cap = "";
        String cap1 = "";
        String medi ="";
        String sql = "SELECT * FROM General_User_Adm WHERE Cedula='" + txt_login.getText() + "' && Contraseña='" + txt_password.getText() + "'";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cap = rs.getString("Tipo");
                cap1 = rs.getString("Cargo");
            }
            if (cap.equals("ADMINISTRADOR") && cap1.equals("Contabilidad")) {
                Contabilidad ad = new Contabilidad(con, st, this);
                ad.setVisible(true);
                this.setVisible(false);
                ad.VISUAL(txt_login.getText());
            } else {
                if (cap.equals("ADMINISTRADOR") && cap1.equals("Atencion al Cliente")) {
                    Contabilidad ad = new Contabilidad(con, st, this);
                    ad.setVisible(true);
                    this.setVisible(false);
                } else {
                    if (cap.equals("ADMINISTRADOR") && cap1.equals("Soporte Tecnico")) {
                        Contabilidad ad = new Contabilidad(con, st, this);
                        ad.setVisible(true);
                        this.setVisible(false);
                    } else {
                        if (cap.equals("ADMINISTRADOR") && cap1.equals("Administrador de la Base de datos")) {
                            Contabilidad ad = new Contabilidad(con, st, this);
                            ad.setVisible(true);
                            this.setVisible(false);
                        } else {
                            if (cap.equals("ADMINISTRADOR") && cap1.equals("Capacitador")) {
                                Contabilidad ad = new Contabilidad(con, st, this);
                                ad.setVisible(true);
                                this.setVisible(false);
                            }
                        }
                    }
                }
            }

            if (cap.equals("USUARIO")) {
                MainMenu us = new MainMenu(con, st, this);
                us.setVisible(true);
                this.setVisible(false);
                us.VISUAL(txt_login.getText());
                cedulau = txt_login.getText();

            }
            if (!cap.equals("ADMINISTRADOR") && !cap.equals("USUARIO")) {
                MainMenu us = new MainMenu(con, st, this);
                us.setVisible(true);
                us.BLOQUEAR();
                JOptionPane.showMessageDialog(null, "Cedula o contraseña incorrecta. Vuelva a intentarlo.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
  /*       sql = "SELECT * FROM medicos WHERE Cedula='" + txt_login.getText() + "' && Contraseña='" + txt_password.getText() + "'";
    
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                medi = rs.getString("Cualidad");
            }
               if (medi.equals("MEDICO")) {
                Diseases us = new  Diseases(con, st, this);
                us.setVisible(true);
                this.setVisible(false);
              

            }
            if (!cap.equals("MEDICO") && !cap.equals("USUARIO")) {
                MainMenu us = new MainMenu(con, st, this);
                us.setVisible(true);
                us.BLOQUEAR();
                JOptionPane.showMessageDialog(null, "Cedula o contraseña incorrecta. Vuelva a intentarlo.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
        */
    }//GEN-LAST:event_btm_conectarActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed

        String url = "jdbc:mysql://localhost:3306/healapp";
        String usuario = "root";
        String contrasena = "1234";
        Connection con = null;
        try {

            Statement stmt = null;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, usuario, contrasena);
            if (con != null) {
                stmt = con.createStatement();
                System.out.println("Se ha establecido una conexión a la base de datos\n " + url);
                Registro u = new Registro(con, stmt, this);
                this.setVisible(false);
                u.setVisible(true);

            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_RegisterActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed

        String user = "ivan";
        String pass = "123";
      

        String usuario_introducido = "";
        String Clave_introducida = "";
       
        while (usuario_introducido.equals(user) == false || Clave_introducida.equals(pass) == false) {
            usuario_introducido = JOptionPane.showInputDialog("Introduzca el User Administrativo");
            Clave_introducida = JOptionPane.showInputDialog("Introduzca contraseña de Administracion");
        }
        
        Icon m = new ImageIcon(getClass().getResource("Imagenes/IconoBajoADM.PNG"));
        JOptionPane.showMessageDialog(null, " >>>INGRESO CORRECTO<<< \n Todo las operaciones realizadas quedara \n registradas bajo su responsabilidad \n mantenga discrecion con la informacion \n registrada en la plataforma. ", "RECOMENDACION", JOptionPane.INFORMATION_MESSAGE, m);

        String url = "jdbc:mysql://localhost:3306/healapp";
        String usuario = "root";
        String contrasena = "1234";
        Connection con = null;
        try {

            Statement stmt = null;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, usuario, contrasena);
            if (con != null) {
                stmt = con.createStatement();
                System.out.println("Se ha establecido una conexión a la base de datos\n " + url);
                System.out.println("DESARROLLADOR ====> " + user);
                Administrativo u = new Administrativo(con, stmt, this);
                this.setVisible(false);
                u.setVisible(true);

            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_AdminActionPerformed

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
    private javax.swing.JButton Admin;
    private javax.swing.JButton Register;
    private javax.swing.JButton btm_conectar;
    private javax.swing.JButton btm_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jl_nombre;
    private javax.swing.JLabel jl_password;
    private javax.swing.JLabel jlabelFondo;
    private javax.swing.JTextField txt_login;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}
