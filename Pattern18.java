class Pattern18{
    public static void main(String[] args){


int n=7;
		int m=7;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(i==(n+1)/2 || j==(m+1)/2 || i==1 && j>=4   || j==1 &&  i<=4 ||i==n && j<=4 ||j==m && i>=4 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    }
}