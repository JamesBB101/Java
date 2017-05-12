package OOP;


public class ExerciseVI {

	public static void main(String[] args){
//		student st=new student();
//		int playtimes=2;
//		int studytimes=3;
//		st.play(playtimes);
//		st.study(studytimes);
		
		
		student st=new student();
		 
		 st.score=90;
		 st.play(3);
		 st.study(6);
		 System.out.println(st.score);

	}
	
}
class student{
	
//    int score;
//	public void play(int hr){
//		System.out.println("play"+hr+" hr, score"+(score-hr));
//	}
//	public void study(int hr){
//		System.out.println("study"+ hr+"hr, score+"+(score+hr));
//    }

int score;
	
	public void play(int hours){
		score-=hours;
	}
    public void study(int hours){
    	score+=hours;
	}
}
