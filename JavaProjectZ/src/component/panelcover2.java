
package component;


import MainPackage.userinterface;
import MainPackage.user;
import MainPackage.Main;
import MainPackage.Main;
import com.raven.swing.MyPasswordField;
import com.raven.swing.MyTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static jdk.jfr.FlightRecorder.register;
import net.miginfocom.swing.MigLayout;
import com.raven.swing.Button;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class panelcover2 extends javax.swing.JLayeredPane {

    
    public panelcover2() throws SQLException {
        Connect();
        initComponents();
        initRegister();
        initLogin();
        login.setVisible(false);
        register.setVisible(true);
    }

    private void initRegister(){
        register.setLayout(new MigLayout("wrap","push[center]push","push[]push"));
        JLabel label = new JLabel("Glovill Solutions pvt(Ltd)");
        label.setFont(new Font("sansserif",1,37));
        label.setForeground(new Color(6, 120, 133));
        register.add(label);
        
    }
    MyTextField txtname;
    MyPasswordField txtPass;
    javax.swing.JComboBox<String> txtutype;

    private void initLogin(){
        login.setLayout(new MigLayout("wrap","push[center]push","push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel ("Sign In");
        label.setFont(new Font("sansserif",1,33));
        label.setForeground(new Color(6, 120, 133));
        login.add(label);
        
        txtname = new MyTextField();
        txtname.setPrefixIcon(new ImageIcon(getClass().getResource("user.png")));
        txtname.setHint("Name");
        login.add(txtname, "w 60%");
        
        txtPass = new MyPasswordField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/com/raven/icon/pass.png")));
        txtPass.setHint("Password");
        login.add(txtPass, "w 60%, h 40");
        
        /*txtutype = new javax.swing.JComboBox<>(new String[]{"Admin", "User"});
        login.add(txtutype, "w 60%");*/
        
        JComboBox<String> txtutype = new JComboBox<>(new String[]{"Admin", "User"});

// Change font color and size
        txtutype.setFont(new Font("SansSerif", Font.PLAIN, 16)); // 16 is font size
        txtutype.setForeground(new Color(255,255,255));          // font color

// Change background color
        txtutype.setBackground((new Color(230, 245, 241)));

// Change the height of the combo box
        txtutype.setPreferredSize(new Dimension(txtutype.getPreferredSize().width, 16)); // 35 is height

// Optional: remove focus border for modern look
        txtutype.setFocusable(false);

        login.add(txtutype, "w 60%");
        
        Button cmd = new Button();
        cmd.setBackground(new Color(6, 120, 133));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("Log In");
        login.add(cmd, "w 40%, h 35");
        cmd.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent evt) {
        
            String username = txtname.getText();
            String pass = txtPass.getText();
            String utype = txtutype.getSelectedItem().toString();

        try {
            pst = con.prepareStatement("SELECT * FROM users WHERE uname=? AND password=? AND utype=?");
            pst.setString(1, username);
            pst.setString(2, pass);
            pst.setString(3, utype);

            rs = pst.executeQuery();

            if (rs.next()) {

                int id = rs.getInt("id");  // get user id

                if (utype.equals("Admin")) {
                    setVisible(false);
                    new Main(id, username, utype).setVisible(true);
                    JFrame topFrame = (JFrame) javax.swing.SwingUtilities.getWindowAncestor(panelcover2.this);
                    topFrame.dispose();
                } else {
                    setVisible(false);
                    new userinterface(id, username, utype).setVisible(true);
                    JFrame topFrame = (JFrame) javax.swing.SwingUtilities.getWindowAncestor(panelcover2.this);
                    topFrame.dispose();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                txtname.setText("");
                txtPass.setText("");
                txtutype.setSelectedIndex(-1);
                txtname.requestFocus();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
});

    }
    public void showLogin(boolean show){
       if (show){
           register.setVisible(true);
           login.setVisible(false);
       } else{
           register.setVisible(false);
           login.setVisible(true);}
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel d;
    
    public void Connect() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/test1","root","");
            
        } catch (ClassNotFoundException ex) {
            System.getLogger(user.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (SQLException ex) {
            System.getLogger(user.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );

        add(login, "card3");

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents

    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables
}
