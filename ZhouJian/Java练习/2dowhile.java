package Java练习;

/*
 do  while ѭ��
 	�﷨��
		do
		{
			ѭ����;
		}while(�����ж�)
*/
class A
{
	public static void main(String[] args)
	{
		int a=10;
		do
		{
			System.out.println(a);
		}
		while (a>100);
		System.out.println("=======================================�� ");
		while (a>100)
		{
			System.out.println(a);
		}
		System.out.println("========================================��");
		int b=1;
		do
		{
			System.out.print(b+" ");
			b++;
		}
		while (b<=10);
	}
}