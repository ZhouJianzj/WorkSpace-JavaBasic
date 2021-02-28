package Java练习;

/*
   关于Java控制语句当中的break语句：
   		1、break是Java语言当中的关键字，被翻译为“中断/折断”

		2、break+“;”可以直接成为单独的完整的Java语句： break;

		3、break 语句使用在Switch语句当中也可以用于其它的循环语句也可以

		4、break是用来中断循环的执行的

		5、break 可以使用在for while do ..while的循环语句当中用来跳出循环的，
		终止执行的，提高执行效率
		6、默认的情况下break终止的是离它最近的循环语句，当然也可以中断指定的循环
		语句，但是要给循环语句命名
*/
class A
{
	public static void main(String[] args)
		{
			for(int a=1;a<=4;a++)
			{
				for(int b=1;b<=4;b++)
				{
					if(b==4)
					{
						break;//这里终止的是for(int b=1;b<=4;b++)
					}
					System.out.print(b+" ");
				}
				System.out.println();
			}
		}
}

class B
{
	public static void main(String[] args)
		{
			for1:for(int a=1;a<=4;a++)
				{
					for2:for(int b=1;b<=4;b++)
						{
							if(b==4)
								{
									break for1;//这里结束for1 输出是1 2 3就没有了
								}
							System.out.print(b+" ");
						}
						System.out.println();
				}
		}
}