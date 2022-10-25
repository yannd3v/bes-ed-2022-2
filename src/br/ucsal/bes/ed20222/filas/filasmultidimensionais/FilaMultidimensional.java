package br.ucsal.bes.ed20222.filas.filasmultidimensionais;



public class FilaMultidimensional {
	
	public static void main(String[] args) {
		
//		int[][] num = {{1,4}, {3}, {9,8,7}};
		
		int[][][] nums = new int[3][2][2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				for (int j2 = 0; j2 < nums[j].length; j2++) {
					System.out.println(nums[i][j][j2] + "");
				}
			}
		}
		

		
		
		
		
	}
}
