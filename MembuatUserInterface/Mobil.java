
package MembuatUserInterface;


public class Mobil implements Kendaraan{
//    deklarasi variabel yang bernama tipemobil
    String type;
    
//    membuat constructor class mobil
    public Mobil(){
        this.type = "hrv";
    
    
//    berikan nilai default pada pemanggilan variabel tipe mobil
    this.type = "hrv";
    }
    
//    buat function untuk menampilkan nilai yang telah diberi
    public void display(){
        System.out.println("Jenis Mobil " + this.type);
    }
    
    @Override
    public void bahanbakar(){
    System.out.println("interface method implements");
    System.out.println("kendaraan membutuhkan bahan bakar");
}
    
    public static void main(String[] args){
//        meninisialisasi class objek
        Mobil mobil = new Mobil();
        
        mobil.bahanbakar();
        
//        menampilkan nilai melalui objek yang telah diberikan
mobil.display();
    }
}
