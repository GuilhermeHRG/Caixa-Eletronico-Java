
public class Funcionario extends Pessoa {
	private Double salario=1500.00;
	private String cargo;
	private int nivelAcesso;
	private String beneficios;
	private String cod;
	private Integer log=2;
	private String pass1="123";
	
	
	
	public void cobrar() {
		System.out.println("NÚMERO DA CONTA A SER COBRADA: ");
		System.out.println("Valor a ser cobrado R$:  ");
	}
	
	public void cadastro() {
		System.out.println("INSIRA O NOME: ");
		System.out.println("INSIRA O NÚMERO DA CONTA: ");
	}
	
	public void setMenu(Integer menu) {
		System.out.println("1- CADASTRAR"
						  + "2- COBRAR	"
						  + "3- RECEBER SALÁRIO ");
	   this.menu = menu;
	}
	
	
	public Integer getLog() {
		return log;
	}

	public void setLog(Integer log) {
		this.log = log;
	}

	public String getPass() {
		return pass1;
	}

	public void setPass(String pass) {
		this.pass1 = pass;
	}

	
	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(int nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}}

	