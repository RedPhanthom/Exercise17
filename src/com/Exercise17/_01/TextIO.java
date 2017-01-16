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
			PrintWriter pw = new PrintWriter(new FileOutputStream("Exercise17-01.txt"), true);
			for (int i = 0; i < 100; i++) {
				pw.print(rnd.nextInt(100) + "\n");
			}
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
