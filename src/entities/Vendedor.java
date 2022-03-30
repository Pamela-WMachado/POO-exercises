package entities;

//atributos
public class Vendedor {
	public String nome;
	public double meta;
	public double totalVendido;
	
	//construtores
	public Vendedor(String nome, double meta, double totalVendido) {
		super();
		this.nome = nome;
		this.meta = meta;
		this.totalVendido = totalVendido;
	}
	
	//getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getMeta() {
		return meta;
	}
	
	public void setMeta (double meta) {
		this.meta = meta;
	}
	
	public double getTotalVendido() {
		return totalVendido;
	}
	
	public void setTotalVendido(double totalVendido) {
		this.totalVendido = totalVendido;
	}
	
	//metodos
	/*DESCOBRINDO A PORCENTAGEM DO VALOR VENDIDO:
	 * SE META > VENDAS
	 * VENDAS * 100 / META
	 * SE VENDAS > METAS
	 * METAS * 100 / VENDAS
	 */

	/*VALOR VENDIDO	EM RELAÇAO A META			COMISSAO SOBRE O VALOR TOTAL VENDIDO
	 * 	 <50% - 0.5									1% = 0.01
	 * 	<=75%									2,5% = 0.025
	 * 	<=100%									3,5% = 0.035
	 * 	>100%									5% = 0.050
	 */
	public double calcularComissao() {
		double comissao; 
		double porcentagem = ( totalVendido / meta) * 100;
		if (porcentagem < 0.5)
			 comissao = totalVendido * 0.01;
		 	else if (porcentagem <=0.75)
		 		comissao = totalVendido * 0.025;
		 	else if (porcentagem <= 1)
		 		comissao = totalVendido * 0.035;
		 	else 
		 		comissao = totalVendido * 0.05;
		return comissao;
	}
	
	public String toString() {
		return "Vendedor(a): " + nome 
				+ "\nMeta atingida: " + totalVendido
				+ "\nComissão: R$" + String.format("%.2f", calcularComissao());
	}
	
	
}
