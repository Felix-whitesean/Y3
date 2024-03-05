public class Person {
    int id;
    String name;

    public Person(int anid, String aName){
        id = anid;
        name = aName;
    }
    public void printDetails(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }
}
