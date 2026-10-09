import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PersonMenu {
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JTable personTable;

    private JTextField idField;
    private JTextField namaField;
    private JTextField lahirField;
    private JTextField gmailField;

    private JComboBox<String> kategoriComboBox;

    private JButton addUpdateButton;
    private JButton deleteButton;
    private JButton cancelButton;

    private ArrayList<Person> listOrang;

    private int selectedIndex = -1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Person Menu");

        PersonMenu personMenu = new PersonMenu();

        frame.setContentPane(personMenu.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public PersonMenu() {
        listOrang = new ArrayList<>();

        populateList();

        personTable.setModel(setTable());

        titleLabel.setFont(
                titleLabel.getFont().deriveFont(Font.BOLD, 20f)
        );

        String[] kategoriData = {
                "Mahasiswa",
                "Dosen",
                "Staf"
        };

        kategoriComboBox.setModel(
                new DefaultComboBoxModel<>(kategoriData)
        );

        // Atur kondisi awal tombol
        addUpdateButton.setText("Add");
        deleteButton.setVisible(false);

        // Tombol Add / Update
        addUpdateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedIndex == -1) {
                    insertData();
                } else {
                    updateData();
                }
            }
        });

        // Tombol Delete
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteData();
            }
        });

        // Tombol Cancel
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });

        // Memilih data dari tabel
        personTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                selectedIndex = personTable.getSelectedRow();

                if (selectedIndex == -1) {
                    return;
                }

                // Kolom index disesuaikan karena nomor dihapus
                idField.setText(
                        personTable.getValueAt(selectedIndex, 0).toString()
                );

                namaField.setText(
                        personTable.getValueAt(selectedIndex, 1).toString()
                );

                lahirField.setText(
                        personTable.getValueAt(selectedIndex, 2).toString()
                );

                kategoriComboBox.setSelectedItem(
                        personTable.getValueAt(selectedIndex, 3).toString()
                );

                gmailField.setText(
                        personTable.getValueAt(selectedIndex, 4).toString()
                );

                // Mengubah mode tombol menjadi Update, Cancel, Delete
                addUpdateButton.setText("Update");
                deleteButton.setVisible(true);
            }
        });
    }

    // Data awal
    public void populateList() {
        listOrang.add(new Person("P001", "Andi", 2005, "Mahasiswa", "andi@gmail.com"));
        listOrang.add(new Person("P002", "Budi", 2004, "Mahasiswa", "budi@gmail.com"));
        listOrang.add(new Person("P003", "Citra", 1985, "Dosen", "citra@gmail.com"));
        listOrang.add(new Person("P004", "Dinda", 2005, "Mahasiswa", "dinda@gmail.com"));
        listOrang.add(new Person("P005", "Eko", 1988, "Dosen", "eko@gmail.com"));
        listOrang.add(new Person("P006", "Fitri", 2006, "Mahasiswa", "fitri@gmail.com"));
        listOrang.add(new Person("P007", "Gilang", 2004, "Mahasiswa", "gilang@gmail.com"));
        listOrang.add(new Person("P008", "Hana", 1990, "Dosen", "hana@gmail.com"));
        listOrang.add(new Person("P009", "Indra", 2005, "Mahasiswa", "indra@gmail.com"));
        listOrang.add(new Person("P010", "Jihan", 1987, "Dosen", "jihan@gmail.com"));

        listOrang.add(new Person("P011", "Kevin", 2006, "Mahasiswa", "kevin@gmail.com"));
        listOrang.add(new Person("P012", "Lestari", 2004, "Mahasiswa", "lestari@gmail.com"));
        listOrang.add(new Person("P013", "Miko", 1989, "Dosen", "miko@gmail.com"));
        listOrang.add(new Person("P014", "Nadia", 2005, "Mahasiswa", "nadia@gmail.com"));
        listOrang.add(new Person("P015", "Oscar", 1992, "Staf", "oscar@gmail.com"));
        listOrang.add(new Person("P016", "Putri", 2006, "Mahasiswa", "putri@gmail.com"));
        listOrang.add(new Person("P017", "Rizky", 2004, "Mahasiswa", "rizky@gmail.com"));
        listOrang.add(new Person("P018", "Salsa", 1991, "Staf", "salsa@gmail.com"));
        listOrang.add(new Person("P019", "Taufik", 2005, "Mahasiswa", "taufik@gmail.com"));
        listOrang.add(new Person("P020", "Ulfa", 1986, "Dosen", "ulfa@gmail.com"));

        listOrang.add(new Person("P021", "Vino", 2006, "Mahasiswa", "vino@gmail.com"));
        listOrang.add(new Person("P022", "Wulan", 2004, "Mahasiswa", "wulan@gmail.com"));
        listOrang.add(new Person("P023", "Yoga", 1993, "Staf", "yoga@gmail.com"));
        listOrang.add(new Person("P024", "Zahra", 2005, "Mahasiswa", "zahra@gmail.com"));
        listOrang.add(new Person("P025", "Arif", 1984, "Dosen", "arif@gmail.com"));
        listOrang.add(new Person("P026", "Bella", 2006, "Mahasiswa", "bella@gmail.com"));
        listOrang.add(new Person("P027", "Chandra", 1990, "Staf", "chandra@gmail.com"));
        listOrang.add(new Person("P028", "Dewi", 2004, "Mahasiswa", "dewi@gmail.com"));
        listOrang.add(new Person("P029", "Fajar", 1988, "Dosen", "fajar@gmail.com"));
        listOrang.add(new Person("P030", "Gita", 2005, "Mahasiswa", "gita@gmail.com"));
    }

    // Membuat tabel tanpa kolom Nomor
    public DefaultTableModel setTable() {
        String[] columnNames = {
                "ID",
                "Nama",
                "Tahun Lahir",
                "Kategori",
                "Gmail"
        };

        DefaultTableModel model = new DefaultTableModel(
                columnNames,
                0
        );

        for (int i = 0; i < listOrang.size(); i++) {
            Person orang = listOrang.get(i);

            Object[] rowData = {
                    orang.getId(),
                    orang.getNama(),
                    orang.getLahir(),
                    orang.getKategori(),
                    orang.getGmail()
            };

            model.addRow(rowData);
        }

        return model;
    }

    // Menambahkan data
    public void insertData() {
        try {
            String id = idField.getText();
            String nama = namaField.getText();
            int lahir = Integer.parseInt(lahirField.getText());
            String kategori = kategoriComboBox.getSelectedItem().toString();
            String gmail = gmailField.getText();

            Person orang = new Person(
                    id,
                    nama,
                    lahir,
                    kategori,
                    gmail
            );

            listOrang.add(orang);

            personTable.setModel(setTable());

            clearForm();

            JOptionPane.showMessageDialog(
                    mainPanel,
                    "Data berhasil ditambahkan!"
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    mainPanel,
                    "Tahun lahir harus berupa angka!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    // Mengubah data
    public void updateData() {
        try {
            String id = idField.getText();
            String nama = namaField.getText();
            int lahir = Integer.parseInt(lahirField.getText());
            String kategori = kategoriComboBox.getSelectedItem().toString();
            String gmail = gmailField.getText();

            Person orang = listOrang.get(selectedIndex);

            orang.setId(id);
            orang.setNama(nama);
            orang.setLahir(lahir);
            orang.setKategori(kategori);
            orang.setGmail(gmail);

            personTable.setModel(setTable());

            clearForm();

            JOptionPane.showMessageDialog(
                    mainPanel,
                    "Data berhasil diubah!"
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    mainPanel,
                    "Tahun lahir harus berupa angka!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    // Menghapus data
    public void deleteData() {
        if (selectedIndex == -1) {
            return;
        }

        int pilihan = JOptionPane.showConfirmDialog(
                mainPanel,
                "Apakah kamu yakin ingin menghapus data ini?",
                "Konfirmasi Hapus",
                JOptionPane.YES_NO_OPTION
        );

        if (pilihan == JOptionPane.YES_OPTION) {
            listOrang.remove(selectedIndex);

            personTable.setModel(setTable());

            clearForm();

            JOptionPane.showMessageDialog(
                    mainPanel,
                    "Data berhasil dihapus!"
            );
        }
    }

    // Membersihkan form & mengembalikan tombol ke state awal
    public void clearForm() {
        idField.setText("");
        namaField.setText("");
        lahirField.setText("");
        gmailField.setText("");

        kategoriComboBox.setSelectedIndex(0);

        addUpdateButton.setText("Add");
        deleteButton.setVisible(false);

        selectedIndex = -1;

        personTable.clearSelection();
    }
}