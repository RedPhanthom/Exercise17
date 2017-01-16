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
package com.Exercise17._02;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Random;

public class BinaryIO {

	public static void main(String[] args) {
		Random rnd = new Random();

		try {
			DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("Exercise17-02.txt"));

			for (int i = 0; i < 100; i++) {
				dataOut.writeInt(rnd.nextInt(10000));
			}
			dataOut.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
