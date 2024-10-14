package assignment;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


public class frmNhanVien extends javax.swing.JFrame {

    public frmNhanVien() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlform = new javax.swing.JPanel();
        lblTTLSP = new javax.swing.JLabel();
        lblMaNhanVien = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        lblTenNhanVien = new javax.swing.JLabel();
        txtTenNhanVien = new javax.swing.JTextField();
        lblDiaChi = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTaoMoi = new javax.swing.JButton();
        lblTimKiem = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        lblSoDienThoai = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        lblGioiTinh = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        txtChucVu = new javax.swing.JTextField();
        lblNgaySinh = new javax.swing.JLabel();
        lblNgayVaoLam = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        txtNgayVaoLam = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rdbNam = new javax.swing.JRadioButton();
        rdbNu = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlform.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTTLSP.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        lblTTLSP.setForeground(java.awt.SystemColor.activeCaption);
        lblTTLSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/nhanvien.png"))); // NOI18N
        lblTTLSP.setText("THÔNG TIN NHÂN VIÊN");

        lblMaNhanVien.setText("Mã Nhân Viên");

        txtMaNhanVien.setEditable(false);

        lblTenNhanVien.setText("Tên Nhân Viên");

        lblDiaChi.setText("Địa Chỉ");

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/Button-Add-icon.png")));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/Delete-icon.png"))); 
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/pencil-red-icon.png"))); 
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnTaoMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/refresh-icon.png"))); 
        btnTaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoiActionPerformed(evt);
            }
        });

        lblTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/timkiem.png"))); // NOI18N
        lblTimKiem.setText("Search: ");

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        lblSoDienThoai.setText("Số Điện Thoại");

        lblGioiTinh.setText("Giới Tính");

        lblChucVu.setText("Chức Vụ");

        lblNgaySinh.setText("Ngày Sinh");

        lblNgayVaoLam.setText("Ngày Vào Làm");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/Ironman-icon.png"))); // NOI18N

        buttonGroup1.add(rdbNam);
        rdbNam.setText("Nam");

        buttonGroup1.add(rdbNu);
        rdbNu.setText("Nữ");

        javax.swing.GroupLayout pnlformLayout = new javax.swing.GroupLayout(pnlform);
        pnlform.setLayout(pnlformLayout);
        pnlformLayout.setHorizontalGroup(
            pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlformLayout.createSequentialGroup()
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addComponent(lblTTLSP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlformLayout.createSequentialGroup()
                                .addComponent(lblNgaySinh)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlformLayout.createSequentialGroup()
                                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(pnlformLayout.createSequentialGroup()
                                            .addComponent(lblNgayVaoLam)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtNgayVaoLam))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlformLayout.createSequentialGroup()
                                            .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblMaNhanVien)
                                                .addComponent(lblTenNhanVien)
                                                .addComponent(lblDiaChi))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                                .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtDiaChi))))
                                    .addGroup(pnlformLayout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(30, 30, 30)
                                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlformLayout.createSequentialGroup()
                                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSoDienThoai)
                                            .addComponent(lblChucVu)
                                            .addComponent(lblGioiTinh))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtChucVu)
                                            .addGroup(pnlformLayout.createSequentialGroup()
                                                .addComponent(rdbNam)
                                                .addGap(18, 18, 18)
                                                .addComponent(rdbNu))
                                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnlformLayout.createSequentialGroup()
                                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnTaoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
            .addGroup(pnlformLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlformLayout.setVerticalGroup(
            pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlformLayout.createSequentialGroup()
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTTLSP)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addComponent(lblMaNhanVien)
                        .addGap(8, 8, 8)
                        .addComponent(lblTenNhanVien)
                        .addGap(12, 12, 12)
                        .addComponent(lblDiaChi))
                    .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlformLayout.createSequentialGroup()
                            .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblGioiTinh)
                                .addComponent(rdbNam)
                                .addComponent(rdbNu))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblChucVu)
                                .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(3, 3, 3)
                            .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSoDienThoai)
                                .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlformLayout.createSequentialGroup()
                            .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgaySinh)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayVaoLam)
                    .addComponent(txtNgayVaoLam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa))
                .addGap(18, 18, 18)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnTaoMoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblNhanVien.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Địa Chỉ", "SDT", "Giới Tính", "Chức Vụ", "Ngày Sinh", "Ngày Vào Làm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        
        LayDuLieu();
    }

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {
        
        Main.playSound("soundbutton.wav");
        int index = tblNhanVien.getSelectedRow();
        txtMaNhanVien.setText(tblNhanVien.getValueAt(index, 0).toString());
        txtTenNhanVien.setText(tblNhanVien.getValueAt(index, 1).toString());
        txtDiaChi.setText(tblNhanVien.getValueAt(index, 2).toString());
        txtSoDienThoai.setText(tblNhanVien.getValueAt(index, 3).toString());
        if(tblNhanVien.getValueAt(index, 4).equals("Nam")){
            rdbNam.setSelected(true);
        }
        else{
            rdbNu.setSelected(true);
        }
        txtChucVu.setText(tblNhanVien.getValueAt(index, 5).toString());
        txtNgaySinh.setText(tblNhanVien.getValueAt(index, 6).toString());
        txtNgayVaoLam.setText(tblNhanVien.getValueAt(index, 7).toString());
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {
        
        Main.playSound("soundbutton.wav");
        String tenNhanVien,diaChi,sdt,gioiTinh,chucVu,ngaySinh,ngayVaoLam;
        tenNhanVien = txtTenNhanVien.getText();
        diaChi = txtDiaChi.getText();
        sdt = txtSoDienThoai.getText();
        if(rdbNam.isSelected()){
            gioiTinh = "1";
        }
        else{
            gioiTinh = "0";
        }
        chucVu = txtChucVu.getText();
        ngaySinh = txtNgaySinh.getText();
        ngayVaoLam = txtNgayVaoLam.getText();
        String SQL = "insert into NhanVien(TenNhanVien,DiaChi,SoDienThoai,GioiTinh,ChucVu,NgaySinh,NgayVaoLam)"
                + " values(N'"+tenNhanVien+"',N'"+diaChi+"','"+sdt+"',"+gioiTinh+","
                + "N'"+chucVu+"','"+ngaySinh+"','"+ngayVaoLam+"')";
        Main.connection.ExcuteQueryUpdateDB(SQL);
        LayDuLieu();
    }

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {
        
        Main.playSound("soundbutton.wav");
        int[] index = tblNhanVien.getSelectedRows();
        for(int i = 0; i < index.length; i++){
            String indexDelete = tblNhanVien.getValueAt(index[i], 0).toString();
            String SQL = "delete from NhanVien where MaNhanVien = "+indexDelete;
            Main.connection.ExcuteQueryUpdateDB(SQL);
        }
        LayDuLieu();
    }

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {
       
        Main.playSound("soundbutton.wav");
        String maNhanVien,tenNhanVien,diaChi,sdt,gioiTinh,chucVu,ngaySinh,ngayVaoLam;
        maNhanVien = txtMaNhanVien.getText();
        tenNhanVien = txtTenNhanVien.getText();
        diaChi = txtDiaChi.getText();
        sdt = txtSoDienThoai.getText();
        if(rdbNam.isSelected()){
            gioiTinh = "1";
        }
        else{
            gioiTinh = "0";
        }
        chucVu = txtChucVu.getText();
        ngaySinh = txtNgaySinh.getText();
        ngayVaoLam = txtNgayVaoLam.getText();
        String SQL = "update NhanVien set TenNhanVien = N'"+tenNhanVien+"' , DiaChi = N'"+diaChi+"' ,"
                + " SoDienThoai = '"+sdt+"' , GioiTinh = "+gioiTinh+" , ChucVu = N'"+chucVu+"' ,"
                + " NgaySinh = '"+ngaySinh+"' , NgayVaoLam = '"+ngayVaoLam+"'"
                + " where MaNhanVien = "+maNhanVien;
        Main.connection.ExcuteQueryUpdateDB(SQL);
        LayDuLieu();        
    }

    private void btnTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoiActionPerformed
       
        Main.playSound("soundbutton.wav");
        txtMaNhanVien.setText("");
        txtTenNhanVien.setText("");
        txtDiaChi.setText("");
        txtSoDienThoai.setText("");
        rdbNam.setSelected(true);
        txtChucVu.setText("");
        txtNgaySinh.setText("");
        txtNgayVaoLam.setText("");
    }

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        
        Main.playSound("soundkeyboard.wav");
        String keySearch = txtTimKiem.getText();
        String SQL = "select * from NhanVien where "
                + "TenNhanVien like N'%"+keySearch+"%' or DiaChi like N'%"+keySearch+"%' "
                + "or ChucVu like N'%"+keySearch+"%' or SoDienThoai like '%"+keySearch+"%' "
                + "or NgaySinh like '%"+keySearch+"%' or NgayVaoLam like '%"+keySearch+"%'";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        Object[] obj = new Object[]{"Mã Nhân Viên","Tên Nhân Viên","Địa Chỉ","SDT","Giới Tính",
            "Chức Vụ","Ngày Sinh","Ngày Vào Làm"};
        DefaultTableModel tableModel = new DefaultTableModel(obj,0);
        tblNhanVien.setModel(tableModel);
        try{
            while(rs.next()){
                Object[] item = new Object[8];
                item[0] = rs.getInt("MaNhanVien");
                item[1] = rs.getString("TenNhanVien");
                item[2] = rs.getString("DiaChi");
                item[3] = rs.getInt("SoDienThoai");
                if(rs.getInt("GioiTinh") == 1){
                    item[4] = "Nam";
                }
                else{
                    item[4] = "Nữ";
                }
                item[5] = rs.getString("ChucVu");
                item[6] = rs.getDate("NgaySinh");
                item[7] = rs.getDate("NgayVaoLam");
                tableModel.addRow(item);
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    private void LayDuLieu(){
        String SQL = "select * from NhanVien";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        Object[] obj = new Object[]{"Mã Nhân Viên","Tên Nhân Viên","Địa Chỉ","SDT","Giới Tính",
            "Chức Vụ","Ngày Sinh","Ngày Vào Làm"};
        DefaultTableModel tableModel = new DefaultTableModel(obj,0);
        tblNhanVien.setModel(tableModel);
        try{
            while(rs.next()){
                Object[] item = new Object[8];
                item[0] = rs.getInt("MaNhanVien");
                item[1] = rs.getString("TenNhanVien");
                item[2] = rs.getString("DiaChi");
                item[3] = rs.getInt("SoDienThoai");
                if(rs.getInt("GioiTinh") == 1){
                    item[4] = "Nam";
                }
                else{
                    item[4] = "Nữ";
                }
                item[5] = rs.getString("ChucVu");
                item[6] = rs.getDate("NgaySinh");
                item[7] = rs.getDate("NgayVaoLam");
                tableModel.addRow(item);
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNhanVien().setVisible(true);
            }
        });
    }

 
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaoMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblMaNhanVien;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblNgayVaoLam;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblTTLSP;
    private javax.swing.JLabel lblTenNhanVien;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JPanel pnlform;
    private javax.swing.JRadioButton rdbNam;
    private javax.swing.JRadioButton rdbNu;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtChucVu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtNgayVaoLam;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenNhanVien;
    private javax.swing.JTextField txtTimKiem;
}
