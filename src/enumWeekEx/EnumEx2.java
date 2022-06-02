package enumWeekEx;

public class EnumEx2 {
	public static void main(String[] args) {
		LoginResult result = LoginResult.FAIL_PASSWORD;
		if(result == LoginResult.SUCCESS) {
		} else if(result == LoginResult.FAIL_ID) {
		}else if(result == LoginResult.FAIL_PASSWORD) {
		}
	}
}
