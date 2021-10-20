/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package robotics.practicals;

/**
 *
 * @author M
 */
   
import java.util.*;
import java.io.*;
public class P8_Breadth_First_Search {
    


	ArrayList arr=new ArrayList();
	String str[]=new String[2];
	String path[]=new String[20];
	int i,j,k=0;
		 
		   //Adding Name Of City To The Arraylist.
		    
		public void breadth()
		{
			arr.add("Arad"); 
		   arr.add("Zerind");
		    arr.add("Sibiu");		
		   arr.add("Timisoara");
		   arr.add("Rimnicu Vilcea");
		   arr.add("Fagaras");
		   arr.add("Lugoj");
		   arr.add("Craiova");
		   arr.add("Pitesti");
		   arr.add("Bucharest");
		   arr.add("Mehadia");
		   arr.add("Dobreta");
		   arr.add("Pitesti");
		   arr.add("Bucharest");
		   arr.add("Dobreta");
		 
			if(arr.isEmpty())
			System.out.println("Empty");
			for(i=0;i<20;i++){
			path[i]="";
			str[0]="";
			str[1]="";}

			//Representing Cities in the tree format.
			System.out.println("\t\t\tArad\n");
			System.out.println("Zerind\t\t\tSibiu\t\t\tTimisoara\n");
			System.out.println("\t\tRimnicu Vilcea     Fagaras\tLugoj\n");
			System.out.println("\t\tCraiova   Pitesti    Bucharest\t Mehadia\n");
			System.out.println("\tDobreta  Pitesti  Bucharest\t\tDobreta\n");
			
			try
			{
		 	  
		 	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			  System.out.println("\nEnter the initial node\n");
			   str[0]=br.readLine();
		 	  System.out.println("\nEnter the goal\n");
				 str[1]=br.readLine();
				 
					//To Find The Goal.
					if(arr.contains(str[1]))
					{
					  System.out.println("Goal is found");

		//To Store the Entire Path from initial node to goal.

						for(j=arr.indexOf(str[0]);j<=arr.indexOf(str[1]);j++)
						{
						   path[k]=arr.get(j).toString();
						     k++;
						}
					}
			}
			catch(IOException e)
			{}
			System.out.print("Path is:   ");
			for(j=0;j<k;j++)
			{
				System.out.print(path[j]);
				if(j!=k-1)
				System.out.print("-->");
			}

		
		 
}
public static void main(String arg[])
		{
	   	  P8_Breadth_First_Search b=new P8_Breadth_First_Search();
		   b.breadth();
		}
    
}
