HOW TO INSPECT BYTECODE (from task37 directory):

1. Compile:
   javac task37.java

2. View bytecode with javap:
   javap -c task37

3. For verbose output (constants, line numbers, local vars):
   javap -verbose task37

What to look for:
- "invokestatic"  -> static method calls
- "iload / istore" -> integer variable load/store
- "ireturn"       -> method returning int
- "iadd / imul"   -> integer add / multiply operations
