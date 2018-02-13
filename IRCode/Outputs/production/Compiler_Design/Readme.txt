Readme:
-----------------------------------------

First Made Intermediate representation IR.
First make Flow Graph, Leaders. Blocks 

Then made Register and Address Table for each as per sir's algorithm.


Then make a class called Translater, which does the following.

Translater: 
	Input : ThreeAddresscode, current Register Table, current AddressTable, Previous Address Table.
	Output: Print Translated Mips code.

	RegisterTable:
		Hashtable<Integer, String> 
		Integre - Regester Number(1-18)
		String - Variable name.
		(Register i stores variable var for this line) 


	AddressTable: (Stores information about variables in this line. )
																( Note : The currently required variables will be in memory, to see whether to load or not you need to see in previous Addresstable entry. Current Addresstable is used to see if any variable need to be stored before translating, see below ToDO steps)
		HashTable<String, AdTableEntry>

		String: variable name

		AdTableEntry : 
			bool : IsInReg (Is the variable in register)
			Int  : Reg (Valid only if above bool is true)
			Bool : WriteToMemory (store the variable in memory before allocating register).


ToDo:
	
	Step1: Go through the current Addresstable, if any of the WriteToMemory is set store it in memory.
	Step2: Go through the Previous AddressTable, and see if the the required variables in register, if not then load then into the register, specified by either of Reg entry in Current Arrdess Table (or) Go through the register table to see which register is used for required variables.

	Step3: Now use the registers allocated for required variables to translate Three Address Code to MIPS instruction.






