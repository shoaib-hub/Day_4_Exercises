package ex_4;
import java.lang.annotation.*; 
import java.lang.reflect.*; 
import java.util.ArrayList;
import java.util.Random;

public class Anno {
	//@Retention annotation is used to specify to what level annotation will be available.
//	@Target tag is used to specify at which type, the annotation is used
	@Retention(RetentionPolicy.RUNTIME)  
	@Target({ElementType.FIELD,ElementType.METHOD})  
	@interface JsonIgnore{  
	int value()  default 1;
	String name() default "shoaib";
	}  
	  
	//Applying annotation  
	public static class Hello{  
	@JsonIgnore(value=10)  
	public void sayHello(){System.out.println("hello annotation");}  
	}  
	  
	//Accessing annotation  
	public  static void main(String args[])throws Exception{  
	  
	Hello h=new Hello();  
	// getclass() method  returns runtime  class of the object "this".
	// getmethod() method returns the value of variable name.
	Method m=h.getClass().getMethod("sayHello");  
	  
	JsonIgnore manno=m.getAnnotation(JsonIgnore.class);  
	System.out.println("value is: "+manno.value()); 
	System.out.println("name is : "+manno.name());
		}

}

// output :
//value is: 10
//name is : shoaib

