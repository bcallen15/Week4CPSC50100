//***********************************************
//	Ex1OverloadBox.java		Author: Ben Callen
//
//	Demonstrates overloading variables
//***********************************************

	public class Ex1OverloadBox {
		int size = 0;
		void printBox() {
			for (int r = 0; r<size; r++) { //increment rows to set value in boxsize variable
				for (int c = 0; c<size; c++) { //increment columns to set value in boxsize variable
				System.out.print("*");
			}
				System.out.println();
		}
	}
		
	public void printBox(char c) {
		for (int r = 0; r<size; r++) {
			for (int d = 0; d<size; d++) {
			System.out.print("c");
		}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Ex1OverloadBox boxsize = new Ex1OverloadBox();
		boxsize.size = 5;
		boxsize.printBox();
		boxsize.printBox('c');

	}

}