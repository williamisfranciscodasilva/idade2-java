package idade2;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class idade {
	
	public void voto() {
		
		int year, nasc, idade;
		
		Calendar cal = Calendar.getInstance();
		year = cal.get(Calendar.YEAR);
		
		nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de seu nascimento: "));
		idade = year - nasc;
		
		if(idade < 16) {
			JOptionPane.showMessageDialog(null, "Estamos em "+year+ " Ent�o voc� tem "+idade+
					"\nN�o pode votar ainda!");
		}
		else {
			if((idade >= 16 && idade < 18) || (idade > 70)) {
				JOptionPane.showMessageDialog(null, "Estamos em "+year+ " Ent�o voc� tem "+idade+
						"\nSeu voto � opcional");
			}
			else {
				JOptionPane.showMessageDialog(null, "Estamos em "+year+ " Ent�o voc� tem "+idade+
						"\nSeu voto � obrigat�rio!");
			}
		}
		
		
	}
}
