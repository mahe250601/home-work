class Number 
{
    int value;
    Number(int value) 
	{
        this.value = value;
    }
}

public class SwapExample 
{

    static void swap(Number a, Number b) 
	{
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String[] args) 
	{
        Number a = new Number(10);
        Number b = new Number(20);

        swap(a, b);

        System.out.println("a = " + a.value + " b = " + b.value);
    }
}