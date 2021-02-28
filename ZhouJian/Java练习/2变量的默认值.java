package Java练习;

class A
{	 static int k; //������û�и�ֵ�Ļ�Ҫ����static����Ȼcompile��ʱ��ᱨ���ھ����Ҳ�����̬��k�����
					//û�и�ֵ��Ĭ����������Ϊ0
	public static void main(String[] args)
		{	int i=1000;
		    //int k=1;
			//���int k;��������Ļ� compile��ʱ��ᱨû�и�ֵ�Ĵ���
			//int i=2;�����������ʾ��������������������������������
			//i=2;������ȷ
			 i=2;
			System.out.println(i);
			System.out.println(k);
		}
}