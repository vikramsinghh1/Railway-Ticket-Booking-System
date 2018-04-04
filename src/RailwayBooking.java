import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class RailwayBooking
{
	static Queue<String> disps = new LinkedList<>();
	public static void main(String args[]) throws Exception
	{
		TrainAdmin ta = TrainAdmin.getTrainAdmin();
		UserSystem us = new UserSystem();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			disps.clear();
			disps.add("User System");
			disps.add("Admin System");
			disps.add("Exit");
			disp(disps.size(), disps);
		
			int firstChoice = Integer.parseInt(br.readLine());
			if(firstChoice == 1)
				us.disp(br);
			else if(firstChoice == 2)
				ta.adminMenu();
			else
				break;
		}		
	}
	
	static void disp(int nargs, Queue<String> disps)
	{
		System.out.println("*******************************************");
		for(int i = 1; i<=nargs; i++)
		{
			System.out.println(i+ ") " + disps.peek());
			disps.remove();
		}
		System.out.print("Enter your choice: ");
	}
}



