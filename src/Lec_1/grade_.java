package Lec_1;

public class grade_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks = 29 ;
if (marks>=75) {
	System.out.println("A" );}

	else if (marks<75 && marks>=65 ) {
		System.out.println("B");
	}
	else if (marks<60 && marks>=50) {
		System.out.println("c");
		
}
	else if (marks<50 && marks>=40) {
		System.out.println("d");
	}
	else if (marks<40 && marks>=30) {
		System.out.println("PASS");
}
	else {
		System.out.println("FAIL");
	}
	}
}
