public class Main{
	public static void main (String[] args){
		for (int i = 0 ; i < args.length; i++){ 
		try{
			System.out.println("Argumentos de Santi " + i + ": " + args[i]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Error " + e.getMessage());
	}
	}
}
}
