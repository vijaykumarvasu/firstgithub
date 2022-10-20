class Disp{

int d1=8;
static int d2=7;

void arithmetic(int a1,int a2){
System.out.println(a1+a2);
System.out.println(a1-a2);
System.out.println(a1*a2);
System.out.println(a1/a2);
}

static float print(int a,int b){
System.out.println(a+b);
return 15;
}

public static void main(String args[]){
Disp o = new Disp();

int w=6,r=9;
float c = print(w,r);
double e =Math.pow(10,c);
System.out.println(e);

o.arithmetic(o.d1,d2);

  System.out.println("second commit");
  System.out.println("new branch");
}

}


