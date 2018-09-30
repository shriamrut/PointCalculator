package exceptions;
import java.util.regex.*;
/**Exception Class that evaluates the expression (x,y)**/
public class InvalidExpressionException extends Exception{

	private static final long serialVersionUID = 1L;
	InvalidExpressionException(String s)
	{
		super(s);
	}
	public static void checkExpression(String s) throws InvalidExpressionException
	{
		//Here by using regex we can evaluate the expression (x,y)
		Pattern pattern=Pattern.compile("\\(-?([0-9]+)?(\\.[0-9]+)?+\\,(-?[0-9]+)?(\\.[0-9]+)?\\)");
		if(!pattern.matcher(s).matches())
			throw new InvalidExpressionException("Invalid Expression");
	}

}
