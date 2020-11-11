class PhonePay{
public static void payment(long mobileNumber){
System.out.println("Ur mobile postpaid bill is paid sucessfully " +mobileNumber);
}
public static void payment(long mobileNumber,String DTH){
System.out.println("Ur DTH recharge is paid sucessfully " +DTH);
}
public static void payment(String Name, int customerID, int amount){
System.out.println("U have paid electricity bill of" +amount);
}
public static void payment(long creditCardNumber, int amount){
System.out.println("Ur credit card bill is paid sucessfully " +creditCardNumber+ "of amount"+amount);
}
public static void main(String args[]){
PhonePay.payment(7019347955L);
PhonePay.payment(7019347955L, "425510638R");
PhonePay.payment("Chethan", 100123458, 250);
PhonePay.payment(578946138523L, 100000);
}
}