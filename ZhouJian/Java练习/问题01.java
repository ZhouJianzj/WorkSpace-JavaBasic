package Java练习;

class F
{
	public static void main(String[] args)
	{
		System.out.println("��ӭʹ�ñ�ϵͳ \n˵����\n1�������� \n2�������� \n3������  \n4����Ů");

		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("�����뵱ǰ����");
		int  tianQi=s.nextInt();  // ��������
	
		System.out.println("�������Ա�");
		int   sex=s.nextInt();    //�����Ա�

		String  str="����������ݲ��Ϸ��������뿴˵��";
		String  stri="��һ�Ѵ�ɡ";
		String  strin="����ɹ˪";
		if (tianQi==1)
		{
			if (sex==3)
			{
				stri="��һ�Ѵ��ɡ";//������ִ�е�ʱ��û����� why?���
			}else if (sex==4)
			{
				System.out.println(stri);
			}else{
				System.out.println("��������Ա���ȷ");
			}
		}else if (tianQi==2)
		{	System.out.println("�����뵱ǰ�¶�");
			int weather=s.nextInt();
			if (weather>30)
			{
				if (sex==3)
				{
					strin="��һ����ɫī��";//��Ҳ��
				}else if (sex==4)
				{
					System.out.println(strin);
				}else{
					System.out.println("��������Ա���ȷ");
				}
			}else{
				System.out.println("��������¶ȴ���30��");
			}
		}else{
			System.out.println(str);
		}
	}
}
class A
{
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("����������");
		int  shuJu=s.nextInt();
		String  dengJi="һ��";
		if (shuJu>10)
		{
			dengJi="����";
		}
		System.out.println(dengJi);
	}
}