import javax.swing.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {
        setTitle("Pata Nobre 2.0");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JButton btnCliente = new JButton("Clientes");
        btnCliente.setBounds(120, 50, 150, 30);
        add(btnCliente);

        JButton btnPet = new JButton("Pets");
        btnPet.setBounds(120, 100, 150, 30);
        add(btnPet);

        JButton btnAgendamento = new JButton("Agendamento");
        btnAgendamento.setBounds(120, 150, 150, 30);
        add(btnAgendamento);

        btnCliente.addActionListener(e -> {
            new TelaCliente().setVisible(true);
        });

        btnPet.addActionListener(e -> {
            new TelaPet().setVisible(true);
        });

        btnAgendamento.addActionListener(e -> {
            new TelaAgendamento().setVisible(true);
        });
    }
}