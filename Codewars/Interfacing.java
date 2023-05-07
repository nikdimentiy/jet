// CodeWars task: solution -> https://www.codewars.com/kata/54c183dd3f069611c3000f97/train/java

/**
 * A utility class that creates a dynamic proxy object based on the provided
 * interface(s). The proxy object allows setting and getting field values 
 * dynamically through generated getter and setter methods.
 */
public class Interfacing {

    /**
     * Creates a dynamic proxy object that implements the given interface(s). 
     * The generated proxy object allows setting and getting field values 
     * dynamically through generated getter and setter methods.
     * 
     * @param interfaces an array of interfaces to implement
     * @return a proxy object that implements the given interface(s)
     */
    public static Object create(Class<?>[] interfaces) {
        return Proxy.newProxyInstance(
                ClassHelper.getClassLoader(),
                interfaces,
                new InvocationHandler() {
                    
                    // A table to store field values
                    private Map<String, Object> fields = new HashMap<>();

                    /**
                     * Handles method invocations on the generated proxy object.
                     * If the method starts with "get", it returns the value of the 
                     * corresponding field. If the method starts with "set", it sets 
                     * the value of the corresponding field to the provided argument. 
                     * Throws UnsupportedOperationException if the method name does 
                     * not start with "get" or "set".
                     * 
                     * @param instance the generated proxy object
                     * @param method the method being invoked
                     * @param args the arguments passed to the method
                     * @return the value returned by the method
                     * @throws UnsupportedOperationException if the method name does not start with "get" or "set"
                     */
                    @Override
                    public Object invoke(Object instance, Method method, Object[] args) {
                        if(method.getName().startsWith("get")) {
                            // Getter method was called
                            return fields.get(method.getName().substring(3));
                        } else if(method.getName().startsWith("set")) {
                            // Setter method was called
                            fields.put(method.getName().substring(3), args[0]);
                            return null;
                        } else {
                            // Something went horribly wrong
                            throw new UnsupportedOperationException();
                        }
                    }
                }
        );
    }
}



