import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Menu extends JFrame {
    private JButton button_Cadastro_Cliente;
    private JButton button_Consulta_Cliente;
    private JButton button_Cadastro_Pet;
    private JButton button_Consulta_Pet;
    private JButton button_Venda_Pet;
    private JButton button_Relatorio;
    private ArrayList<Cliente> lista_Cliente;
    private ArrayList<Pet> lista_Pet;

    public Menu() {
        this.setTitle("Loja");
        setBounds(0,0,700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        button_Cadastro_Cliente = new JButton();
        button_Cadastro_Cliente.setText("Cadastrar Cidade");
        button_Cadastro_Cliente.setBounds(10, 10, 150, 50);
        this.add(button_Cadastro_Cliente);

        lista_Cliente = new ArrayList<Cliente>();

        button_Cadastro_Cliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Cliente cliente = new Cliente();
                cliente.setNome_Cliente(JOptionPane.showInputDialog("Nome"));
                cliente.setCpf_Cliente(JOptionPane.showInputDialog("CPF"));
                cliente.setTelefone_Cliente(JOptionPane.showInputDialog("Telefone"));
                lista_Cliente.add(cliente);
                JOptionPane.showMessageDialog(null, "Cadastro de cliente realizado com sucesso!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
