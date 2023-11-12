
package View;

import ConnectSocket.SVSocket;
import Controler.DAOclient;
import Controler.DAOnv;
import Model.M_Client;
import Model.M_DBconnect;
import Model.M_Nhanvien;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Home extends javax.swing.JFrame {

    private List<M_Nhanvien> nhanvien;
    private List<M_Client> client;
    private DefaultTableModel model;
    private int selectedIndex;
    public SVSocket sv;
    private DefaultListModel modelList;
    
    public Home() {
        initComponents();
        modelList = new DefaultListModel();
        this.Show();
        M_DBconnect.loadConnection();
        
    }
    
    public void Show(){
        btnListClients.setVisible(false);
        btnStatusClient.setVisible(false);
        btnEditData.setVisible(false);
        btnShowData.setVisible(false);
        panelContainer.setVisible(true);
        panelData.setVisible(false);
        panelStatusClient.setVisible(true);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        iconHome = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnDATA = new javax.swing.JButton();
        txtPort = new javax.swing.JTextField();
        btnCLIENT = new javax.swing.JButton();
        btnEditData = new javax.swing.JButton();
        btnShowData = new javax.swing.JButton();
        btnListClients = new javax.swing.JButton();
        btnStatusClient = new javax.swing.JButton();
        panelContainer = new javax.swing.JPanel();
        panelData = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableNV = new javax.swing.JTable();
        jPanelThongtinnhanvien = new javax.swing.JPanel();
        mã = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        ten = new javax.swing.JLabel();
        gioitinh = new javax.swing.JLabel();
        cv = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        date = new javax.swing.JLabel();
        diachi = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        lương = new javax.swing.JLabel();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        cbbChucvu = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnRefesh = new javax.swing.JButton();
        jDate = new com.toedter.calendar.JDateChooser();
        panelStatusClient = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListStatus = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSend = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListClient = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableClient = new javax.swing.JTable();
        panelListClients = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStart.setBackground(new java.awt.Color(54, 33, 89));
        btnStart.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 255, 255));
        btnStart.setText("Start");
        btnStart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel2.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 90, 40));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PORT:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 60));

        iconHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_image/home.png"))); // NOI18N
        jPanel2.add(iconHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 140, 120));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 330, 20));

        btnDATA.setBackground(new java.awt.Color(204, 204, 255));
        btnDATA.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnDATA.setForeground(new java.awt.Color(54, 33, 89));
        btnDATA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_image/customer.png"))); // NOI18N
        btnDATA.setText("DATA");
        btnDATA.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 255, 255)));
        btnDATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDATAActionPerformed(evt);
            }
        });
        jPanel2.add(btnDATA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 330, 60));

        txtPort.setBackground(new java.awt.Color(54, 33, 89));
        txtPort.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        txtPort.setForeground(new java.awt.Color(255, 255, 255));
        txtPort.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPort.setText("1234");
        txtPort.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 100, 30));

        btnCLIENT.setBackground(new java.awt.Color(204, 204, 255));
        btnCLIENT.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnCLIENT.setForeground(new java.awt.Color(54, 33, 89));
        btnCLIENT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_image/customer.png"))); // NOI18N
        btnCLIENT.setText("CLIENTS");
        btnCLIENT.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 255, 255)));
        btnCLIENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCLIENTActionPerformed(evt);
            }
        });
        jPanel2.add(btnCLIENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 330, 60));

        btnEditData.setBackground(new java.awt.Color(54, 33, 89));
        btnEditData.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnEditData.setForeground(new java.awt.Color(255, 255, 255));
        btnEditData.setText("Edit Data");
        btnEditData.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        btnEditData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDataActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 330, 40));

        btnShowData.setBackground(new java.awt.Color(54, 33, 89));
        btnShowData.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnShowData.setForeground(new java.awt.Color(255, 255, 255));
        btnShowData.setText("Show Data");
        btnShowData.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        btnShowData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDataActionPerformed(evt);
            }
        });
        jPanel2.add(btnShowData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 330, 40));

        btnListClients.setBackground(new java.awt.Color(54, 33, 89));
        btnListClients.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnListClients.setForeground(new java.awt.Color(255, 255, 255));
        btnListClients.setText("List Clients");
        btnListClients.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        btnListClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListClientsActionPerformed(evt);
            }
        });
        jPanel2.add(btnListClients, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 330, 40));

        btnStatusClient.setBackground(new java.awt.Color(54, 33, 89));
        btnStatusClient.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnStatusClient.setForeground(new java.awt.Color(255, 255, 255));
        btnStatusClient.setText("Status Clients");
        btnStatusClient.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        btnStatusClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusClientActionPerformed(evt);
            }
        });
        jPanel2.add(btnStatusClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 330, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 820));

        panelContainer.setBackground(new java.awt.Color(204, 204, 255));
        panelContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelData.setBackground(new java.awt.Color(204, 204, 255));
        panelData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableNV.setForeground(new java.awt.Color(54, 33, 89));
        TableNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã NV", "Họ và tên", "Chức vụ", "Ngày sinh", "Giới tính", "Địa chỉ", "Email", "Lương"
            }
        ));
        TableNV.setGridColor(new java.awt.Color(204, 204, 255));
        TableNV.setSelectionBackground(new java.awt.Color(204, 204, 255));
        TableNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableNV);
        if (TableNV.getColumnModel().getColumnCount() > 0) {
            TableNV.getColumnModel().getColumn(0).setPreferredWidth(15);
            TableNV.getColumnModel().getColumn(1).setPreferredWidth(30);
            TableNV.getColumnModel().getColumn(2).setPreferredWidth(100);
            TableNV.getColumnModel().getColumn(3).setPreferredWidth(70);
            TableNV.getColumnModel().getColumn(4).setPreferredWidth(50);
            TableNV.getColumnModel().getColumn(6).setPreferredWidth(50);
            TableNV.getColumnModel().getColumn(7).setPreferredWidth(100);
            TableNV.getColumnModel().getColumn(8).setPreferredWidth(30);
        }

        panelData.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 710, 800));

        jPanelThongtinnhanvien.setBackground(new java.awt.Color(255, 255, 255));
        jPanelThongtinnhanvien.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 2, true), "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 18), new java.awt.Color(54, 33, 89))); // NOI18N
        jPanelThongtinnhanvien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mã.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mã.setForeground(new java.awt.Color(54, 33, 89));
        mã.setText("Mã nhân viên:");
        jPanelThongtinnhanvien.add(mã, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 50));

        txtMa.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        txtMa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 1, true));
        jPanelThongtinnhanvien.add(txtMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 230, 30));

        txtTen.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        txtTen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 1, true));
        jPanelThongtinnhanvien.add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 230, 30));

        ten.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ten.setForeground(new java.awt.Color(54, 33, 89));
        ten.setText("Họ và tên");
        jPanelThongtinnhanvien.add(ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 50));

        gioitinh.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        gioitinh.setForeground(new java.awt.Color(54, 33, 89));
        gioitinh.setText("Giới tính");
        jPanelThongtinnhanvien.add(gioitinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, 50));

        cv.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cv.setForeground(new java.awt.Color(54, 33, 89));
        cv.setText("Chức vụ");
        jPanelThongtinnhanvien.add(cv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 50));

        txtDiachi.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        txtDiachi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 1, true));
        jPanelThongtinnhanvien.add(txtDiachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 230, 30));

        date.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        date.setForeground(new java.awt.Color(54, 33, 89));
        date.setText("Ngày sinh");
        jPanelThongtinnhanvien.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, 50));

        diachi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        diachi.setForeground(new java.awt.Color(54, 33, 89));
        diachi.setText("Địa chỉ");
        jPanelThongtinnhanvien.add(diachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 110, 50));

        txtLuong.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        txtLuong.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 1, true));
        jPanelThongtinnhanvien.add(txtLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 230, 30));

        txtEmail.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 1, true));
        jPanelThongtinnhanvien.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 230, 30));

        email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        email.setForeground(new java.awt.Color(54, 33, 89));
        email.setText("Email");
        jPanelThongtinnhanvien.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 110, 50));

        lương.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lương.setForeground(new java.awt.Color(54, 33, 89));
        lương.setText("Lương");
        jPanelThongtinnhanvien.add(lương, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 110, 50));

        rdNam.setText("Nam");
        jPanelThongtinnhanvien.add(rdNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        rdNu.setText("Nữ");
        jPanelThongtinnhanvien.add(rdNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        cbbChucvu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(BH) Bán Hàng", "(BV) Bảo Vệ", "(QL) Quản Lý" }));
        cbbChucvu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanelThongtinnhanvien.add(cbbChucvu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 230, 30));

        btnAdd.setBackground(new java.awt.Color(54, 33, 89));
        btnAdd.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanelThongtinnhanvien.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 180, 50));

        btnEdit.setBackground(new java.awt.Color(54, 33, 89));
        btnEdit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanelThongtinnhanvien.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 180, 50));

        btnDel.setBackground(new java.awt.Color(54, 33, 89));
        btnDel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnDel.setForeground(new java.awt.Color(255, 255, 255));
        btnDel.setText("Delete");
        btnDel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        jPanelThongtinnhanvien.add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 720, 120, 50));

        btnSearch.setBackground(new java.awt.Color(54, 33, 89));
        btnSearch.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanelThongtinnhanvien.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 120, 50));

        btnRefesh.setBackground(new java.awt.Color(54, 33, 89));
        btnRefesh.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnRefesh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefesh.setText("Refesh");
        btnRefesh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });
        jPanelThongtinnhanvien.add(btnRefesh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, 180, 50));
        jPanelThongtinnhanvien.add(jDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 230, 30));

        panelData.add(jPanelThongtinnhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 800));

        panelContainer.add(panelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 820));

        panelStatusClient.setBackground(new java.awt.Color(255, 255, 255));
        panelStatusClient.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ListStatus.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 2, true), "Status", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(54, 33, 89))); // NOI18N
        jScrollPane2.setViewportView(ListStatus);

        panelStatusClient.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 600, 720));

        txtSend.setBackground(new java.awt.Color(204, 204, 255));
        txtSend.setColumns(20);
        txtSend.setRows(5);
        txtSend.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane3.setViewportView(txtSend);

        panelStatusClient.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 740, 460, 50));

        btnSend.setBackground(new java.awt.Color(204, 204, 255));
        btnSend.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSend.setForeground(new java.awt.Color(0, 102, 102));
        btnSend.setText("Send");
        btnSend.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        panelStatusClient.add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 740, 120, 50));

        ListClient.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 2, true), "Danh sách online", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(54, 33, 89))); // NOI18N
        jScrollPane4.setViewportView(ListClient);

        panelStatusClient.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 440, 350));

        TableClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Username", "Block"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(TableClient);
        if (TableClient.getColumnModel().getColumnCount() > 0) {
            TableClient.getColumnModel().getColumn(0).setPreferredWidth(15);
            TableClient.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        panelStatusClient.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 440, 350));

        panelContainer.add(panelStatusClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 820));

        javax.swing.GroupLayout panelListClientsLayout = new javax.swing.GroupLayout(panelListClients);
        panelListClients.setLayout(panelListClientsLayout);
        panelListClientsLayout.setHorizontalGroup(
            panelListClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
        );
        panelListClientsLayout.setVerticalGroup(
            panelListClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );

        panelContainer.add(panelListClients, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 820));

        jPanel1.add(panelContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 1110, 820));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 //Kết nối socket

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
            modelList.addElement("Server connecting ...");
            ListStatus.setModel(modelList);
        try {
            sv = new SVSocket();
            Home homeframe = new Home();
            sv.setHomeFrame(homeframe);
    
            modelList.addElement("Server has successfully connected");
            ListStatus.setModel(modelList);
        } catch (Exception e) {
        }
        btnStart.setEnabled(false);
    }//GEN-LAST:event_btnStartActionPerformed

//Menu Button
    private void btnDATAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDATAActionPerformed
        // TODO add your handling code here:
        btnShowData.setVisible(true);
        btnEditData.setVisible(true);
        btnListClients.setVisible(false);
        btnStatusClient.setVisible(false);
    }//GEN-LAST:event_btnDATAActionPerformed

    private void btnCLIENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCLIENTActionPerformed
        // TODO add your handling code here:
        btnListClients.setVisible(true);
        btnStatusClient.setVisible(true);
        btnEditData.setVisible(false);
        btnShowData.setVisible(false);
    }//GEN-LAST:event_btnCLIENTActionPerformed

    private void btnEditDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDataActionPerformed
        
    // hiện panelData
        panelStatusClient.setVisible(false);
        panelData.setVisible(true);
        //đưa dữ liệu lên bảng
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel)TableNV.getModel();
        showTableDATA();
    }//GEN-LAST:event_btnEditDataActionPerformed

    private void btnShowDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowDataActionPerformed

    private void btnListClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListClientsActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnListClientsActionPerformed

    private void btnStatusClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusClientActionPerformed
        // TODO add your handling code here:
        panelStatusClient.setVisible(true);
        panelData.setVisible(false);
        //đưa dữ liệu lên bảng
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel)TableClient.getModel();
        showTableClient();
    }//GEN-LAST:event_btnStatusClientActionPerformed

    
//CRUD DATA+++++++++++++++++++++++++++++++++++++++
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        M_Nhanvien nv=new M_Nhanvien();
        nv.setManv(txtMa.getText());
        nv.setTennv(txtTen.getText());
        nv.setChucvu(cbbChucvu.getSelectedItem().toString());
        nv.setDate(jDate.getDate());
        nv.setDiachi(txtDiachi.getText());
        nv.setEmail(txtEmail.getText());
        String gt="";
        if(rdNam.isSelected()) gt="Nam"; 
        else gt="Nữ";
        nv.setGt(gt);
        boolean isOK=true;
        try{
            nv.setLuong(Integer.parseInt(txtLuong.getText()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Lương phải nhập số");
            isOK=false;
        }
        if(isOK){
            new DAOnv().AddNV(nv);
            showTableDATA();
            try {
                for (Socket client : sv.clientList) {
                    sv.SendDATA(client, model);
                    JOptionPane.showMessageDialog(this, "Them thanh cong");
                }
                
            }catch(Exception e ){e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        selectedIndex=TableNV.getSelectedRow();
        M_Nhanvien n= nhanvien.get(selectedIndex);
        new DAOnv().DeleteNV(n.getId());
        if(nhanvien.isEmpty()){
            JOptionPane.showMessageDialog(this, "Không có dữ liệu để sửa");
        }
        else if(selectedIndex==-1){
            JOptionPane.showMessageDialog(this, "Hãy chọn 1 dòng để sửa");
        }
        else{
        M_Nhanvien nv=new M_Nhanvien();
        nv.setManv(txtMa.getText());
        nv.setTennv(txtTen.getText());
        nv.setChucvu(cbbChucvu.getSelectedItem().toString());
        nv.setDate(jDate.getDate());
        String gt="";
        if(rdNam.isSelected()) gt="Nam"; 
        else gt="Nữ";
        nv.setGt(gt);
        nv.setDiachi(txtDiachi.getText());
        nv.setEmail(txtEmail.getText());
        boolean isOK=true;
        try{
            nv.setLuong(Integer.parseInt(txtLuong.getText()));
     
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Là số không phải là kí tự");
            isOK=false;
        }
        if(isOK){
            new DAOnv().AddNV(nv);
            showTableDATA();
            JOptionPane.showMessageDialog(this, "Sửa thành công");
        }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
       selectedIndex =TableNV.getSelectedRow();
       M_Nhanvien nv= nhanvien.get(selectedIndex);
       JOptionPane.showConfirmDialog(this,"Bạn có chắc muốn xóa");
       new DAOnv().DeleteNV(nv.getId());
       showTableDATA();
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
            String Name=txtTen.getText();
        if(Name.length()>0){
            nhanvien=new DAOnv().findbyName(Name);
            model.setRowCount(0);
        for(M_Nhanvien nv:nhanvien){
            model.addRow(new Object[]{
            TableNV.getRowCount()+1,nv.getManv(),nv.getTennv(),nv.getChucvu(),nv.getDate(),nv.getGt(),nv.getDiachi(),nv.getEmail(),nv.getLuong()
        });
        }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed
        // TODO add your handling code here:
        txtMa.setText("");
        txtTen.setText("");
        cbbChucvu.setSelectedIndex(0);
        jDate.setDate(null);
        rdNam.setSelected(true);
        rdNu.setSelected(false);
        txtDiachi.setText("");
        txtEmail.setText("");
        txtLuong.setText("");
        showTableDATA();
    }//GEN-LAST:event_btnRefeshActionPerformed

    private void TableNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableNVMouseClicked
        
        selectedIndex =TableNV.getSelectedRow();
        M_Nhanvien nv= nhanvien.get(selectedIndex);
        txtMa.setText(nv.getManv());
        txtTen.setText(nv.getTennv());
        cbbChucvu.setSelectedItem(nv.getChucvu());
        jDate.setDate(nv.getDate());
        if(nv.getGt()== "Nam"){rdNam.setSelected(true);rdNu.setSelected(false);}
        else {rdNu.setSelected(true); rdNam.setSelected(false);}
        txtDiachi.setText(nv.getDiachi());
        txtEmail.setText(nv.getEmail());
        txtLuong.setText(Integer.toString(nv.getLuong()));

    }//GEN-LAST:event_TableNVMouseClicked
//CLIENT+++++++++++++++++++++++++++++++++++++++
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        if(txtSend.getText()==""){
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập thông tin");
        }
        else{
            try {
                modelList.addElement("Server: " + txtSend.getText());
                ListStatus.setModel(modelList);
                String mess = txtSend.getText();
                
                
                for (Socket client : sv.clientList) {
                    sv.SendMess(client, mess);
                    JOptionPane.showMessageDialog(this, "Them thanh cong");
                }
              
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnSendActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListClient;
    private javax.swing.JList<String> ListStatus;
    private javax.swing.JTable TableClient;
    private javax.swing.JTable TableNV;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCLIENT;
    private javax.swing.JButton btnDATA;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEditData;
    private javax.swing.JButton btnListClients;
    private javax.swing.JButton btnRefesh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShowData;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStatusClient;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbChucvu;
    private javax.swing.JLabel cv;
    private javax.swing.JLabel date;
    private javax.swing.JLabel diachi;
    private javax.swing.JLabel email;
    private javax.swing.JLabel gioitinh;
    private javax.swing.JLabel iconHome;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelThongtinnhanvien;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lương;
    private javax.swing.JLabel mã;
    private javax.swing.JPanel panelContainer;
    private javax.swing.JPanel panelData;
    private javax.swing.JPanel panelListClients;
    private javax.swing.JPanel panelStatusClient;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JLabel ten;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextArea txtSend;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

        
    //thuộc paneldata
    private void showTableDATA(){
        nhanvien = new DAOnv().getListNV();
        model.setRowCount(0);
        for(M_Nhanvien nv : nhanvien){
            model.addRow(new Object[]{
            TableNV.getRowCount()+1,nv.getManv(), nv.getTennv(), nv.getChucvu(), nv.getDate(), nv.getGt(), nv.getDiachi(), nv.getEmail(), nv.getLuong()
        });
        }
    }
    private void showTableClient(){
        client = new DAOclient().getListClients();
        model.setRowCount(0);
        
        for(M_Client c : client){
            model.addRow(new Object[]{
            TableClient.getRowCount()+1, c.getUsername(), c.getBlock()
        });
        }
    }


 

    public void updateListModel(String string) {
        modelList.addElement("Server connecting ...");
        ListStatus.setModel(modelList);
//    ListClient.add
    }
}
