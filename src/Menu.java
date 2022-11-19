import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

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
        button_Cadastro_Cliente.setText("Cadastrar Cliente");
        button_Cadastro_Cliente.setBounds(10, 10, 150, 50);
        this.add(button_Cadastro_Cliente);

        button_Consulta_Cliente = new JButton();
        button_Consulta_Cliente.setText("Consultar Cliente");
        button_Consulta_Cliente.setBounds(170, 10, 150, 50);
        this.add(button_Consulta_Cliente);

        button_Cadastro_Pet = new JButton();
        button_Cadastro_Pet.setText("Cadastrar Pet");
        button_Cadastro_Pet.setBounds(10, 70, 150, 50);
        this.add(button_Cadastro_Pet);

        button_Consulta_Pet = new JButton();
        button_Consulta_Pet.setText("Consultar Pet");
        button_Consulta_Pet.setBounds(170, 70, 150, 50);
        this.add(button_Consulta_Pet);

        button_Venda_Pet = new JButton();
        button_Venda_Pet.setText("Vender Pet");
        button_Venda_Pet.setBounds(10, 130, 150, 50);
        this.add(button_Venda_Pet);

        button_Relatorio = new JButton();
        button_Relatorio.setText("Relatório");
        button_Relatorio.setBounds(170, 130, 150, 50);
        this.add(button_Relatorio);

        lista_Cliente = new ArrayList<Cliente>();
        lista_Pet = new ArrayList<Pet>();

        button_Cadastro_Cliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Cliente cliente = new Cliente();
                cliente.setNome_Cliente(JOptionPane.showInputDialog("Nome"));
                cliente.setCpf_Cliente(JOptionPane.showInputDialog("CPF"));
                cliente.setTelefone_Cliente(JOptionPane.showInputDialog("Telefone"));
                lista_Cliente.add(cliente);
                JOptionPane.showMessageDialog(null,
                        "Cadastro de cliente realizado com sucesso!",
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        button_Consulta_Cliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                for (Cliente cliente : lista_Cliente) {
                    JOptionPane.showMessageDialog(null,
                            "Nome: " + cliente.getNome_Cliente() +
                                    "\n CPF: " + cliente.getCpf_Cliente() +
                                    "\n Telefone "+ cliente.getTelefone_Cliente(),
                            "Clientes",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        button_Cadastro_Pet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Pet pet = new Pet();
                pet.setId_Pet(lista_Pet.size()+1);
                pet.setNome_Pet(JOptionPane.showInputDialog("Nome"));
                pet.setApelido_Pet(JOptionPane.showInputDialog("Apelido"));
                pet.setIdade_Pet(JOptionPane.showInputDialog("Idade"));
                pet.setSexo_Pet(JOptionPane.showInputDialog("Sexo[Macho ou Fêmea]"));
                pet.setData_Entrada(new Date());
                pet.setRacao_Pet(JOptionPane.showInputDialog("Tipo de Ração"));
                pet.setRacao_Quantd_Gramas(Integer.parseInt(JOptionPane.showInputDialog("Qntd de Ração")));

                lista_Pet.add(pet);

                JOptionPane.showMessageDialog(null,
                        "Cadastro de pet realizado com sucesso!",
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        button_Consulta_Pet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                for (Pet pet : lista_Pet) {
                    JOptionPane.showMessageDialog(null,
                            "Nome: " + pet.getNome_Pet() +
                                    "\n Apelido: " + pet.getApelido_Pet() +
                                    "\n Id: "+ pet.getId_Pet() +
                                    "\n Entrada: " + pet.getData_Entrada(),
                            "Pets",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}
