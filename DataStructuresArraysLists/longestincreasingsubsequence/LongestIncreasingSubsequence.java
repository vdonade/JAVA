package longestincreasingsubsequence;



public class LongestIncreasingSubsequence {
	
		   static int incre_subseq(int myArr[], int arr_len){
		      int seqArr[] = new int[arr_len];
		      int i, j, max = 0;
		      for (i = 0; i < arr_len; i++)
		    	  seqArr[i] = 1;
		      for (i = 1; i < arr_len; i++)
		      for (j = 0; j < i; j++)
		      if (myArr[i] > myArr[j] && seqArr[i] < seqArr[j] + 1)
		    	  seqArr[i] = seqArr[j] + 1;
		      for (i = 0; i < arr_len; i++)
		      if (max < seqArr[i])
		          max = seqArr[i];
		          return max;
		   }
		   public static void main(String args[]){
		      int myArr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		      int arr_len = myArr.length;
		      System.out.println("The length of the longest increasing subsequence is " +  incre_subseq(myArr, arr_len));
		   }
	}