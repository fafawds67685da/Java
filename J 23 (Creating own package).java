package p;
public class Package{
	public void display(){
		System.out.println("Ayesha");
	}
}


import p.Package;
public class Best{
	public static void main(String[] args){
		Package ob= new Package();
		ob.display();
	}
}

/* 1. javac -d . Package.java
  2. javac Best.java
  3. java Best
  */
