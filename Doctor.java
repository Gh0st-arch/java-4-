package ie;
import java.util.Scanner;
public class Doctor implements Student_Administration,Teacher_Administration
{
	String name,sex,effect="未缴费";
	int age,feeed=6;
	double salary,fee,money,cha,tax;
	Doctor(String sex,int age,double salary,double fee,String effect,int money)
	{
		this.sex = sex;
		this.age = age;
		this.salary = salary;
		this.fee = fee;
		this.effect = effect;
		this.money = money;
	}
	Scanner reader = new Scanner(System.in);
	void input()
	{
		System.out.println("请输入博士的名字");
		name = reader.nextLine();
	}
	public void Pay() 
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

}
