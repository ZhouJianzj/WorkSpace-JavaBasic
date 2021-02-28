package Java练习;

/*
�߼���������������㣩��
   &			�߼���	���������Ӷ���true�������true��
   |			�߼���	�����ߵ�����ֻҪ��һ����true�������true��
   !			�߼���	 ��ȡ����!false����true����true����flase��
   ^			�߼����	�����ߵ�����ֻҪ��һ���������true��

   &&			��·��
   ||			��·��

ע�⣺�߼�����Ҫ�����ߵ����Ӷ��ǲ������ͣ��߼�����������Ҳ��һ���������͡�
      ��·����߼�������յ���������һ���ģ�ֻ������·�����ֶ�·����
*/
 //����
 class A
 {
	 public static void main(String[] args)
	 {
		int x=10;
		int y=8;
		System.out.println(x<y & y>x);	//flase
		System.out.println(x>y & y>x);	//flase
		System.out.println(x>y & y<x);	//true
		System.out.println(x<y | y>x);	//flase
		System.out.println(x>y | y>x);	//true
		System.out.println(x>y | y>x);	//true
		System.out.println(! (x<y));	//true�����ﲻ�����ű���ᱨ���
		System.out.println(! (x>y));	//flase
		System.out.println(x<y ^ y>x);	//true
		System.out.println(x>y ^ y>x);	//true
		System.out.println(x>y ^ y<x);	//flase
	 }
 }
	class B
	{
	public static void main(String[] args)
		{
		int t=10;
		int y=8;
		System.out.println(t<y & ++t>y);//flase
		System.out.println(t);          //11���߼���һֱִ����
		
		System.out.println(t<y && ++t>y);//flase
		System.out.println(t);			//11�����t�������t=11,
										//��·������++x�ͷ�����·�ˣ��Ͳ�ִ���ˣ�Ҫ��ִ�����������12��
		//��·��Ƚϳ���
		//ʲô����»ᷢ����·��Ͷ�·�롣
		
		//1.��·��ķ���ֻҪ��һ����true���ͻᷢ����·��
		//2.��·��ķ���ֻҪ��һ����flase,�ͻᷢ����·��
		
		//��չ
		System.out.println(t<y & t++<y);
		System.out.println(t);//     11+1=12
	 }
 }