package fundamentalsgood;

public class Simpleinterest {
int princi;
int time;
int rate;

 Simpleinterest(int princi,int time,int rate){
	
	this.princi=princi;
	this.time=time;
	this.rate=rate;
	
}
 public float calculate() {
	 return (this.princi*this.time*this.rate)/100;
 }
	

public static void main(String[] args) {
	Simpleinterest S1=new Simpleinterest(1000,2,5);
		float As=S1.calculate();
		System.out.println(As);
}
}