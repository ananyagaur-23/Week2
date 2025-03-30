interface Worker{
    void performDuties();
}

class Person{
    String name;
    int id;

    Person(String name, int id){
        this.name = name;
        this.id = id;
    }
    void displayDetail(){
        System.out.println("Name: "+name+"\nid: "+id);
    }
}

class Chef extends Person{
    String speciality;

    Chef(String name, int id, String speciality){
        super(name, id);
        this.speciality = speciality;
    }
    void performDuties(){
        System.out.println(name+" is preparing "+speciality+" dishes.");
    }
}

class Waiter extends Person{
    int tables;

    Waiter(String name, int id, int tables){
        super(name, id);
        this.tables = tables;
    }
    void performDuties(){
        System.out.println(name+" is attending to table "+tables);
    }
}