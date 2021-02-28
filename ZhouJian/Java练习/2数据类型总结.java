package Java练习;

/*�������͵�ת����ֻ��Boolean�����Ͳ����ԣ��������������Ͷ�����ת��
	1��С�����������ת����ϵͳ�Զ�ת����������С���������˳��
	byte < short < int < long < float < double
			char
	ס���κεĸ���������������������������
		char��short�ı�ʾ����������ͬ��chart����ȡ�������
		char i='a';  char i =97;
	2����������С����ת��Ҫ��ǿ��ת���� ����Ҫ��ʧ����
	3������������ֵû�г���byte short char ��ȡֵ��Χ������ֱ�Ӹ�ֵ��byte 
		short char���ͱ������и�ֵ��
	4��byte short char ��������ʱ�������ת����int�����������㡣
	5�������������ͽ��л�������ʱ����ת�����������������������㡣
*/
class A
{
	public static void main(String[] args)
	{
		int i=100;
		double ii=i;//��Сת��
		System.out.println(ii); //100.0

		long b=200;
		int bb=(int)b; //�Դ�תС
		System.out.println(bb);
		int bbb=300;
		long bbbb=300L;
		System.out.println(bbbb);//����int bb=200l
		
		//�缶
		long e=10;
		byte f=(byte)(e/3);//byte=byte e/3;�����ᱨ��
		System.out.println(f);


		double a=10/3;//����int�����͵����㻹��int������ֻ������һ����int������ת����double����
		System.out.println(a);//3.0
		double aa=10.0/3; //double���ͺ�int���ͽ��������ʱ��ȡ��������
		System.out.println(aa);//3.33333...

		/*
		�������͵�ת��
		*/
	}
}