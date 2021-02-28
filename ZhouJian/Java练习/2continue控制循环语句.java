package Java练习;

/*
	continue����ѭ������break��������
	break����ʾ��ִ��ѭ��������
	continue����ʾ��ִ�����������ģ�ֱ�ӽ�����һ��ѭ������ִ��
		
*/
class A
{
	public static void main(String[] args)
		{
			for (int a=0;a<=10;a++ )
			{
				if(a==5)
				{
					break;
				}
			System.out.println(a); //0 1 2 3 4 
			}
		}
}
class B
{
	public static void main(String[] args)
		{
			for (int a=0;a<=10;a++ )
			{
				if(a==5)
				{
					continue;
				}
				System.out.println(a);//0 1 2 3 4 6 7 8 9 10
			}
		}
}