package com.exemple.jni;

/**
 * Test de l'API JNI : Java Native Interface
 * @see https://github.com/jerome-Dh/jni-exemple
 *
 * @author Jerome Dh 
 * @see https://www.linkedin.com/in/jerome-dh
 */
 
public class JNIExemple { 

		static {
			//  Lors de l'exécution, Cette Bibliothèque contient la définition des methodes natives déclarées
			System.loadLibrary("hello"); // Charge hello.dll (Windows) ou libhello.so (Linux)
	    }

		// Déclare une instance de la methode native sayHello() sans paramètre et sans valeur de retour
		private native void sayHello();

		// Test de fonctionnement
		public static void main(String[] args) {

			//welcome();
			
			//Faire appel à une méthode native implémentée dans une Bibliothèque externe 
			new JNIExemple().sayHello();  
			
		}
		
		/**
		 * Bienvenue 
		 */
		public static void welcome()
		{
			
			/*************************************************************************
				"+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+-+--+--+
				" 													   
				"  ____________     ____       ___     ___________    
				" +            +   +	 \    +   +   +           +   
				" +___     ____+   +     \    +   +   +___     ___+      
				"     +   +        +      \   +   +       +   +        
				"     +   +        +       \  +   +       +   +        
				"     +   +        +        \ +   +       +   +       
				"     +   +        +         \+   +       +   +         
				"     +   +        +   +\     \   +       +   +       
				"     +   +        +   + \        +       +   +        
				"     +   +        +   +  \       +       +   +        
				"     +   +        +   +   \      +       +   +        
				"  ___+   +        +   +    \     +    ___+   +___    
				" +       +        +   +     \    +   +           +   
				" +_______+        +___+      \___+   +___________+   
				"     												   
				"     												   
				
				" @@@@@  					 @@@@@@@@@@@@@@@  
				" @    @  						 @			
				" @     @  						 @			
				" @    @   						 @			
				" @   @   						 @			
				" @@@@     @@@@@     @@@@@				 @			
				" @   @    @   @     @   @				 @			
				" @    @   @   @     @   @				 @			
				" @     @  @   @     @   @				 @			
				" @    @   @   @     @   @				 @			
				" @   @    @   @     @   @				 @	@@		 
				" @@@@     @   @@@@@@    @		  	@@@@@@@ 	@@		
				"                        @				 			
				"                        @				 			
				"        @@     @@       @				 			
				"       @ )@@  @ )@@     @				 			
				"        \@@    \@@      @							
				"                       @ 							
				"                      @ 							
				"                     @ 							
				"         @@@@@@@@@@@ 								
				
				+"+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+-+--+--+
				
				*/
				
			System.out.println("Bienvenue !!");
			
		}


}
