
	public class Cliente extends Pessoa {
		private String conta;
		private String agenica;
		private Double saldo=0.00;
		private Integer log=1;
		private String pass="123";
		
		
		
		
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

		public void pagarSacar(Double valor) {
			
			saldo -= valor;
			System.out.println("valor sacado foi de : R$" + valor);
		}

		public void pagarSacar(Double valor, String recebedor) {
			saldo -= valor;
			System.out.println("VOCÊ PAGOU R$ " +valor+" PARA : " + recebedor);
		}

		public String getConta() {
			return conta;
		}

		public void setConta(String conta) {
			this.conta = conta;
		}

		public String getAgenica() {
			return agenica;
		}

		public void setAgenica(String agenica) {
			this.agenica = agenica;
		}

		public Double getSaldo() {
			return saldo;
		}

		public void setSaldo(Double saldo) {
			this.saldo = saldo;
		}
		public void depositar(Double valor) {
			saldo += valor;
			System.out.println("valor depositado foi de : R$" + valor);
		}
		public void depositar(Double valor, String recebedor) {
			saldo += valor;
			System.out.println("valor depositado foi de : R$" + valor);}
		}

		