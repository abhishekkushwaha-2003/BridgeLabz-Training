public class PenDistribution{
	public  static void main(String [] args){
		
		int totalPen = 14;
		int totalStudent = 3;			
		int penPerStudent = totalPen/totalStudent;	
		int remainingPen =  totalPen%totalStudent;

		System.out.print("The Pen Per Student is "+penPerStudent+" and the Remaining pen not distributed is "+remainingPen);
	}
}