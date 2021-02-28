package Java练习;

/*
    ����java�еġ�+�������

	     1��+�������Java�����е��������ã�
		   *�ӷ����㣬���
		   *�ַ�������������
		 2��
		   *ֻ��������ȫ�����ֵ�ʱ��ſɱ�ʾΪ�ӷ�
		   *��һ�����ַ���һ��������ʱ�����������ַ�
*/
class A
{
	public static void main(String[] args)
	{   int a=10;
		int b=11;
//Ҫ�����Ϊa+b=21����ʽ
        //System.out.println(a+b);���Ϊ21 ��������Ҫ�Ľ��
		//System.out.println("a+b=21"); ��������ַ�����ʽ�ľ�̬��
		System.out.println(a+"+"+b+"="+(a+b)); // ������Ƕ�̬��a+b=21����ʽ
		a=200;
		b=100;
		System.out.println(a+"+"+b+"="+(a+b));// ����ģ����ż���ʾ������ֱ�ʾ���ӷ�
		String username="zhoujian";
		System.out.println("��ӭӢ��"+username+"�ع�");
	}
}
class B
{
	public static void main(String[] args)
	{
		boolean a=true;
		boolean b=false;
		if(a)
		{
			System.out.println("��ϲ���½�ɹ�");
		}
		else
		{
			System.out.println("�Բ��𣬵�½ʧ��");	
		}
	}
}