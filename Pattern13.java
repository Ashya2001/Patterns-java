
class Pattern13{
    public static void main(String[] args){

int n=5;
		int m=5;
		for(int i=1;i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(i==j || i+j == n+1) {
					System.out.print("X ");
				}else {
					System.out.print("O ");
				}
			}
			System.out.println();
		}
    }
}