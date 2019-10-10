package mavenJenkinsBuildTest;

import org.junit.jupiter.api.Test;

public class MavenTestRunToJenkin {
	public static void main(String [] args) {
		add();
		
	}
	
	@Test 
	public static void add() {
		
		int a = 10;
		int b = 30;
		int s = a+b;
		
		System.out.println("Sum of a and b is: "+s);
		
	}

}

