class A{
private int zero;
  /* public int getZero() {
        return this.zero;
    }
 
    public void setZero(int num) {
     if (num>10)   
      this.zero = num;
     else
      throw new IllegalArgumentException();
    }*/

public void setZero(int num){
this.zero=num;}

public int getZero(){
return this.zero;}

int a(){
int a = 12;
return a;}}

class B {
int b(){
int b=16;
return b;}}

class C {
int c(){
int c= 18;
return c;}}

class D{ 
public static void main(String args[]){
A a1 = new A();
B b1 = new B();
C c1 = new C();
a1.setZero(11);
int e = a1.getZero();
int d=a1.a()+b1.b()+c1.c();
System.out.println(a1.a());
System.out.println(b1.b());
System.out.println(c1.c());
System.out.println(d);
System.out.println(e);
int zero=25;
System.out.println(zero);
System.out.println(zero);

}
}

