
class Mahasiswa {
    String nama;
    String NIM;
    
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }
    
    void showData(){
        System.out.println("Nama Anda : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    
    String getNama(){
        return this.nama;
    }
    
    String sayHello(String nama){
        return "Halo" + nama + "salam kenal";
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Azmil", "400120212");
        mahasiswa1.showData();
        System.out.println("Nama Anda : "+ mahasiswa1.getNama());
        String data = mahasiswa1.sayHello("Sueb");
        System.out.println(data);
    }
}