# SER502-Spring2018-Team31
1. Chetanya Ahuja (cahuja3@asu.edu | 1213247254) 
2. Drishty Kapoor (dkapoor3@asu.edu | 1213247241)
3. Himanshu Dua (hdua1@asu.edu | 1213100991)
4. Natalya Kumar (nkumar50@asu.edu | 1213103292)


Steps to run the Program:

1) Change diresctory to the folder where the project is stored by command "cd".

2) To compile and run the MainCherish.java in order to create intermediate code run the following commands:
  a) javac -d . -cp .:src/:lib/antlr-4.7.1-complete.jar src/compiler/MainCherish.java
  b) java -cp .:src/:lib/antlr-4.7.1-complete.jar src/compiler/MainCherish
  
3) To compile and run the Cherish.java in order to handle the runtime, run the following commands:
  a) javac -d . -cp .:src/:lib/antlr-4.7.1-complete.jar src/runtime/Cherish.java
  b) java -cp .:src/:lib/antlr-4.7.1-complete.jar Cherish
  
  OR
  
  1) Open the project on Eclipse.
  
  
  2) Now run MainCherish.java present in the src/compiler. It will give you the IC for the example.txt present in the folder         Grammar and a new file named example.cherish will be created in the Grammar folder.
  
  
  3) Now run Cherish.java present in src/runtime. It will give you output of the example.txt on console after handling the IC     instructions.
  
  
  4) There are 5 sample programs in the grammar folder, whichever you wants to run just rename that one as "example.txt" and       follow the above written steps. 
