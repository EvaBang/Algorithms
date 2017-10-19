import java.util.Arrays;
import java.util.Collections;

class NoOvertime {
	public int noOvertime(int no, int[] works) {
		int result = 0;
		while(no != 0) {
			Arrays.sort(works,Collections.reverseOrder()); //Decrese order
			works[0] -= 1;
			no--;
		}

		for ( int i = 0 ; i < works.length ; i ++ ) {
			result += Math.pow(works[i],2);
		}
		return result;
	}

	public static void main(String[] args) {
		NoOvertime c = new NoOvertime();
		int []test = {4,3,3};
		System.out.println(c.noOvertime(4,test));
	}
}
