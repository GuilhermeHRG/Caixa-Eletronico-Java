
public class Gerente extends Funcionario {
	private String sala;
	private Integer log=3;
	private String pass="123";
	
	public void setMenu(Integer menu, String a) {
		System.out.println("1- ONDE É MINHA SALA? "
						  + "2- DEMITIR 	"
						  + "3- PROMOVER"
						  + "4- CONTRATAR ");
	   this.menu=menu;
	}
	public void contrat() {
		System.out.println("DIGITE O NOME DO FUNCIONÁRIO: ");
		System.out.println("DIGITE O CARGO DA CONTRATAÇÃO: ");
	}
	public void promo() {
		System.out.println("DIGITE O CÓDIGO DO FUNCIONÁRIO: ");
		System.out.println("DIGITE O CARGO DA PROMOÇÃO: ");
	}

	public Integer getLog() {
		return log;
	}

	public void setLog(Integer log) {
		this.log = log;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getSala() {
		return sala="SALA 03";
	}

	public void setSala(String sala) {
		this.sala = sala;
	}
	public void demitir() {
		System.out.println("DIGITE O CÓDIGO DO FUNCIONÁRIO: ");
		
		
	}

}