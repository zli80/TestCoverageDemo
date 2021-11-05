
public class CoverageExample {
	public static int identity(int x, boolean cond1, boolean cond2, boolean cond3)
	{	if(cond1)
			x++;		
		if (cond2)
			x--;
		if(cond3)
			x *=1;		
		return x;}
}
