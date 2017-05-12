package HelloMethod;

public class MethodArray {

	public static void main(String[] args) {
		int[][] x=getRandomArray();
		int[][] y=getRandomArray();
		int[][] z=new int[3][3];
		for(int i=0;i<z.length;i++){
			for(int j=0;j<z[i].length;j++){
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		showArray(x);
		showArray(y);
		showArray(z);

	}
	
	public static int[][] getRandomArray(){  //不塞值可減少一個變數//
		int[][] RandomArray=new int[3][3];
		for(int i=0;i<RandomArray.length;i++){
			for(int j=0;j<RandomArray[i].length;j++){
				RandomArray[i][j]=random();
			}
		}
		return RandomArray;
	}
	public static int random(){
		return (int)(Math.random()*31);
	}
	
	public static void showArray(int[][] array){
		for(int[] row:array){
			for(int value:row){
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		System.out.println("==================");
	}

}
