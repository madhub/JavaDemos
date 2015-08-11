public class Demo {

 public static class Base
    {
        public Base()
        {
            Hello();
        }
        public void Hello()
        {
            System.out.println("Hello From Base");
        }
    }

    public static class Derieved extends Base
    {
        public void Hello()
        {
            System.out.println("Hello From Derieved");
        }
    }

	 public static void main(String[] args)
        {
		Base b = new Derieved ();
	}
}