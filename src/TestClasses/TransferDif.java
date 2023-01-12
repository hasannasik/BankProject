package TestClasses;

import bankAccount.Customers;

public class TransferDif {
    public static void main(String[] args) {

        Customers u1=new Customers("Kuzey", "kzy123", "02/09/2000", "Evli", 1000, 2000);

        Customers u2 = new Customers("Eva", "evaBjk1903", "11/12/1998", "bekar", 3000, 2000);


        u1.transfer(u1,u2);

       System.out.println(u1.toString());
       System.out.println(u2.toString());

//         Kefil eklemek istiyor musunuz ?              TODO----CEVAP = Evet / Hayır
//         Kefilin adı ?                                TODO----CEVAP = Bilal
//         Kefilin doğum tarihi ?                       TODO----CEVAP = 02/09/2000
//         Hesaplarınız arasında mı yoksa farklı bir kullanıcı
//         arasında mı transfer yapmak istiyorsunuz?    TODO----CEVAP = Farklı / Kendi
//         Transfer istediğiniz para miktarını girin    TODO----CEVAP = 200


    }
}
