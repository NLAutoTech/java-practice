package java_fundamentals;
//learnt about JVM,JRE,JDK
//compile time-runtime
//Variables and Data-type

//JVM- converts bytecode into machine code making java platform independent
//JRE- contains JVM and Core libraries to run programs
//JDK- containsJRE and compiler, debugger. used to convert source code to bytecode

//Compiletime - JDK-javac = java source code is checked and converted into bytecode.
//runtime - JVM(run)+JRE(environment to run) = executing compiled bytecode to produce output

public class Basic {
	public static void main(String[] args) {
//DATA-TYPE  = defines what kind of data the variable stores
//2 type - PRIMITIVE/NON-PRIMITIVE
//PRIMITIVE= Basic , built-in data-type. stores actual values. have fixed size. int		float	double	char	boolean
	int intnum = 10;
	float flonum = 10.1f;
	double dubnum = 10.21;
	char charb = 'a';
	boolean boo = true;
	
	
//NON-PRIMITIVE = User-defined or complex types. stores reference of the data.size not fixed. default value null. can call methods. string		arrays		class	object	interface	collections
	String sentence = "Hi my name is NIDHI";
	//ARRAY= store multiple values of same type
	int[] marks = {80, 90, 85};

	}

}
