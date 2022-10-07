package br.ucsal.bes.ed2022.atividade0310.mdcrecursivo;

import java.util.Scanner;

public class MdcRecursivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int r = 0;
		int resultado = CalculaMDC(m, n, r);
		System.out.println(resultado);
		sc.close();
	}

	public static int CalculaMDC(int m, int n, int r) {
		r = m % n;
		m = n;
		n = r;
		if (r == 0) {
			return m;
		}
		return CalculaMDC(r = m % n, m = n, n = r);
	}

}
