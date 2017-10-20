package programacion3;

public class LianeaRecta
{
	public Punto punto1;
	public Punto punto2;
	public double m;
	public double b;
	public boolean existe;
	
	public LianeaRecta(Punto punto1, Punto punto2) 
	{
		this.punto1 = punto1;
		this.punto2 = punto2;
		CalculaPendiente();
		CalcularInterseccionB();
	}
	
	public String getDetalles()
	{
		return(
		          "\npunto 1 : " + punto1.getDetalles()+
		          "\npunto 2 : " + punto2.getDetalles()+
		          "\nla pendiente existe:"+getExiste()+
		          "\npendiente: " + m+
		          "\nY = m.x+b"+
		          "\nY = "+m+".x + b"+
		          "\nb = "+b+
		          "\nY = "+m+".x + "+b+
		          "\nRecta = ("+((m*punto1.getX())+b)+","+((m*punto2.getX())+b)+")"
		
		    );
	}
	
	public Punto getPunto1() 
	{
		return(punto1);
	}
	
	public Punto getPunto2() 
	{
		return(punto2);
	}
	
	public double getPendiente()
	{
		return(m);
		
	}
	public boolean getExiste() {
		if(punto1.getX() == punto2.getX()  || ( (punto2.getX() - punto1.getX() ) == 0)) 
		  {
			return(false);
		  }
		return(true);
	}
	
	public void CalcularInterseccionB()
	{
		 if(punto1.getX() == punto2.getX() ) 
		  {
			 b = Double.POSITIVE_INFINITY;
	          
		  }else {
			 b = punto1.getY()-(m*punto1.getX());
		  }
	}
	
	public void CalculaPendiente()
	{
		double y2menosy1 = punto2.getY() - punto1.getY();
		double x2menosx1 = punto2.getX() - punto1.getX();
		
	  if(x2menosx1 !=0 ) {
		  m = y2menosy1/x2menosx1;
	  }	else {
		  m = Double.POSITIVE_INFINITY;
	  }
		
	}
	
	 
	
	public String interseccion(LianeaRecta l1) {
        double nuevaX, nuevaY;
        if (m == l1.m){
        	if(punto1.getY() == punto2.getY() || punto1.getX() == punto2.getX()) {
        		return ("- NO EXiste Solucion Real");
        	}
        	return ("- Las 2 rectas son iguales");
        }
        else {
          nuevaX = (b- l1.b)/(l1.m - m);
          nuevaY = (m*nuevaX + b);
        }
        return ("Recta que pasa por "+nuevaX+" y "+nuevaY);
    } 

	

}
