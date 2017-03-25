package Vault;

public class Spy {
	public static void main(String[] args) {
		SecertVault vault = new SecertVault();
		Spy JamesBond = new Spy();
		System.out.println(JamesBond.crackvault(vault));
	}

	String crackvault(SecertVault vault) {
		int x = 0;
		while (x < 9999999) {
			if (!(vault.tryCode(x++).equals("fail"))) {
				return vault.tryCode(x - 1);
			}

		}
		return "failed";

	}
}
