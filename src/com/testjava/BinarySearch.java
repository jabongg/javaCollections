/**
 * Created by ejangpa on 11/25/2016.
 */
public class BinarySearch {
    public static void main (String args []) {
        int a [] = {1, 2, 13, 34, 42, 59, 60, 67, 78, 89, 902 };
        int toSearch = 89;
		binarySearch(a, toSearch);

    }
    static void binarySearch(int [] a, int toSearch){
        int mid = (a.length + 1)/2;
		int index = -1;
        for( int i = 0; i < a.length; i++) {
			if(toSearch < a[mid]) {
				int start;
				int end;
				start = a[0];
				end = mid;
				if(toSearch == mid) {
					index = i;
					break;
				}
				//binarySearch(a,toSearch);
				
			}
			
			else {
				int start;
				int end;
				start = mid;
				end = a[a.length-1];
				if(toSearch == mid) {
					index = i;
					break;
				}
				//binarySearch(a,toSearch);
			}
			
        }		
					System.out.println(index);
    }
}
