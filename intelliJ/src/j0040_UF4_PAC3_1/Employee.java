package j0040_UF4_PAC3_1;

public class Employee{
    private String name;
    private int age;
    private String rol;

    public Employee(String name, int age, String rol){
        this.name = name;
        this.age = age;
        this.rol = rol;
    }
    public void getEmployee(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Rol: " + rol);
    }
    public void sayHello(){
        System.out.println("Hello " + name);
    }
}