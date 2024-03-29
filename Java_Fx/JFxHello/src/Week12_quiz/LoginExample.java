package Week12_quiz;

public class LoginExample {
	public static void main(String[] args) {

		System.out.println("시도 1");
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("시도 2");
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("시도 3");
		try {
			login("blue", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		if (!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}

		if (!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}

		System.out.println("로그인 되었습니다");
	}
}
