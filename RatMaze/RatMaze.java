
import java.util.*;
iport java.io.*;

public class RatMaze
{
    static int N;
    static ArrayList<String> al;
    static int k;
    
	static boolean isSafe(int [][]maze, int x,int y){
	    if( x>=0 && x<N && y>=0 && y<N && maze[x][y]==1)
	     return true;
	    return false;
	}
	static void mazeSol(int[][] maze){
	    
	    
	    mazeSolUtl(maze,0,0,"");
	    
	    
	}
	static boolean boundary(int x,int y)
	 {
	     if(x>=0 && x<N && y>=0 && y<N)
	      return true;
	     return false;
	 }
  static  void mazeSolUtl(int[][] maze,int x, int y, String s){
      
      if(x==N-1 && y==N-1)
       {
           
            al.add(k++,s);
              return;
           
       }
      if(isSafe(maze,x,y)==true)
       {
           maze[x][y]=0;
           
           mazeSolUtl(maze,x+1,y,s+"D");
           
           mazeSolUtl(maze,x,y+1,s+"R");
           
           mazeSolUtl(maze,x,y-1,s+"L");
           
           mazeSolUtl(maze,x-1,y,s+"U");
           
           
           maze[x][y]=1;
           
           return ;       
       }
       
      return ; 
  }
  
  public static void main(String[] args) {
		int [][]maze={ {1, 1, 0, 1, 1, 0, 1},
		               {0, 1, 0, 0, 1, 1, 1},
		               {1, 1, 1, 1, 0, 1, 0},
		               {0, 1, 0, 1, 1, 1, 1},
		               {0, 1, 0, 0, 1, 0, 1},
		               {0, 1, 1, 1, 1, 0, 1},
		               {0, 0, 0, 0, 1, 1, 1}
		             };
        N=7;        
        al=new ArrayList<String>();
         k=0;
        mazeSol(maze);
    if(k==0)
     {
         System.out.println("No Solution");
     }
    else{ 
	
	Collections.sort(al);
       for(int i=0;i<k;i++)
		   
       System.out.println(al.get(i));
        
    }
    
	}
}
