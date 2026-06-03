HOW TO DECOMPILE (from task38 directory):

1. Compile:
   javac task38.java

2. Decompile using CFR (recommended, no install needed):
   Download CFR: https://github.com/leibnitz27/cfr/releases
   java -jar cfr.jar task38.class

3. OR use JD-GUI (graphical decompiler):
   Download: https://github.com/java-decompiler/jd-gui/releases
   Open task38.class in JD-GUI

What to observe:
- Decompiled source closely matches original Java code
- String concatenation may appear as StringBuilder in older Java versions
- Method signatures and return types are fully reconstructed
- Private/internal compiler optimizations may be visible
