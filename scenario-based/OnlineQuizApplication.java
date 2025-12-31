/*
17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/
import java.util.*;
public class OnlineQuizApplication{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		String [] questions = {
			"1. What is Java?\n"
				+ "a. MarkUp Language.\n"
				+ "b. Programming Language\n"
				+ "c. Game Engine\n"
				+ "d. Food\n",
			
			"2. Who invented Java Programming?\n"
				+ "a. Guido van Rossum\n"
				+ "b. James Gosling\n"
				+ "c. Dennis Ritchie\n"
				+ "d. Bjarne Stroustrup\n",
			
			"3. Which one of the following is not a Java feature?\n"
				+ "a. Object-oriented\n"
				+ "b. Use of pointers\n"
				+ "c. Portable\n"
				+ "d. Dynamic and Extensible\n",
				
			"4. Which of these cannot be used for a variable name in Java?\n"
				+ "a. identifier & keyword\n"
				+ "b. identifier\n"
				+ "c. keyword\n"
				+ "d. none of the mentioned\n",
			
			"5. What is the extension of java code files?\n"
				+ "a. .js\n"
				+ "b. .txt\n"
				+ "c. .class\n"
				+ "d. .java\n"
		};
		char [] correctans = {'b', 'b', 'b', 'c', 'd'};
		
		for(int i = 0 ; i< 5 ; i++){
			System.out.println(questions[i]);
			char userans = input.next().charAt(0);
			if(userans != correctans[i] ){
				System.out.println("WRONG ANSWER! CORRECT OPTION IS: " + correctans[i] +"\n");
				
			}else{
				System.out.println("CORRECT ANSWER\n");
			}
		}
		input.close();
		
	}
}