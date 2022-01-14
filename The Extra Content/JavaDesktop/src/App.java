package JavaDesktop.src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) {
        // Definindo Usuário e Senha como constantes
        final String USER = "geek";
        final String PASS = "university";

        // Criando o frame da Janela (Parte superior da janela)
        JFrame frame = new JFrame("Geek University :: Acesso ao Sistema");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Definindo ação do botão "fechar" como encerrar a aplicação

        // Criando o painel com todo o conteúdo da janela
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        // Criando a caixa de texto para inserção do usuário
        JLabel lblUsuario = new JLabel("Usuário: ");
        JTextField txtUsuario = new JTextField(20);
        txtUsuario.setToolTipText("Informe seu usuário de acesso...");

        // Criando a caixa de texto para inserção da senha
        JLabel lblSenha = new JLabel("Senha: ");
        JPasswordField txtSenha = new JPasswordField(20);
        txtSenha.setToolTipText("Informe sua senha de acesso...");

        // Criando o botão de login
        JButton btnLogin = new JButton("Login");

        // Criando ação para o botão login
        btnLogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // Verificando se o usuário e senha coincide com os que a gente definiu
                if(txtUsuario.getText().equals(USER) && new String(txtSenha.getPassword()).equals(PASS)) {
                    JOptionPane.showMessageDialog(frame, "Acesso autorizado");
                }else {
                    JOptionPane.showMessageDialog(frame, "Acesso negado");
                }
            }
            
        });

        // Adicionando todo o conteúdo ao painel
        panel.add(lblUsuario);
        panel.add(txtUsuario);

        panel.add(lblSenha);
        panel.add(txtSenha);

        panel.add(btnLogin);

        // Agrupando tudo na janela e deixando visível
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
