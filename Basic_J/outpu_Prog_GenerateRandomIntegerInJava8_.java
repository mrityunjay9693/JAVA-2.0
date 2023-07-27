import java.util.Random;
public class outpu_Prog_GenerateRandomIntegerInJava8_
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		for(int i=0;i<3;i++)
		{
			System.out.println(rand.ints(1,5,11).findFirst().getAsInt());
		}
	}
} 
