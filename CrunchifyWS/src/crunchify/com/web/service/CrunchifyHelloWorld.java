package crunchify.com.web.service;
 
/**
 * @author Crunchify.com
 */
 
public class CrunchifyHelloWorld {
 
	public float addValue(float value) {
		System.out.println("value: " + value);
		return (value + 10);
	}
 
	public float subtractValue(float value) {
		return (value - 10);
	}
}