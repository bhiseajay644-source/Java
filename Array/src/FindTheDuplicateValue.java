
public class FindTheDuplicateValue {

	public static void main(String[] args) {
		long[] aadharIds= {123409872345l,869833290202l,928496422222l,123409872345l,
				960713892121l};
		boolean[] visited=new boolean[aadharIds.length];
		for(int i=0;i<aadharIds.length;i++) {
			if(visited[i]) {
				continue;
			}
			boolean isDuplicate=false;
			for(int j=i+1;j<aadharIds.length;j++) {
				if(aadharIds[i]==aadharIds[j]) {
					isDuplicate=true;
					visited[i]=true;
				}
			}
			if(isDuplicate) {
				System.out.println("Duplicate aadhar id= "+aadharIds[i]);
			}
		}
	}

}
