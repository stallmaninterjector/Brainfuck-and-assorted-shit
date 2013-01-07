import java.util.*;
public class Brainfuck {
  public static void main(String[]args) {
		Scanner in = new Scanner (System.in);

		char buff;

		System.out.println("What do you want the program to output?");
		String desiredOutput=in.nextLine();
		in.close();

		int lengthOfString=desiredOutput.length();

		for(int ctr=0;ctr<lengthOfString;ctr++)
		{
			buff=desiredOutput.charAt(ctr);
			int lel = (int) buff;
			System.out.print(">");
			for (int j=0;j<lel;j++)
			{
				System.out.print("+");
			}
			System.out.println("\n.");

		}
	}
}
