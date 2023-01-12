package bankAccount;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Customers extends Account {

    //8. Step
    public String name;
    public String password;
    public String dateOfBirth;
    public String maritalStatus;
    public String guarantorFullName;
    public String guarantorAge;

    public int accountNo1;
    public int accountBalance1;
    public int accountNo2;
    public int accountBalance2;


    //9. Step
    public Customers(String name, String password, String dateOfBirth, String maritalStatus,
                     int accountBalance1, int accountBalance2) {
        this.name = name;
        this.password = password;
        this.accountBalance1 = accountBalance1;
        this.accountBalance2 = accountBalance2;
        this.accountNo1 = randomAccountNo();
        this.accountNo2 = randomAccountNo();
        this.maritalStatus = maritalStatusCheck(maritalStatus);
        this.dateOfBirth = ageControl(dateOfBirth);


    }


    //10. Step


    public String maritalStatusCheck(String maritalStatus) {
        Scanner input = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        if (maritalStatus == "Evli") {
            System.out.print("Kefil eklemek istiyor musunuz : ");
            String answer = input.nextLine();
            if (answer.toLowerCase().contains("evet")) {

                System.out.print("Kefilin adi : ");
                String guarantorName = input.nextLine();
                System.out.print("Kefilin dogum tarihi (dd/MM/yyyy) : ");
                String guarantorDateOfBirth = input.nextLine();

                DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate date = LocalDate.parse(guarantorDateOfBirth, f);
                date.getYear();
                int guarantorAge = today.getYear() - date.getYear();
                String ageStr = String.valueOf(guarantorAge);
                Guarantor newGuarantor = new Guarantor(guarantorName, ageStr);


                this.guarantorFullName = guarantorName;
                this.guarantorAge = ageStr;
                if (Integer.parseInt(ageStr) < 18) {
                    String message = "Kefil 18 yasindan buyuk olmalidir.";
                    this.guarantorFullName = message;
                    this.guarantorAge = message;
                    return message;
                } else return "islem basarili";

            }
        }

        return maritalStatus;
    }

    //11. Step

    public static String ageControl(String dateOfBirth) {

        LocalDate today = LocalDate.now();

        DateTimeFormatter specilType = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String birthday = dateOfBirth.substring(6);


        if (today.getYear() - Integer.parseInt(birthday) >= 18) {
            return "Kredi karti alabilirsiniz !";
        } else return "Kredi karti alabilmek icin en az 18 yasinda olmalisiniz.";

    }

    //12. Step
    public int randomAccountNo() {


        return (int) (Math.random() * (99999999 - 10000000) + 10000000);
    }

    //13. Step

    public void transfer(Customers object1, Customers object2) {
        Scanner scan = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        System.out.print("Hesaplariniz arasinda mi yoksa farkli bir kullanici arasinda" +
                " mi transfer yapmak istiyorsunuz? :");
        String answer = scan.nextLine();
        if (answer.toLowerCase().contains("kendi")) {
            System.out.print("Transfer etmek istediginiz miktari giriniz : ");
            int amount = scanInt.nextInt();
            Account.virman(object1,amount);
        } else {
            System.out.print("Transfer etmek istediginiz miktari giriniz : ");
            int amount = scanInt.nextInt();
            Account.transferToDifferentAccount(object1, object2, amount);
        }
    }

//14 . Adim
public void processLoading(){
    char[] animationChars = new char[]{'|', '/',  '\\'};

    for (int i = 0; i <= 100; i++) {
        System.out.print("Processing : " + i + "% " + animationChars[i % 3] + "\r");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    System.out.println("Report has been prepared : Done!");
}

    @Override
    public String toString() {
        processLoading();
        return "\t"+"*** Report by Group2!! ***" +"\n"+
                "Customer name ='" + name + '\'' +"\n"+
                "Customer password ='" + password + '\'' +"\n"+
                "Date of birth ='" + dateOfBirth + '\'' +"\n"+
                "Marital status ='" + maritalStatus + '\'' +"\n"+
                "Account no1 =" + accountNo1 +"\n"+
                "Account balance1 =" + accountBalance1 +"\n"+
                "Account no2 =" + accountNo2 +"\n"+
                "Account balance2 =" + accountBalance2 +"\n"+
                "Guarantor ='" + guarantorFullName + '\'' +"\n"+
                "Guarantor age ='" + guarantorAge + '\'' +"\n"
                ;
    }


}
