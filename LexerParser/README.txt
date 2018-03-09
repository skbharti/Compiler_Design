Source Language : Java 
Implementation  Language : Java

Tool Used : antlr (http://www.antlr.org/)
BNF grammar file : Java.g4

src folder contains:
Java.g4			Java.tokens				JavaLexer.interp	JavaLexer.tokens	JavaParser.java		antlr4.jar
Java.interp		JavaBaseListener.java	JavaLexer.java		JavaListener.java	Main.java

First we installed antlr4 tool (procedure given in https://github.com/antlr/antlr4/blob/master/doc/getting-started.md )
After success-full installation we ran the following command

--------------------------------------------------
cd src
antlr4 Java.g4	
--------------------------------------------------

Initially we had only antlr4.jar, Java.g4 and Main.java in our source folder, after running the above command it creates all other files in src directory.

Our make file compiles all the java files in src folder and gives permission for lexer executable in bin.

Test folder contains:
test1.java 		test2.java 		test3.java 		test4.java  test5.java		test6.java


Run the following command for testing: 

--------------------------------------------------------------------------
cd asgn1
make
./bin/lexer test/test1.java
--------------------------------------------------------------------------


