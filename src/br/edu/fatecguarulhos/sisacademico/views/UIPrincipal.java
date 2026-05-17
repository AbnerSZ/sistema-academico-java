package br.edu.fatecguarulhos.sisacademico.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.BorderLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class UIPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIPrincipal frame = new UIPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UIPrincipal() throws Exception {
		setTitle("Sistema Acadêmico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mntmSalvar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK | InputEvent.ALT_DOWN_MASK));
		mnArquivo.add(mntmSalvar);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar");
		mnArquivo.add(mntmConsultar);
		
		JMenuItem mntmAlterar = new JMenuItem("Alterar");
		mnArquivo.add(mntmAlterar);
		
		JSeparator separator = new JSeparator();
		mnArquivo.add(separator);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Botão Sair
				System.exit(0);
			}
		});
		mntmSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mnArquivo.add(mntmSair);
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		JMenuItem mntmAlterarFonte = new JMenuItem("Alterar Fonte");
		mnEditar.add(mntmAlterarFonte);
		
		JSeparator separator_1 = new JSeparator();
		mnEditar.add(separator_1);
		
		JMenuItem mntmFormato = new JMenuItem("Formato");
		mnEditar.add(mntmFormato);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Mostrar o "Sobre"
				JOptionPane.showMessageDialog(null, "Informações do Menu");
			}
		});
		mntmSobre.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.SHIFT_DOWN_MASK));
		mnAjuda.add(mntmSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(20, 21, 759, 395);
		contentPane.add(tabbedPane);
		
		JPanel panelDadosP = new JPanel();
		tabbedPane.addTab("Dados Pessoais", null, panelDadosP, null);
		panelDadosP.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setBounds(10, 11, 46, 14);
		panelDadosP.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNome.setBounds(61, 10, 243, 20);
		panelDadosP.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setBounds(10, 50, 46, 14);
		panelDadosP.add(lblData);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCpf.setBounds(10, 85, 46, 14);
		panelDadosP.add(lblCpf);
		
		JFormattedTextField txtData = new JFormattedTextField(new MaskFormatter(" ##/##/####"));
		txtData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtData.setBounds(61, 49, 98, 20);
		panelDadosP.add(txtData);
		
		JFormattedTextField txtCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		txtCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCpf.setBounds(61, 84, 115, 20);
		panelDadosP.add(txtCpf);
		
		JButton btnSalvar = new JButton("");
		btnSalvar.setIcon(new ImageIcon(UIPrincipal.class.getResource("/resources/save.png")));
		btnSalvar.setBounds(667, 290, 77, 66);
		panelDadosP.add(btnSalvar);
		
		JPanel panelDadosC = new JPanel();
		tabbedPane.addTab("Dados do Curso", null, panelDadosC, null);
		panelDadosC.setLayout(null);
		
		JLabel lblNCurso = new JLabel("Curso:");
		lblNCurso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNCurso.setBounds(10, 11, 46, 14);
		panelDadosC.add(lblNCurso);
		
		JComboBox comboBoxCurso = new JComboBox();
		comboBoxCurso.setModel(new DefaultComboBoxModel(new String[] {"Análise e Desenvolvimento de Sistemas", "Logística", "Redes de Computadores"}));
		comboBoxCurso.setBounds(66, 9, 162, 22);
		panelDadosC.add(comboBoxCurso);
		
		JPanel panelNotaseFalta = new JPanel();
		tabbedPane.addTab("Notas e Faltas", null, panelNotaseFalta, null);
		panelNotaseFalta.setLayout(new BorderLayout(0, 0));

	}
}
