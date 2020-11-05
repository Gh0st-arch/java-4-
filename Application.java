package ie;
import java.util.Scanner;


public class Application 
{
	public static void main(String args[])
	{
		int a = -1,b = 0;
		String inputname = null;
		Doctor doctor01 = new Doctor("男",21,9999,999,"未缴费",0);
		Doctor doctor02 = new Doctor("女",20,9999,999,"未缴费",0);
		Student_Administration stu01,stu02;
		Teacher_Administration Tea01,Tea02;
		stu01 = doctor01;
		Tea01 = doctor01;
		stu02 = doctor02;
		Tea02 = doctor02; 
		doctor01.input();
		doctor02.input();
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		Scanner reader02 = new Scanner(System.in);
		while(a != 0)
		{
			System.out.println("选择通道,1为学生管理，2为教师管理,0退出并计算纳税额");
			a = reader.nextInt();
			if (a == 1)
			{
					System.out.println("请输入你的名字");
					   try
					    {
					    		inputname = reader02.nextLine();
					    }
					    catch(Exception e)
					    	{
					    		System.out.println("请输入你的名字！（你的名字应为中文）");
					    	}
					   if (inputname.equals(doctor01.name))
				    	{
				    		while(true)
				    		{
				    			System.out.println("1.进入缴费系统 2.查看所需交学费");
					    		b = reader.nextInt();
					    		if(b == 1)
					    		{
					    			stu01.Pay();
					    			if(doctor01.feeed == 0)
					    			{
					    				break;
					    			}
					    		}
					    		if(b == 2)
					    		{
					    			stu01.looktuition();
					    			if(doctor01.feeed == 0)
					    			{
					    				break;
					    			}
					    		}
					    		if(b == 0)
					    		{
					    			break;
					    		}
				    		}
				    	}
				    	if (inputname.equals(doctor02.name))
				    	{
				    		
				    		while(doctor01.feeed != 0)
				    		{
				    			System.out.println("1.进入缴费系统 2.查看所需交学费");
					    		b = reader.nextInt();
					    		if(b == 1)
					    		{
					    			stu02.Pay();
					    			if(doctor02.feeed == 0)
					    			{
					    				break;
					    			}
					    			
					    		}
					    		if(b == 2)
					    		{
					    			stu02.looktuition();
					    			if(doctor02.feeed == 0)
					    			{
					    				break;
					    			}
					    		}
					    		if(b == 0)
					    		{
					    			break;
					    		}
				    		}
				    	}
				    	
				
			}
			if (a==2)
		    {
		    	System.out.println("请输入你的名字");
		    	try
		    	{
		    		inputname = reader02.nextLine();
		    	}
		    	catch(Exception e)
		    	{
		    		System.out.println("请输入你的名字！（你的名字应为中文）");
		    	}
		    	if (inputname.equals(doctor01.name))
		    	{
		    		while( true)
		    		{
		    			System.out.println("1.领取工资 2.查看月薪");
			    		b = reader.nextInt();
			    		if(b == 1)
			    		{
			    			Tea01.Givesalary();
			    			if(doctor01.feeed == 0)
			    			{
			    				break;
			    			}
			    		}
			    		if(b == 2)
			    		{
			    			Tea01.looksalary();
			    			if(doctor01.feeed == 0)
			    			{
			    				break;
			    			}
			    		}
			    		if(b == 0)
			    		{
			    			break;
			    		}
			    		
		    		}
		    	}
		    	if (inputname.equals(doctor02.name))
		    	{
		    		
		    		while(true)
		    		{
		    			System.out.println("1.领取工资 2.查看月薪");
			    		b = reader.nextInt();
			    		if(b == 1)
			    		{
			    			Tea02.Givesalary();
			    			if(doctor02.feeed == 0)
			    			{
			    				break;
			    			}
			    		}
			    		if(b == 2)
			    		{
			    			Tea02.looksalary();
			    			if(doctor02.feeed == 0)
			    			{
			    				break;
			    			}
			    		}
			    		if(b == 0)
			    		{
			    			break;
			    		}
		    		}
		        }
				    
		    }
		}
		  final double h = 0.03;
		  final double i = 0.1;
		  final double c = 0.2;
		  final double d = 0.25;
		  final double e = 0.3;
		  final double f = 0.35;
		  final double g = 0.45;
		  if(inputname.equals(doctor01.name))
		  {
			  if(doctor01.salary - doctor01.fee > 0 && doctor01.salary - doctor01.fee <= 5000) 
			  {
			   doctor01.tax = 0;
			   System.out.println("税收为:"+doctor01.tax);
			  }
			  if(doctor01.salary - doctor01.fee > 5000 && doctor01.salary - doctor01.fee <= 8000) 
			  {
			   doctor01.tax = h*(doctor01.salary - doctor01.fee - 5000);
			   System.out.println("税收为:"+doctor01.tax);
			  }
			  if(doctor01.salary - doctor01.fee > 8000 && doctor01.salary - doctor01.fee <= 17000) 
			  {
			   doctor01.tax = 90 + i*(doctor01.salary - doctor01.fee - 8000);
			   System.out.println("税收为:"+doctor01.tax);
			  }
			  if(doctor01.salary - doctor01.fee > 17000 && doctor01.salary - doctor01.fee <= 30000)
			  {
			   doctor01.tax = 90 + 900 + c*(doctor01.salary - doctor01.fee - 17000);
			   System.out.println("税收为:"+doctor01.tax);
			  }
			  if(doctor01.salary - doctor01.fee > 30000 && doctor01.salary - doctor01.fee <= 40000) 
			  {
			   doctor01.tax = 90 + 900 + 2600 + d*(doctor01.salary - doctor01.fee - 30000);
			   System.out.println("税收为:"+doctor01.tax);
			  }
			  if(doctor01.salary - doctor01.fee > 40000 && doctor01.salary - doctor01.fee <= 60000)
			  {
			   doctor01.tax = 90 + 900 + 2600 + 2500 + e*(doctor01.salary - doctor01.fee - 40000);
			   System.out.println("税收为:"+doctor01.tax);
			  }
			  if(doctor01.salary - doctor01.fee > 60000 && doctor01.salary - doctor01.fee <= 85000)
			  {
			   doctor01.tax = 90 + 900 + 2600 + 2500 + 6000 + f*(doctor01.salary - doctor01.fee - 60000);
			   System.out.println("税收为:"+doctor01.tax);
			  }
			  if(doctor01.salary - doctor01.fee > 85000) 
			  {
			   doctor01.tax = 90 + 900 + 2600 + 2500 + 6000 + 8750 + g*(doctor01.salary - doctor01.fee - 60000);
			   System.out.println("税收为:"+doctor01.tax);
			  }
			  else 
			  {
			   System.out.println("当薪水低于学费时，您不用缴纳税款！");
			  }
		  }
		  if(inputname.equals(doctor02.name))
		  {
			  if(doctor02.salary - doctor02.fee > 0 && doctor02.salary - doctor02.fee <= 5000) 
			  {
			   doctor02.tax = 0;
			   System.out.println("税收为:"+doctor02.tax);
			  }
			  if(doctor02.salary - doctor02.fee > 5000 && doctor02.salary - doctor02.fee <= 8000) 
			  {
			   doctor02.tax = h*(doctor02.salary - doctor02.fee - 5000);
			   System.out.println("税收为:"+doctor02.tax);
			  }
			  if(doctor02.salary - doctor02.fee > 8000 && doctor02.salary - doctor02.fee <= 17000) 
			  {
			   doctor02.tax = 90 + i*(doctor02.salary - doctor02.fee - 8000);
			   System.out.println("税收为:"+doctor02.tax);
			  }
			  if(doctor02.salary - doctor02.fee > 17000 && doctor02.salary - doctor02.fee <= 30000)
			  {
			   doctor02.tax = 90 + 900 + c*(doctor02.salary - doctor02.fee - 17000);
			   System.out.println("税收为:"+doctor02.tax);
			  }
			  if(doctor02.salary - doctor02.fee > 30000 && doctor02.salary - doctor02.fee <= 40000) 
			  {
			   doctor02.tax = 90 + 900 + 2600 + d*(doctor02.salary - doctor02.fee - 30000);
			   System.out.println("税收为:"+doctor02.tax);
			  }
			  if(doctor02.salary - doctor02.fee > 40000 && doctor02.salary - doctor02.fee <= 60000)
			  {
			   doctor02.tax = 90 + 900 + 2600 + 2500 + e*(doctor02.salary - doctor02.fee - 40000);
			   System.out.println("税收为:"+doctor02.tax);
			  }
			  if(doctor02.salary - doctor02.fee > 60000 && doctor02.salary - doctor02.fee <= 85000)
			  {
			   doctor02.tax = 90 + 900 + 2600 + 2500 + 6000 + f*(doctor02.salary - doctor02.fee - 60000);
			   System.out.println("税收为:"+doctor02.tax);
			  }
			  if(doctor02.salary - doctor02.fee > 85000) 
			  {
			   doctor02.tax = 90 + 900 + 2600 + 2500 + 6000 + 8750 + g*(doctor02.salary - doctor02.fee - 60000);
			   System.out.println("税收为:"+doctor02.tax);
			  }
			  else 
			  {
			   System.out.println("当薪水低于学费时，您不用缴纳税款！");
			  } 
		  }
		  
    }
}