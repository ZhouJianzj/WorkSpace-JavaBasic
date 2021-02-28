package Java练习;

/*
    ������� ���߸���
	  ѡ��ṹ
	    if    if..else
		swith
	  ѭ���ṹ
	    for
		while
		do..while
	  ����ѭ�����
	  	break
		continue
	  
*/      
  //if��䱻��Ϊ��֧���/�����������
  /*
    if���������﷨�ṹ�����ֱ�д��ʽ
	    ��һ��
		     if(�������ʽ)
			   { java ���
			   ....
			   }
		�ڶ���
			 if(�������ʽ)
			   {Java���
			   ....
			   }else
			       {java���
			      ....
			       }
		������
			if(�������ʽ)
			  {java���
			    ....
			  }else if
			    {java���
			    ....
				}else if
					{java ���
					 ....
					 }else if
						{  ...
							...
						}
		������
			if(�������ʽ)
			  {java ���

			  }else if
			     {java ���

			     }else if
			        {java ���

					}else
						{java ���

						}
  */
//���� ���ݳɼ��жϵȼ�
class A    //ִ���н���
{
	public static void main(String[] args)
	{
		double  grade=90;
		if(grade>=100 || grade<=0)  //&& ֻҪ��һ����false��������false,  ||ֻҪ��һ����true��������true
		{
			System.out.println("����������ݲ�����");
		}
		else if (grade>=80 & grade<90)  //ֻҪ����һ��true�ͽ�����������
		{
			System.out.println('B');
		}
		else if (grade>=70 & grade<80)//�����ı�д����70 80 ���Բ���˳������ִ��Ҳ�������
		{
			System.out.println('C');
		}
		else if(grade>=60 & grade<70)
		{
			System.out.println('D');
		}
		else if(grade>=90 & grade<=100)
		{
			System.out.println('A');
		}
		else    ///��β��else
		{
			System.out.println("������");
		}
		
		
		
		/*double distance=5;
		 if(distance<=5)
		{
			System.out.println("����ʵʩ");
		}
		*/
	}

}
class B							//ȫ��if�͵���䣨ִ��Ч�ʵ�Ҫһ��һ�������㣩
{
	public static void main(String[] args)
	{
		double  grade=90;
		if(grade>100 | grade<0)
		{
			System.out.println("��������ݲ�����");
		}
		if(grade>=90 & grade<=100)
		{
			System.out.println("����");
		}
		if(grade>=80 & grade<90)
		{
			System.out.println("��");
		}
		if(grade>=70 & grade<80)
		{
			System.out.println("��");
		}
		if(grade>=60 & grade<70)
		{
			System.out.println("��");
		}
		if(grade<60)
		{
			System.out.println("������");
		}

	}
}
class C   //�������в�����
{
	 public static void main(String[] args)
  {
		double  grade=-10;
	 if(grade<0 || grade>100)
	 {
		System.out.println("�������벻�ϸ�");
	 }
	 else if(grade>=90 && grade<=100)
	 {
		System.out.println("A");
	 }
	 else if(grade>=80 && grade<90)
	 {
		System.out.println("B");
	 }
	 else if(grade>=70 && grade<80)
	 {
		System.out.println('C');
   	 }
	 else if (grade>=60 && grade<70)
	 {
	 	System.out.println('D');
	 }
	 else if(grade<60)    //��β��else if
	 {
	 	System.out.println('E');
	 }
  }
}
class D
{
	public static void main(String[] args)
	{
		double score=90.5;
		String dengji="�ÿ����ĳɼ��ȼ��ǣ�E�ȼ�";
		if(score>100 || score<0)
		{
			dengji="�ÿ����ĳɼ����벻�Ϸ�";
		}else if (score>=90)//������ֵҪ����С˳���� ����˳��������ִ�е�ʱ������
		{
			dengji="�ÿ����ĳɼ��ȼ��ǣ�A�ȼ�";
		}else if (score>=80)
		{
			dengji="�ÿ����ĳɼ��ȼ��ǣ�B�ȼ�";
		}else if (score>=70)
		{
			dengji="�ÿ����ĳɼ��ȼ��ǣ�C�ȼ�";
		}else if (score>=60)
		{
			dengji="�ÿ����ĳɼ��ȼ��ǣ�D�ȼ�";
		}
		System.out.println(dengji);

	}
}
 //System.out.println();     �������̨��������ڴ浽����̨��������̣�
 //���ܼ�������ָ��
 //��һ�� ��������ɨ��������
class E
{
	public static void main(String[] args)
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		String userInputContent = s.next();
		System.out.println("��������ǣ�"+userInputContent);
		
	}
} 
//java.util.Scanner s = new java.util.Scanner(System.in);//�����û����������ָ��Ӽ��̵��ڴ�
 /*�ڶ��� ����Scanner�����next()������ʼ�����û����̵�����
        ����ִ�е������ͣ�������ȴ��û�����
		���û������ʱ���������ûس�����ʱ��������Ϣ���Զ���ֵ��uesrInputContent
		����ִ�е�����û��������Ϣ�Ѿ������ڴ浱��
*/
//String userInputContent = s.next(); //��ʶ��������������֪��

/*����ϵͳ����һ���˵����䣬�����������ж�����˴����������ĸ��׶Σ���������ڣ�0-150��
      ��0-5���׶�
	  ��6-10���ٶ�
	  ��11-18�����ٶ�
	  ��19-35������
	  ��36-55������
	  ��56-150������
*/

class NianLing
{
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);//����ϵͳ����ɨ�蹦��
			System.out.println("���������ʵ������");         //����ַ�����ʾ
		  int age=s.nextInt();  //��ֵ������
		//String  str=s.next();   //�����ʾ��������ַ�����
		String  year="�㵱ǰ��������ǣ�����"+age+"��";      //�ο�֮ǰ�ı�д����ȽϾ���
		if (age<0 || age>150)     //��·��Ĳ�������ֻҪ�е�һ����true��������true
		{
			year="����������䳬����������������������Ҫ��Ҫ��0��150��֮��";
		}else if (age<=5)
		{
			year="�㵱ǰ��������ǣ��׶�"+age+"��";
		}else if (age<=10)
		{
			year="�㵱ǰ��������ǣ��ٶ�"+age+"��";
		}else if (age<=18)
		{
			year="�㵱ǰ��������ǣ�������"+age+"��";
		}else if (age<=35)
		{
			year="�㵱ǰ��������ǣ�����"+age+"��";
		}else if (age<=55)
		{
			year="�㵱ǰ��������ǣ�����"+age+"��";
		}
	System.out.println(year);
	System.out.println("��ӭʹ���ܽ���д�Ĵ��������Ե�����");
	}
}
/*��ϰ �жϵ�ǰ������
			�����������ʱ��
			   ����ɡ��
			       �ж��Ա�
				        ���Ա�Ϊ�У���һ�Ѵ��ɡ
				        ���Ա�ΪŮ����һ��С��ɡ
			���������ʱ���죺
			   �ж������¶ȣ�
				   �������¶�Ϊ30�����ϣ�
						���Ա�Ϊ��:��ī��
						���Ա�ΪŮ������ɹ˪
*/

/*�ڱ�д��γ����ʱ�������˲��ٵ�С���⣬һ��ʼ�ڳ�����ƽṹ����û�����⣬
�����ڸ����ʸ�ֵ��ʱ����������⣬����Ҫ���ǳ����ַ����������ȳ�������У�����
����String str=content��ʱ�򣬳�������ʱ��û�д���ִ�в��ˡ�
*/
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
				stri="��һ�Ѵ��ɡ";  //����������ǵ�ʱ�����ͨ����ִ�в���ֱ��û�����
			}else if (sex==4)
			{
				System.out.println(stri);
			}else{
				System.out.println("��������Ա���ȷ");
			}
		}else if (tianQi==2)
		{	
			System.out.println("�����뵱ǰ�¶�");
			int weather=s.nextInt();
			if (weather>30)
			{
				if (sex==3)
				{
					strin="��һ����ɫī��";
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


class G   //���ǵİ���ȷ�еĳ���
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
class H   //�������Ӵ�����Ҳ����
{
	public static void main(String[] args)
		{
		boolean   sex=true;
	if (sex) System.out.println("��");
	//System.out.println("");    ���������һ�λ���ֵ�376�б������elseȱ��if
	else System.out.println("Ů");
		}
}