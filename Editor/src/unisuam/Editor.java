package unisuam;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Editor extends javax.swing.JFrame {

    private JFrame frmEditorJava;
    /**
     * Creates new form Editor
     */
    public Editor() {
        initialize();
    }

    
    private void initialize() {
		frmEditorJava = new JFrame();
		frmEditorJava.setTitle("Editor Java\r\n");
		frmEditorJava.setBounds(100, 100, 450, 300);
		frmEditorJava.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmEditorJava.setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Arquivo");
		menuBar.add(mnMenu);
		
		JMenuItem mntmArquivo = new JMenuItem("Novo");
		mntmArquivo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mnMenu.add(mntmArquivo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir...");
		mntmAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnMenu.add(mntmAbrir);
		
		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mntmSalvar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnMenu.add(mntmSalvar);
		
		JMenuItem mntmSalcoComo = new JMenuItem("Salvar como...");
		mnMenu.add(mntmSalcoComo);
		
		JMenuItem mntmConfigurarPgina = new JMenuItem("Configurar P\u00E1gina...");
		mnMenu.add(mntmConfigurarPgina);
		
		JMenuItem mntmImprimir = new JMenuItem("Imprimir...");
		mntmImprimir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		mnMenu.add(mntmImprimir);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnMenu.add(mntmSair);
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		JMenuItem mntmDesfazer = new JMenuItem("Desfazer");
		mntmDesfazer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		mnEditar.add(mntmDesfazer);
		
		JMenuItem mntmRecortar = new JMenuItem("Recortar");
		mntmRecortar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mnEditar.add(mntmRecortar);
		
		JMenuItem mntmCopiar = new JMenuItem("Copiar");
		mntmCopiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		mnEditar.add(mntmCopiar);
		
		JMenuItem mntmColar = new JMenuItem("Colar");
		mntmColar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		mnEditar.add(mntmColar);
		
		JMenuItem mntmExcluir = new JMenuItem("Excluir");
		mntmExcluir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));		
		mnEditar.add(mntmExcluir);
		
		JMenuItem mntmLocalizar = new JMenuItem("Localizar");
		mntmLocalizar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
		mnEditar.add(mntmLocalizar);
		
		JMenuItem mntmLocalizarPrxima = new JMenuItem("Localizar pr\u00F3xima");
		mntmLocalizarPrxima.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
		mnEditar.add(mntmLocalizarPrxima);
		
		JMenuItem mntmSubstituir = new JMenuItem("Substituir..");
		mntmSubstituir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		mnEditar.add(mntmSubstituir);
		
		JMenuItem mntmIrPara = new JMenuItem("Ir para...");
		mntmIrPara.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		mnEditar.add(mntmIrPara);
		
		JMenuItem mntmSelecionarTudo = new JMenuItem("Selecionar tudo");
		mntmSelecionarTudo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mnEditar.add(mntmSelecionarTudo);
		
		JMenuItem mntmHoradata = new JMenuItem("Hora/data");
		mntmHoradata.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		mnEditar.add(mntmHoradata);
		
		JMenu mnFormatar = new JMenu("Formatar");
		menuBar.add(mnFormatar);
		
		JCheckBoxMenuItem chckbxmntmQuebraDeLinhas = new JCheckBoxMenuItem("Quebra autom\u00E1tica de linha");
		mnFormatar.add(chckbxmntmQuebraDeLinhas);
		
		JMenuItem mntmFonte = new JMenuItem("Fonte...");
		mnFormatar.add(mntmFonte);
		
		JMenu mnExibir = new JMenu("Exibir");
		menuBar.add(mnExibir);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmExibirAjuda = new JMenuItem("Exibir Ajuda");
		mnAjuda.add(mntmExibirAjuda);
		
		JMenuItem mntmSobreOBloco = new JMenuItem("Sobre o bloco de notas");
		mnAjuda.add(mntmSobreOBloco);
		frmEditorJava.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 23, 442, 229);
		frmEditorJava.getContentPane().add(textArea);
		
		JButton btnNovo = new JButton("");              
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNovo.setBounds(0, 0, 22, 22);
		frmEditorJava.getContentPane().add(btnNovo);
		
		JButton btnAbrir = new JButton("");
		btnAbrir.setBounds(21, 0, 22, 22);
		frmEditorJava.getContentPane().add(btnAbrir);
		
		JButton btnSalvar = new JButton("");
		btnSalvar.setBounds(43, 0, 22, 22);
		frmEditorJava.getContentPane().add(btnSalvar);
		
		JButton btnCopiar = new JButton("");
		btnCopiar.setBounds(75, 0, 22, 22);
		frmEditorJava.getContentPane().add(btnCopiar);
		
		JButton btnColar = new JButton("");
		btnColar.setBounds(173, 0, 22, 22);
		frmEditorJava.getContentPane().add(btnColar);
		
		JButton btnNegrito = new JButton("");
		btnNegrito.setBounds(97, 0, 22, 22);
		frmEditorJava.getContentPane().add(btnNegrito);
		
		JButton btnItalico = new JButton("");
		btnItalico.setBounds(129, 0, 22, 22);
		frmEditorJava.getContentPane().add(btnItalico);
		
		JButton btnSublinhado = new JButton("");
		btnSublinhado.setBounds(150, 0, 22, 22);
		frmEditorJava.getContentPane().add(btnSublinhado);
		
		JButton btnPesquisar = new JButton("");
		btnPesquisar.setBounds(290, 0, 22, 22);
		frmEditorJava.getContentPane().add(btnPesquisar);
		
		JButton btnImprimir = new JButton("");
		btnImprimir.setBounds(205, 0, 22, 22);
		frmEditorJava.getContentPane().add(btnImprimir);
		
		JButton btnAjuda = new JButton("");
		btnAjuda.setBounds(226, 0, 22, 22);
		frmEditorJava.getContentPane().add(btnAjuda);
		
		JButton btnImagem = new JButton("");
		btnImagem.setBounds(258, 0, 22, 22);
		frmEditorJava.getContentPane().add(btnImagem);
	}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editor window = new Editor();
					window.frmEditorJava.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
