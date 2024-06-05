package sgpa_and_cgpa;

import java.text.DecimalFormat;
import java.util.Scanner;

public class calculation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		DecimalFormat d=new DecimalFormat("0.00");
		int marks[]=new int[100];
		int credit[]=new int[100];
		double sgpaofeachsem[]=new double[100];
		boolean flag=true;
		System.out.println("*******WELCOME TO CGPA AND SGPA CALCULATOR*******");
		while(flag)
		{
			System.out.println("\n1.Claculation of SGPA\n2.Claculation of CGPA\n3.EXIT");
			System.out.println("Enter your choice  :");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter the number of subject :");
				int subjectno=scanner.nextInt();
				System.out.println("enter the : ");
				System.out.println("marks\tcredit ");
				for(int i=0;i<subjectno;i++)
				{
				 marks[i]=scanner.nextInt();
				 credit[i]=scanner.nextInt();
				}
				double sgpa=SgpaCalculator(marks,credit,subjectno);
				System.out.println("SGPA ="+d.format(sgpa));
				break;
			case 2:
				System.out.println("enter the number of Semister :");
				int numberofsem=scanner.nextInt();
				System.out.println("enter the SGPA of each semester : ");
				System.out.println("SGPA :");
				for (int i = 0; i < numberofsem; i++) {
					sgpaofeachsem[i]=scanner.nextDouble();
				}
				double cgpa=CgpaCalculator(sgpaofeachsem,numberofsem);
				System.out.println("SGPA ="+d.format(cgpa));
				break;
			case 3:
				flag=false;
				break;
			default:
				System.out.println("Invalid choice ..........!");
			}
			
		}
		

	}

	private static double CgpaCalculator(double[] sgpaofeachsem, int numberofsem) {
		double totalsgpa=0;

		for(int i=0;i<numberofsem;i++)
		{
			totalsgpa=totalsgpa+sgpaofeachsem[i];
			
		}
		double cgpa=(double)totalsgpa/(double)numberofsem;
		
		return cgpa;
	}

	private static double SgpaCalculator(int[] marks, int[] credit, int subjectno) 
	{
		int total=0,totalcredit=0;
		for(int i=0;i<subjectno;i++)
	{
		if(marks[i]>=90)
		{
			total=total+(10*credit[i]);
		}
		else if(marks[i]<90 && marks[i]>=80)
		{
			total=total+(9*credit[i]);
		}
		else if(marks[i]<80 && marks[i]>=70)
		{
			total=total+(8*credit[i]);
		}
		else if(marks[i]<70 && marks[i]>=60)
		{
			total=total+(7*credit[i]);
		}
		else if(marks[i]<60 && marks[i]>=50)
		{
			total=total+(6*credit[i]);
		}
		else if(marks[i]<50 && marks[i]>=45)
		{
			total=total+(5*credit[i]);
		}
		else if(marks[i]<45 && marks[i]>=40)
		{
			total=total+(4*credit[i]);
		}
		else
		{
			total=total+(0*credit[i]);
		}
		
	}
	
	for(int i=0;i<subjectno;i++)
	{
		totalcredit=totalcredit+credit[i];
		
	}
	double sgpa=(double)total/(double)totalcredit;
		
		return sgpa;
	}

}
