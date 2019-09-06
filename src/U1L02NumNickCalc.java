import javax.swing.JOptionPane;

//U1L02 Notes
public class U1L02NumNickCalc {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "How many cents do you have?");
		int userMoney = Integer.parseInt(input);
		
		
		int numBNick = userMoney/5;
		int pennies = userMoney - (numBNick *5);
		JOptionPane.showMessageDialog(null, userMoney + " cents is " + numBNick + " nickles and " + pennies + " pennies.");
		

	}

}
