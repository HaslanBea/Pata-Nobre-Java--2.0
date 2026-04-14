import javax.swing.*;

public class TelaPet extends JFrame {

    public TelaPet() {
        setTitle("Cadastro Pet");
        setSize(300, 250);
        setLayout(null);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(10, 10, 100, 20);
        add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(100, 10, 150, 20);
        add(txtNome);

        JLabel lblGenero = new JLabel("Gênero:");
        lblGenero.setBounds(10, 40, 100, 20);
        add(lblGenero);

        JTextField txtGenero = new JTextField();
        txtGenero.setBounds(100, 40, 150, 20);
        add(txtGenero);

        JLabel lblIdade = new JLabel("Idade:");
        lblIdade.setBounds(10, 70, 100, 20);
        add(lblIdade);

        JTextField txtIdade = new JTextField();
        txtIdade.setBounds(100, 70, 150, 20);
        add(txtIdade);

        JButton salvar = new JButton("Salvar");
        salvar.setBounds(100, 110, 100, 30);
        add(salvar);

        salvar.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Pet salvo com sucesso!");
        });
    }
}