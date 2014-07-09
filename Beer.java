//project test
public class Beer {
	public static void main (String[] args)
	{
			BeerTest b = new BeerTest();
			b.show();
	}
	}
	class BeerTest {
		private String start = " bottles of beer on the wall ";
		private	String end = " bottles of beer";
		private	String add = " take one down, pass it around";
		public void show()
		{
			System.out.print("Dang Hoang Trung\t");
			System.out.print("MSSV : 09020542\t");
			System.out.print("Lop : Bang kep\t");
			System.out.print("Github account : trungdh\t");
			System.out.print("email : conandoye@gmail.com\n");
			for(int i = 9; i>0 ; i--)
			{
				System.out.println(i+start + i +end);
				System.out.println(add);
			}
			System.out.println("No more bottles of beer on the wall\n");
		}
	}
