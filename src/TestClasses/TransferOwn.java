package TestClasses;

import bankAccount.Customers;

public class TransferOwn {
    public static void main(String[] args) {


        Customers u1=new Customers("Kuzey", "Kk44_n", "10/02/2000", "Evli", 1000, 2000);

        u1.transfer(u1,u1);
        System.out.println(u1.toString());

//         Kefil eklemek istiyor musunuz ?      TODO----CEVAP = Evet
//         Kefilin adı ?                        TODO----CEVAP = Esra
//         Kefilin doğum tarihi ?               TODO----CEVAP = 11/11/2002
//         Hesaplarınız arasında mı yoksa farklı bir kullanıcı
//         arasında mı transfer yapmak istiyorsunuz?    TODO----CEVAP = Kendi
//         Transfer istediğiniz para miktarını girin    TODO----CEVAP = 100


    }
}
