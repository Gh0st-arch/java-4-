package ie;
import java.util.Scanner;
public class Doctor implements Student_Administration,Teacher_Administration
{
	String name,sex,effect="δ�ɷ�";
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
		System.out.println("�����벩ʿ������");
		name = reader.nextLine();
	}
	public void Pay() 
	{
		
		{
			System.out.println("��ӭ"+name+"�����ɷ�ϵͳ,����״̬:"+effect);
			if (effect.equals("δ�ɷ�"))
			{
				System.out.println("����1�ɷѣ�����0���ز˵�");
				feeed = reader.nextInt();
				if (feeed == 1)
				{
					if(fee <= money )
					{
						money -= fee;
						System.out.println("�������"+money);
						effect = "�ѽɷ�";
						System.out.println("�ɷѳɹ�,����ǰ��״̬:"+effect);
					}
					if(fee > money)
					{
						System.out.println("����Ǯ����!�ɷ�ʧ��");
					}
				}
			}
		}

		if (effect.equals("�ѽɷ�"))
		{
			System.out.println("ϵͳ��⵽���ѽɷѣ��밴0���ز˵�");
		}
	}
	public void looktuition() 
	{
		System.out.println("����Ҫ����ѧ��Ϊ"+fee+"����0���ص��˵�");
		feeed = reader.nextInt();
	}
	public void Givesalary()
	{
		money += salary;
		System.out.println("��ȡ�ɹ�!����ǰУ԰���ڵ�ǮΪ:"+money+"����0���ز˵�");
		feeed = reader.nextInt();
		
	}
	public void looksalary()
	{
		System.out.println("�����µ�нˮΪ:"+salary+"����0���ز˵�");
		feeed = reader.nextInt();
	}

}
