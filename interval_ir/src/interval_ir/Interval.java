package interval_ir;

public class Interval {
	
	public int upperLimit;
	public int lowerLimit;
	
	// Getters (inspectors)
	public static int getLowerLimit(Interval interval) {
		return interval.lowerLimit;
	}
	
	public static int getUpperLimit(Interval interval) {
		return interval.upperLimit;
	}
	
	public static int getLength(Interval interval) {
		return interval.upperLimit - interval.lowerLimit;
	}


	// Setters (mutators)
	public static void setLowerLimit(Interval interval, int newLowerLimit) {
		interval.lowerLimit = newLowerLimit;
	}
	
	public static void setUpperLimit(Interval interval, int newUpperLimit) {
		interval.upperLimit = newUpperLimit;
	}
	
	public static void setLength(Interval interval, int newLength) {
		interval.upperLimit = interval.lowerLimit + newLength;
	}



}
