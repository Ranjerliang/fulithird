import java.util.Scanner;


public class fulithird {

	
	public static void main(String[] args) {
		
		double amount;
		 double rate ;
		 double year,result,p;
		 result=0;
		 p=0;
	
		 Scanner keyboard = new Scanner(System.in);

		String ch ="n";
		 System.out.println("请选择，单利计算本息输入s:");
		 System.out.println("复利计算本息输入d:");
		 System.out.println("计算本金输入m:");
		 System.out.println("复利计算时间输入t:");
		 System.out.println("计算利率请输入输入r:");
		 
		 
		ch =keyboard.nextLine();
		
		if ( ch.equals("d")||ch.equals("D"))
		{
			
	 		 System.out.println("请输入本金:");
	 		 amount = keyboard.nextDouble();
	 			 System.out.println("请输入利率:");
	 		 rate = keyboard.nextDouble();
	 			 rate = rate/100;
	 			 System.out.println("请输入时间:");
	 			 year = keyboard.nextInt();
			 for (int x = 1; x < year; x++){
	 				amount = amount * Math.pow(1.0 + rate, year);
	 			    }
			 System.out.println("结果为"+amount);
		
		}
		
		else if(ch.equals("s")||ch.equals("S"))
		{
			
	 		 System.out.println("请输入本金:");
	 		 amount = keyboard.nextDouble();
	 			 System.out.println("请输入利率:");
	 		 rate = keyboard.nextDouble();
	 			 rate = rate/100;
	 			 System.out.println("请输入时间:");
	 			 year = keyboard.nextInt();
		 for (int x = 1; x < year; x++){
			amount =   amount*(1+rate*year);
		    }
		System.out.println("结果为"+amount);
		}
		else if(ch.equals("m")||ch.equals("M"))
		{
			 System.out.println("请输入本息:");
	 		 amount = keyboard.nextDouble();
	 			 System.out.println("请输入利率:");
	 		 rate = keyboard.nextDouble();
	 			 rate = rate/100;
	 			 System.out.println("请输入时间:");
	 			 year = keyboard.nextInt();
		 for (int x = 1; x < year; x++){
			p= (rate+1)*x;
		    }
		 result=amount/p;
		 
		System.out.println("结果为"+result);	
		}
		else if(ch.equals("t")||ch.equals("T"))
		{   double amount1,amount2;
		double time;
			System.out.println("请输入本金:");
	 		 amount1 = keyboard.nextDouble();
	 		 System.out.println("请输入本息:");
	 		 amount2 = keyboard.nextDouble();
	 			 System.out.println("请输入利率:");
	 		 rate = keyboard.nextDouble();
	 			 rate = rate/100;	 
         time= (Math.log(amount2/amount1)/Math.log(1+rate));
		System.out.println("结果为"+time);
		}
		else if(ch.equals("r")||ch.equals("R"))
		{   double amount1,amount2;
	      double rate1 =0;
	      
			System.out.println("请输入本金:");
	 		 amount1 = keyboard.nextDouble();
	 		 System.out.println("请输入本息:");
	 		 amount2 = keyboard.nextDouble();
	 			 System.out.println("请输入时间:");
	 			 year = keyboard.nextInt();			 
	 			rate1=amount2/amount1/year;
		System.out.println("结果为"+rate1);
		}
	}

}
