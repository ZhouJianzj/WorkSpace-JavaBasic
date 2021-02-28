package Java练习;

//ע�⣺��editplus���У�����Ϊ��ɫ�ı�ʾһ��������֣���������Javase��⵱���Դ���
//�����Զ�������������Ǻ�ɫ�ı�ʶ��
//��ʵJavaSE��⵱�е��Դ����࣬���磺String.class System.class��Щ�������Ҳ�Ǳ�ʶ��
//ֻҪ��������һ���Ǳ�ʶ��
class A//ֵ��˼���ȽϷ���
{
	public static void main(String[] args){
		int a =10;
		int b=20;
		int result=sum(a,b);//ִ��sum�������ҽ���sum�ķ���ֵresult
		System.out.println(result);
	}
	public static int  sum(int i,int j){
		int result=i+j;
		int num=10;
		int result1=divide(result,num);//ִ��divide�������ҽ��շ���ֵz���������int���ͱ���result 
		return result1;//
	}
	public static int divide(int x,int y){
		int z=x/y;
		int e=3;
		int result=chengFa(z,e);
		return result;//
	}
	public static int chengFa(int a,int b){
		int c=a*b;
		int f=1;
		int result=sum1(c,f);
		return result;
	}
	public static int sum1(int c, int f){
		int result=c+f;
		return result;
	}
}
class B
{
	public static void main(String[] args){
		int a=10;
		B.result(a);			//ִ�н����11
		System.out.println(a);  //ִ�н����10
		//�����������10,��Ϊ�������ڴ���䣬�ټ�û�з���ֵ���������a����10
		
		}
	public static void result(int a){
		a++;
		System.out.println(a);//������11
	}
}