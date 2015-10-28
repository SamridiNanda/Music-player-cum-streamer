package projmusiclib;

import java.awt.FlowLayout;
import java.io.File;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.media.*;
import java.net.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.Delayed;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainFrame2search extends javax.swing.JFrame {
    private Player p;

    public MainFrame2search() {
        initComponents();
        jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
        setLayout(new FlowLayout());
        jButton3.setVisible(false);
        //this.getParent().getParent().getParent().getParent().setVisible(false);
         
    }
    final static String mPath = "I:\\MusicLib\\";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projmusiclib/samban.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 51));
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(255, 255, 204));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GENRE", "ARTIST" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BLUES", "COUNTRY", "POP", "ROCK" }));
        jComboBox2.setOpaque(false);

        jComboBox3.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EMINEM", "KATY PERRY", "IMAGINE DRAGONS", "COLDPLAY", "ENRIQUE" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setOpaque(true);

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setText("ALL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Mistral", 3, 36)); // NOI18N
        jLabel2.setText("BASS BOOST");

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("STOP playing");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton3)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        if (jComboBox1.getSelectedItem().toString() == "GENRE") {
            jComboBox2.setVisible(true);
            jComboBox3.setVisible(false);
        } else {
            jComboBox3.setVisible(true);
            jComboBox2.setVisible(false);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private Vector getSongs(String paths) {
        Vector vec = new Vector();
        File f = new File(paths);
        File[] arr = f.listFiles();
        for (File k : arr) {
           // vec.add(k.getPath());
            vec.add(k.getName());
            //use dis if u just want the name of song
        }
        return vec;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jComboBox1.getSelectedItem().toString() == "GENRE") {
            String h = jComboBox2.getSelectedItem().toString();
            String paths = mPath + h;
            if (h.equals("BLUES")) {
                Vector v = new Vector();
                v = getSongs(paths);
                jList1.removeAll();
                jList1.setListData(v);
            }
            if (h.equals("ROCK")) {
                Vector v = new Vector();
                v = getSongs(paths);
                jList1.removeAll();
                jList1.setListData(v);
            }
            if (h.equals("POP")) {
                Vector v = new Vector();
                v = getSongs(paths);
                jList1.removeAll();
                jList1.setListData(v);
            }
            if (h.equals("COUNTRY")) {
                Vector v = new Vector();
                v = getSongs(paths);
                jList1.removeAll();
                jList1.setListData(v);
            }
        } else if (jComboBox1.getSelectedItem().toString() == "ARTIST") {
            String j = jComboBox3.getSelectedItem().toString();
            String pathss = mPath + j;
            if (j.equals("EMINEM")) {
                Vector v = new Vector();
                v = getSongs(pathss);
                jList1.removeAll();
                jList1.setListData(v);
            }
            if (j.equals("KATY PERRY")) {
                Vector v = new Vector();
                v = getSongs(pathss);
                jList1.removeAll();
                jList1.setListData(v);
            }
            if (j.equals("IMAGINE DRAGONS")) {
                Vector v = new Vector();
                v = getSongs(pathss);
                jList1.removeAll();
                jList1.setListData(v);
            }
            if (j.equals("ENRIQUE")) {
                Vector v = new Vector();
                v = getSongs(pathss);
                jList1.removeAll();
                jList1.setListData(v);
            }
            if (j.equals("COLDPLAY")) {
                Vector v = new Vector();
                v = getSongs(pathss);
                jList1.removeAll();
                jList1.setListData(v);
            }

            if (jComboBox3.getSelectedIndex() > -1) {
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged

        String h = jList1.getSelectedValue().toString();
        
        
       String j = jComboBox3.getSelectedItem().toString();
       String k=jComboBox2.getSelectedItem().toString();
       String u = null ;
       if (jComboBox1.getSelectedItem().toString() == "GENRE")
       {
       u=mPath+k+"\\"+h;
       }
       else if (jComboBox1.getSelectedItem().toString() == "ARTIST")
       {
       u=mPath+j+"\\"+h;
       }
       JOptionPane.showMessageDialog(null, u);
//        Runtime r = Runtime.getRuntime();
//        try {
//            String j[] = new String[]{h};
//            r.exec("H:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe", j);
//
//        } catch (Exception ex) {
//            System.out.println("Exception buddy" + ex.getMessage());
//        }
        
        File f= new File(u);
 //final Player p = null;
        try {
            try {
                p = Manager.createRealizedPlayer(f.toURI().toURL());
            } catch (IOException ex) {
                Logger.getLogger(MainFrame2search.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoPlayerException ex) {
                Logger.getLogger(MainFrame2search.class.getName()).log(Level.SEVERE, null, ex);
            } catch (CannotRealizeException ex) {
                Logger.getLogger(MainFrame2search.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(MainFrame2search.class.getName()).log(Level.SEVERE, null, ex);
        }
  p.start();
  jButton3.setVisible(true);
//  Scanner s=new Scanner(System.in);
//  String st=s.nextLine();
//   if(st.equals("s"))
//   {
//   p.stop();
//   }
  
    }//GEN-LAST:event_jList1ValueChanged

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        //JOptionPane.showMessageDialog(null, "Clicked on song "+jList1.getSelectedValue().toString());
     
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String[] arr1 = {"BLUES", "POP", "ROCK", "COUNTRY"};
        DefaultMutableTreeNode rNode = new DefaultMutableTreeNode("SONGS");

        DefaultMutableTreeNode node2 = null;
        DefaultMutableTreeNode node3 = null;
        DefaultMutableTreeNode node4 = null;
        DefaultMutableTreeNode node5 = null;
        for (String d : arr1) {
            if (d.equals("BLUES")) {
                node2 = new DefaultMutableTreeNode("BLUES");
                File f = new File("I:\\MusicLib\\BLUES");
                File[] arr = f.listFiles();
                for (File k : arr) {
                    // for (String k : arr2) {
                    DefaultMutableTreeNode nodeb = new DefaultMutableTreeNode(k.getName());
                    node2.add(nodeb);
                }
                rNode.add(node2);
            } else if (d.equals("ROCK")) {
                node3 = new DefaultMutableTreeNode("ROCK");
                 File f = new File("I:\\MusicLib\\ROCK");
                File[] arr = f.listFiles();
                for (File k : arr) {

                    DefaultMutableTreeNode nodeb = new DefaultMutableTreeNode(k);
                    node3.add(nodeb);
                }
                rNode.add(node3);
            } else if (d.equals("POP")) {
                node4 = new DefaultMutableTreeNode("POP");
                File f = new File("I:\\MusicLib\\POP");
                File[] arr = f.listFiles();
                for (File k : arr) {
               // for (String k : arr4) {
                    DefaultMutableTreeNode nodeb = new DefaultMutableTreeNode(k);
                    node4.add(nodeb);
                }
                rNode.add(node4);
            } else if (d.equals("COUNTRY")) {
                node5 = new DefaultMutableTreeNode("COUNTRY");
                File f = new File("I:\\MusicLib\\COUNTRY");
                File[] arr = f.listFiles();
                for (File k : arr) {
               // for (String k : arr5) {
                    DefaultMutableTreeNode nodeb = new DefaultMutableTreeNode(k);
                    node5.add(nodeb);
                }
                rNode.add(node5);
//     DefaultMutableTreeNode nodea = new DefaultMutableTreeNode(d);
//                rNode.add(nodea);
//            }
            }
        }

        JTree tree = new JTree(rNode);
        tree.setSize(900, 900);
        jLabel1.add(tree);
        //add(tree);
       tree.setModel(new DefaultTreeModel(rNode));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        p.stop();
        jButton3.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame2search().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
