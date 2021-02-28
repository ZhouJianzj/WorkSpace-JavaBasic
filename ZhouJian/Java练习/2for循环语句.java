package Java练习;

/*
		1��ѭ���ṹ��
			for
			while
			do..while
		2����ǰ��Ҫ˵forѭ��
			�﷨�ṹ��
				for(��ʼ���ʽ; �������ʽ; ���±��ʽ)
				{
					����Ĵ��루ѭ���壩
				}
		3��for����ִ��ԭ��
		  3.1 ��ʼ���ʽ �������ʽ ���±��ʽ�����Ǳ����
		  3.2 ��ʼ�����ʽ����ִ�У���������forѭ������ִֻ��һ��
		  3.3 �������ʽ����ʽtrue����false
		  3.4 forִ�еĹ��̡������Գ�ʼ  �ڲ����ж�  true��ִ��ѭ����  Ȼ��ִ�и��±��ʽ   �ٲ����ж�   true��ִ�б��ʽ   false�ͽ���ѭ����
			*��ִ�г�ʼ���ʽ������ִֻ��һ��

			*�������ʽ�Ľ����true����false
				-�������ʽtrue
					*ִ��ѭ����
					*ִ�и��±��ʽ
					*�жϲ������ʽ
						-�������ʽtrue
							*ִ��ѭ����
							*ִ�и��±��ʽ
							*�жϲ������ʽ
							....
							....
						-�������ʽfalse
							*ѭ���˳�
				-�������ʽfalse
					*ѭ���˳�
	ʾ��ͼ��
								    -- false  ---����ѭ��

							------------------------------------------------------------------------
	  ��ʼ���ʽ-----�����жϡ�*��---- true						----ִ�и��±��ʽ�ٽ���----�����жϡ�*��
								              ---ִ��ѭ����----
*/
class A
{
	public static void main(String[] args)
	{    //int  a=10;
		for (int a=10;a<12 ;a+=1 )//����int a=10����û��
		{
			System.out.println(a);//���Ϊ10 11 ����<=�����Ϊ10 11 12 
		}


		for (int a=0;a<=10 ;a+=1 )
		{
			System.out.println(a);//0---10
		}
		for (int a=0;a<10 ;a+=1 )
		{
			System.out.println(a);//0--9
		}
		//for(int a=0;a<10;)
		//{
			//System.out.println(a);//��ѭ��
		//}
		for(int a=0;a<10;)
		{
			System.out.println(a);//0--9
			a++;
		}
		for(int a=0;a<10;)
		{
			a++;
			System.out.println(a);//1--10

		}

		
	}
}
class LeiJia//��0��100�������ۼӺ͡�
{
	public static void main(String[] args)
	{
		int sum=0;
		for(int a=1;a<=100;a+=2)
		{
			//int sum=0;������������sum�����������Ļ�������ÿһ�ε���͹���
			sum=sum+a;//�ۼ�����
			//Sytem.out.println(sum);����������������Ļ��ͻ���1 4 9 16...
		}
		System.out.println("sum====>"+sum);
	}
}
class OuShuLeiJia
{
	public static void main(String[] args)
	{
		int sum=0;
		int a=2;
		if (a%2==0)
		{
			for(a=2;a<=100;a+=2)
			{
				sum=sum+a;
			}
			System.out.println(sum);
		}else{
			System.out.println("�������������");
		}	
	}
}
class QianTaoXunHuan
{
	public static void main(String[] args)
	{
		for (int a=0;a>10;a+=1 )
		{
			for (int b=0;b<3;b+=1 )
			{
				System.out.println(b);
			}
		}
	}
}
class ChengFaBiao//ԭ���������ִ��һ��  ����ѭ��ִ��9�� 1*1  1*2 1*..9
{
	public static void main(String[] args)
	{
		for (int a=1; a<=9;a++ )//��ѭ��9��
		{
			for(int b=1;b<=a;b++)//��ѭ��9��
			{
				System.out.print(a+"*"+ b + "=" + (a*b)+" ");//ϸ��ln  ÿһ�����ʽ����Ҫ���У��� �������ʾÿһ�����ʽҪ�տ�
			}
			System.out.println();//ûһ��a�еĻ���
		}
	}
}


//�κ���ҵ ���1000֮���
/*class SuShu  
{
	public static void main(String[] args)
	{
		int b=2;
		int c=3;
		int d=5;
		int e=7;
		for(int a=1;a<=100;a++)
		{
			if (a%b!=0 & a%c!=0 & a%d!=0 & a%e!=0   )
			{
				System.out.println(a);
			}
			
		}
	}
}*/
class AA
{
	public static void main(String[] args)
	{
		/*
		ʵ�ֵ�˼·

			7/1������Ҫ��
			7/2
			7/3
			7/4
			7/5
			7/6
			7/7������Ҫ��
		*/
		int a=7;
		boolean suShu=true;
		for(int b=2;b<a;b++)//�����ʾ����1-7֮�����������1��7
		{
			if(a%b==0)//�ܱ����ǵ��е��κ�һ������û������������
			{
				suShu=false;
				break;
			}
		}
		System.out.println(suShu?a+"������":a+"��������");//��ѧ��������������ж������  ���������� �� true ��false
	}
}
class AAA���ǳ��ؼ���
{
	public static void main(String[] args)
	{
		int count=0;
		for (int a=2;a<=100;a++)//�����ʾ����һ����
		{
			boolean suShu=true; //���������һ���ֱ�ʾ��ʾ����ж�
			for(int b=2;b<a;b++)
				{
					if(a%b==0)
						{
							suShu=false;
							break;
						}
					
				}
			if(suShu)//����Ҫ��ֱ�����Ϊa�Ļ�����2 3 4 5 ....����
			//Ҫ�����ΪSystem.out.println(suShu);�����true����false 
			{
				count++;//ͳ��ѧ
				System.out.print(a+" ");
				if(count%8==0)//ÿ8����һ��
				{
					System.out.println();//if(count==8)
										//{
										//	  System.out.println();
										//    count=0;//��ʾ����
										//}
				}
			}
		}
	}
}
		