public class Practice {
	static int[]list=new int[100];
	static int n=5;
	static int r=3;
	public static void main(String[] args) {
		perm(n,r);
	}
    public static void perm(int m,int k){
    	for(int i=m;i>=k;i--){
    		list[k-1]=i;
    		if(k>1){
    			perm(i-1,k-1);
    		}
    		else{
    			for(int j=r-1;j>=0;j--){
    			System.out.print(list[j]);
    			}
    			System.out.print("\n");
    		}
       
    	}
    
  }

}