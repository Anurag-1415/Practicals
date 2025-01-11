import java.util.*;

class Practical4 {
static Scanner sc=new Scanner(System.in);

public static void getByte(int number){

int result;
int temp=number/128;
if(temp%2==0) result=number%128;
else if(Integer.signum(number)==1) result=number%128-128;
else result=number%128+128;
System.out.println("The Byte value is: "+result);
}

public static void getShort(int number){

int result;
int temp=number/32768;
if(temp%2==0) result=number%32768;
else if(Integer.signum(number)==1) result=number%32768-32768;
else result=number%32768+32768;
System.out.println("The Short value is: "+result);
}

public static void getNumber(int number,String type){
if(type.equals("byte")){
int resultByte;
int temp1=number/128;
if(temp1%2==0) resultByte=number%128;
else if(Integer.signum(number)==1) resultByte=number%128-128;
else resultByte=number%128+128;
System.out.println("The Byte value is: "+resultByte);
}
else{
int resultShort;
int temp2=number/32768;
if(temp2%2==0) resultShort=number%32768;
else if(Integer.signum(number)==1) resultShort=number%32768-32768;
else resultShort=number%32768+32768;
System.out.println("The Short value is: "+resultShort);
}
}


public static void toXXSystem(String value,String system){


//Decimal
if (system.equals("D")) {

//b No
if(value.startsWith("0B")) {
int length=value.length();
int DecimalNumber=0;
for (int i=0;i<length;i++){
if(value.charAt(i)=='1'){
DecimalNumber+=Math.pow(2,length-i-1);
}

}
System.out.println("The decimal number of your given number is: "+DecimalNumber);
//o no
}else if (value.startsWith("0")) {
int length=value.length();

int DecimalNumber=0;
for (int i=0;i<length;i++){
DecimalNumber+=(value.charAt(i)-'0')*Math.pow(8,length-i-1);

}
System.out.println("The decimal number of your given number is: "+DecimalNumber);
//x no
}else if(value.startsWith("0X")){
int length=value.length();

int DecimalNumber=0;
for (int i=0;i<length;i++){
int digit = Character.getNumericValue(value.charAt(i));
DecimalNumber+=digit*Math.pow(16,length-i-1);

}
System.out.println("The decimal number of your given number is: "+DecimalNumber);
}else {
System.out.println("The decimal number of your given number is: "+value);
}
}

//Binary
else if(system.equals("B")) {

StringBuilder binary=new StringBuilder();
//b no
if(value.startsWith("0B")) {
System.out.println("The binary number of your given number is: "+"0B"+value);
//o no
}else if (value.startsWith("0")) {
int length=value.length();

int DecimalNumber=0;
for (int i=0;i<length;i++){
DecimalNumber+=(value.charAt(i)-'0')*Math.pow(8,length-i-1);
}
while(DecimalNumber>0){
int remainder=DecimalNumber%2;
binary.append(remainder);
DecimalNumber/=2;
}
System.out.println("The binary number of your given number is: "+"0B"+binary.reverse());
//x no
}else if(value.startsWith("0X")){

int length=value.length();

int DecimalNumber=0;
for (int i=0;i<length;i++){
int digit = Character.getNumericValue(value.charAt(i));
DecimalNumber+=digit*Math.pow(16,length-i-1);
}
while(DecimalNumber>0){
int remainder=DecimalNumber%2;
binary.append(remainder);
DecimalNumber/=2;
}
System.out.println("The binary number of your given number is: "+"0B"+binary.reverse());
}else {
String num=value.substring(2);
int n=Integer.parseInt(value);
while(n>0){
int remainder=n%2;
binary.append(remainder);
n/=2;
}
System.out.println("The binary number of your given number is: "+"0B"+binary.reverse());
}
}

//Octal
else if(system.equals("0")) {
StringBuilder binary=new StringBuilder();

if(value.startsWith("0B")) {
int length=value.length();
int DecimalNumber=0;
for (int i=0;i<length;i++){
if(value.charAt(i)=='1'){
DecimalNumber+=Math.pow(2,length-i-1);
}
}
while(DecimalNumber>0){
int remainder=DecimalNumber%8;
binary.append(remainder);
DecimalNumber/=8;
}

System.out.println("The octal number of your given number is: "+"0"+binary.reverse());

}else if (value.startsWith("0")) {
System.out.println("The octal number of your given number is: "+value);

}else if (value.startsWith("0X")) {
int length=value.length();
int DecimalNumber=0;
for (int i=0;i<length;i++){
int digit = Character.getNumericValue(value.charAt(i));
DecimalNumber+=digit*Math.pow(16,length-i-1);
}
while(DecimalNumber>0){
int remainder=DecimalNumber%8;
binary.append(remainder);
DecimalNumber/=8;
}

System.out.println("The octal number of your given number is: "+"0"+binary.reverse());
}else{
String num=value.substring(2);
int n=Integer.parseInt(value);
while(n>0){
int remainder=n%8;
binary.append(remainder);
n/=8;
}
System.out.println("The octal number of your given number is: "+"0"+binary.reverse());
}
}


//Hexa

else {
StringBuilder binary=new StringBuilder();

if(value.startsWith("0B")) {
int length=value.length();
int DecimalNumber=0;
for (int i=0;i<length;i++){
if(value.charAt(i)=='1'){
DecimalNumber+=Math.pow(2,length-i-1);
}
}
while(DecimalNumber>0){
int remainder=DecimalNumber%16;
binary.append(Character.toUpperCase(Character.forDigit(remainder,16)));
DecimalNumber/=16;
}

System.out.println("The hexa number of your given number is: "+"0X"+binary.reverse());

}else if (value.startsWith("0")) {
int length=value.length();

int DecimalNumber=0;
for (int i=0;i<length;i++){
DecimalNumber+=(value.charAt(i)-'0')*Math.pow(8,length-i-1);
}
while(DecimalNumber>0){
int remainder=DecimalNumber%16;
binary.append(Character.toUpperCase(Character.forDigit(remainder,16)));
DecimalNumber/=16;
}
System.out.println("The hexa number of your given number is: "+"0X"+binary.reverse());

}else if(value.startsWith("0X")) {
System.out.println("The hexa number of your given number is: "+"0X"+value.toUpperCase());
}else {
String num=value.substring(2);
int n=Integer.parseInt(value);
while(n>0){
int remainder=n%16;
binary.append(Character.toUpperCase(Character.forDigit(remainder,16)));
n/=16;
}
System.out.println("The hexa number of your given number is: "+"0X"+binary.reverse());
}
}
}

//main function
public static void main(String[] args){
int choice,number;

System.out.println("Choose the option wisely");
System.out.println("1 To convert the number in Byte");
System.out.println("2 To convert the number in Short");
System.out.println("3 To convert the number in   Byte or Short");
System.out.println("4 To convert the number in any number system");
System.out.println("0 To exit!");

while(true){

System.out.print("Enter your choice: ");
choice=sc.nextInt();

switch(choice){
case 1:
System.out.print("Enter a number to convert: ");
number=sc.nextInt();
getByte(number);
break;

case 2:
System.out.print("Enter a number to convert: ");
number=sc.nextInt();
getShort(number);
break;

case 3:
System.out.print("Enter a number to convert: ");
number=sc.nextInt();
System.out.print("Enter the type in which you want to convert: ");
String type=sc.next();
getNumber(number,type);
break;

case 4:
System.out.println("\nGive the following prefix as per your number:");
System.out.println("0D for Decimal\n0B for Binary\n0 for Octal\n0X for HexaDecimal");
System.out.print("Enter a number to convert: ");
String value=sc.next();
System.out.println("D for Decimal\nB for Binary\n0 for Octal\nX for HexaDecimal");
System.out.print("Enter the type of system in which you want to convert: ");
String system=sc.next();
toXXSystem(value,system);
break;

case 0:
System.out.println("Exiting!");
return;

default:
System.out.println("Incorrect choice!");
}
}
}
}




