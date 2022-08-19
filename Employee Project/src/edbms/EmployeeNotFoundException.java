package edbms;

class EmployeeNotFoundException extends RuntimeException {
	private String message;
	
	EmployeeNotFoundException(String message){
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return message;
	}
}
