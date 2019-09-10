import javax.swing.JOptionPane;

//U1L02 Notes
public class U1L02NumNickCalc {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "How many cents do you have?");
		int userMoney = Integer.parseInt(input);
		
		// 25-quarters, 10 -dimes 5 nickle 1 penny
		//57
		int numbQuart = userMoney/25;
		int userMoney1 = userMoney - numbQuart * 25;
		//numbQuart 2
		int numbDim = (userMoney%25)/10;
		userMoney1 = userMoney1 - numbDim * 10;

		//int currUM = userMoney -  
		//numbdim 2
		//int numBNick =userMoney%(numbQuart*numbDim);
		// line above is wrong
		
		int numBNick = userMoney1/5;
		int pennies = userMoney1 - (numBNick *5);
		JOptionPane.showMessageDialog(null, userMoney + " cents is " + numbQuart + " Quarters " + numbDim + " dimes" + numBNick + " nickles and " + pennies + " pennies.");
		

	}

}
