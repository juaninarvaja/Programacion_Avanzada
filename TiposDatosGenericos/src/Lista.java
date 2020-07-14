
public class Lista<T extends Number,K> {
//uso esa letra dentro de la clase como tipo de dato
	private T valor;
		public void addK (K o) {
			
		}
		public void addT(T o) {
			this.valor = o;
			//el objeto o es de tipo T
			//es decir q vale de acuerdo a la implementacion de la clase
		}
		public T get() {
			return valor;
		}
}
