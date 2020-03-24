import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to Find it's Lexicographical permuatations");
		String input_String=sc.nextLine();
		
		Generate_Permutations Gen1 = new Generate_Permutations(input_String);
	}

}
