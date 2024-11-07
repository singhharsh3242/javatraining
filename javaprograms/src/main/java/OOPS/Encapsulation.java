package OOPS;
//it is data binding using method
public class Encapsulation {
    public static void main(String[] args) {
        //to print the trainer profile
        Trainers trainer= new Trainers();
        trainer.name ="pawan sharma";
        trainer.email="pawansharma@gmail";
        trainer.technology="java";
        System.out.println("the trainer name is " + trainer.name+"and his email is"+trainer.email+"the technology used by him is "+trainer.technology);

trainer.setName("suraj");
trainer.setEmail("s@gamail");
trainer.setTechnology("java");
        System.out.println(trainer.getName()+trainer.getEmail()+trainer.getTechnology());
    }
}

class Trainers{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    String name;
    String email;
    String technology;




}
