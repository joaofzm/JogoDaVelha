package jogodavelha;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

	static void checkarOndePintar() {

		if (Gui.quadrado1.getText().equals("o") && Gui.quadrado2.getText().equals("o") && Gui.quadrado3Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado3);
		} else if (Gui.quadrado1.getText().equals("o") && Gui.quadrado3.getText().equals("o") && Gui.quadrado2Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado2);
		} else if (Gui.quadrado2.getText().equals("o") && Gui.quadrado3.getText().equals("o") && Gui.quadrado1Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado1);
		}  else if (Gui.quadrado4.getText().equals("o") && Gui.quadrado5.getText().equals("o") && Gui.quadrado6Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado6);
		} else if (Gui.quadrado4.getText().equals("o") && Gui.quadrado6.getText().equals("o") && Gui.quadrado5Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado5);
		} else if (Gui.quadrado5.getText().equals("o") && Gui.quadrado6.getText().equals("o") && Gui.quadrado4Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado4);
		}  else if (Gui.quadrado7.getText().equals("o") && Gui.quadrado8.getText().equals("o") && Gui.quadrado9Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado9);
		} else if (Gui.quadrado7.getText().equals("o") && Gui.quadrado9.getText().equals("o") && Gui.quadrado8Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado8);
		} else if (Gui.quadrado8.getText().equals("o") && Gui.quadrado9.getText().equals("o") && Gui.quadrado7Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado7);
		}  else if (Gui.quadrado1.getText().equals("o") && Gui.quadrado4.getText().equals("o") && Gui.quadrado7Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado7);
		} else if (Gui.quadrado1.getText().equals("o") && Gui.quadrado7.getText().equals("o") && Gui.quadrado4Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado4);
		} else if (Gui.quadrado4.getText().equals("o") && Gui.quadrado7.getText().equals("o") && Gui.quadrado1Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado1);
		} else if (Gui.quadrado2.getText().equals("o") && Gui.quadrado5.getText().equals("o") && Gui.quadrado8Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado8);
		} else if (Gui.quadrado2.getText().equals("o") && Gui.quadrado8.getText().equals("o") && Gui.quadrado5Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado5);
		} else if (Gui.quadrado5.getText().equals("o") && Gui.quadrado8.getText().equals("o") && Gui.quadrado2Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado2);
		}  else if (Gui.quadrado3.getText().equals("o") && Gui.quadrado6.getText().equals("o") && Gui.quadrado9Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado9);
		} else if (Gui.quadrado3.getText().equals("o") && Gui.quadrado9.getText().equals("o") && Gui.quadrado6Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado6);
		} else if (Gui.quadrado6.getText().equals("o") && Gui.quadrado9.getText().equals("o") && Gui.quadrado3Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado3);
		}  else if (Gui.quadrado1.getText().equals("o") && Gui.quadrado5.getText().equals("o") && Gui.quadrado9Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado9);
		} else if (Gui.quadrado1.getText().equals("o") && Gui.quadrado9.getText().equals("o") && Gui.quadrado5Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado5);
		} else if (Gui.quadrado5.getText().equals("o") && Gui.quadrado9.getText().equals("o") && Gui.quadrado1Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado1);
		}  else if (Gui.quadrado3.getText().equals("o") && Gui.quadrado5.getText().equals("o") && Gui.quadrado7Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado7);
		} else if (Gui.quadrado3.getText().equals("o") && Gui.quadrado7.getText().equals("o") && Gui.quadrado5Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado5);
		} else if (Gui.quadrado5.getText().equals("o") && Gui.quadrado7.getText().equals("o") && Gui.quadrado3Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado3);

		} else if (Gui.quadrado1.getText().equals("x") && Gui.quadrado2.getText().equals("x") && Gui.quadrado3Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado3);
		} else if (Gui.quadrado1.getText().equals("x") && Gui.quadrado3.getText().equals("x") && Gui.quadrado2Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado2);
		} else if (Gui.quadrado2.getText().equals("x") && Gui.quadrado3.getText().equals("x") && Gui.quadrado1Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado1);
		}  else if (Gui.quadrado4.getText().equals("x") && Gui.quadrado5.getText().equals("x") && Gui.quadrado6Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado6);
		} else if (Gui.quadrado4.getText().equals("x") && Gui.quadrado6.getText().equals("x") && Gui.quadrado5Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado5);
		} else if (Gui.quadrado5.getText().equals("x") && Gui.quadrado6.getText().equals("x") && Gui.quadrado4Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado4);
		}  else if (Gui.quadrado7.getText().equals("x") && Gui.quadrado8.getText().equals("x") && Gui.quadrado9Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado9);
		} else if (Gui.quadrado7.getText().equals("x") && Gui.quadrado9.getText().equals("x") && Gui.quadrado8Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado8);
		} else if (Gui.quadrado8.getText().equals("x") && Gui.quadrado9.getText().equals("x") && Gui.quadrado7Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado7);
		}  else if (Gui.quadrado1.getText().equals("x") && Gui.quadrado4.getText().equals("x") && Gui.quadrado7Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado7);
		} else if (Gui.quadrado1.getText().equals("x") && Gui.quadrado7.getText().equals("x") && Gui.quadrado4Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado4);
		} else if (Gui.quadrado4.getText().equals("x") && Gui.quadrado7.getText().equals("x") && Gui.quadrado1Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado1);
		} else if (Gui.quadrado2.getText().equals("x") && Gui.quadrado5.getText().equals("x") && Gui.quadrado8Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado8);
		} else if (Gui.quadrado2.getText().equals("x") && Gui.quadrado8.getText().equals("x") && Gui.quadrado5Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado5);
		} else if (Gui.quadrado5.getText().equals("x") && Gui.quadrado8.getText().equals("x") && Gui.quadrado2Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado2);
		}  else if (Gui.quadrado3.getText().equals("x") && Gui.quadrado6.getText().equals("x") && Gui.quadrado9Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado9);
		} else if (Gui.quadrado3.getText().equals("x") && Gui.quadrado9.getText().equals("x") && Gui.quadrado6Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado6);
		} else if (Gui.quadrado6.getText().equals("x") && Gui.quadrado9.getText().equals("x") && Gui.quadrado3Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado3);
		}  else if (Gui.quadrado1.getText().equals("x") && Gui.quadrado5.getText().equals("x") && Gui.quadrado9Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado9);
		} else if (Gui.quadrado1.getText().equals("x") && Gui.quadrado9.getText().equals("x") && Gui.quadrado5Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado5);
		} else if (Gui.quadrado5.getText().equals("x") && Gui.quadrado9.getText().equals("x") && Gui.quadrado1Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado1);
		}  else if (Gui.quadrado3.getText().equals("x") && Gui.quadrado5.getText().equals("x") && Gui.quadrado7Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado7);
		} else if (Gui.quadrado3.getText().equals("x") && Gui.quadrado7.getText().equals("x") && Gui.quadrado5Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado5);
		} else if (Gui.quadrado5.getText().equals("x") && Gui.quadrado7.getText().equals("x") && Gui.quadrado3Ocupado==false) {
			Gui.pintaQuadradoComO(Gui.quadrado3);
		
		} else if (Gui.quadrado1.getText().equals("x") && Gui.quadrado9Ocupado == false) {
			Gui.pintaQuadradoComO(Gui.quadrado9);
		} else if (Gui.quadrado3.getText().equals("x") && Gui.quadrado7Ocupado == false) {
			Gui.pintaQuadradoComO(Gui.quadrado7);
		} else if (Gui.quadrado7.getText().equals("x") && Gui.quadrado3Ocupado == false) {
			Gui.pintaQuadradoComO(Gui.quadrado3);
		} else if (Gui.quadrado9.getText().equals("x") && Gui.quadrado1Ocupado == false) {
			Gui.pintaQuadradoComO(Gui.quadrado1);

		} else if (Gui.quadrado1Ocupado == false) {
			Gui.pintaQuadradoComO(Gui.quadrado1);
		} else if (Gui.quadrado9Ocupado == false) {
			Gui.pintaQuadradoComO(Gui.quadrado9);
		} else if (Gui.quadrado3Ocupado == false) {
			Gui.pintaQuadradoComO(Gui.quadrado3);
		} else if (Gui.quadrado7Ocupado == false) {
			Gui.pintaQuadradoComO(Gui.quadrado7);
		} else if (Gui.quadrado2Ocupado == false) {
			Gui.pintaQuadradoComO(Gui.quadrado2);
		} else if (Gui.quadrado4Ocupado == false) {
			Gui.pintaQuadradoComO(Gui.quadrado4);
		} else if (Gui.quadrado6Ocupado == false) {
			Gui.pintaQuadradoComO(Gui.quadrado6);
		} else if (Gui.quadrado8Ocupado == false) {
			Gui.pintaQuadradoComO(Gui.quadrado8);
		} else if (Gui.quadrado5Ocupado == false) {
			Gui.pintaQuadradoComO(Gui.quadrado5);
		}
	}


	static void roundComputador() {
		Gui.cpuJogando = true;
		Timer timer = new Timer();
		TimerTask task1 = new TimerTask() {
			public void run() {
				checkarOndePintar();
				boolean perdeu = Gui.checkDerrota();
				if (perdeu == false) {
					Gui.checkEmpate();
				}
				Gui.cpuJogando = false;
			}
		};
		timer.schedule(task1, 1000);

	}

	public static void main(String[] args) {
		new Gui();
	}

}
