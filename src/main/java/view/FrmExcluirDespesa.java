package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.ControladoraDespesa;
import controller.ControladoraUsuario;
import model.vo.DespesaVO;
import model.vo.UsuarioVO;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmExcluirDespesa extends JFrame {
	
	DateTimeFormatter formataDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private JPanel contentPane;
	private JTextField txtIdDespesa;
	private JTextField txtIdUsuario;
	private JTextField txtDescricao;
	private JTextField txtValor;
	private JTextField txtDtaVencimento;
	private JTextField txtDtaPagamento;
	private JTextField txtCategoria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmExcluirDespesa frame = new FrmExcluirDespesa();
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
	public FrmExcluirDespesa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblExcluirDespesa = new JLabel("Excluir Despesa");
		lblExcluirDespesa.setFont(new Font("Calibri", Font.BOLD, 30));
		lblExcluirDespesa.setForeground(Color.BLUE);
		lblExcluirDespesa.setBounds(168, 28, 214, 37);
		contentPane.add(lblExcluirDespesa);
		
		JLabel lblCdigoDespesa = new JLabel("Código Despesa");
		lblCdigoDespesa.setBounds(47, 121, 99, 16);
		contentPane.add(lblCdigoDespesa);
		
		JLabel lblCdigoUsurio = new JLabel("Código Usuário");
		lblCdigoUsurio.setBounds(55, 155, 91, 16);
		contentPane.add(lblCdigoUsurio);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setBounds(81, 188, 56, 16);
		contentPane.add(lblDescrio);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(102, 217, 35, 16);
		contentPane.add(lblValor);
		
		JLabel lblDataVencimento = new JLabel("Data Vencimento");
		lblDataVencimento.setBounds(42, 246, 104, 16);
		contentPane.add(lblDataVencimento);
		
		JLabel lblDataPagamento = new JLabel("Data Pagamento");
		lblDataPagamento.setBounds(47, 275, 104, 16);
		contentPane.add(lblDataPagamento);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(81, 304, 56, 16);
		contentPane.add(lblCategoria);
		
		txtIdDespesa = new JTextField();
		txtIdDespesa.setBounds(148, 118, 56, 22);
		contentPane.add(txtIdDespesa);
		txtIdDespesa.setColumns(10);
		
		txtIdUsuario = new JTextField();
		txtIdUsuario.setEnabled(false);
		txtIdUsuario.setColumns(10);
		txtIdUsuario.setBounds(148, 150, 56, 22);
		contentPane.add(txtIdUsuario);
		
		txtDescricao = new JTextField();
		txtDescricao.setEnabled(false);
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(149, 185, 207, 22);
		contentPane.add(txtDescricao);
		
		txtValor = new JTextField();
		txtValor.setEnabled(false);
		txtValor.setColumns(10);
		txtValor.setBounds(149, 214, 104, 22);
		contentPane.add(txtValor);
		
		txtDtaVencimento = new JTextField();
		txtDtaVencimento.setEnabled(false);
		txtDtaVencimento.setColumns(10);
		txtDtaVencimento.setBounds(149, 243, 104, 22);
		contentPane.add(txtDtaVencimento);
		
		txtDtaPagamento = new JTextField();
		txtDtaPagamento.setEnabled(false);
		txtDtaPagamento.setColumns(10);
		txtDtaPagamento.setBounds(149, 272, 104, 22);
		contentPane.add(txtDtaPagamento);
		
		txtCategoria = new JTextField();
		txtCategoria.setEnabled(false);
		txtCategoria.setColumns(10);
		txtCategoria.setBounds(149, 304, 104, 22);
		contentPane.add(txtCategoria);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consultarDespesa();
			}
		});
		btnConsultar.setBounds(214, 117, 97, 25);
		contentPane.add(btnConsultar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				excluirDespesa();
			}
		});
		btnExcluir.setBounds(49, 394, 97, 25);
		contentPane.add(btnExcluir);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIdDespesa.setText("");
				txtIdUsuario.setText("");
				txtDescricao.setText("");
				txtValor.setText("");
				txtDtaVencimento.setText("");
				txtDtaPagamento.setText("");
				txtCategoria.setText("");
			}
		});
		btnLimpar.setBounds(168, 394, 97, 25);
		contentPane.add(btnLimpar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FrmDespesa().setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(285, 394, 97, 25);
		contentPane.add(btnVoltar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFechar.setBounds(399, 394, 97, 25);
		contentPane.add(btnFechar);
	}
	
	private void consultarDespesa() {
		ControladoraDespesa controladoraDespesa = new ControladoraDespesa();
		
				DespesaVO despesaVO = new DespesaVO();			
				despesaVO.setId(Integer.parseInt(txtIdDespesa.getText()));
				DespesaVO despesa = controladoraDespesa.consultarDespesaController(despesaVO);
				
				txtIdUsuario.setText(String.valueOf(despesa.getIdUsuario()));
				txtDescricao.setText(despesa.getDescricao());
				txtValor.setText(String.valueOf(despesa.getValor()));
				txtDtaVencimento.setText(String.valueOf(despesa.getDataVencimento().format(formataDate)));
				txtDtaPagamento.setText(String.valueOf(despesa.getDataPagamento().format(formataDate)));
				txtCategoria.setText(despesa.getCategoria());
				
	}
	
	private void excluirDespesa() {
		DespesaVO despesaVO = new DespesaVO();
		despesaVO.setId(Integer.parseInt(txtIdDespesa.getText()));		
		ControladoraDespesa controladoraDespesa = new ControladoraDespesa();
		controladoraDespesa.excluirDespesaController(despesaVO);
		
	}

}
