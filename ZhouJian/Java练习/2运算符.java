package Java练习;

class A     //����������ȼ�����ȷ���Ŀ��Լ����š�
{
	public static void main(String[] args)
		{	/*double a=21;
			int b=10;
			double z=a/b;
			System.out.println(a+b);//�ӷ�  31
			System.out.println(a-b);//����	11
			System.out.println(a*b);//�˷�	210
			System.out.println(a/b);//����	2
			System.out.println(a%b);//ȡ���� ������1
				
				//++a    a++ �Լ�һ

			                        //++i --i i++ i--������Ƚϳ���
			int y=20;
				++y;
			System.out.println(y);//21
				y++;              //int x=20; x++; System.out.println(x)Ϊ21
			System.out.println(y);// 22
			*/
				/*int i=10;
			System.out.println(i);//10  int x=i
			System.out.println(i++);//10  ����Ϊ1++ int x=i 1++

			System.out.println(i++);//11 ����Ϊ2++ int x=i 1++ 2++
			System.out.println(i++);//12 ����Ϊ3++ int x=i 2++ 3++
			*/int k=10;
			System.out.println(k);  //10
			System.out.println(++k);//11
			int c=10;
			int d=c ++;
			System.out.println(c);  //11
			System.out.println(d);  //10
			System.out.println(d ++);	//10 ע�������dҪ��û��++�Ļ������ֵ����10
			System.out.println(d ++);	//11
			//������������
			int e=10;
			int f=++ e;
			System.out.print(e); //11
			System.out.print(f); //11
		

		}
}
class B
{
	public static void main(String[] args)
	{
		int z=100;
		int v=z ++;
		System.out.println(z); //101
		System.out.println(z ++);//101
		System.out.println(v ++);//100
		System.out.println(v);//101
	}
}