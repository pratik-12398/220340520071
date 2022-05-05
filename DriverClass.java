class StackUsingArray{
int [] arr;
int size;
int top_1;
int top_2;

StackUsingArray(int p)
{
	size=p;
	arr= new int[p];
	top_1=-1;
	top_2=size;
}
void push_1(int q)
	{
	if(top_1 < top_2 -1)
		{
		top_1++;
		arr[top_1]=q;
		}
		else
		{
		System.out.println("Stack Overflow");
		System.out.println();
		return;
		}
	}
void push_2(int q)
	{
	if(top_1 < top_2 - 1)
		{
		top_2--;
		arr[top_2]=q;
		}
		else
		{
		System.out.println("Stack Overflow");
		System.out.println();
		return;
		}
	}

int pop_1()
{
	if(top_1 >= 0)
	{
	int q= arr[top_1];
	top_1--;
	return q;
	}
	else
	{
	System.out.println("Stack underflow");
	}
	return 0;
}
int pop_2()
{
	if(top_2< size)
	{
	int q= arr[top_2];
	top_2++;
	return q;
	}
	else
	{
	System.out.println("Stack underflow");
	}
	return 0;
	}
};
class DriverClass{

public static void main(String args[]){

StackUsingArray msd= new StackUsingArray(6);
		msd.push_1(5);
		msd.push_2(10);
		msd.push_2(15);
		msd.push_1(11);
		msd.push_2(7);
		msd.push_2(40);

		System.out.println("Popped  element from the stack 1 is "+" ->="+ msd.pop_1());
		System.out.println();

		System.out.println("Popped  element from the stack 1 is "+" ->="+ msd.pop_2());
		System.out.println();
		}
}
