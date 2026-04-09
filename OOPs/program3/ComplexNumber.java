public class ComplexNumber{
double real,img;
ComplexNumber(double r,double i){
this.real=r;
this.img=i;
}
ComplexNumber() { }
ComplexNumber sum(ComplexNumber c1,ComplexNumber c2){
ComplexNumber temp=new ComplexNumber();
temp.real=c1.real+c2.real;
temp.img=c1.img+c2.img;
return temp;
}
public static void main(String args[]){
ComplexNumber c1=new ComplexNumber(2.3,5.2);
ComplexNumber c2=new ComplexNumber(3.2,3.5);

System.out.println("First Complex Number: "+ c1.real + " + " + c1.img + "i");
System.out.println("Second Complex Number: "+ c2.real + " + " + c2.img + "i");

ComplexNumber temp1=new ComplexNumber();
temp1=temp1.sum(c1,c2);
System.out.println("Sum is " + temp1.real + " + " + temp1.img + "i");
}
}