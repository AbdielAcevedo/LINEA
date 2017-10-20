package programacion3;

public class Punto 
{
	
	public double X;
	public double Y;
	
	
	public Punto(double X , double Y) 
	{
		this.X = X;
		this.Y = Y;
		
	}



public String getDetalles()
{
	return ("( "+ X + " , " + Y + " )");
}


public double getX()
{
	return (X);
}


public double getY()
{
	return(Y);
	
}

public void setX(double X)
{
	this.X = X;
}

public void setY(double Y)
{
	this.Y = Y;
}

public void trasladarXY(double A , double B)
{
	X += A;
    Y += B;
}

public boolean estanAlineados(Punto p1, Punto p2) {
    return (Y - p1.Y)*(p2.X - p1.X) == (p2.Y - p1.Y)*(X -p1.X);
  }

}
