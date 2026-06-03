HOW TO COMPILE AND RUN (from task34 directory):

1. Compile com.utils module:
   javac -d mods/com.utils com.utils/src/module-info.java com.utils/src/com/utils/StringUtils.java

2. Compile com.greetings module:
   javac --module-path mods -d mods/com.greetings com.greetings/src/module-info.java com.greetings/src/com/greetings/Main.java

3. Run:
   java --module-path mods -m com.greetings/com.greetings.Main
