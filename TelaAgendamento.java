import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.*;

public class TelaAgendamento extends JFrame {

    JTextField txtData;
    JTextField txtServico;

    public TelaAgendamento() {

        setTitle("Agendamento");
        setSize(300, 220);
        setLayout(null);

        JLabel lblData = new JLabel("Data:");
        lblData.setBounds(10, 10, 100, 20);
        add(lblData);

        txtData = new JTextField();
        txtData.setBounds(100, 10, 150, 20);
        add(txtData);

        JLabel lblServico = new JLabel("Serviço:");
        lblServico.setBounds(10, 40, 100, 20);
        add(lblServico);

        txtServico = new JTextField();
        txtServico.setBounds(100, 40, 150, 20);
        add(txtServico);

        JButton agendar = new JButton("Agendar");
        agendar.setBounds(100, 80, 100, 30);
        add(agendar);

        agendar.addActionListener(e -> {

            try {

                Connection conn = Conexao.conectar();

                String sql = "INSERT INTO agendamento(data_agendamento, servico) VALUES (?, ?)";

                PreparedStatement stmt = conn.prepareStatement(sql);

                stmt.setString(1, txtData.getText());
                stmt.setString(2, txtServico.getText());

                stmt.execute();

                JOptionPane.showMessageDialog(null, "Agendamento realizado!");

                txtData.setText("");
                txtServico.setText("");

            } catch (Exception erro) {

                JOptionPane.showMessageDialog(null, "Erro no agendamento");
                System.out.println(erro);

            }

        });
    }
}