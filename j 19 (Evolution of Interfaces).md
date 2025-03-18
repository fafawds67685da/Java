## Evolution of Interfaces in Java

| Java Version | Interface Features |
|-------------|------------------|
| **Java 1.7** | <ul><li>All methods in an interface are **public** and **abstract** by default.</li><li>A class **must override every method** of an interface.</li></ul> |
| **Java 1.8** | <ul><li>Introduced **default methods** (methods with body in an interface).</li><li>Introduced **static methods** in interfaces.</li><li>All **abstract methods must be overridden**.</li><li>Non-abstract methods can only be **default or static**.</li><li>To invoke a **static method** from an interface, use: `InterfaceName.methodName();`</li></ul> |
| **Java 1.9** | <ul><li>Introduced **private methods** and **private static methods** in interfaces.</li><li>Private methods **solve conflicts** when multiple interfaces have default methods with the same signature.</li></ul> |
