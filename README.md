# java-4-
Java实验4仓库

## 实验目的
   1.掌握Java中抽象类和抽象方法的定义； 
   
   2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法;
   
   3.了解异常的使用方法，并在程序中根据输入情况做异常处理。

## 实验要求
   1.	在 博士研究生类中实现各个接口定义的抽象方法;
   
   2.	对年学费和年收入进行统计，用收入减去学费，求得纳税额;
   
   3.	国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义;
   
   4.	实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入;
   
   5.	根据输入情况，要在程序中做异常处理。

 ## 实验过程
   1.首先明确博士研究生类需要Pay和looktuition,givesalary和looksalary这四个方法。
   
   2.其中，Pay和looktuition是在学生管理方面要使用的抽象方法，而givesalary和looksalary是教师管理系统的使用的抽象方法，然后创建两个类Stu_Admin.java和Tea_Admin.java用以实现接口回调。
   
   3.在Dotcor类里，实例化了两个接口的抽象方法，Pay方法用来支付学费，looktution用来查看所需交的学费，然后在教师管理系统中的givesalary用来领取薪水，looksalary用来查看自己的月薪，作为一个博士研究生兼职助教，可以先领取薪水然后再用以上缴学费。
   
   4.当博士研究生已经领取完薪水并且上缴该上缴的学费之后，输入0可以退出这个程序，然后会计算所需要上缴的税收。
   
   5.其中，为了区分你是哪一位学生，在选择了通道之后，需要再次输入名字，用以判断，这样才知道你是为自己上缴学费，要领取你自己的薪水。最开始实例化博士的时候在Doctor类里定义了一个方法input,用来实例化博士的名字，其余博士属性在道理上应该为已有信息所以直接用构造方法构造。
   
 ## 核心代码
 ```
 1.interface Student_Administration    //定义学生管理通道的接口
{
	void Pay();
	void looktuition();
}

```
```
2.interface Teacher_Administration    //定义教师管理通道的接口
{
	void Givesalary();
	void looksalary();
}
```
```
3.public class Stu_Admin 
{
	public void usePay(Student_Administration sta)
	{
		sta.Pay();  //接口回调
	}
	public void uselooktuition(Student_Administration sta)
	{
		sta.looktuition();   //接口回调，教师接口同此类
	}

}
```
```
4.	Scanner reader = new Scanner(System.in);
	void input()
	{
		System.out.println("请输入博士的名字");
		name = reader.nextLine(); //用于实例化博士的名字，不用构造方法来直接赋值其姓名
	}
```
```
5.public void Pay() //接口中方法的实例化
	{
		
		{
			System.out.println("欢迎"+name+"来到缴费系统,您的状态:"+effect);
			if (effect.equals("未缴费"))
			{
				System.out.println("输入1缴费，输入0返回菜单");
				feeed = reader.nextInt();
				if (feeed == 1)
				{
					if(fee <= money )
					{
						money -= fee;
						System.out.println("您的余额"+money);
						effect = "已缴费";
						System.out.println("缴费成功,您当前的状态:"+effect);
					}
					if(fee > money)
					{
						System.out.println("您的钱不够!缴费失败");
					}
				}
			}
		}

		if (effect.equals("已缴费"))
		{
			System.out.println("系统检测到您已缴费，请按0返回菜单");
		}
	}
   public void looktuition() 
	{
		System.out.println("你需要交的学费为"+fee+"输入0返回到菜单");
		feeed = reader.nextInt();
	}
	public void Givesalary()
	{
		money += salary;
		System.out.println("领取成功!您当前校园卡内的钱为:"+money+"输入0返回菜单");
		feeed = reader.nextInt();
		
	}
	public void looksalary()
	{
		System.out.println("您当月的薪水为:"+salary+"输入0返回菜单");
		feeed = reader.nextInt();
	}
```

## 系统运行截图
![result](https://github.com/Gh0st-arch/java-4-/blob/main/img/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20201105221007.jpg)
## 编程感想
   通过本次实验编程，我对于接口类有了初步了解，熟练的掌握了抽象类和抽象方法的定义，掌握了java中接口的定义熟练掌握接口的定义形式以及接口的实现方法，了解了异常的使用方法，在java的编程中，我利用scanner类型的变量作为中间变量来传输值的时候为了保证输入不错误使用了tryexpect这种异常处理。
