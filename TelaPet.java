import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.*;

public class TelaPet extends JFrame {

    JTextField txtNome;
    JTextField txtGenero;
    JTextField txtIdade;

    public TelaPet() {

        setTitle("Cadastro Pet");
        setSize(300, 250);
        setLayout(null);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(10, 10, 100, 20);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(100, 10, 150, 20);
        add(txtNome);

        JLabel lblGenero = new JLabel("Gênero:");
        lblGenero.setBounds(10, 40, 100, 20);
        add(lblGenero);

        txtGenero = new JTextField();
        txtGenero.setBounds(100, 40, 150, 20);
        add(txtGenero);

        JLabel lblIdade = new JLabel("Idade:");
        lblIdade.setBounds(10, 70, 100, 20);
        add(lblIdade);

        txtIdade = new JTextField();
        txtIdade.setBounds(100, 70, 150, 20);
        add(txtIdade);

        JButton salvar = new JButton("Salvar");
        salvar.setBounds(100, 110, 100, 30);
        add(salvar);

        salvar.addActionListener(e -> {

            try {

                Connection conn = Conexao.conectar();

                String sql = "INSERT INTO pet(nome, genero, idade) VALUES (?, ?, ?)";

                PreparedStatement stmt = conn.prepareStatement(sql);

                stmt.setString(1, txtNome.getText());
                stmt.setString(2, txtGenero.getText());
                stmt.setInt(3, Integer.parseInt(txtIdade.getText()));

                stmt.execute();

                JOptionPane.showMessageDialog(null, "Pet salvo!");

                txtNome.setText("");
                txtGenero.setText("");
                txtIdade.setText("");

            } catch (Exception erro) {

                JOptionPane.showMessageDialog(null, "Erro ao salvar pet");
                System.out.println(erro);

            }

        });
    }
}