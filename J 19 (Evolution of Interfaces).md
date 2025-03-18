## Evolution of Interfaces in Java

| **Java Version** | **Key Features** |
|----------------|------------------------------------------------|
| **Java 1.7**  | ✅ All methods in an interface are **public** and **abstract** by default.<br>✅ A class **must override every method** of an interface. |
| **Java 1.8**  | ✅ Introduced **default methods** (methods with a **body** in an interface).<br>✅ Introduced **static methods** in interfaces.<br>✅ All **abstract methods must be overridden** by implementing classes.<br>✅ Non-abstract methods can only be **default** or **static**.<br>✅ To invoke a **static method** from an interface, use: `InterfaceName.methodName();`. |
| **Java 1.9**  | ✅ Introduced **private methods** and **private static methods** in interfaces.<br>✅ **Prevents conflicts** when multiple interfaces have **default methods** with the same signature.<br>✅ **Enhances code reuse** within interfaces by allowing method implementation sharing. |
