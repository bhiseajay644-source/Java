
public class FindingDuplicateMobileNumber {

	public static void main(String[] args) {
		long[] mobile= {9284964222l,8698332902l,9607138921l,7499278982l,9284964222l};
		
		boolean[] visited=new boolean[mobile.length];
		
		for(int i=0;i<mobile.length;i++) {
			if(visited[i]) {
				continue;
			}
			boolean isDuplicate=false;
			for(int j=i+1;j<mobile.length;j++) {
				if(mobile[i]==mobile[j]) {
					isDuplicate=true;
					visited[i]=true;
				}
			}
			if(isDuplicate) {
				System.out.println("The duplicate mobile number= "+mobile[i]);
			}
		}
	}

}
