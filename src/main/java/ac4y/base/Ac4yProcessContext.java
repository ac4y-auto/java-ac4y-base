package ac4y.base;

public class Ac4yProcessContext {
		
	public Ac4yProcessContext() {
		
	}
	
	public Ac4yProcessContext(
				Object external
				,Object internal
			) {
		
		setExternal(external);
		setInternal(internal);
		
	}
	
	protected Object external;
	protected Object internal;
	
	public Object getExternal() {
		return external;
	}
	
	public void setExternal(Object external) {
		this.external = external;
	}
	
	public Object getInternal() {
		return internal;
	}
	
	public void setInternal(Object internal) {
		this.internal = internal;
	}
	
}