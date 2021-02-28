package Java练习;

class A
{
	public static void main(String[] args)
	{
		char c='\n';
		System.out.print("Hello");
		System.out.print(c);
		System.out.println("World");
		System.out.println("I \nLove \nYou");
	}
}


class B
{
	public static void main(String[] args)
		{
			char i='\u0061';
			System.out.println(i);   //���Ϊa
			char ii='\'';
			System.out.println(ii);  // '
			     iii='\\';
		    System.out.println(iii);  // \
		}
}
/* ע�� 
  JDK�е�native2ascii.exe���Խ�����ת����unicode������ʽ