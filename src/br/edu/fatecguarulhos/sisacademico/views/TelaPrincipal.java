package br.edu.fatecguarulhos.sisacademico.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import java.awt.Choice;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtRgm;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 518);
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
		tabbedPane.setBounds(20, 21, 643, 395);
		contentPane.add(tabbedPane);
		
		JPanel panelDadosP = new JPanel();
		tabbedPane.addTab("Dados Pessoais", null, panelDadosP, null);
		panelDadosP.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setBounds(185, 15, 46, 14);
		panelDadosP.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNome.setBounds(235, 15, 243, 20);
		panelDadosP.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblData.setBounds(10, 50, 46, 14);
		panelDadosP.add(lblData);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCpf.setBounds(170, 50, 46, 14);
		panelDadosP.add(lblCpf);
		
		JFormattedTextField txtData = new JFormattedTextField(new MaskFormatter(" ##/##/####"));
		txtData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtData.setBounds(60, 50, 98, 20);
		panelDadosP.add(txtData);
		
		JFormattedTextField txtCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		txtCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCpf.setBounds(220, 50, 115, 20);
		panelDadosP.add(txtCpf);
		
		JLabel lblRgm = new JLabel("RGM:");
		lblRgm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRgm.setBounds(10, 15, 36, 14);
		panelDadosP.add(lblRgm);
		
		txtRgm = new JTextField();
		txtRgm.setBounds(60, 15, 115, 20);
		panelDadosP.add(txtRgm);
		txtRgm.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(10, 85, 46, 14);
		panelDadosP.add(lblEmail);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(60, 85, 550, 20);
		panelDadosP.add(textField);
		
		JLabel lblE = new JLabel("Endereço:");
		lblE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblE.setBounds(10, 120, 65, 14);
		panelDadosP.add(lblE);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(85, 120, 527, 20);
		panelDadosP.add(textField_1);
		
		JLabel lblMunicipio = new JLabel("Municipio:");
		lblMunicipio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMunicipio.setBounds(10, 155, 65, 14);
		panelDadosP.add(lblMunicipio);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(85, 155, 115, 20);
		panelDadosP.add(textField_2);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUf.setBounds(205, 155, 46, 14);
		panelDadosP.add(lblUf);
		
		Choice choice = new Choice();
		choice.setBounds(240, 155, 46, 20);
		panelDadosP.add(choice);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCelular.setBounds(305, 155, 52, 14);
		panelDadosP.add(lblCelular);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(365, 155, 115, 20);
		panelDadosP.add(textField_3);
		
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
		
		JButton btnSalvar = new JButton("");
		btnSalvar.setBounds(667, 290, 77, 66);
		panelDadosC.add(btnSalvar);
		btnSalvar.setIcon(new ImageIcon(UIPrincipal.class.getResource("/resources/save.png")));
		
		JPanel panelNotaseFalta = new JPanel();
		tabbedPane.addTab("Notas e Faltas", null, panelNotaseFalta, null);
		panelNotaseFalta.setLayout(new BorderLayout(0, 0));


	}
}
