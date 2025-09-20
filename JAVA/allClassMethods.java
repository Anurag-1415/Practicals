import java.lang.reflect.*;

class ClassMethods{
	public static void main(String[] args) throws ClassNotFoundException{
		Class<?> cls = Class.forName("java.util.Arrays");
		System.out.println(cls.getSuperclass().getName());
		
		System.out.println("\nCollection Methods: \n");
		cls = Class.forName("java.util.Collections");

    Method[] methods = cls.getDeclaredMethods();
      for (Method method : methods) {
          System.out.println(method.getName());
        }
	
	  System.out.println("\nInteger Methods: \n");
	      cls = Class.forName("java.lang.Integer");

        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        
        
        System.out.println("\nString Methods: \n");
        cls = Class.forName("java.lang.String");

        Constructor<?>[] constructors =                          cls.getDeclaredConstructors();
        
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
	
	}
}
