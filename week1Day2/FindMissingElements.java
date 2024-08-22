package week1Day2;

import java.util.Arrays;

import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class FindMissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,3,2,8,6,7};
		//System.out.println(a[]);
		Arrays.sort(a);

		if(a[0]==1) {

			for (int i = 0; i < a.length; i++) {

				System.out.print(a[i] + " ");


				if(a[i] != i+1) {
					System.out.println("Missing Number is " + (i+1));
					break;
				}
			}
		}
		else {
			System.out.println("Error");
		}

	}}
