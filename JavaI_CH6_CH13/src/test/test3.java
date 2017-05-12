package test;

public class test3 {
	public static void main(String[] args) {
		int[][][] z=new int[3][3][3];
		for(int i=0;i<z.length;i++){
			for(int j=0;j<z[i].length;j++){
				for(int k=0;k<z[i][j].length;k++){
					z[i][j][k]=(int)(Math.random()*27+1);
				}
			}
		}
		for(int[][] i:z){
			for(int[] j:i){
				for(int k:j){
					System.out.print(k+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}