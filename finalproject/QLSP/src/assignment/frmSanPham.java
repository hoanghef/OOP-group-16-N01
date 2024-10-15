
package assignment;

import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class frmSanPham extends javax.swing.JFrame {

   
    public frmSanPham() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        pnlform = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblIDSanPham = new javax.swing.JLabel();
        txtIDSanPham = new javax.swing.JTextField();
        lblMaSanPham = new javax.swing.JLabel();
        txtMaSanPham = new javax.swing.JTextField();
        lblTenSanPham = new javax.swing.JLabel();
        txtTenSanPham = new javax.swing.JTextField();
        lblSoLuong = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        lblDonViTinh = new javax.swing.JLabel();
        txtDonViTinh = new javax.swing.JTextField();
        lblGiaNhap = new javax.swing.JLabel();
        txtGiaNhap = new javax.swing.JTextField();
        lblGiaBan = new javax.swing.JLabel();
        txtGiaBan = new javax.swing.JTextField();
        lblMaLoaiSanPham = new javax.swing.JLabel();
        lblMoTa = new javax.swing.JLabel();
        txtMoTa = new javax.swing.JTextField();
        cbbMaLoaiSanPham = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTaoMoi = new javax.swing.JButton();
        lblTimKiem = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlform.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.activeCaption);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/sanpham.png"))); // NOI18N
        jLabel1.setText("THÔNG TIN SẢN PHẨM");

        lblIDSanPham.setText("ID");

        txtIDSanPham.setEditable(false);

        lblMaSanPham.setText("Mã Sản Phẩm");

        lblTenSanPham.setText("Tên Sản Phẩm");

        lblSoLuong.setText("Số Lượng");

        lblDonViTinh.setText("Đơn Vị Tính");

        lblGiaNhap.setText("Giá Nhập");

        lblGiaBan.setText("Giá Bán");

        lblMaLoaiSanPham.setText("Mã Loại Sản Phẩm");

        lblMoTa.setText("Mô Tả");

        cbbMaLoaiSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/Button-Add-icon.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/Delete-icon.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/pencil-red-icon.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnTaoMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/refresh-icon.png"))); // NOI18N
        btnTaoMoi.setText("Tạo Mới");
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/Ironman-icon.png"))); // NOI18N

        javax.swing.GroupLayout pnlformLayout = new javax.swing.GroupLayout(pnlform);
        pnlform.setLayout(pnlformLayout);
        pnlformLayout.setHorizontalGroup(
            pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlformLayout.createSequentialGroup()
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIDSanPham)
                            .addComponent(lblSoLuong)
                            .addComponent(lblGiaNhap)
                            .addComponent(lblTenSanPham)
                            .addComponent(lblGiaBan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnlformLayout.createSequentialGroup()
                                    .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtIDSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(75, 75, 75))
                                .addComponent(txtTenSanPham, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDonViTinh)
                            .addComponent(lblMaLoaiSanPham)
                            .addComponent(lblMoTa)
                            .addComponent(lblMaSanPham))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDonViTinh)
                            .addComponent(txtMaSanPham)
                            .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbbMaLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlformLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(pnlformLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTaoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlformLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlformLayout.setVerticalGroup(
            pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlformLayout.createSequentialGroup()
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIDSanPham)
                            .addComponent(lblMaSanPham)
                            .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoLuong)
                            .addComponent(lblDonViTinh)
                            .addComponent(txtDonViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGiaNhap)
                            .addComponent(lblMoTa)
                            .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGiaBan)
                            .addComponent(lblMaLoaiSanPham)
                            .addComponent(cbbMaLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(lblTenSanPham))
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addComponent(txtIDSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem)
                    .addComponent(btnXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnTaoMoi))
                .addGap(18, 18, 18)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "ID", "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng", "Đơn Vị Tính", "Giá Nhập", "Giá Bán", "Mã Loại Sản Phẩm", "Mô Tả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }
    
    private void LayDuLieu(){
        String SQL = "select * from SanPham";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        Object [] obj = new Object[]{"STT","ID","Mã Sản Phẩm","Tên Sản Phẩm","Số Lượng",
            "Đơn Vị Tính","Giá Nhập","Giá Bán","Mã Loại Sản Phẩm","Mô Tả"};
        DefaultTableModel tableModel = new DefaultTableModel(obj,0);
        tblSanPham.setModel(tableModel);
        try{
            while(rs.next()){
                Object [] item = new Object[10];
                item[0] = tblSanPham.getRowCount() + 1;
                item[1] = rs.getInt("IDSanPham");
                item[2] = rs.getString("MaSP");
                item[3] = rs.getString("TenSP");
                item[4] = rs.getInt("SoLuong");
                item[5] = rs.getString("DonViTinh");
                item[6] = rs.getInt("GiaNhap");
                item[7] = rs.getInt("GiaBan");
                item[8] = layTen(rs.getString("MaLoaiSP"));
                item[9] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        }
        catch (Exception e) {
            System.out.println("nó đâu rồi");
        }
    }
    
    private void LayLoaiSanPham(){
        String SQL = "select * from LoaiSanPham";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        DefaultComboBoxModel cbbModel = new DefaultComboBoxModel();
        try{
           while(rs.next()){
               DisplayComboBoxModel item = new DisplayComboBoxModel(rs.getString("TenLoai"), rs.getString("MaLoaiSP"));
               cbbModel.addElement(item);
           }
           cbbMaLoaiSanPham.setModel(cbbModel);
        }
        catch (Exception e) {
            System.out.println("ở đây");
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {

        LayDuLieu();
        LayLoaiSanPham();
    }

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {
   
        Main.playSound("soundbutton.wav");
        int index = tblSanPham.getSelectedRow();
        txtIDSanPham.setText(tblSanPham.getValueAt(index, 1).toString());
        txtMaSanPham.setText(tblSanPham.getValueAt(index, 2).toString());
        txtTenSanPham.setText(tblSanPham.getValueAt(index, 3).toString());
        txtSoLuong.setText(tblSanPham.getValueAt(index, 4).toString());
        txtDonViTinh.setText(tblSanPham.getValueAt(index, 5).toString());
        txtGiaNhap.setText(tblSanPham.getValueAt(index, 6).toString());
        txtGiaBan.setText(tblSanPham.getValueAt(index, 7).toString());
        String tenLoai = tblSanPham.getValueAt(index, 8).toString();
        setSelectedCombobox(tenLoai);
       
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {
 
        Main.playSound("soundbutton.wav");
        String maSP,tenSP,soLuong,donViTinh,giaNhap,giaBan,maLoai;
        maSP = txtMaSanPham.getText();
        tenSP = txtTenSanPham.getText();
        soLuong = txtSoLuong.getText();
        donViTinh = txtDonViTinh.getText();
        giaNhap = txtGiaNhap.getText();
        giaBan = txtGiaBan.getText();
        //
        Object [] obj = cbbMaLoaiSanPham.getSelectedObjects();
        DisplayComboBoxModel item = (DisplayComboBoxModel) obj[0];
        maLoai = item.DisplayValue.toString();
        
        String SQL = "insert into SanPham(MaSP,TenSP,SoLuong,DonViTinh,GiaNhap,GiaBan,MaLoaiSP)"
                + " values('"+maSP+"',N'"+tenSP+"',"+soLuong+",N'"+donViTinh+"',"
                + ""+giaNhap+","+giaBan+","+maLoai+")";
        if("".equals(maSP) && "".equals(tenSP) && "".equals(donViTinh) && "".equals(giaNhap)){
            Main.thongBao("Bạn chưa nhập đầy đủ dữ liệu", "Thông Báo", 1);
        }
        else{
            Main.connection.ExcuteQueryUpdateDB(SQL);
        }
        LayDuLieu();
    }

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {
     
        Main.playSound("soundbutton.wav");
        int[] index = tblSanPham.getSelectedRows();
        for(int i = 0; i < index.length; i++){
            String maCanXoa = tblSanPham.getValueAt(index[i], 1).toString();
            String SQL = "delete from SanPham where IDSanPham = "+maCanXoa;
            Main.connection.ExcuteQueryUpdateDB(SQL);
        }
        LayDuLieu();
    }

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {
   
        Main.playSound("soundbutton.wav");
        String idSP,maSP,tenSP,soLuong,donViTinh,giaNhap,giaBan,maLoaiSP;
        idSP = txtIDSanPham.getText();
        maSP = txtMaSanPham.getText();
        tenSP = txtTenSanPham.getText();
        soLuong = txtSoLuong.getText();
        donViTinh = txtDonViTinh.getText();
        giaNhap = txtGiaNhap.getText();
        giaBan = txtGiaBan.getText();
        //
        Object [] obj = cbbMaLoaiSanPham.getSelectedObjects();
        DisplayComboBoxModel item = (DisplayComboBoxModel) obj[0];
        maLoaiSP = item.DisplayValue.toString();
        String SQL = "update SanPham set "
                + "MaSP = '"+maSP+"', TenSP = N'"+tenSP+"', "
                + "SoLuong = "+soLuong+", DonViTinh = N'"+donViTinh+"', "
                + "GiaNhap = "+giaNhap+", GiaBan = "+giaBan+", MaLoaiSP = "+maLoaiSP+" "
                + "where IDSanPham = "+idSP;
        Main.connection.ExcuteQueryUpdateDB(SQL);
        LayDuLieu();
    }

    private void btnTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {
    
        Main.playSound("soundbutton.wav");
        txtIDSanPham.setText("");
        txtMaSanPham.setText("");
        txtTenSanPham.setText("");
        txtSoLuong.setText("");
        txtDonViTinh.setText("");
        txtGiaNhap.setText("");
        txtGiaBan.setText("");
        cbbMaLoaiSanPham.setSelectedIndex(0);
    }

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {
  
        Main.playSound("soundkeyboard.wav");
        String key = txtTimKiem.getText();
        String SQL = "select * from SanPham where "
                + "MaSP like '%"+key+"%' or TenSP like N'%"+key+"%'"
                + " or DonViTinh like N'%"+key+"%'"
                + " or GiaNhap like '%"+key+"%' or GiaBan like '%"+key+"%'";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        Object [] obj = new Object[]{"STT","ID","Mã Sản Phẩm","Tên Sản Phẩm","Số Lượng",
            "Đơn Vị Tính","Giá Nhập","Giá Bán","Tên Loại Sản Phẩm","Mô Tả"};
        DefaultTableModel tableModel = new DefaultTableModel(obj,0);
        tblSanPham.setModel(tableModel);
        try{
            while(rs.next()){
                Object [] item = new Object[10];
                item[0] = tblSanPham.getRowCount() + 1;
                item[1] = rs.getInt("IDSanPham");
                item[2] = rs.getString("MaSP");
                item[3] = rs.getString("TenSP");
                item[4] = rs.getInt("SoLuong");
                item[5] = rs.getString("DonViTinh");
                item[6] = rs.getInt("GiaNhap");
                item[7] = rs.getInt("GiaBan");
                item[8] = layTen(rs.getString("MaLoaiSP"));
                item[9] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        }
        catch (Exception e) {
            System.out.println("nó đâu rồi");
        }
    }
    
    
    
    private void setSelectedCombobox(String tenLoai){
        
        for(int i = 0; i < cbbMaLoaiSanPham.getItemCount(); i++){
            Object obj = cbbMaLoaiSanPham.getItemAt(i);
            
            if(obj != null){
                DisplayComboBoxModel m = (DisplayComboBoxModel) obj;
                if(tenLoai.equals(m.DisplayMember)){
                    cbbMaLoaiSanPham.setSelectedItem(m);
                }
            }        
        }
    }
    private String layTen(String maLoai){
        String tenLoai = "";
        String SQL = "select TenLoai from LoaiSanPham where MaLoaiSP = "+maLoai;
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        try{
            while(rs.next()){
                tenLoai = rs.getString("TenLoai");
            }
        }
        catch (Exception e) {
            System.out.println("mày đâu rồi");
        }
        
        return tenLoai;
    }
    

    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   
        java.awt.EventQueue.invokeLater(() -> {
            new frmSanPham().setVisible(true);
        });
    }

  
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaoMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbMaLoaiSanPham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDonViTinh;
    private javax.swing.JLabel lblGiaBan;
    private javax.swing.JLabel lblGiaNhap;
    private javax.swing.JLabel lblIDSanPham;
    private javax.swing.JLabel lblMaLoaiSanPham;
    private javax.swing.JLabel lblMaSanPham;
    private javax.swing.JLabel lblMoTa;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenSanPham;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JPanel pnlform;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtDonViTinh;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtGiaNhap;
    private javax.swing.JTextField txtIDSanPham;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSanPham;
    private javax.swing.JTextField txtTimKiem;
   
}
