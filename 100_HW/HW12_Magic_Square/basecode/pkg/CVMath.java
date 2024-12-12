package pkg;

public class CVMath {		
	public static boolean perfectSquare(int x){
		int sqaure = (int)Math.sqrt(x);
		return (sqaure*square == x);
	}
	}
	
public static boolean consecutive(int x){
	int sum = 0;
	for(int i = 0; sum < x; i++){
		sum += i;
		if(sum == x){
			return true;
		}
	}
	return false;
}

public static void specialSquare(int n){
	int counter = 0;
	int x = 1;
	while (counter < x){
		if(perfectSquare(x) && consecutive(x)){
			System.out.println(x);
		counter ++;
		}
	x++;
	}
}
