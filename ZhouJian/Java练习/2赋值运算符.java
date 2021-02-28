package Java练习;

/*
��ֵ���������������1������ֵ2��չ��ֵ
1������ֵ   =
2��չ��ֵ    -=  +=  *=  /=  %=
*/
class A
{
	public static void main(String[] args)
	{
		int a=10;
		    a=a+5;    //15 ��ͬ��a+=5
		System.out.println(a);
		    a+=5;	  //20
		System.out.println(a);
			a-=5;     //15
		System.out.println(a);
			a*=5;	  //3
		System.out.println(a);
			a/=3;     //1
		System.out.println(a);
			a%=1;    //0
				System.out.println(a);
					//   byte i=5; 
					//     a=i+5;    �������벻��
					//Ҫ����    a=(byte)(i+5)    ��ʧ����
					//���� a+=5      ��������    ��ʧ����
   //ע��         �����ܿ���   +=5����(byte)(i+5)
   //����         ��չ�ำֵ��������ı�����������
        
		 byte b=0;
		      c=128;
		System.out.println(c);
	}
}
