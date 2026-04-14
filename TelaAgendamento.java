import javax.swing.*;

public class TelaAgendamento extends JFrame {

    public TelaAgendamento() {
        setTitle("Agendamento");
        setSize(300, 220);
        setLayout(null);

        JLabel lblData = new JLabel("Data:");
        lblData.setBounds(10, 10, 100, 20);
        add(lblData);

        JTextField txtData = new JTextField();
        txtData.setBounds(100, 10, 150, 20);
        add(txtData);

        JLabel lblServico = new JLabel("Serviço:");
        lblServico.setBounds(10, 40, 100, 20);
        add(lblServico);

        JTextField txtServico = new JTextField();
        txtServico.setBounds(100, 40, 150, 20);
        add(txtServico);

        JButton agendar = new JButton("Agendar");
        agendar.setBounds(100, 80, 100, 30);
        add(agendar);

        agendar.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Agendamento realizado!");
        });
    }
}