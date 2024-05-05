package ar.edu.unq.po2.tp7;

/*
 * Representacion de los palos que puede llegar a tener las cartas francesas.
 */
public enum Palo {

	Corazon{
		@Override
		public String getPalo() {
			return "Corazon"; 
		}
	}, Trebol{
		@Override
		public String getPalo() {
			return "Trebol";
		}
	}, Pica{
		@Override
		public String getPalo() {
			return "Pica";
		}
	}, Diamante{
		@Override
		public String getPalo() {
			return "Diamante";
		}
	};
	
	public abstract String getPalo();
	
	public boolean mismoPalo(Palo palo) {
		
		return (this.getPalo()).equals(palo.getPalo());
	}
}
