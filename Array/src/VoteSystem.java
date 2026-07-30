
public class VoteSystem {

	public static void main(String[] args) {
		int[] votes= {1,2,3,4,1,2,4,3,2,2,3,3,4};
		
		for(int c=1;c<=4;c++) {
			int count=0;
			for(int vote: votes) {
				if(c==vote) {
					count++;
				}
			}
			System.out.println("The number of votes of contenstant "+c+" is "+count);
		}
	}

}
