class Stringword{
	public static void main(String[] args){
	
	String a [] ="java is a programming language".split(" a ");
	String b ="  ";
	
		for(int i=0; i<a.length; i++){								//reverse word in sentance
			for (int j=a[i].length()-1; j>=0; j--){
		
			b=b+a[i].charAt(j);
			}
			//b=b+" ";
		}
				System.out.println(b);
				System.out.println(a.equals(b));
	
	}
}