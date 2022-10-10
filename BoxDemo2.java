public class BoxDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box mybox1=new Box();
		Box mybox2=new Box();
		double vol;
		mybox1.width=10;
		mybox1.depth=20;
		mybox1.height=30;
		mybox2.width=2;
		mybox2.depth=4;
		mybox2.height=6;
		vol=mybox1.width*mybox1.depth*mybox1.height;
		System.out.println("Volume is:"+vol);
		vol=mybox2.width*mybox2.depth*mybox2.height;
		System.out.println("Volume is:"+vol);

	}

}
