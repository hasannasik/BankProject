package bankAccount;

public class Guarantor {
//5. Step
    String fullName;
    String age;

    //6. Step
    public Guarantor(String fullName, String age) {
        this.fullName = fullName;
       if(Integer.parseInt(age)>=18){
           this.age = age;
       }else this.age ="0";


    }

//7. Step

   public boolean guarantorAgeControl(String ageOfGuarantor){
int guarantorAge=Integer.parseInt(Customers.ageControl(this.age));
        if(guarantorAge>=18){
            return true;
        }
return false;
    }

}
