/*(NULL)*/
class PessoaFisica extends Farmacia {
	protected String Nome;
	protected int Nivel_Acesso;
	protected String CPF;

	public PessoaFisica() {
		
	}

	public String get_Nome () {
		
	}

	public int get_Nivel_Acesso () {
		
	}

	public void set_Nome (String nome) {
		
	}

	public void set_Nivel_Acesso (int nivel) {
		
	}

	public void set_CPF (String cpf) {
		
	}

	public String get_CPF () {
		
	}

}

/*(NULL)*/
class Farmacia {
	protected int Tamanho;

	public Farmacia() {
		
	}

	public int get_Tamanho () {
		
	}

	public void set_Tamanho (int tamanho) {
		
	}

}

/*(NULL)*/
class Fornecedor extends PessoaJuridica {
	protected String Nome;

	public Fornecedor() {
		
	}

	public String get_Nome () {
		
	}

	public void set_Nome (String nome) {
		
	}

	public boolean Fornecer () {
		
	}

}

/*(NULL)*/
class PessoaJuridica extends Farmacia {
	protected String CNPJ;

	public PessoaJuridica() {
		
	}

	public String get_CNPJ () {
		
	}

	public void set_CNPJ (String cnpj) {
		
	}

}

/*(NULL)*/
class Funcionario extends PessoaFisica {
	protected String ID;

	public Funcionario() {
		
	}

	public String get_ID () {
		
	}

	public void set_ID (String id) {
		
	}

}

/*(NULL)*/
class Cliente extends PessoaFisica {

	public Cliente() {
		
	}

	public boolean Comprar () {
		
	}

}

