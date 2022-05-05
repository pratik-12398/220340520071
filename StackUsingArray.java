class StackUsingArray{
int [] arr;
int size;
int top1;
int top2;

StackUsingArray(int p)
{
	size=p;
	arr= new int[p];
	top1=p / 2+1;
	top2=p / 2;
}
void push1(int q)
	{
	if(top1>0)
		{
		top1--;
		arr[top1]=q;
		}
		else
		{
		System.out.println("Stack Overflow"+ "By element :"+  q);
		System.out.println();
		return;
		}
	}
void push2(int q)
	{
	if(top2<size - 1)
		{
		top2++;
		arr[top2]=q;
		}
		else
		{
		System.out.println("Stack Overflow"+ "By element :"+  q);
		System.out.println();
		return;
		}
	}

int pop1()
{
	if(top1<= size/2)
	{
	int q= arr[top1];
	top1++;
	return q;
	}
	else
	{
	System.out.println("Stack underflow");
	}
	return 0;
}
int pop2()
{
	if(top2>= size/2+1)
	{
	int q= arr[top2];
	top2--;
	return q;
	}
	else
	{
	System.out.println("Stack underflow");
	}
	return 1;
	}
};
class DriverClass{

public static void main(String args[]){

StackUsingArray msd= new StackUsingArray(5);
		msd.push1(5);
		msd.push2(10);
		msd.push2(15);
		msd.push1(11);
		msd.push2(7);
		msd.push2(40);
		
		System.out.println("Popped  element from the stack 1 is "+" ->"+ msd.pop1());
		System.out.println();
		System.out.println("Popped  element from the stack 1 is "+" ->"+ msd.pop2());
		System.out.println();
		}
}
