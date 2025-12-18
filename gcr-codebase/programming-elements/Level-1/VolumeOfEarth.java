public class VolumeOfEarth{
	public  static void main(String [] args){
		
		int radiusOfEarth = 6378;
		double pi = 3.14;
		double radiusInMiles = 0.621371*radiusOfEarth;	 		
		double  cubicKilometer = (4.0/3.0)*pi*radiusOfEarth*radiusOfEarth*radiusOfEarth;
		double cubicMiles =  (4.0/3.0)*pi* radiusInMiles * radiusInMiles * radiusInMiles ;

		System.out.print("The volume of earth in cubic kilometer is "+cubicKilometer+" and cubic miles is "+cubicMiles);

		}
}