# Random Color Generator
A simple Java API that generates pseudo-random RGB colors as HEX values. Potential implementations could be in visually appealing Android applications!
# API Inclusion
* **Android** - Import this API as an Eclipse ADT Project
* **Java** (cross-IDE) - Download the module as ZIP - extract and import the extracted directory as a module (within Project Structure in IntelliJ IDEA)
# Documentation
The API functions in two modes,
* Simple random generation
* Random generation preventing repetition of colors (for subsequent API calls)
## Simple Random Generation
```java
public class AnotherCoolApplication {
  public static void main(String[] args) {
  
    String color = ColorHex.getRGB();
    
    System.out.println(color); // e.g. #3F51B5
  }
}
```
## Unrepeated Random Generation
```java
public class AnotherCoolApplication {
  public static void main(String[] args) {
  
    // object to be passed as argument to prevent repetation
    ColorHex colorHex = new ColorHex();
    
    // get a random color
    String color1 = ColorHex.getRGB(colorHex);
    System.out.println(color1); // e.g. #3F51B5
    
    // get another random color (!= color1)
    String color2 = ColorHex.getRGB(colorHex);
    System.out.println(color2); // e.g. #673AB7
  }
}
```
# Footnotes
Thanks and hope you like the work!
