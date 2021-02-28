package Java练习;

class A
{	
	public static void main(String[] args){
		 int shuRu1=A.shuRu();//���յ�һ������ֵ���ҷ�����
		
		 int shuRu2=A.shuRu();//���صڶ������ֵ
		 int sum=A.sum(1,1);//��ͷ���ֵ

		 A.chengFa(shuRu1,shuRu2,sum);//�ɹ��Ĺؼ�
		
	}
	public static int  sum(int a,int b){
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);
		return c;
	}
	public static int shuRu(){
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("����������");
		int c=s.nextInt();
		return c;
	}
	public static void chengFa(int a,int b,int c){
		int d=a*b*c;//����˷�
		System.out.println(a+"*"+b+"*"+c+"="+d);
	}  
	
	
}