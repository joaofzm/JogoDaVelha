package jogodavelha;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Gui extends JFrame implements ActionListener {

	static String[] options = { "Jogar Novamente!" };

	Border emptyBorder = BorderFactory.createEmptyBorder();

	JPanel barra1;
	JPanel barra2;
	JPanel barra3;
	JPanel barra4;

	static boolean quadrado1Ocupado = false;
	static boolean quadrado2Ocupado = false;
	static boolean quadrado3Ocupado = false;
	static boolean quadrado4Ocupado = false;
	static boolean quadrado5Ocupado = false;
	static boolean quadrado6Ocupado = false;
	static boolean quadrado7Ocupado = false;
	static boolean quadrado8Ocupado = false;
	static boolean quadrado9Ocupado = false;

	static boolean cpuJogando = false;

	static JButton quadrado1;
	static JButton quadrado2;
	static JButton quadrado3;
	static JButton quadrado4;
	static JButton quadrado5;
	static JButton quadrado6;
	static JButton quadrado7;
	static JButton quadrado8;
	static JButton quadrado9;

	static boolean jogadorVaiPrimeiro = true;

	static JLabel vitorias;
	static JLabel empates;
	static JLabel derrotas;
	static int totalVitorias;
	static int totalDerrotas;
	static int totalEmpates;
	

	public static void atualizaPlacar() {
		vitorias.setText("Vitórias : " + totalVitorias);
		empates.setText("Empates : " + totalEmpates);
		derrotas.setText("Derrotas : " + totalDerrotas);
	}

	public static void marcarQuadradoComoOcupado(JButton button) {
		if (button == quadrado1) {
			quadrado1Ocupado = true;
		} else if (button == quadrado2) {
			quadrado2Ocupado = true;
		} else if (button == quadrado3) {
			quadrado3Ocupado = true;
		} else if (button == quadrado4) {
			quadrado4Ocupado = true;
		} else if (button == quadrado5) {
			quadrado5Ocupado = true;
		} else if (button == quadrado6) {
			quadrado6Ocupado = true;
		} else if (button == quadrado7) {
			quadrado7Ocupado = true;
		} else if (button == quadrado8) {
			quadrado8Ocupado = true;
		} else if (button == quadrado9) {
			quadrado9Ocupado = true;
		}
	}

	public void pintaQuadradoComX(JButton button) {
		button.setText("x");
		button.setForeground(Color.yellow);
		marcarQuadradoComoOcupado(button);
	}

	public static void pintaQuadradoComO(JButton button) {
		button.setText("o");
		button.setForeground(Color.red);
		marcarQuadradoComoOcupado(button);
	}

	public static void reiniciarPartida() {
		quadrado1.setText("");
		quadrado2.setText("");
		quadrado3.setText("");
		quadrado4.setText("");
		quadrado5.setText("");
		quadrado6.setText("");
		quadrado7.setText("");
		quadrado8.setText("");
		quadrado9.setText("");
		cpuJogando = false;
		quadrado1Ocupado = false;
		quadrado2Ocupado = false;
		quadrado3Ocupado = false;
		quadrado4Ocupado = false;
		quadrado5Ocupado = false;
		quadrado6Ocupado = false;
		quadrado7Ocupado = false;
		quadrado8Ocupado = false;
		quadrado9Ocupado = false;
		if (jogadorVaiPrimeiro) {
			jogadorVaiPrimeiro = false;
			Main.roundComputador();
		} else if (jogadorVaiPrimeiro == false) {
			jogadorVaiPrimeiro = true;
		}
	}

	public void jogadorVenceu() {
		cpuJogando = true;
		totalVitorias++;
		atualizaPlacar();
		int action = JOptionPane.showOptionDialog(null, "Parabéns, você venceu!", "Você venceu!", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, options, 0);
		if (action == 0) {
			reiniciarPartida();
		}
	}

	public static void empate() {
		cpuJogando = true;
		totalEmpates++;
		atualizaPlacar();
		int action = JOptionPane.showOptionDialog(null, "Empate, ninguém venceu!", "Deu velha!",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, 0);
		if (action == 0) {
			reiniciarPartida();
		}
	}

	public static void jogadorPerdeu() {
		cpuJogando = true;
		totalDerrotas++;
		atualizaPlacar();
		int action = JOptionPane.showOptionDialog(null, "Que pena, você perdeu!", "Você perdeu!",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, 0);
		if (action == 0) {
			reiniciarPartida();
		}
	}

	public boolean checkVitoria() {
		if (quadrado1.getText().equals("x") && quadrado2.getText().equals("x") && quadrado3.getText().equals("x")) {
			jogadorVenceu();
			return true;
		} else if (quadrado4.getText().equals("x") && quadrado5.getText().equals("x") && quadrado6.getText().equals("x")) {
			jogadorVenceu();
			return true;
		} else if (quadrado7.getText().equals("x") && quadrado8.getText().equals("x") && quadrado9.getText().equals("x")) {
			jogadorVenceu();
			return true;
		} else if (quadrado1.getText().equals("x") && quadrado4.getText().equals("x") && quadrado7.getText().equals("x")) {
			jogadorVenceu();
			return true;
		} else if (quadrado2.getText().equals("x") && quadrado5.getText().equals("x") && quadrado8.getText().equals("x")) {
			jogadorVenceu();
			return true;
		} else if (quadrado3.getText().equals("x") && quadrado6.getText().equals("x") && quadrado9.getText().equals("x")) {
			jogadorVenceu();
			return true;
		} else if (quadrado1.getText().equals("x") && quadrado5.getText().equals("x") && quadrado9.getText().equals("x")) {
			jogadorVenceu();
			return true;
		} else if (quadrado3.getText().equals("x") && quadrado5.getText().equals("x") && quadrado7.getText().equals("x")) {
			jogadorVenceu();
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean checkEmpate() {
		if (quadrado1Ocupado && quadrado2Ocupado && quadrado3Ocupado && quadrado4Ocupado && quadrado5Ocupado
				&& quadrado6Ocupado && quadrado7Ocupado && quadrado8Ocupado && quadrado9Ocupado) {
			empate();
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkDerrota() {
		if (quadrado1.getText().equals("o") && quadrado2.getText().equals("o") && quadrado3.getText().equals("o")) {
			jogadorPerdeu();
			return true;
		} else if (quadrado4.getText().equals("o") && quadrado5.getText().equals("o") && quadrado6.getText().equals("o")) {
			jogadorPerdeu();
			return true;
		} else if (quadrado7.getText().equals("o") && quadrado8.getText().equals("o") && quadrado9.getText().equals("o")) {
			jogadorPerdeu();
			return true;
		} else if (quadrado1.getText().equals("o") && quadrado4.getText().equals("o") && quadrado7.getText().equals("o")) {
			jogadorPerdeu();
			return true;
		} else if (quadrado2.getText().equals("o") && quadrado5.getText().equals("o") && quadrado8.getText().equals("o")) {
			jogadorPerdeu();
			return true;
		} else if (quadrado3.getText().equals("o") && quadrado6.getText().equals("o") && quadrado9.getText().equals("o")) {
			jogadorPerdeu();
			return true;
		} else if (quadrado1.getText().equals("o") && quadrado5.getText().equals("o") && quadrado9.getText().equals("o")) {
			jogadorPerdeu();
			return true;
		} else if (quadrado3.getText().equals("o") && quadrado5.getText().equals("o") && quadrado7.getText().equals("o")) {
			jogadorPerdeu();
			return true;
		} else {
			return false;
		}
	}


	public Gui() {
		
		this.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource(""))));
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setTitle("Jogo da Velha");
		this.setResizable(false);
		this.setSize(620, 720);
		this.setMinimumSize(new Dimension(620, 720));

		barra1 = new JPanel();
		barra1.setBackground(Color.cyan);
		barra1.setBounds(200, 30, 10, 540);
		this.add(barra1);

		barra2 = new JPanel();
		barra2.setBackground(Color.cyan);
		barra2.setBounds(410, 30, 10, 540);
		this.add(barra2);

		barra3 = new JPanel();
		barra3.setBackground(Color.cyan);
		barra3.setBounds(30, 200, 540, 10);
		this.add(barra3);

		barra4 = new JPanel();
		barra4.setBackground(Color.cyan);
		barra4.setBounds(30, 410, 540, 10);
		this.add(barra4);


		quadrado1 = new JButton();
		quadrado1.setBorder(emptyBorder);
		quadrado1.addActionListener(this);
		quadrado1.setFont(new Font("Arial", Font.BOLD, 230));
		quadrado1.setHorizontalTextPosition(JLabel.CENTER);
		quadrado1.setVerticalTextPosition(JLabel.CENTER);
		quadrado1.setForeground(Color.white);
		quadrado1.setBackground(Color.black);
		quadrado1.setFocusable(false);
		quadrado1.setBounds(0, 0, 200, 200);
		quadrado1.setVisible(true);

		quadrado2 = new JButton();
		quadrado2.setBorder(emptyBorder);
		quadrado2.addActionListener(this);
		quadrado2.setFont(new Font("Arial", Font.BOLD, 230));
		quadrado2.setHorizontalTextPosition(JLabel.CENTER);
		quadrado2.setVerticalTextPosition(JLabel.CENTER);
		quadrado2.setForeground(Color.white);
		quadrado2.setBackground(Color.black);
		quadrado2.setFocusable(false);
		quadrado2.setBounds(210, 0, 200, 200);
		quadrado2.setVisible(true);

		quadrado3 = new JButton();
		quadrado3.setBorder(emptyBorder);
		quadrado3.addActionListener(this);
		quadrado3.setFont(new Font("Arial", Font.BOLD, 230));
		quadrado3.setHorizontalTextPosition(JLabel.CENTER);
		quadrado3.setVerticalTextPosition(JLabel.CENTER);
		quadrado3.setForeground(Color.white);
		quadrado3.setBackground(Color.black);
		quadrado3.setFocusable(false);
		quadrado3.setBounds(420, 0, 200, 200);
		quadrado3.setVisible(true);

		quadrado4 = new JButton();
		quadrado4.addActionListener(this);
		quadrado4.setBorder(emptyBorder);
		quadrado4.setFont(new Font("Arial", Font.BOLD, 230));
		quadrado4.setHorizontalTextPosition(JLabel.CENTER);
		quadrado4.setVerticalTextPosition(JLabel.CENTER);
		quadrado4.setForeground(Color.white);
		quadrado4.setBackground(Color.black);
		quadrado4.setFocusable(false);
		quadrado4.setBounds(0, 210, 200, 200);
		quadrado4.setVisible(true);

		quadrado5 = new JButton();
		quadrado5.addActionListener(this);
		quadrado5.setBorder(emptyBorder);
		quadrado5.setFont(new Font("Arial", Font.BOLD, 230));
		quadrado5.setHorizontalTextPosition(JLabel.CENTER);
		quadrado5.setVerticalTextPosition(JLabel.CENTER);
		quadrado5.setForeground(Color.white);
		quadrado5.setBackground(Color.black);
		quadrado5.setFocusable(false);
		quadrado5.setBounds(210, 210, 200, 200);
		quadrado5.setVisible(true);

		quadrado6 = new JButton();
		quadrado6.setBorder(emptyBorder);
		quadrado6.addActionListener(this);
		quadrado6.setFont(new Font("Arial", Font.BOLD, 230));
		quadrado6.setHorizontalTextPosition(JLabel.CENTER);
		quadrado6.setVerticalTextPosition(JLabel.CENTER);
		quadrado6.setForeground(Color.white);
		quadrado6.setBackground(Color.black);
		quadrado6.setFocusable(false);
		quadrado6.setBounds(420, 210, 200, 200);
		quadrado6.setVisible(true);

		quadrado7 = new JButton();
		quadrado7.setBorder(emptyBorder);
		quadrado7.addActionListener(this);
		quadrado7.setFont(new Font("Arial", Font.BOLD, 230));
		quadrado7.setHorizontalTextPosition(JLabel.CENTER);
		quadrado7.setVerticalTextPosition(JLabel.CENTER);
		quadrado7.setForeground(Color.white);
		quadrado7.setBackground(Color.black);
		quadrado7.setFocusable(false);
		quadrado7.setBounds(0, 420, 200, 200);
		quadrado7.setVisible(true);

		quadrado8 = new JButton();
		quadrado8.setBorder(emptyBorder);
		quadrado8.addActionListener(this);
		quadrado8.setFont(new Font("Arial", Font.BOLD, 230));
		quadrado8.setHorizontalTextPosition(JLabel.CENTER);
		quadrado8.setVerticalTextPosition(JLabel.CENTER);
		quadrado8.setForeground(Color.white);
		quadrado8.setBackground(Color.black);
		quadrado8.setFocusable(false);
		quadrado8.setBounds(210, 420, 200, 200);
		quadrado8.setVisible(true);

		quadrado9 = new JButton();
		quadrado9.setBorder(emptyBorder);
		quadrado9.addActionListener(this);
		quadrado9.setFont(new Font("Arial", Font.BOLD, 230));
		quadrado9.setHorizontalTextPosition(JLabel.CENTER);
		quadrado9.setVerticalTextPosition(JLabel.CENTER);
		quadrado9.setForeground(Color.white);
		quadrado9.setBackground(Color.black);
		quadrado9.setFocusable(false);
		quadrado9.setBounds(420, 420, 200, 200);
		quadrado9.setVisible(true);

		vitorias = new JLabel();
		vitorias.setFont(new Font("Arial", Font.BOLD, 20));
		vitorias.setHorizontalTextPosition(JLabel.CENTER);
		vitorias.setVerticalTextPosition(JLabel.CENTER);
		vitorias.setForeground(Color.green);
		vitorias.setBounds(40, 620, 200, 65);
		vitorias.setVisible(true);
		vitorias.setText("Vitórias : 0");

		empates = new JLabel();
		empates.setFont(new Font("Arial", Font.BOLD, 20));
		empates.setHorizontalTextPosition(JLabel.CENTER);
		empates.setVerticalTextPosition(JLabel.CENTER);
		empates.setForeground(Color.white);
		empates.setBounds(240, 620, 200, 65);
		empates.setVisible(true);
		empates.setText("Empates : 0");

		derrotas = new JLabel();
		derrotas.setFont(new Font("Arial", Font.BOLD, 20));
		derrotas.setHorizontalTextPosition(JLabel.CENTER);
		derrotas.setVerticalTextPosition(JLabel.CENTER);
		derrotas.setForeground(Color.red);
		derrotas.setBounds(440, 620, 200, 65);
		derrotas.setVisible(true);
		derrotas.setText("Derrotas : 0");

		this.add(quadrado1);
		this.add(quadrado2);
		this.add(quadrado3);
		this.add(quadrado4);
		this.add(quadrado5);
		this.add(quadrado6);
		this.add(quadrado7);
		this.add(quadrado8);
		this.add(quadrado9);

		this.add(vitorias);
		this.add(empates);
		this.add(derrotas);


		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == quadrado1) {
			if (quadrado1Ocupado == false && cpuJogando == false) {
			pintaQuadradoComX(quadrado1);
			quadrado1Ocupado = true;
			boolean venceu = checkVitoria();
			if (venceu == false) {
				boolean empatou = checkEmpate();
				if (empatou == false) {
					Main.roundComputador();
				}
			}
			}
		}

		if (e.getSource() == quadrado2) {
			if (quadrado2Ocupado == false && cpuJogando == false) {
				pintaQuadradoComX(quadrado2);
				quadrado2Ocupado = true;
				boolean venceu = checkVitoria();
				if (venceu == false) {
					boolean empatou = checkEmpate();
					if (empatou == false) {
						Main.roundComputador();
				}
			}
		}
		}

		if (e.getSource() == quadrado3) {
			if (quadrado3Ocupado == false && cpuJogando == false) {
				pintaQuadradoComX(quadrado3);
				quadrado3Ocupado = true;
				boolean venceu = checkVitoria();
				if (venceu == false) {
					boolean empatou = checkEmpate();
					if (empatou == false) {
						Main.roundComputador();
				}
			}
		}
		}

		if (e.getSource() == quadrado4) {
			if (quadrado4Ocupado == false && cpuJogando == false) {
				pintaQuadradoComX(quadrado4);
				quadrado4Ocupado = true;
				boolean venceu = checkVitoria();
				if (venceu == false) {
					boolean empatou = checkEmpate();
					if (empatou == false) {
						Main.roundComputador();
				}
			}
		}
		}

		if (e.getSource() == quadrado5) {
			if (quadrado5Ocupado == false && cpuJogando == false) {
				pintaQuadradoComX(quadrado5);
				quadrado5Ocupado = true;
				boolean venceu = checkVitoria();
				if (venceu == false) {
					boolean empatou = checkEmpate();
					if (empatou == false) {
						Main.roundComputador();
				}
			}
		}
		}

		if (e.getSource() == quadrado6) {
			if (quadrado6Ocupado == false && cpuJogando == false) {
				pintaQuadradoComX(quadrado6);
				quadrado6Ocupado = true;
				boolean venceu = checkVitoria();
				if (venceu == false) {
					boolean empatou = checkEmpate();
					if (empatou == false) {
						Main.roundComputador();
				}
			}
		}
		}

		if (e.getSource() == quadrado7) {
			if (quadrado7Ocupado == false && cpuJogando == false) {
				pintaQuadradoComX(quadrado7);
				quadrado7Ocupado = true;
				boolean venceu = checkVitoria();
				if (venceu == false) {
					boolean empatou = checkEmpate();
					if (empatou == false) {
						Main.roundComputador();
				}
			}
		}
		}

		if (e.getSource() == quadrado8) {
			if (quadrado8Ocupado == false && cpuJogando == false) {
				pintaQuadradoComX(quadrado8);
				quadrado8Ocupado = true;
				boolean venceu = checkVitoria();
				if (venceu == false) {
					boolean empatou = checkEmpate();
					if (empatou == false) {
						Main.roundComputador();
				}
			}
		}
		}

		if (e.getSource() == quadrado9) {
			if (quadrado9Ocupado == false && cpuJogando == false) {
				pintaQuadradoComX(quadrado9);
				quadrado9Ocupado = true;
				boolean venceu = checkVitoria();
				if (venceu == false) {
					boolean empatou = checkEmpate();
					if (empatou == false) {
						Main.roundComputador();
				}
			}
		}
		}





	}

}
