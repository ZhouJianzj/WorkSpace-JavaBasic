package Java练习;

class A
{
	public static void main(String[] args)
	{
		int a=10;
		int b=11;
		char f='\t';
		double c;
		System.out.println(c=a+b);
		System.out.println(a);
		System.out.print(f);
		System.out.println(b);
		
	}
}
class B
{
	public static void main(String[] args)
		{
			char i='\u0061';
			System.out.println(i);
			char z='a';
			System.out.println(z);
		}
}
class C
{
	public static void main(String[] args)
	{
		double grade=55;
		String   a="�ÿ����ĳɼ�Ϊ���ϸ�";
		
		if (grade>=90 && grade<=100)
		{
			a="�ÿ����ĳɼ�Ϊ����";//������֮ǰû����������ʱ������ֱ���������ᱨ��
		}
		System.out.println(a);
		
    }
}


class D
{
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("�������������");
		int   num=s.nextInt();
		String  year="Ӥ��";
		if (num>150 || num<0)
		{
			year="����������䳬����������";
		}else if (num>=56)
		{
			year="����";
		}else if (num>=36)
		{
			year="����";
		}else if (num>=19)
		{
			year="����";
		}else if (num>=11)
		{
			year="������";
		}else if (num>=6)
		{
			year="�ٶ�";
		}
		System.out.println(year);
	}
}
class F //����ǿ�� \n ���÷�����û��������ʱ��ֱ��ʹ��Ҫ�� �������������Ϊ�ַ������ݵ�ʱ��Ҫ��
{
	public static void main(String[] args)
	{
		System.out.print("��ӭʹ�ñ�ϵͳ"+'\n' +"������Ϊ��򵥵Ľ���һ�±�ϵͳ");
	}
}

class G
{
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);

		System.out.println("��ӭʹ�ñ�ϵͳ");
		System.out.println("˵����1��ʾ���� \n0��ʾ���� \n1��ʾ�� \n0��ʾŮ \n�¶�Ϊ���ֱ�ʾ");

		System.out.println("�����뵱ǰ����״��");
		int weather=s.nextInt();
		System.out.println("�������Ա�");
		int sex=s.nextInt();
		if (weather==1)
		{
			if (sex==1)
			{
				System.out.println("���Ŵ�һ�Ѵ��ɡ");
			}else if (sex==0)
			{
				System.out.println("���Ŵ�һ��С��ɡ");
			}else{
				System.out.println("��������Ա���ȷ");
			}
		}else if (weather==0)
		{   System.out.println("�����뵱ǰ�����¶�");
			int tem=s.nextInt();
		
			if (tem>30)
			{
				if (sex==1)
				{
					System.out.println("��һ����ɫī��");
				}else if (sex==0)
				{
					System.out.println("����ɹ˪");
				}else{
					System.out.println("��������Ա���ȷ");
				}
			}else{
				System.out.println("����ĵ�ǰ�¶ȵ���30��");
			}
		}else{
			System.out.print("�������������ô����");
		}
	}
} 
