package uninter;

public class Real extends Moeda{

	public Real(double valor) {
		this.valor=valor;
	}
	//criando metodos info/converter
	@Override
	public void info() {
		System.out.println("Real -" + valor);
	}

	@Override
	public double converter() {
		return this.valor;
	}
	
	//utilização de equals para verificar se o objeto se encontra dentro da lista para ser removido
	@Override
	public boolean equals(Object obj) {
		if(this.getClass() != obj.getClass()) {
			return false;
		}
	
		Real objReal = (Real) obj;
	
		if(this.valor != objReal.valor) {
			return false;
		}
		return true;

	
	}
}
//Nas classes "Dolar" e "Euro", sao repetidos e implementados os mesmos métodos