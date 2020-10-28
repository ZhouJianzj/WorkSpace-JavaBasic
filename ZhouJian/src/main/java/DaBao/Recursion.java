package DaBao;

class Recursion{		//一下方法没有使用递归
	public static void main(String[] args){
		int result = recursion(2);
		System.out.println(result);
	}
	
	public static int recursion(int n){
		int result = 1;
		for(int a = n; a> 0;a--){
			result = result * a;
		}
		return result;
	}
}