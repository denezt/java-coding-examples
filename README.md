# Java-Sessions
Java Programming and Computational Design
date: 2013-06-01 00:34:15
name: Computer Science 046 | factsheets
---
<!-- I don't see a discussion page for the fact sheet so I hope this is okay. -->
<!-- What does the "Note" column add? The bad examples already say "error" on the left; "NOT recommended" seems redundant. -->

<!--  -->

# Factsheets

**Variables**

<TABLE class="table-default">
<THEAD>
<TR>
<TH>Variable_Declaration</TH>
<TH>Comment</TH>
<TH>Note</TH>
</TR>
</THEAD>
<TBODY>
<TR>
<TD>int age = 21;</TD>

<TD>This declares an integer variable and initializes it to 21.</TD>
<TD>Recommended</TD>
</TR>
<TR>
<TD>int nextAge = age + 1;</TD>
<TD>The initial value of a variable can be an expression (as long as age has been previously declared.)</TD>
<TD>Recommended</TD>
</TR>
<TD>String course= "Udacity";</TD>
<TD>The variable has type  String and is assigned an initial value of "Udacity". </TD>
<TD>Recommended</TD>
</TR>
<TD>score= 80;</TD>
<TD>ERROR: the type is required. This statement will not declare a variable. It is an assignment statement which assigns a new value to an existing variable. </TD>
<TD>NOT Recommended</TD>
</TR>
<TD>int age= "42";</TD>
<TD>ERROR: You cannot initialize a number with a String.  "42" is a String. See the quotation marks. </TD>
<TD>NOT Recommended</TD>
</TR>
<TD>int age;</TD>
<TD>This declares an integer variable without initializing it. It is best to initialize variables when they are created: int age = 0; If you do not know what value you  want yet </TD>
<TD>----</TD>
</TR>
</TBODY>
</TABLE>

<TABLE class="table-default">
<THEAD>
<TR>
<TH>Naming Rule</TH>
<TH>Example</TH>
</TR>
</THEAD>
<TBODY>
<TR>
<TD>Names must consist of letters, numbers, an underscore, or a dollar sign only.</TD>
<TD>score_1</TD>
</TR>
<TR>
<TD>Don't use single letter variable name as you do in  mathematics. While it is legal in Java, it is usually not a good idea because it can make programs harder to understand. (you will encounter a couple of exceptions later)</TD>
<TD>a</TD>
</TR>
<TD>WARNING: Names are case sensitive. Note that by convention, variable names start with a lowercase letter</TD>
<TD>FinalGrade, finalGrade, and FINALGRADE are all different variables</TD>
</TR>
<TD>ERROR Names cannot start with a number.</TD>
<TD>7up</TD>
</TR>
<TD>ERROR. You cannot use a reserved word as a name.</TD>
<TD>int</TD>
</TR>
<TD>ERROR: You cannot use special characters such as * or & in names.</TD>
<TD>m&m</TD>
</TR>
<TD>ERROR: Names cannot contain spaces.</TD>
<TD>final grade</TD>
</TR>
</TBODY>
</TABLE>

**Number Types**
<TABLE class="table-default">
<THEAD>
<TR>
<TH>Type</TH>
<TH>Range</TH>
<TH>Size</TH>
</TR>
</THEAD>
<TBODY>
<TR>
<TD>int (integer)</TD>
<TD>–2,147,483,648 to 2,147,483,647(~2.14 billion)</TD>
<TD>4 bytes</TD>
</TR>
<TR>
<TD>short (integer)</TD>
<TD>-32,768 to 32,767</TD>
<TD> 2 bytes </TD>
</TR>
<TD>long (integer)</TD>
<TD>–9,223,372,036,854,775,808 to 9,223,372,036,854,775,807</TD>
<TD> 8 bytes</TD>
</TR>
<TD>byte</TD>
<TD>-128 to 127</TD>
<TD> 1 byte </TD>
</TR>
<TD>double(double-precision floating point)</TD>
<TD>range of about + or - 10^308</TD>
<TD> 8 bytes </TD></TR>
<TD>float(single-precision floating point)</TD>
<TD>range of about + or - 10^38 & about 7 significant decimal places</TD>
<TD> 4 bytes </TD></TR>
<TD>char</TD>
<TD>represents a Unicode character</TD>
<TD> 2 bytes </TD> </TR>
<TD>boolean</TD>
<TD>has only 2 possible values: true or false</TD>
<TD> 1 bit </TD>
</TR>
</TBODY>
</TABLE>

<TABLE class="table-default">
<THEAD>
<TR>
<TH>Number Literals</TH>
<TH>Description</TH>
<TH>Examples</TH>
</TR>
</THEAD>
<TBODY>
<TR>
<TD>int</TD>
<TD>An integer has no fractional part and can be positive, negative, or 0.</TD>
<TD>5,-100,0
</TR>
<TR>
<TD>double</TD>
<TD>A number with fractional part</TD>
<TD>1.7, 1.0, 2.4E5, 3.47E-2</TD>
</TR>
<TD>ERROR</TD>
<TD>Do not use a comma to separate thousands</TD>
<TD>1,000,000</TD>
</TR>
<TD>ERROR</TD>
<TD> Do not use a fraction. Use a decimal instead.</TD>
<TD> 3 1/4 </TD>
</TR>
</TBODY>
</TABLE>

**Integer Arithmetic**

<TABLE class="table-default">
<THEAD>
<TR>
<TH>Expression</TH>
<TH>Value (when n =2497)</TH>
<TH>Description</TH>
</TR>
</THEAD>
<TBODY>
<TR>
<TD>n/10</TD>
<TD>249</TD>
<TD>Notice that the answer is an integer with no decimal part.</TD>
</TR>
<TR>
<TD>n % 10</TD>
<TD>7</TD>
<TD> Always the last digit of n</TD>
</TR>
<TD>n /100 </TD>
<TD>24</TD>
<TD>Again, decimal part is discarded. Removes the last 2 digits.</TD>
</TR>
<TD>n % 100</TD>
<TD> 97 </TD>
<TD> The last two digits. </TD>
</TR>
<TD>n % 2</TD>
<TD> 1 </TD>
<TD> If n % 2 is 0 the number is even. Otherwise it is odd. </TD>
</TR>
</TBODY>
</TABLE>

**Math Functions**
<TABLE class="table-default">
<THEAD>
<TR>
<TH>Method</TH>
<TH>Return Value</TH>
</TR>
</THEAD>
<TBODY>
<TR>
<TD>Math.sqrt (n)</TD>
<TD>Square root of n ( if n is > or = to 0)</TD>
</TR>
<TR>
<TD>Math.pow(a,b)</TD>
<TD>a^b( if a = 0, b must be >0)</TD>
</TR>
<TD>Math.sin(n)</TD>
<TD>Sine of n where n is in radians</TD>
</TR>
<TD>Math.cos(n)</TD>
<TD>Cosine of n where n is in radians</TD>
</TR>
<TD>Math.tan(n)</TD>
<TD>Tangent of n where n is in radians</TD>
</TR>
<TD>Math.round(n)</TD>
<TD>closest integer to n as a long</TD>
</TR>
<TD>Math.ceil(n)</TD>
<TD>smallest integer > or = to n as a double</TD>
</TR>
<TD>Math.floor(n)</TD>
<TD>largest integer < or = to n as a double</TD>
</TR>
<TD>Math.toRadians(n)</TD>
<TD>Converts n degrees to radians</TD>
</TR>
<TD>Math.toDegrees(n)</TD>
<TD>Converts n radians to degrees</TD>
</TR>
<TD>Math.abs(n)</TD>
<TD>Absolute value of n |n|</TD>
</TR>
<TD>Math.max(a,b)</TD>
<TD>The larger of a and b</TD>
</TR>
<TD>Math.min(a,b)</TD>
<TD>The smaller of a and b</TD>
</TR>
<TD>Math.exp(n)</TD>
<TD>e^n</TD>
</TR>
<TD>Math.log(n)</TD>
<TD>natural log of n</TD>
</TR>
<TD>Math.log10(n)</TD>
<TD>Base 10 log of n</TD>
</TR>
</TBODY>
</TABLE>

**String Formatting**

<TABLE class="table-default">
<THEAD>
<TR>
<TH>Code</TH>
<TH>In an Example</TH>
<TH>Type</TH>
<TH>What It Prints</TH>
</TR>
</THEAD>
<TBODY>
<TR>
<TD>d</TD>
<TD>"%4d"</TD>
<TD>Decimal integer</TD>
<TD> 123</TD>
</TR>
<TR>
<TD>x</TD>
<TD>"%x"</TD>
<TD>Hexadecimal integer</TD>
<TD>7A</TD>
</TR>
<TR>
<TD>o</TD>
<TD>"%o"</TD>
<TD>Octal integer</TD>
<TD>173</TD>
</TR>
<TR>
<TD>f</TD>
<TD>"%5.2f"</TD>
<TD>Fixed floating-point</TD>
<TD>12.30</TD>
</TR>
<TR>
<TD>e</TD>
<TD>"%e"</TD>
<TD>Exponential (very large or small) floating-point</TD>
<TD>1.23e+1</TD>
</TR>
<TR>
<TD>g</TD>
<TD>"%3.2g"</TD>
<TD>General (medium sized) floating-point</TD>
<TD>12.3</TD>
</TR>
<TR>
<TD>s</TD>
<TD>"%s"</TD>
<TD>String</TD>
<TD>Tax: </TD>
</TR>
<TR>
<TD>n</TD>
<TD>"%n" or "\n"</TD>
<TD>Line end</TD>
<TD></TD>
</TR>
</TBODY>
</TABLE>

**Format Flags**

<TABLE class="table-default">
<THEAD>
<TR>
<TH>Flag</TH>
<TH>In an Example</TH>
<TH>Meaning</TH>
<TH>What It Prints</TH>
</TR>
</THEAD>
<TBODY>
<TR>
<TD>-</TD>
<TD>"%-6d"</TD>
<TD>Align left</TD>
<TD>an integer that takes 6 spaces and starts in the first one</TD>
</TR>
<TR>
<TD>0</TD>
<TD>"%07.2f"</TD>
<TD>Show leading zeroes</TD>
<TD>0001.23</TD>
</TR>
<TR>
<TD>+</TD>
<TD>"%+7.2f"</TD>
<TD>Show a plus sign for positive numbers</TD>
<TD>+1.23</TD>
</TR>
<TR>
<TD>(</TD>
<TD>"%(6.2f"</TD>
<TD>Enclose negative numbers in parentheses</TD>
<TD>-1.23 would look like (1.23)</TD>
</TR>
<TR>
<TD>,</TD>
<TD>"%,10d"</TD>
<TD>Show decimal separators</TD>
<TD>12,300</TD>
</TR>
<TR>
<TD>^</TD>
<TD>"%^s"</TD>
<TD>convert letters to uppercase</TD>
<TD>"tax:" would print as "TAX:"</TD>
</TR>
</TBODY>
</TABLE>

**Strings**

<TABLE class="table-default">
<THEAD>
<TR>
<TH>Example_Code_For_String_Methods</TH>
<TH>Result</TH>
<TH>Other info</TH>
</TR>
</THEAD>
<TBODY>
<TR>
<TD>String str = "Java ";<br/> str = str + "Programming"</TD>
<TD>str is assigned the value "Java Programming"</TD>
<TD>The + sign is used to concatenate Strings</TD>
</TR>
<TR>
<TD>String answer = "Total: " + 42;</TD>
<TD>answer is set to "Total: 42"</TD>
<TD>Because "Total: " is a string 42 is converted to a string and then the concatenation takes place</TD>
</TR>
<TR>
<TD>String name = "Sara T";<br/> int len = name.length();</TD>
<TD>len is set to 6</TD>
<TD>The number of characters in a string. A space counts as a character</TD>
</TR>
<TR>
<TD>String city = "San Jose"; <br/> String sub = city.substring(1, 3);</TD>
<TD>sub is set to "an"</TD>
<TD>Takes the substring starting at position 1 and ending before position 3</TD>
</TR>
<TR>
<TD>String city = "San Jose"; <br/> String first = city.substring(0, 1);</TD>
<TD>first is set to "S"</TD>
<TD>Gets the first character. The substring has length 1 </TD>
</TR>
<TR>
<TD>String city = "San Jose"; <br/>
String sub = city.substring(4);"</TD>
<TD>sub is set to "Jose"</TD>
<TD>If you only supply one parameter, the substring consists of all characters from that position until the end of the String</TD>
</TR>
<TR>
<TD>String city = "San Jose"; <br/> 
String last = city.substring(city.length() - 1);</TD>
<TD>returns the string containing the last letter in the string ("e") and assigns it to last</TD>
<TD>str.substring(str.length() - 1) will always give you the last character as a String</TD>
</TR>
<TR>
<TD>String city = "San Jose";<br/>
int index = city.indexOf("Jose")
</TD>
<TD>index is set to 4</TD>
<TD>returns the index where "Jose" starts</TD>
</TR>
<TR>
<TD>String city = "Santa Barbara";<br/>
int index = city.lastIndexOf("a")
</TD>
<TD>index is set to 12</TD>
<TD>returns the index of the last "a" in the string</TD>
</TR>
<TR>
<TD>String cityWithTypo = "Son Jose";<br/>
String cityCorrected = cityWithTypo.replace("Son","San");
</TD>
<TD>Changes all ocurrences of "Son" to "San" in cityWithTypo and put the result in cityCorrected</TD>
<TD>Will also worked the following ("So","Sa");</TD>
</TR>
<TR>
<TD>String sentence = "Joseph is in San Jose";<br/>
int index = sentence.indexOf("Jose", 2)</TD>
<TD>index is set to 17</TD>
<TD>indexOf returns the index where "Jose" starts. When an index position is supplied as the second argument (2 in this case), search will begin AFTER that index</TD>
</TR>
</TBODY>
</TABLE>

Common Loop Algorithms
======================

Sum
-------
<pre style='font-family: "Consolas"', cursive>
total = 0
for each item
     total = total + input
</pre>

Counting Matches
----------------
<pre style='font-family: "Consolas"', cursive>
matches = 0
for each item
    if the item matches
        matches = matches + 1
</pre>

Finding the Location of the First Match
----------------
<pre style='font-family: "Consolas"', cursive>
found = false
position = 0
while it's not found, and there are more items
    if the item at position matches
        found = true
    else 
        position = position + 1
if the item was found
    its location is position
</pre>

Maximum
-----------

<pre style='font-family: "Consolas"', cursive>
largest = the first item
for all the items except the first
    if the current item is larger than largest
        replace the value in largest with the current item
</pre>

<span>Last Update: 21.08.2021</span>
