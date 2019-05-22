
public class AccumulatorMain {

	public static void main(String[] args) {
		
		System.out.println("Accumulator.grandTotal = " + Accumulator.grandTotal);
		
		Accumulator acc1 = new Accumulator();
		Accumulator acc2 = new Accumulator();
		
		acc1.accumulate(150);
		acc2.accumulate(260);
		
		System.out.println("acc1.total = " + acc1.total);
		System.out.println("acc1.grandTotal = " + Accumulator.grandTotal);
		System.out.println("Accumulator.getGrandTotla() = " + Accumulator.getGrandTotal());

		System.out.println("acc2.total = " + acc2.total);
		System.out.println("acc2.grandTotal = " + Accumulator.grandTotal);
		
		
		
		
		
	}
}
