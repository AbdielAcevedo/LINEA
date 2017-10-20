package programacion3;

public class PruebaLinea {

	public static void main(String[] args) {
		
		Punto punto1 = new Punto(-3.0 , 1.0);
		Punto punto2 = new Punto(2.0 , -4.0);
		
		Punto punto3 = new Punto(-2.0 , -2.0);
		Punto punto4 = new Punto(2.0 , 2.0);
		
		LianeaRecta  lin1 = new LianeaRecta (punto1, punto2);
	
		LianeaRecta  lin2 = new LianeaRecta (punto3, punto4);
		
		System.out.println("\nRECTA 1" + lin1.getDetalles()+
				           "\n\nRECTA 2" + lin2.getDetalles()+
				           "\n\nINTERSECCION :"+lin1.interseccion(lin2)
		
				);

	}

}
