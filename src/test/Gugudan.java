package test;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		for(int i = 1; i < 9; i++) {
			if(i%2!= 0) continue;
			for(int j = 1; j <= 9; j++) {
				if(j > i) break;
				System.out.println(i+"X"+j+"="+(i*j));
			}
			System.out.println(" ");
		}
	}

}
