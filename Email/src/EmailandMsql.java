
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintStream;
import java.net.SocketTimeoutException;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.text.BadLocationException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class EmailandMsql extends javax.swing.JFrame {
    public EmailandMsql() {
        initComponents();
        showDate();
    
        
    }
    void showDate(){
       Date d=new Date();
       SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
       datelabe.setText(s.format(d));
       
        
    }
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        URL = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailbul = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        yazdırma = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        yazdırma2 = new javax.swing.JTextArea();
        dome = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        veriyekle = new javax.swing.JButton();
        domain = new javax.swing.JComboBox<>();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        emaillist = new javax.swing.JButton();
        domainemail = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        yazdırma3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        yazdırma4 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        datelabe = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 4), "Email Bulma ve Gosterme", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Lutfen URL Giriniz: ");

        URL.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        URL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                URLActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Domain nereye ait: ");

        emailbul.setBackground(new java.awt.Color(204, 204, 204));
        emailbul.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailbul.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Email\\ımage\\Internet-url-icon.png")); // NOI18N
        emailbul.setText("E-posta Bul");
        emailbul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailbulMouseClicked(evt);
            }
        });
        emailbul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailbulActionPerformed(evt);
            }
        });

        yazdırma.setEditable(false);
        yazdırma.setBackground(new java.awt.Color(204, 204, 204));
        yazdırma.setColumns(50);
        yazdırma.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        yazdırma.setForeground(new java.awt.Color(153, 0, 0));
        yazdırma.setRows(5);
        jScrollPane1.setViewportView(yazdırma);

        yazdırma2.setEditable(false);
        yazdırma2.setBackground(new java.awt.Color(204, 204, 204));
        yazdırma2.setColumns(50);
        yazdırma2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        yazdırma2.setForeground(new java.awt.Color(153, 0, 0));
        yazdırma2.setRows(5);
        jScrollPane3.setViewportView(yazdırma2);

        dome.setBackground(new java.awt.Color(204, 204, 204));
        dome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dome.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Email\\ımage\\Help-icon (1).png")); // NOI18N
        dome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                domeMouseClicked(evt);
            }
        });
        dome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domeActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Temizle");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Bulunan E-Posta Adresleri");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("E-Posta ile Iliskisi Olmayan Linkler");

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Veritabanına Eklemek için Tıklayınız:");

        veriyekle.setBackground(new java.awt.Color(204, 204, 204));
        veriyekle.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Email\\ımage\\Data-Mysql-icon.png")); // NOI18N
        veriyekle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                veriyekleMouseClicked(evt);
            }
        });

        domain.setBackground(new java.awt.Color(204, 204, 204));
        domain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        domain.setForeground(new java.awt.Color(153, 0, 0));
        domain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "commercial", "network", "organization", "business", "information", "professional", "nickler", "education", "government" }));
        domain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                domainMouseClicked(evt);
            }
        });
        domain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domainActionPerformed(evt);
            }
        });

        jProgressBar1.setBackground(new java.awt.Color(204, 204, 204));
        jProgressBar1.setForeground(new java.awt.Color(153, 0, 0));
        jProgressBar1.setStringPainted(true);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Email\\ımage\\system-attention-icon.png")); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(domain, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(URL, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailbul)
                                .addGap(52, 52, 52)))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(veriyekle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(URL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailbul, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(domain, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dome, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(veriyekle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 4), "Veri Tabanından Veri Gorunteleme ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        emaillist.setBackground(new java.awt.Color(204, 204, 204));
        emaillist.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emaillist.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Email\\ımage\\mysql-icon.png")); // NOI18N
        emaillist.setText("E-posta Goruntule");
        emaillist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emaillistActionPerformed(evt);
            }
        });

        domainemail.setBackground(new java.awt.Color(204, 204, 204));
        domainemail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        domainemail.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Email\\ımage\\mysql-icon.png")); // NOI18N
        domainemail.setText("Domain Doruntule");
        domainemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                domainemailMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Emailleri görüntülemek için tıklayınız");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Domein görüntülemek için tıklayınız");

        yazdırma3.setEditable(false);
        yazdırma3.setBackground(new java.awt.Color(204, 204, 204));
        yazdırma3.setColumns(50);
        yazdırma3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        yazdırma3.setForeground(new java.awt.Color(153, 0, 0));
        yazdırma3.setRows(5);
        jScrollPane2.setViewportView(yazdırma3);

        yazdırma4.setEditable(false);
        yazdırma4.setBackground(new java.awt.Color(204, 204, 204));
        yazdırma4.setColumns(50);
        yazdırma4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        yazdırma4.setForeground(new java.awt.Color(153, 0, 0));
        yazdırma4.setRows(5);
        jScrollPane4.setViewportView(yazdırma4);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Temizle");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Veritabanı E-Posta");

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Veritabanı Domain");

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("Veritabanından Silmek İçin Tıklayınız: ");

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Email\\ımage\\Database-Delete-icon.png")); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(domainemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emaillist, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(emaillist, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(domainemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("E-POSTA BULMA VE VERITABANINA ATAMA");

        datelabe.setBackground(new java.awt.Color(204, 204, 204));
        datelabe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        datelabe.setForeground(new java.awt.Color(153, 0, 0));
        datelabe.setText("TarihYeri");

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Email\\ımage\\zip-icon.png")); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274)
                .addComponent(datelabe, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(datelabe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emaillistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emaillistActionPerformed
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        String host ="localhost";
        String user = "root";
        String password = "";
        int toplam=0;
    try{ 
        Class.forName("com.mysql.jdbc.Driver");
    
    try {
         con = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://"+host+"/Email?user="+user+"&password="+password);
         st = (Statement) con.createStatement();
         String sql="select emailadi from email";
         rs=st.executeQuery(sql);
         while(rs.next()) {
                toplam=toplam+1;
               yazdırma3.append(""+rs.getString(1)+"\n");
               }
         System.out.println("Veri tabaninda bulunan mail sayisi; "+toplam);
         } catch (SQLException ex) {
               Logger.getLogger(EmailandMsql.class.getName()).log(Level.SEVERE, null, ex);
           }
     } catch (ClassNotFoundException ex) {
            System.out.print("Connector problemi var");
 
        }
        
        
    }//GEN-LAST:event_emaillistActionPerformed

    private void emailbulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailbulActionPerformed
        int i=0;
        
        try {
            ArrayList<String> listem = new ArrayList<>();
            Document doc = Jsoup.connect(URL.getText()).get();
            Pattern p = Pattern.compile("[a-zA-Z0-9_*.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+");
            Matcher matcher = p.matcher(doc.text());
            Set<String> emails = new HashSet<>();
            while (matcher.find()){
                emails.add(matcher.group());
            }
            listem.add(Arrays.toString(emails.toArray()));
            String E=((listem.get(0)).substring(1));
            String EM=E.substring(0,E.length()-1);
            String EMA [] =(EM.split(","));
            if(emails.size()==0){
               yazdırma2.append("Girdiğiniz ana URL de mail yok"+"\n");
            }
            else{
                for(String k:EMA){
                    k=k.trim();
                    jProgressBar1.setValue(i);
                    System.out.println(k);
                    i=i+1;
                    yazdırma.append(""+k+"\n");
                }
            }
            Set<String> links = new HashSet<>();
            Elements elements = doc.select("a[href]");
            elements.forEach((Element e) -> {
                    links.add(e.attr("href"));
            });
            ArrayList<String> link = new ArrayList<>();
            link.add(Arrays.toString(links.toArray()));
            String a =((link.get(0)).substring(1));
            String b=a.substring(0,a.length()-1);
            String[] c=b.split(",");
            yazdırma2.append("Bu URL'de bulunan link sayisi: "+c.length+"\n");
            for(String c1: c){
                try{
                String l="";
                c1=c1.trim();
                l=c1.substring(0,4);
                ArrayList<String> list = new ArrayList<>();
                if(l.equals("http")){
                        Document d = Jsoup.connect(c1).get();
                        Pattern s = Pattern.compile("[a-zA-Z0-9_*.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+");
                        Matcher m = s.matcher(d.text());
                        Set<String> email = new HashSet<>();
                        while (m.find()){
                            email.add(m.group());
                            }
                        list.add(Arrays.toString(email.toArray()));
                        String P=((list.get(0)).substring(1));
                        String EML=P.substring(0,P.length()-1);
                        String EMAE [] =(EML.split(","));
                        if(email.isEmpty()){
                            yazdırma2.append("Bu linkte e posta yok : " +c1+"\n");
                            }
                            else{
                                    for(String k:EMAE){
                                        jProgressBar1.setValue(i);
                                        System.out.println(k);
                                        i=i+1;
                                        k=k.trim();
                                        yazdırma.append(""+k+"\n");
                                            }
                                }
                            }
                else if((URL.getText().substring(URL.getText().length()-1,URL.getText().length())).equals("/")){
                    String YeniURL=URL+c1;
                    Document d = Jsoup.connect(YeniURL).get();
                    Pattern s = Pattern.compile("[a-zA-Z0-9_*.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+");
                    Matcher m = s.matcher(d.text());
                    Set<String> email = new HashSet<>();
                    while (m.find()){
                        email.add(m.group());
                        }
                    list.add(Arrays.toString(email.toArray()));
                    String P=((list.get(0)).substring(1));
                    String EML=P.substring(0,P.length()-1);
                    String EMAE [] =(EML.split(","));
                    if(email.isEmpty()){
                        yazdırma2.append("Bu Linkte e posta yok : " +c1+"\n");
                        }
                    else{
                        for(String k:EMAE){
                                i=i+1;
                                System.out.println(k);
                                jProgressBar1.setValue(i);
                                k=k.trim();
                                yazdırma.append(""+k+"\n");
                                }
                        }
                }else if((URL.getText().substring(URL.getText().length()-1,URL.getText().length()))!="/"){
                    String YeniURL=URL+"/"+c1;
                    Document d = Jsoup.connect(YeniURL).get();
                    Pattern s = Pattern.compile("[a-zA-Z0-9_*.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+");
                    Matcher m = s.matcher(d.text());
                    Set<String> email = new HashSet<>();
                    while (m.find()){
                        email.add(m.group());
                        }
                    list.add(Arrays.toString(email.toArray()));
                    String P=((list.get(0)).substring(1));
                    String EML=P.substring(0,P.length()-1);
                    String EMAE [] =(EML.split(","));
                    if(email.isEmpty()){
                        yazdırma2.append("Bu Linkte e posta yok : " +c1+"\n");
                        }
                    else{
                        for(String k:EMAE){
                                i=i+1;
                                System.out.println(k);
                                jProgressBar1.setValue(i);
                                k=k.trim();
                                yazdırma.append(""+k+"\n");
                                }
                    
                }
                }   
                }catch(IOException e){
                    if(c1.equals(" ") ||  c1.equals("#")){
                        yazdırma2.append("bilinmeyen link: "+c1+"\n");
                        }
                }catch(Exception e){
                        if(c1.equals(" ") ||  c1.equals("#")){
                            yazdırma2.append("bilinmeyen link: "+c1+"\n");
                            }
                }
                
                }
            
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(EmailandMsql.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_emailbulActionPerformed

    private void emailbulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailbulMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_emailbulMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        yazdırma.setText("");
        yazdırma2.setText("");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        yazdırma3.setText("");
        yazdırma4.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

    private void domainemailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_domainemailMouseClicked
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        String host ="localhost";
        String user = "root";
        String password = "";
        int toplam=0;
    try{ 
        Class.forName("com.mysql.jdbc.Driver");
    
    try {
         con = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://"+host+"/Email?user="+user+"&password="+password);
         st = (Statement) con.createStatement();
         String sql="select domain from email";
         rs=st.executeQuery(sql);
         while(rs.next()) {
                toplam=toplam+1;
               yazdırma4.append(""+rs.getString(1)+"\n");
               }
         System.out.println("Veri tabaninda bulunan mail sayisi; "+toplam);
         } catch (SQLException ex) {
               Logger.getLogger(EmailandMsql.class.getName()).log(Level.SEVERE, null, ex);
           }
     } catch (ClassNotFoundException ex) {
            System.out.print("Connector problemi var");
 
        }
        
    }//GEN-LAST:event_domainemailMouseClicked

    private void URLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_URLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_URLActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void domeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domeActionPerformed
        
    }//GEN-LAST:event_domeActionPerformed

    private void domeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_domeMouseClicked
       JOptionPane.showMessageDialog(null, "Aşağıda Domain Uzantıları ve Anlamları yer almaktadır"+"\n"+
               ".com = Ticari alan adı olarak üretilmiş olmasına rağmen günümüzde her tür site için kullanılmaya başlamıştır."+"\n"+
               ".net = İngilizcede ağ uzantısı anlamına gelen \"network\" kelimesinden kısaltılmıştır."+"\n"+
               ".org = Organizasyonlar için kullanılır \"organization\" kelimesinin ilk üç harfi kullanılmıştır. "+"\n"+
               ".biz = Bu uzantı iş, ticaret anlamına gelen \"business\"  kelimesinden kısaltılmıştır. "+"\n"+
               ".info = Uzantısı bilgi anlamına gelmektedir. İngilizcede \"information\" kelimesinin kısaltılmışıdır."+"\n"+
               ".pro = Profesyonel anlamına gelmektedir. İngilizcede professional\" kelimesinin kısaltılmışıdır."+"\n"+
               ".name = Gerçek isimler için bu uzantı kullanılmaktadır. İngilizcede \"nickler\" kelimesinden üretilmiştir."+"\n"+
               ".edu = Eğitim kurumları için türetilmiş bir alan adı uzantısıdır. \"education\" kelimesinin kısaltılmışıdır."+"\n"+
               ".gov = Devlet kuruluşlarının alan adı uzantısıdır. \"government\" kelimesinin kısaltılmışıdır."+"\n"
               );
    }//GEN-LAST:event_domeMouseClicked

    private void veriyekleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_veriyekleMouseClicked
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        String host ="localhost";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://"+host+"/Email?user="+user+"&password="+password);
            st = (Statement) con.createStatement();
            String a=yazdırma.getText();
            String [] b =(a.split("\n"));    
            int size = b.length;
            ArrayList<String> liste = new ArrayList<String>();
            for(String k:b){
                liste.add(k);
            }
            Set<String> hs = new HashSet<>();
                hs.addAll(liste);
                liste.clear();
                liste.addAll(hs);
          String selectDomain=(String) domain.getSelectedItem();
          for(String k:liste){
                k=k.trim();
                System.out.println(k);
                String sql="insert into email values ('"+k+"','"+selectDomain+"')";
                st.executeUpdate(sql);
           }
         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmailandMsql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EmailandMsql.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_veriyekleMouseClicked

    private void domainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domainActionPerformed
        
    }//GEN-LAST:event_domainActionPerformed

    private void domainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_domainMouseClicked
     
        
        
    }//GEN-LAST:event_domainMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        String host ="localhost";
        String user = "root";
        String password = "";
        int toplam=0;
    try{ 
        Class.forName("com.mysql.jdbc.Driver");
    
    try {
         con = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://"+host+"/Email?user="+user+"&password="+password);
         st = (Statement) con.createStatement();
         String sql="delete from email";
         int silinen=st.executeUpdate(sql);
         if(silinen>0){
		JOptionPane.showMessageDialog(null,"Mailler başarıyla silindi");
		}else{
                JOptionPane.showMessageDialog(null,"Tablo Boş"); 
		}
         } catch (SQLException ex) {
               Logger.getLogger(EmailandMsql.class.getName()).log(Level.SEVERE, null, ex);
           }
     } catch (ClassNotFoundException ex) {
            System.out.print("Connector problemi var");
 
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
       
        JOptionPane.showMessageDialog(null,"Veritabanına eklemek için bilgisayarınızda MySql yüklü olmalıdır."+"\n"+
                    "MySql yüklü ise lutfen bilgisayarınızdan C:\\xampp adresine gidip \"XAMPP-Control-Panel\"'i yonetici olarak çalıstırınız"+"\n"+
                    "Acılan pencereden daha sonra Mysql servisini Start(aktif) ediniz "+"\n"+
                    "Eğer Mysql yüklü değilse \"mySQL+Php+Apache (3 in 1) xampp-win32-1.7.2.exe\" linkinden indirebilirsiniz"+"\n"+
                    "yukledikten sonra veritabanınızda \"Email\" adında bir veritabanı, \"email\" adında bir tablo ve tablo içinde "+"\n"+
                    "\"emailadi\" adında \"primary\" olacak şekilde bir alan ve bu alana karşılık gelecek \"domain\" adında baska bir alan olusturunuz"+"\n"+
                    "Eğer alan ve toblo oluşturmayı bilmiyorsanız \"http://80.251.40.59/ankara.edu.tr/demircan/ogrenciDb_yapisi.pdf\" linkine giribilisiniz"+"\n"+
                    "yada  bu konuda google a basvurubilirsiniz"+"\n"+
                    "\"www.google.com\""+"\n"+
                    "Veritabanını yuklemek istemiyorsanız e-posta adreslerini sadece görüntüleyebilirsiniz!"+"\n"+
                    "Bu durumda sağ tarafta bulunan \"Veri Tabanından Veri Goruntulme \" kısmından herhangi bir veri alamazsınız"
                );
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
         JOptionPane.showMessageDialog(null,"Girilen URL arşivi yer almaktadir: "+"\n"+
                            +URL.getColumns()
                 );
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(EmailandMsql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmailandMsql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmailandMsql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmailandMsql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmailandMsql().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField URL;
    private javax.swing.JLabel datelabe;
    private javax.swing.JComboBox<String> domain;
    private javax.swing.JButton domainemail;
    private javax.swing.JButton dome;
    private javax.swing.JButton emailbul;
    private javax.swing.JButton emaillist;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton veriyekle;
    private javax.swing.JTextArea yazdırma;
    private javax.swing.JTextArea yazdırma2;
    private javax.swing.JTextArea yazdırma3;
    private javax.swing.JTextArea yazdırma4;
    // End of variables declaration//GEN-END:variables

   
    private void DateTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
