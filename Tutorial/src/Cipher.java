//package Hello;

import java.util.Scanner;

public class Cipher {
	private static int[] enc_key = { 6, 3, 0, 4, 5, 1, 2 }; // ������Կ
	private static int[] dec_key = { 2, 5, 6, 1, 3, 4, 0 }; // ������Կ

	public static void main(String[] args) {
		char[][] m = new char[2][7];
		char[][] c = new char[2][7];
		char[][] dec_m = new char[2][7];
		System.out.println("����������7��Ӣ���ַ������ģ�");
		try (Scanner scanner = new Scanner(System.in)) {
			m[0] = scanner.nextLine().toCharArray();
			m[1] = scanner.nextLine().toCharArray();
			for (int i = 0; i < 7; i++) {
				c[0][enc_key[i]] = m[0][i];
				c[1][enc_key[i]] = m[1][i];
			}
			for (int i = 0; i < 7; i++) {
				dec_m[0][dec_key[i]] = c[0][i];
				dec_m[1][dec_key[i]] = c[1][i];
			}
			System.out.println("�������ԭʼ����Ϊ��");
			System.out.println(m[0]);
			System.out.println(m[1]);
			System.out.println("���ܽ��Ϊ��");
			System.out.println(c[0]);
			System.out.println(c[1]);
			System.out.println("���ܽ��Ϊ��");
			System.out.println(dec_m[0]);
			System.out.println(dec_m[1]);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
