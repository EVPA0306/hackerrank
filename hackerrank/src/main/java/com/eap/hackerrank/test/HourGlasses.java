package com.eap.hackerrank.test;


public class HourGlasses {

	/*static int arr[][] = {
			 {1,1,1, 0,0,0}
			,{0,1,0, 0,0,0}
			,{1,1,1, 0,0,0}
			,{0,0,2, 4,4,0}
			,{0,0,0, 2,0,0}
			,{0,0,1, 2,4,0}
	};*/

	static int arr[][] = {
			 {1, 1,  1,  0,  0, 0}
			,{0, 1,  0,  0,  0, 0}
			,{1, 1,  1,  0,  0, 0}
			,{0, 9,  2, -4, -4, 0}
			,{0, 0,  0, -2,  0, 0}
			,{0, 0, -1, -2, -4, 0}
		};

    public static void main(String[] args) {

		int maxsum = -10000;

		for(int arr_i=0; arr_i < 4; arr_i++)
		{
			for(int arr_j=0; arr_j < 4; arr_j++)
			{
				int sum = arr[arr_i][arr_j] + arr[arr_i][arr_j+1] + arr[arr_i][arr_j+2]
						+ arr[arr_i+1][arr_j+1]
						+ arr[arr_i+2][arr_j] + arr[arr_i+2][arr_j+1] + arr[arr_i+2][arr_j+2];
				if (sum>maxsum)
					maxsum = sum;
			}
		}
		System.out.println(maxsum);
    }
}
