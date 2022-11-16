package ex_4;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Demo {
	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	@interface GamingLaptop {
		String graphicsProcessor() default "Intel Iris Graphics 540";
		String graphicsMemory() default "32GB";		
	}

interface Laptops {
	void showInformation();
}

@GamingLaptop
public static class AsusLaptops implements Laptops {

	@Override
	public void showInformation() {
		System.out.println("I am an average gaming laptop");
	}
}

@GamingLaptop(graphicsProcessor="Core X eGPU", graphicsMemory="64GB")
public static class RazerLaptops implements Laptops {
	
	@Override
	public void showInformation() {
		System.out.println("I am a powerful gaming laptop");
	}
}
	public static void main(String[] args) {
		RazerLaptops rl = new RazerLaptops();
		AsusLaptops al = new AsusLaptops();
		
		rl.showInformation();
		al.showInformation();
	}
//output 
//	I am a powerful gaming laptop
//	I am an average gaming laptop







}
