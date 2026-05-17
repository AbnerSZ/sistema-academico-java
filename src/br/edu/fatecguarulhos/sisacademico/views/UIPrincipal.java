package br.edu.fatecguarulhos.sisacademico.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
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
import java.awt.Choice;


import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class UIPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	JRadioButton rdbtnMatutino = new JRadioButton("Matutino");
    JRadioButton rdbtnVespertino = new JRadioButton("Vespertino");
    JRadioButton rdbtnNoturno = new JRadioButton("Noturno");
	private JTextField txtRgm;
	private JTextField txtEmail;
	private JTextField txtEnd;
	private JTextField txtNotaBoletim;
	private JTextField txtMunicipio;
	private JTextField txtSemestreBoletim;
	private JTextField txtCelular;
	private JTextField txtDisciplinaBoletim;
	private JTextField txtRgm2;
	private JTextField txtFaltas;

	private JComboBox comboDisciplin;
	private JComboBox comboSemestre;
	private JComboBox comboNota;

	private JButton btnNovo = new JButton("");
	private JButton btnGravar = new JButton("");
	private JButton btnPesquisar;
	private JButton btnJava;
	private JButton btnSair2;

	private JLabel lblNomeAluno;
	private JLabel lblCursoAluno;
	private JTextField txtCurso2;
	private JTextField txtNome2;
	private JTextField txtNota;

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
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNome.setBounds(200, 15, 66, 40);
		panelDadosP.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtNome.setBounds(276, 15, 358, 40);
		panelDadosP.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblData = new JLabel("Data de Nascimento:");
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblData.setBounds(10, 80, 219, 40);
		panelDadosP.add(lblData);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblCpf.setBounds(370, 80, 60, 40);
		panelDadosP.add(lblCpf);
		
		JFormattedTextField txtData = new JFormattedTextField(new MaskFormatter(" ##/##/####"));
		txtData.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtData.setBounds(240, 80, 98, 40);
		panelDadosP.add(txtData);
		
		JFormattedTextField txtCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		txtCpf.setText("   .   -  ");
		txtCpf.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtCpf.setBounds(440, 80, 194, 40);
		panelDadosP.add(txtCpf);
		
		JLabel lblRgm = new JLabel("RGM:");
		lblRgm.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblRgm.setBounds(10, 15, 60, 40);
		panelDadosP.add(lblRgm);
		
		txtRgm = new JTextField();
		txtRgm.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtRgm.setBounds(70, 15, 115, 40);
		panelDadosP.add(txtRgm);
		txtRgm.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblEmail.setBounds(10, 150, 66, 40);
		panelDadosP.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtEmail.setColumns(10);
		txtEmail.setBounds(95, 150, 539, 40);
		panelDadosP.add(txtEmail);
		
		JLabel lblEnd = new JLabel("Endereço:");
		lblEnd.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblEnd.setBounds(10, 220, 102, 40);
		panelDadosP.add(lblEnd);
		
		txtEnd = new JTextField();
		txtEnd.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtEnd.setColumns(10);
		txtEnd.setBounds(130, 220, 504, 40);
		panelDadosP.add(txtEnd);
		
		JLabel lblMunicipio = new JLabel("Municipio:");
		lblMunicipio.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblMunicipio.setBounds(10, 290, 115, 40);
		panelDadosP.add(lblMunicipio);
		
		txtMunicipio = new JTextField();
		txtMunicipio.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtMunicipio.setColumns(10);
		txtMunicipio.setBounds(120, 290, 115, 40);
		panelDadosP.add(txtMunicipio);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblUf.setBounds(261, 290, 46, 40);
		panelDadosP.add(lblUf);
		
		String[] ufs = {
			    "AC", "AL", "AP", "AM", "BA", "CE", "DF",
			    "ES", "GO", "MA", "MT", "MS", "MG", "PA",
			    "PB", "PR", "PE", "PI", "RJ", "RN", "RS",
			    "RO", "RR", "SC", "SP", "SE", "TO"
			};

			JComboBox<String> comboBoxUf = new JComboBox<>(ufs);
			comboBoxUf.setFont(new Font("Tahoma", Font.PLAIN, 23));
			comboBoxUf.setBounds(313, 290, 80, 40);

			panelDadosP.add(comboBoxUf);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblCelular.setBounds(410, 290, 80, 40);
		panelDadosP.add(lblCelular);
		
		txtCelular = new JTextField();
		txtCelular.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtCelular.setColumns(10);
		txtCelular.setBounds(500, 290, 134, 40);
		panelDadosP.add(txtCelular);
		
		JPanel panelDadosC = new JPanel();
		tabbedPane.addTab("Dados do Curso", null, panelDadosC, null);
		panelDadosC.setLayout(null);
		
		JLabel lblCampus = new JLabel("Campus:");
		lblCampus.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblCampus.setBounds(10, 80, 94, 40);
		panelDadosC.add(lblCampus);
		
		JLabel lblPeriodo = new JLabel("Periodo:");
		lblPeriodo.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblPeriodo.setBounds(10, 147, 94, 40);
		panelDadosC.add(lblPeriodo);
		
		JRadioButton rdbtnMatutino_1 = new JRadioButton("Matutino");
		rdbtnMatutino_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		rdbtnMatutino_1.setBounds(105, 146, 115, 40);
		panelDadosC.add(rdbtnMatutino_1);
		
		JRadioButton rdbtnVespertino_1 = new JRadioButton("Vespertino");
		rdbtnVespertino_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		rdbtnVespertino_1.setBounds(240, 147, 133, 40);
		panelDadosC.add(rdbtnVespertino_1);
		
		JRadioButton rdbtnNoturno_1 = new JRadioButton("Noturno");
		rdbtnNoturno_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		rdbtnNoturno_1.setBounds(390, 147, 109, 41);
		panelDadosC.add(rdbtnNoturno_1);
		
		JLabel lblNCurso = new JLabel("Curso:");
		lblNCurso.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNCurso.setBounds(10, 15, 77, 40);
		panelDadosC.add(lblNCurso);
		
		JComboBox comboBoxCurso = new JComboBox();
		comboBoxCurso.setFont(new Font("Tahoma", Font.PLAIN, 23));
		comboBoxCurso.setModel(new DefaultComboBoxModel(new String[] {"Análise e Desenvolvimento de Sistemas", "Logística", "Redes de Computadores"}));
		comboBoxCurso.setBounds(97, 15, 543, 40);
		panelDadosC.add(comboBoxCurso);
		
		JButton btnNovo2 = new JButton("");
		btnNovo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNovo2.setBounds(10, 222, 77, 66);
		panelDadosC.add(btnNovo2);
		btnNovo2.setIcon(new ImageIcon(UIPrincipal.class.getResource("/resources/save.png")));
		
		JComboBox comboBoxCampus = new JComboBox();
		comboBoxCampus.setFont(new Font("Tahoma", Font.PLAIN, 23));
		comboBoxCampus.setBounds(114, 80, 526, 40);
		panelDadosC.add(comboBoxCampus);
		
		JButton btnSalvar = new JButton("");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalvar.setIcon(new ImageIcon(UIPrincipal.class.getResource("/resources/save.png")));
		btnSalvar.setBounds(143, 222, 77, 66);
		panelDadosC.add(btnSalvar);
		
		JButton btnPesquisar2 = new JButton("");
		btnPesquisar2.setIcon(new ImageIcon(UIPrincipal.class.getResource("/resources/save.png")));
		btnPesquisar2.setBounds(280, 222, 77, 66);
		panelDadosC.add(btnPesquisar2);
		
		JButton btnJava2 = new JButton("");
		btnJava2.setIcon(new ImageIcon(UIPrincipal.class.getResource("/resources/save.png")));
		btnJava2.setBounds(414, 222, 77, 66);
		panelDadosC.add(btnJava2);
		
		JButton btnSair = new JButton("");
		btnSair.setIcon(new ImageIcon(UIPrincipal.class.getResource("/resources/save.png")));
		btnSair.setBounds(563, 222, 77, 66);
		panelDadosC.add(btnSair);
		
		JPanel panelNotaseFalta = new JPanel();
		tabbedPane.addTab("Notas e Faltas", null, panelNotaseFalta, null);
		panelNotaseFalta.setLayout(null);
		
				JLabel lblRGM = new JLabel("RGM:");
				lblRGM.setFont(new Font("Tahoma", Font.PLAIN, 23));
				lblRGM.setBounds(10, 15, 60, 40);
				panelNotaseFalta.add(lblRGM);
				
						txtRgm2 = new JTextField();
						txtRgm2.setFont(new Font("Tahoma", Font.PLAIN, 23));
						txtRgm2.setBounds(69, 15, 195, 40);
						panelNotaseFalta.add(txtRgm2);
						
								JLabel lblDisciplina = new JLabel("Disciplina:");
								lblDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 23));
								lblDisciplina.setBounds(12, 146, 121, 40);
								panelNotaseFalta.add(lblDisciplina);
								
										JComboBox comboDisciplina = new JComboBox();
										comboDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 23));
										
												comboDisciplina.setModel(
														new DefaultComboBoxModel(
																new String[] {
																		"Programação Orientada a Objetos",
																		"Banco de Dados",
																		"Engenharia de Software"
																}));
												
														comboDisciplina.setBounds(128, 146, 490, 40);
														panelNotaseFalta.add(comboDisciplina);
														
														
																JLabel lblSemestre = new JLabel("Semestre:");
																lblSemestre.setFont(new Font("Tahoma", Font.PLAIN, 23));
																lblSemestre.setBounds(10, 215, 110, 40);
																panelNotaseFalta.add(lblSemestre);
																
																		JComboBox comboSemestre_1 = new JComboBox();
																		comboSemestre_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
																		
																				comboSemestre_1.setModel(
																						new DefaultComboBoxModel(
																								new String[] {
																										"2026-1",
																										"2026-2"
																								}));
																				
																						comboSemestre_1.setBounds(115, 215, 100, 40);
																						panelNotaseFalta.add(comboSemestre_1);
																						
																								
																								JLabel lblNota = new JLabel("Nota:");
																								lblNota.setFont(new Font("Tahoma", Font.PLAIN, 23));
																								lblNota.setBounds(267, 215, 60, 40);
																								panelNotaseFalta.add(lblNota);
																										
																												JLabel lblFaltas = new JLabel("Faltas:");
																												lblFaltas.setFont(new Font("Tahoma", Font.PLAIN, 23));
																												lblFaltas.setBounds(478, 215, 70, 40);
																												panelNotaseFalta.add(lblFaltas);
																												
																														txtFaltas = new JTextField();
																														txtFaltas.setHorizontalAlignment(SwingConstants.CENTER);
																														txtFaltas.setFont(new Font("Tahoma", Font.PLAIN, 23));
																														txtFaltas.setText("2");
																														txtFaltas.setBounds(558, 215, 60, 40);
																														panelNotaseFalta.add(txtFaltas);
																														
																																
																																btnNovo.setBounds(10, 280, 70, 60);
																																panelNotaseFalta.add(btnNovo);
																																
																																		
																																		btnGravar.setBounds(140, 280, 70, 60);
																																		panelNotaseFalta.add(btnGravar);
																																		
																																				JButton btnPesquisar1 = new JButton("");
																																				btnPesquisar1.setBounds(279, 280, 70, 60);
																																				panelNotaseFalta.add(btnPesquisar1);
																																				
																																						JButton btnJava1 = new JButton("");
																																						btnJava1.addActionListener(new ActionListener() {
																																							public void actionPerformed(ActionEvent e) {
																																							}
																																						});
																																						btnJava1.setBounds(414, 280, 70, 60);
																																						panelNotaseFalta.add(btnJava1);
																																						
																																								JButton btnSair2_1 = new JButton("");
																																								btnSair2_1.setBounds(548, 280, 70, 60);
																																								panelNotaseFalta.add(btnSair2_1);
																																								
																																								txtCurso2 = new JTextField();
																																								txtCurso2.setEditable(false);
																																								txtCurso2.setFont(new Font("Tahoma", Font.PLAIN, 23));
																																								txtCurso2.setBounds(10, 80, 608, 40);
																																								panelNotaseFalta.add(txtCurso2);
																																								
																																								txtNome2 = new JTextField();
																																								txtNome2.setEditable(false);
																																								txtNome2.setFont(new Font("Tahoma", Font.PLAIN, 23));
																																								txtNome2.setBounds(288, 15, 330, 40);
																																								panelNotaseFalta.add(txtNome2);
																																								
																																								txtNota = new JTextField();
																																								txtNota.setFont(new Font("Tahoma", Font.PLAIN, 23));
																																								txtNota.setBounds(333, 215, 60, 40);
																																								panelNotaseFalta.add(txtNota);
		
		JPanel panelBoletim = new JPanel();
		panelBoletim.setLayout(null);

		tabbedPane.addTab("Boletim", null, panelBoletim, null);
		JLabel lblRgmBoletim = new JLabel("RGM:");
		lblRgmBoletim.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblRgmBoletim.setBounds(10, 15, 61, 40);
		panelBoletim.add(lblRgmBoletim);

		JTextField txtRgmBoletim = new JTextField();
		txtRgmBoletim.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtRgmBoletim.setEditable(false);
		txtRgmBoletim.setBounds(80, 15, 120, 40);
		panelBoletim.add(txtRgmBoletim);
		JTextField txtNomeBoletim = new JTextField();
		txtNomeBoletim.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtNomeBoletim.setEditable(false);
		txtNomeBoletim.setBounds(310, 15, 301, 40);
		panelBoletim.add(txtNomeBoletim);
		JTextField txtCursoBoletim = new JTextField();
		txtCursoBoletim.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtCursoBoletim.setEditable(false);
		txtCursoBoletim.setBounds(80, 80, 531, 40);
		panelBoletim.add(txtCursoBoletim);

		JLabel lblDisciplinaBoletim = new JLabel("Disciplina:");
		lblDisciplinaBoletim.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblDisciplinaBoletim.setBounds(10, 153, 111, 40);
		panelBoletim.add(lblDisciplinaBoletim);

		JLabel lblSemestreBoletim = new JLabel("Semestre:");
		lblSemestreBoletim.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblSemestreBoletim.setBounds(10, 234, 120, 40);
		panelBoletim.add(lblSemestreBoletim);


		JLabel lblNotaBoletim = new JLabel("Nota:");
		lblNotaBoletim.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNotaBoletim.setBounds(238, 234, 55, 40);
		panelBoletim.add(lblNotaBoletim);
		JLabel lblFaltasBoletim = new JLabel("Faltas:");
		lblFaltasBoletim.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblFaltasBoletim.setBounds(451, 234, 80, 40);
		panelBoletim.add(lblFaltasBoletim);

		JTextField txtFaltasBoletim = new JTextField();
		txtFaltasBoletim.setHorizontalAlignment(SwingConstants.CENTER);
		txtFaltasBoletim.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtFaltasBoletim.setEditable(false);
		txtFaltasBoletim.setBounds(541, 234, 70, 40);
		panelBoletim.add(txtFaltasBoletim);
		
		txtNotaBoletim = new JTextField();
		txtNotaBoletim.setHorizontalAlignment(SwingConstants.CENTER);
		txtNotaBoletim.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtNotaBoletim.setEditable(false);
		txtNotaBoletim.setBounds(303, 234, 80, 40);
		panelBoletim.add(txtNotaBoletim);
		
		txtSemestreBoletim = new JTextField();
		txtSemestreBoletim.setHorizontalAlignment(SwingConstants.CENTER);
		txtSemestreBoletim.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtSemestreBoletim.setEditable(false);
		txtSemestreBoletim.setBounds(117, 234, 80, 40);
		panelBoletim.add(txtSemestreBoletim);
		
		txtDisciplinaBoletim = new JTextField();
		txtDisciplinaBoletim.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtDisciplinaBoletim.setEditable(false);
		txtDisciplinaBoletim.setBounds(131, 153, 480, 40);
		panelBoletim.add(txtDisciplinaBoletim);
		
		JLabel lblNome_1 = new JLabel("Nome:");
		lblNome_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNome_1.setBounds(230, 15, 70, 40);
		panelBoletim.add(lblNome_1);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblCurso.setBounds(10, 80, 70, 40);
		panelBoletim.add(lblCurso);

	}
}
