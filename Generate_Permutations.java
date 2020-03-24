import java.util.Arrays;

public class Generate_Permutations {
  
	String input_string;
	int curr_ind;
	int input_string_len;
	
	Generate_Permutations(String input)
	{ 
		input_string=input; //initialising the String
		curr_ind=0; // setting the value for Current position
		input_string_len=input.length();//initialising teh length of generated permutations
	    
		input_string = Make_Lexo(input_string); //To AMke the input String in lexicographical order
        Make_Permutations(input_string,curr_ind,input_string_len,"");
	}
	
	private void Make_Permutations(String input_string,int curr_ind,int input_string_len,String result)
	{
		if(curr_ind==input_string_len)
		{
		  System.out.println(result);
		  return;
		}
		
	    for(int i=0;i<input_string_len;i++)
	     {
	       Make_Permutations(input_string,curr_ind+1,input_string_len,result+input_string.charAt(i));
	     }

    }
	
	private String Make_Lexo(String input)
	{
		char[] Input_char_Arr = input.toCharArray();
		Arrays.sort(Input_char_Arr);
		return String.valueOf(Input_char_Arr);
	}
	
	
	
	

}
