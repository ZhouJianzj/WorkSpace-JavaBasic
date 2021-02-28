package Java练习;

/* switch(int��String���͵ı���)
	{
		caseƥ�� int��string���͵�����ֵ���߱���  :  
			java���;
			break;
		case int����string���͵�����ֵ���߱���    ��
			Java���;
			break;
		case int����string���͵�����ֵ���߱���    ��
			java���;
			default;
		case int����string���͵�����ֵ���߱���    ��
			java���;
	...}
	switch����ִ��ԭ��
		1 switch�����С���ŵ��еġ����ݡ���case����ġ����ݡ�
		2 ����һһƥ�䣬ƥ��ɹ��ķ�ִ֧�У��������϶��µ�˳������ƥ��
		3 ƥ��ɹ��ķ�֧����֧����break����ʱ��������swtich�ͻ���ֹ
		5 ƥ��ɹ��ķ�֧����֧��û��break��䣬ֱ�ӽ�����һ����ִ֧�У�������ƥ�䣩�����������Ϊcase��͸��
		6 ���еķ�֧��û��ƥ��ɹ�������default������ִ��default��֧���еĳ���
		7 switch ��������ݱ�����int string���͵�����
		8 switch �������� byte short char �������Ƕ���int ���͵����ݼ�ס�ˣ�

*/
class Switch
{
	public static void main(String[] args)
		{
			java.util.Scanner s=new java.util.Scanner(System.in);
			System.out.println("����������");
			int a=s.nextInt();
			switch (a)
			{
			case 1:
				System.out.println("����һ");
				break;  //break ȥ����case��͸�ˣ�������ֵ1��ᵽ��������
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;
			default:
				System.out.println("���������ֵ������Χ");
			}
		}
}
class Switch1
{
	public static void main(String[] args)
		{
			java.util.Scanner s=new java.util.Scanner(System.in);
			System.out.println("���������ڼ�");
			String a=s.next();
			switch (a)
			{
			case "����һ":
				System.out.println(1);
				break;
			case "���ڶ�":
				System.out.println(2);
				break;
			default:
				System.out.println("������ĸ�ʽ����");
			}
		}
}
class Switch2
{
	public static void main(String[] args)
	{
		char a=65; //����Ҳ����char a='A';
		switch (a)   //ԭ����� char����ת���int���ͣ�����ʼ���
		{
		case 'A': //����Ҳ������case 65:
			System.out.println("�߼�");
			break;
		case 'B':
			System.out.println("�м�");
			break;
		case 'c':
			System.out.println("�ͼ�");
			break;
		default:
			System.out.println("���ݴ���");
		
		}
	}
}
class  JiSuanQi
{
	public static void main(String[] args)
	{
		System.out.println("��ӭʹ��С�ܿ����ļ򵥵ļ�����");
		java.util.Scanner s=new java.util.Scanner(System.in);
			System.out.println("�������һ����");
		int numOne=s.nextInt();
			System.out.println("�����������");
		String yunSuanFu=s.next();
			System.out.println("������ڶ�����");
		int numTwo=s.nextInt();
		int result=0;//Ҫ������������result.
		switch (yunSuanFu)
		{
		case "+":
			result = numOne + numTwo;
			//System.out.println(numOne+"+"+numTwo+"="+(numOne+numTwo));  //�����õ�֮ǰ���ַ������ӷ���+��
		break;
		case "-":
			result = numOne - numTwo;
			//System.out.println(numOne+"-"+numTwo+"="+(numOne-numTwo));
		break;
		case "*":
			result = numOne * numTwo;
			//System.out.println(numOne+"*"+numTwo+"="+(numOne*numTwo));
		break;
		case "/":
			result = numOne / numTwo;
			//System.out.println(numOne+"/"+numTwo+"="+(numOne/numTwo));
		break;
		case "%":
			result=numOne % numTwo;
			//System.out.println(numOne+"%"+numTwo+"="+(numOne%numTwo));
		break;
		default:
			System.out.println("����������������");
		
		}
		System.out.println(numOne + yunSuanFu + numTwo +"="+ result);
		//�������System.out.println("numOne+numTwo");
	}
}
/*����ϵͳ���������ɼ�  ���������ĳɼ��ȼ�
		1 ��Ч�ɼ��ķ�Χ��0--100��
		2 �����ɼ��п��ܴ���С��
		3 �����ɼ��ĵȼ����ձ�
		   [90-100]     A
		   [80-90]		B
		   [70-80]		C
		   [60-70]		D
		   [0-60]		e
*/
class ChengJiDengji
{
	public static void main(String[] args)
	{
		/*java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("�����뿼���ɼ�");
		
		int grade=s.nextInt();*/
		double  score=90.5;
		int grade=(int)(score/10);
		String G="������ĳɼ�����ȷ";
		switch(grade)
			{
				case 9: case 10:
					G="A";
				break;
				case 8:
					G="B";
				break;
				case 7:
					G="C";
				break;
				case 6:
					G="D";
				break;
				default:
					G="E";

			}
			System.out.println(G);
	}
}