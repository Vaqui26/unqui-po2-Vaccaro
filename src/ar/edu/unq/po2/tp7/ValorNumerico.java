package ar.edu.unq.po2.tp7;

/*
 * Representacion de los valor que pueden llegar a tener las cartas francesas.
 */
public enum ValorNumerico{
	
	A{
		@Override
		public int getValor() {
			return 1;
		}
		@Override
		public boolean esSuperior(ValorNumerico valor) {
			return true;
		}
	}, Dos{
		@Override
		public int getValor() {
			return 2;
		}
	}, Tres{
		@Override
		public int getValor() {
			return 3;
		}
	}, Cuatro{
		public int getValor() {
			return 4;
		}
	}, Cinco{
		@Override
		public int getValor() {
			return 5;
		}
	}, Seis{
		@Override
		public int getValor() {
			return 6;
		}
	}, Siete{
		@Override
		public int getValor() {
			return 7;
		}
	}, Ocho{
		@Override
		public int getValor() {
			return 8;
		}
	}, Nueve{
		@Override 
		public int getValor() {
			return 9;
		}
	}, Diez{
		@Override
		public int getValor() {
			return 10;
		}
	}, J{
		@Override
		public int getValor() {
			return 11;
		}
	}, Q{
		@Override
		public int getValor() {
			return 12;
		}
	}, K{
		@Override
		public int getValor() {
			return 13;
		}
	};
	
	public abstract int getValor();
	/*
	 * Indica si la carta ingresada por parametro es de menor valor, en caso que tengan el 
	 * mismo valor retorn false.
	 */
	public boolean esSuperior(ValorNumerico valor) {
		
		if(valor.getValor() != 1) {
			return (this.getValor()) > valor.getValor();
		}else {
			return false;
		}
	}
}
