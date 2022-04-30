package tr.com.ckama.btkjavacourse.Classes;

public class Main {
    public static void main(String[] args) {

        // new operatörü ile nesne örneği yaratıldığında bu örnekler memory'nin stack alanında yaratılır.
        CustomerManager manager1 = new CustomerManager();
        CustomerManager manager2 = new CustomerManager();

        // alt satırdaki bir örneğin farklı örneğe atanması durumunda heapte çağrıda bulundukları referanslar atanır. Böylelikle manager2 hangi referansa çağrıda bulunuyorsa,
        // manager1 de aynı referansa çağrıda bulunur.
        manager1 = manager2;

        // CustomerManager sınıfı örneklerinin operasyonları olan metotlar heap memory'de tutulur.
        manager1.add();
        manager2.remove();
        manager1.update();

        // value types. alt satırdaki atamalar stack memory'de tutulur.
        int sayi1 = 10;
        int sayi2 = 20;

        sayi2 = sayi1;
        sayi1 = 30;

        System.out.println(sayi2);

    }

}
