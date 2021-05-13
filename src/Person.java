public class Person {


    private String _name;
    private String _gender;
    private int _age;

    //Using getters and setters
    //Making 2 getter setter and third from constructor
    public String getName(){
        return _name;
    }
    public void setName(String name){
        this._name = name;
    }

    public String getGender(){
        return _gender;
    }
    public void setGender(String gender){
        this._gender = gender;
    }

    //2nd way using getters and setters
    //Creating constructor
    public Person(int age){
        this._age = age;
    }

    //Creating Public method
    public void runs(){
        System.out.println(this._name + " Runs ");
    }

    public static void main(String[] args) {

        //Simple way of doing it..
//        Person obj = new Person();
//        obj.age=20;
//        obj.gender="Male";
//        obj.name="Manmehak Partap Singh";

        //2nd way
        Person obj = new Person(20);
        obj.setName("Manmehak Partap Singh");
        obj.setGender("Male");
        System.out.println(obj.getName());
        System.out.println(obj.getGender());
        System.out.println(obj._age);
        obj.runs();


    }

}
