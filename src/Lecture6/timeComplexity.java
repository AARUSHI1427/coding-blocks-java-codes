package Lecture6;

public class timeComplexity {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int answer=power(2,5);
//		System.out.println(answer);
		SOE(50);
	}
	public static int power(int base,int pow){
		if(pow==0){
			return 1;
		}
		
			int ans=power(base,pow/2);
			if(pow%2==0){
				return ans*ans;
			}else{
				return base*ans*ans;
			}
			
		
	}
	public static void SOE(int n){
		boolean[] primes=new boolean[n+1];
		for(int i=0;i<primes.length;i++){
			primes[i]=true;
		}
		int n2test=2;
		while(n2test*n2test<=n){
			if(primes[n2test]==true){
			for(int j=n2test;j*n2test<n;j++){
				primes[j*n2test]=false;
			}
			}
			n2test++;
		}
		for(int i=2;i<primes.length;i++){
			if(primes[i]==true){
				System.out.println(i);
			}
		}
	}
}
