import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.*;

public class TelaCliente extends JFrame {

    JTextField txtNome;
    JTextField txtTelefone;

    public TelaCliente() {

        setTitle("Cadastro Cliente");
        setSize(300, 200);
        setLayout(null);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(10, 10, 100, 20);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(100, 10, 150, 20);
        add(txtNome);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(10, 40, 100, 20);
        add(lblTelefone);

        txtTelefone = new JTextField();
        txtTelefone.setBounds(100, 40, 150, 20);
        add(txtTelefone);

        JButton salvar = new JButton("Salvar");
        salvar.setBounds(100, 80, 100, 30);
        add(salvar);

        salvar.addActionListener(e -> {

            try {

                Connection conn = Conexao.conectar();

                String sql = "INSERT INTO cliente(nome, telefone) VALUES (?, ?)";

                PreparedStatement stmt = conn.prepareStatement(sql);

                stmt.setString(1, txtNome.getText());
                stmt.setString(2, txtTelefone.getText());

                stmt.execute();

                JOptionPane.showMessageDialog(null, "Cliente salvo no banco!");

                txtNome.setText("");
                txtTelefone.setText("");

            } catch (Exception erro) {

                JOptionPane.showMessageDialog(null, "Erro ao salvar");
                System.out.println(erro);

            }

        });
    }
}