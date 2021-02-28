package Java练习;

/*
�ڷ����ĵݹ���ã�
	1��ʲô�ǵݹ飿
		���������������
			a(){
				a();
			}
	2���ݹ��Ǻܺķ�ջ�ڴ��

	3��һ�³��������е�ʱ��ᱨ�����Ĵ���error
		java.lang.StackOverflowError
		ջ���������
		�������޷���أ�ֻ��һ�����������jvmֹͣ����

	4���ݹ�����н���������û�н�������һ���ᷢ��ջ�ڴ�����Ĵ���

	5���ݹ鼴ʹ�н�����������ʹ������������ȷ�ģ�Ҳ�п��ܷ���ջ�ڴ����������Ϊ�ݹ��̫����
*/	
class Recoursion//����Ƿ����ĵݹ�
{
	public static void main(String[] args){
		Recoursion.dosome();
	}
	//���µĴ���Ƭ����Ȼֻ��һ��
	//���ǿ��Ա��ظ��ĵ��ã�����ֻҪ�����þͻ���ջ�����·���һ���������ڴ�ռ�
	public static void dosome(){
		System.out.println("Hello");
		Recoursion.dosome();//��һ�д��벻������һ�оͲ���ִ��
		System.out.println("Hello World!");
	}
}
class RecoursionOne//��ʹ�õݹ���1-N�ĺ�
{
	public static void main(String[] args){
		int result=RecoursionOne.sum(10);
		System.out.println(result);
	}
	public static int sum(int n){
		int result=0;
		for (int a=1;a<=n ;a++ )
		{
			result=result+a;//����Ҳ����д��result+=a;s
		}
		return result;
	}
}
class RecoursionTwo//�õݹ�ķ������м��� 
{
	public static void main(String[] args){
		int result=RecoursionTwo.sum(4);
		System.out.println(result);
	}
	public static int sum(int n){
		if (n==1)//���ݹ鵽4+3+2+1��ʱ����ʱ����� �Ĳ㷽���ڴ棬��ʱ��return 1;�������ǵ��ĸ�sum���� 
		//n=1��ʱ���������½������ͽ�����������������
		//
		{
			return 1;
		}else {
			return n+sum(n-1);
		}
	
	}
}
class Recoursion1
{
	public static void main(String[] args){
		int result=1;
		int a=5;
		for (a=5;a>0 ;a--)
		{
			result=result*a;
		}
		System.out.println(result);
	}

}
class Recoursion11
{
	public static void main(String[] args){
		int result =Recoursion11.method(5);
		System.out.println(result);
	}
	public static int method(int a){
		if (a==1)
		{
			return 1;//�������ǲ�a=1��ʱ�򷵻�ֵ��1
		}
			return a*method(a-1);//a!=1��ʱ�򷵻�ֵ��a+sum(a-1)��������ִ��
		
	}
}