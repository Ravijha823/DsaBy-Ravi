package recursiveapproch;
import java.util.*;

public class subsetofset {
	private static ArrayList<ArrayList<Integer>>findsubset(ArrayList<Integer> ar) 
	{
		ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
		ArrayList<Integer> lt=new ArrayList<>();
		int i=0;
		solve(i,ar,lt,ans);
		return ans;
		
		
	}


	public static void solve(int i, ArrayList<Integer> ar, ArrayList<Integer> lt, ArrayList<ArrayList<Integer>> ans) {
		// TODO Auto-generated method stub
		if(i>=ar.size())
		{
			ans.add(new ArrayList<>(lt));
			return;
		}
		//exclude
		solve(i+1,ar,lt,ans);
		//include
		int p=ar.get(i);
		lt.add(p);
		solve(i+1,ar,lt,ans);
		 // backtrack
        lt.remove(lt.size() - 1); // Remove the last element to backtrack correctly
	}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     ArrayList<Integer> ar=new ArrayList<>();
     ar.add(1);
     ar.add(2);
     ar.add(3);
     ArrayList<ArrayList<Integer>> arrayListOfLists=   findsubset(ar);
     for (List<Integer> list : arrayListOfLists) {
         // Iterating over each individual list
         for (Integer element : list) {
             System.out.print(element + " ");
         }
         System.out.println(); // New line after each inner list is printed
     }
	}

	
}
