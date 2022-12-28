// return object of error 

class Err {
	String msg;
	int severity;

	Err(String m, int s) {
		msg = m;
		severity = s;
	}
}

class ErrorInfo {
	String[] msgs = { "Fail input", "Fail output", "No needed space in drive", "Index out of bond" };
	int[] howbad = { 3, 3, 2, 4 };

	Err getErrorInfo(int i) {
		if (i >= 0 & i < msgs.length) {
			return new Err(msgs[i], howbad[i]);
		} else {
			return new Err("Non-existent error code!", 0);
		}
	}
}

public class ErrInfo {
	public static void main(String[] args) {
		ErrorInfo err = new ErrorInfo();
		Err e;

		e = err.getErrorInfo(2);
		System.out.println(e.msg + " level: " + e.severity);

		e = err.getErrorInfo(19);
		System.out.println(e.msg + " level: " + e.severity);

	}
}

