package Vault;

public class SecertVault {
	int SecretCode = 281832;
	String Secertmessage = "Hello";

	public String tryCode(int guess) {
		if (guess == 281832) {
			return Secertmessage;
		}
		return "fail";
	}
}
