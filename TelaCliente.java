import javax.swing.*;

public class TelaCliente extends JFrame {

    public TelaCliente() {
        setTitle("Cadastro Cliente");
        setSize(300, 200);
        setLayout(null);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(10, 10, 100, 20);
        add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(100, 10, 150, 20);
        add(txtNome);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(10, 40, 100, 20);
        add(lblTelefone);

        JTextField txtTelefone = new JTextField();
        txtTelefone.setBounds(100, 40, 150, 20);
        add(txtTelefone);

        JButton salvar = new JButton("Salvar");
        salvar.setBounds(100, 80, 100, 30);
        add(salvar);

        salvar.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
        });
    }
}