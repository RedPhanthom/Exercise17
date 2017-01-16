/*--------------------------------------------------------------------
Name: Jaime Palencia
Student ID: U94665425
COP 2805C - Java Programming 2
Spring /2017
Assignment # 1
Plagiarism Statement
I certify that this assignment is my own work and that I
have not copied in part or whole or otherwise plagiarized 
the work of other students and/or persons.
--------------------------------------------------------------------*/
package com.Exercise17._01;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class TextIO {

	public static void main(String[] args) {
		Random rnd = new Random();
		try {
			/*
			 * PrintWriter to output into a new file called "Exercise17-01.txt".
			 */
			PrintWriter pw = new PrintWriter(new FileOutputStream("Exercise17-01.txt"), true);
			for (int i = 0; i < 100; i++) {
				/*
				 * Print 100 Random Int numbers into the "Exercise17-01.txt"
				 * file.
				 */
				pw.print(rnd.nextInt(100) + "\n");
			}
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
