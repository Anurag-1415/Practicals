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
if(type.equalsIgnoreCase("byte")){
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
if (system.equalsIgnoreCase("D")) {

//b No
if(value.startsWith("0B")) {
int length=value.length();
int DecimalNumber=0;
for (int i=2;i<length;i++){
if('0'<=value.charAt(i) && value.charAt(i)<='1'){
DecimalNumber+=Character.getNumericValue(value.charAt(i))*Math.pow(2,length-i-1);
}else{
System.out.println("Invalid binary number! Please enter a valid binary number!");
return;
}
}
System.out.println("Binary-->Decimal: "+DecimalNumber);
//x no
}else if(value.startsWith("0X")){
int length=value.length();
int DecimalNumber=0;
for (int i=2;i<length;i++){
if (('0' <= value.charAt(i) && value.charAt(i) <= '9') || ('a' <= value.charAt(i) && value.charAt(i) <= 'f') || ('A' <= value.charAt(i) && value.charAt(i) <= 'F')){
DecimalNumber+=Character.getNumericValue(value.charAt(i))*Math.pow(16,length-i-1);
} else{ 
System.out.println("Invalid hexa number! Please enter a valid Hexa number!");
return;
}
}
System.out.println("Hexa-->Decimal: "+DecimalNumber);
//o no
}else if (value.startsWith("0")) {
int length=value.length();
int DecimalNumber=0;
for (int i=1;i<length;i++){
if('0'<= value.charAt(i) && value.charAt(i)<='7'){
DecimalNumber+=Character.getNumericValue(value.charAt(i))*Math.pow(8,length-i-1);
}else{ 
System.out.println("Invalid octal number! Please enter a valid octal number!");
return;
}
}
System.out.println("Octal-->Decimal: "+DecimalNumber);
//d no
}else {
if(value.matches("^[0-9]+$")){
System.out.println("Decimal: "+value);
}else{
System.out.println("Invalid decimal number! Please enter a valid decimal number!");
return;
}
}
}

//Binary
else if(system.equalsIgnoreCase("B")) {

StringBuilder binary=new StringBuilder();
//b no
if(value.startsWith("0B")) {
String b="";
for (int i=2;i<value.length();i++){
if('0'<=value.charAt(i) && value.charAt(i)<='1'){
b+=value.charAt(i);
}else{ 
System.out.println("Invalid binary number! Please enter a valid binary number!");
return;
}
}
System.out.println("Binary: "+"0B"+b);

//x no
}else if(value.startsWith("0X")){
int length=value.length();
int DecimalNumber=0;
for (int i=2;i<length;i++){
if (('0' <= value.charAt(i) && value.charAt(i) <= '9') || ('a' <= value.charAt(i) && value.charAt(i) <= 'f') || ('A' <= value.charAt(i) && value.charAt(i) <= 'F')){
DecimalNumber+=Character.getNumericValue(value.charAt(i))*Math.pow(16,length-i-1);
} else{ 
System.out.println("Invalid hexa number! Please enter a valid Hexa number!");
return;
}
}
while(DecimalNumber>0){
binary.append(DecimalNumber%2);
DecimalNumber/=2;
}
System.out.println("Hexa-->Binary: "+"0B"+binary.reverse());
//o no
}else if (value.startsWith("0")) {
int length=value.length();
int DecimalNumber=0;
for (int i=0;i<length;i++){
if('0'<= value.charAt(i) && value.charAt(i)<='7'){
DecimalNumber+=Character.getNumericValue(value.charAt(i))*Math.pow(8,length-i-1);
}else{ 
System.out.println("Invalid octal number! Please enter a valid octal number!");
return;
}
}
while(DecimalNumber>0){
binary.append(DecimalNumber%2);
DecimalNumber/=2;
}
System.out.println("Octal-->Binary: "+"0B"+binary.reverse());
//d no
}else {
int n;
if(value.matches("^[0-9]+$")){
n=Integer.parseInt(value);
}else{
System.out.println("Invalid decimal number! Please enter a valid decimal number!");
return;
}
while(n>0){
int remainder=n%2;
binary.append(remainder);
n/=2;
}
System.out.println("Decimal-->Binary: "+"0B"+binary.reverse());
}
}

//Octal
else if(system.equalsIgnoreCase("0")) {
StringBuilder binary=new StringBuilder();
//b no
if(value.startsWith("0B")) {
int length=value.length();
int DecimalNumber=0;
for (int i=2;i<length;i++){
if('0'<=value.charAt(i) && value.charAt(i)<='1'){
DecimalNumber+=Character.getNumericValue(value.charAt(i))*Math.pow(2,length-i-1);
}else{
System.out.println("Invalid binary number! Please enter a valid binary number!");
return;
}
}
while(DecimalNumber>0){
binary.append(DecimalNumber%8);
DecimalNumber/=8;
}
System.out.println("Binary-->Octal: "+"0"+binary.reverse());
//x no
}else if (value.startsWith("0X")) {
int length=value.length();
int DecimalNumber=0;
for (int i=2;i<length;i++){
if (('0' <= value.charAt(i) && value.charAt(i) <= '9') || ('a' <= value.charAt(i) && value.charAt(i) <= 'f') || ('A' <= value.charAt(i) && value.charAt(i) <= 'F')){
DecimalNumber+=Character.getNumericValue(value.charAt(i))*Math.pow(16,length-i-1);
} else{ 
System.out.println("Invalid hexa number! Please enter a valid Hexa number!");
return;
}
}
while(DecimalNumber>0){
binary.append(DecimalNumber%8);
DecimalNumber/=8;
}
System.out.println("Hexa-->Octal: "+"0"+binary.reverse());
}else if (value.startsWith("0")) {
String octal="";
for (int i=1;i<value.length();i++){
if('0'<= value.charAt(i) && value.charAt(i)<='7'){
octal+=value.charAt(i);
}else{ 
System.out.println("Invalid octal number! Please enter a valid octal number!");
return;
}
}
System.out.println("Octal: "+"0"+octal);
}else{
int n;
if(value.matches("^[0-9]+$")){
n=Integer.parseInt(value);
}else{
System.out.println("Invalid decimal number! Please enter a valid decimal number!");
return;
}
while(n>0){
int remainder=n%8;
binary.append(remainder);
n/=8;
}
System.out.println("Decimal-->Octal: "+"0"+binary.reverse());
}
}


//Hexa
else {
StringBuilder binary=new StringBuilder();
//b no
if(value.startsWith("0B")) {
int length=value.length();
int DecimalNumber=0;
for (int i=2;i<length;i++){
if('0'<=value.charAt(i) && value.charAt(i)<='1'){
DecimalNumber+=Character.getNumericValue(value.charAt(i))*Math.pow(2,length-i-1);
}else{
System.out.println("Invalid binary number! Please enter a valid binary number!");
return;
}
}
while(DecimalNumber>0){
binary.append(Character.toUpperCase(Character.forDigit(DecimalNumber%16,16)));
DecimalNumber/=16;
}
System.out.println("Binary-->Hexa: "+"0X"+binary.reverse());
//x no
}else if(value.startsWith("0X")) {
String hexa="";
for(int i=2;i<value.length();i++){
if (('0' <= value.charAt(i) && value.charAt(i) <= '9') || ('a' <= value.charAt(i) && value.charAt(i) <= 'f') || ('A' <= value.charAt(i) && value.charAt(i) <= 'F')){
hexa+=value.charAt(i);
} else{ 
System.out.println("Invalid hexa number! Please enter a valid Hexa number!");
return;
}
}
System.out.println("Hexa: "+"0X"+hexa.toUpperCase());
//o no
}else if (value.startsWith("0")) {
int length=value.length();
int DecimalNumber=0;
for (int i=0;i<length;i++){
if('0'<= value.charAt(i) && value.charAt(i)<='7'){
DecimalNumber+=Character.getNumericValue(value.charAt(i))*Math.pow(8,length-i-1);
}else{ 
System.out.println("Invalid octal number! Please enter a valid octal number!");
return;
}
}
while(DecimalNumber>0){
binary.append(Character.toUpperCase(Character.forDigit(DecimalNumber%16,16)));
DecimalNumber/=16;
}
System.out.println("Octal-->Hexa: "+"0X"+binary.reverse());

}else {
int n;
if(value.matches("^[0-9]+$")){
n=Integer.parseInt(value);
}else{
System.out.println("Invalid decimal number! Please enter a valid decimal number!");
return;
}
while(n>0){
binary.append(Character.toUpperCase(Character.forDigit(n%16,16)));
n/=16;
}
System.out.println("Decimal-->Hexa: "+"0X"+binary.reverse());
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
System.out.println("Decimal value as it is!\n0B for Binary\n0 for Octal\n0X for HexaDecimal");
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




