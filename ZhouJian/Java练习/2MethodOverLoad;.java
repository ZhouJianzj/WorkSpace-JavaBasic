package Java练习;

/*
	��������overload
		1��ʲôʱ����ʹ�÷������� 

			*�������Ƶ�ʱ�򣬾����ܵ��÷�������ͬ
			�����ܲ�ͬ/�����Ƶ�ʱ�򣬾����ܵ��÷�������ͬ��

		2��ʲô��������֮�󹹳ɷ�������

			*��ͬһ���൱��
			*��������ͬ
			*�����б�ͬ��
				-������ͬ
				-˳��ͬ
				-���Ͳ�ͬ
		3���������غ�ʲô�й�ϵ����ʲôû�й�ϵ
			*�������غͷ�����+�����б��й�
			*�������غͷ���ֵ�����޹�
			*�������غ����η������޹�
		
*/		
class A
{
	public static void main(String[] args){}
	public static void sum(){}
	public static void sum(int a){}
	public static void sum(int a,int b){}
	//public static double sum(){}
	//public static int sum(){}
	//�������У����������뷵��ֵ���������޹أ������ʱ����뱨��
	//sum(){}
	//public static void sum(){}
	//����ָ���Ƿ����������������б��޹�
}
class MethodOverLoad//�������ص�Ӧ��
		//���԰�����װ��������֮���.class�ļ�ȥ����ļ�������Ա����ã����õķ�����  ����.������ ���ǳ���Ҫ��

{
	public static void p(byte b){
		System.out.println(b);
	}
	public static void p(short b){
		System.out.println(b);
	}
	public static void p(int b){
		System.out.println(b);
	}
	public static void p(long b){
		System.out.println(b);
	}
	public static void p(float b){
		System.out.println(b);
	}
	public static void p(double b){
		System.out.println(b);
	}
	public static void p(boolean b){
		System.out.println(b);
	}
	public static void p(char b){
		System.out.println(b);
	}
	public static void p(String b){
		System.out.println(b);
	}
}


										