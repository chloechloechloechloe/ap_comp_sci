/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        int [] arr = {5, 5, 7, 7 , 7, 2, 9, 9};
        
        for(int i = 0; i < arr.length-1; i++){
            System.out.println(arr[i] + " ");
        }
        int x = 8;
        for(int i = 0; i < arr.length-1; i++){
            if(x == arr[i]){
                System.out.println(i);
            }
        }
	}
	
	for(int i = 0; i < arr.length-1; i++){
	    if(arr[i] + arr[i+1] == 5){
	        System.out.println("Consect at" + 1 + " and " + (i+1));
	    }
	}
	
}