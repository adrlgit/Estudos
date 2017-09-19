ackage com.andre.pedidovenda.util.jsf;

import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;

public class jsfExceptionHandlerFactory extends ExceptionHandlerFactory {

	private ExceptionHandlerFactory parent;
	
	public jsfExceptionHandlerFactory(ExceptionHandlerFactory parent){
		this.parent = parent;
	}
	
	@Override
	public ExceptionHandler getExceptionHandler(){
		return new JsfExceptionHandler(parent.getExceptionHandler());
	}
}
