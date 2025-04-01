
class Doctor{
    private String name;
    
    public Doctor(String name){
        this.name = name;
    }

    public void treat(Patient patient){
        System.out.println("Dr. " + name + " is treating patient " + patient.getName());
    }
}

class Patient{
    private String name;

    public Patient(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

class main{
    public static void main(String[] args){
        Doctor doctor = new Doctor("Smith");
        Patient patient = new Patient("John");

        doctor.treat(patient);
    }
}