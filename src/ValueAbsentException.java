public class ValueAbsentException extends Throwable {

	/**
	* This class is only for OptionalDemo
	*/
	private static final long serialVersionUID = 1L;

	public ValueAbsentException() {
		super();
	}

	public ValueAbsentException(String msg) {
		super(msg);
	}

	@Override
	public String getMessage() {
		return "No value present in the Optional instance";
	}
}