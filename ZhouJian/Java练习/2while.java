package Java练习;

/*
  whileѭ�����
  		1��whileѭ�������﷨�ṹ��
			while(�������ʽ)
			{
				ѭ����;
			}
		2��while ѭ��ִ��ԭ��
				���жϲ������ʽ�����
					-true
						ִ��ѭ����
							�жϲ������ʽ
								-true
									ִ�в������ʽ
										.....
								-false
									����ѭ����
					-false
					    ����ѭ����
	3��whileѭ�����ѭ��������
		0~N��
		ע��whileѭ����Ĵ�������Ϊ0
								
*/
class A
{
	public static void main(String[] args)
	{
		//while (true)
		//{
			//System.out.println("S");//��������true��ѭ��
		//}
		//System.out.println(SS);//���뱨��
		int b=10;
		int c=1;
		while (b>c)//���벻�ᱨ��
		{
			System.out.println("D");
		}
		System.out.println("F");//��ִ�е�ʱ��ֻҪ�����while��true���µ�System.out.println();�Ͳ���ִ�С�
	}
}