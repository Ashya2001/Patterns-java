
class Pattern22{
    public static void main(String[] args){


int n=5;
		int num=2;
		
		for(int i=1;i<=n; i++) {
			for(int j=1;j<=i; j++) {
				

				System.out.print(num -i +" ");
				num++ ;
			}
			System.out.println();
		}
    }
}
