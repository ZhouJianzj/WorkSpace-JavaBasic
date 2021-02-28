package Java练习;

/*
��Ԫ�����/��Ŀ�����/���������
       1�� �﷨����
	        �������ʽ �����ʽ1 �����ʽ2
	   2����Ԫ�������ִ��ԭ��

*/
class A
{
	public static void main(String[] args)
	{	
		boolean	 sex=false;
		   char  c=sex ? 'Ů' : '��'; 
		System.out.println(c);
				 sex=true;
				 c=sex? 'Ů':'��';
		System.out.println(c);
	}
}