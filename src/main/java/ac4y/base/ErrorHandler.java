package ac4y.base;

public class ErrorHandler{
	 
	public static void addStack(Exception aException){
		
		//System.out.println("addStack:" + aException.getMessage());
		System.out.println("addStack:" + aException.toString());
		
	} // addStack

	public static void addMessage(String aMessage){
		
		System.out.println("addMessage:" + aMessage);
		
	} // addMessage

} // ErrorHandler
