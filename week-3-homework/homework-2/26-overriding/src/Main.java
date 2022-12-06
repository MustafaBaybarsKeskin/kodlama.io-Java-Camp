/*
Bir class'ın herhangi bir operasyonu siz aksini belirtmedğiniz sürece overrideable yani üzerine yazılabilirdir.
Vir class'ı inherit eden başka bir class onu ezeblir, miras aldığı sınıf ezebelir.
C#'ta bu duurmlar virtual kullanılır.
Eğer metoda final keyword'u ile işaretlersek kimse o metodu ezemez.
 */
public class Main {

    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};

        for(BaseKrediManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }

    }
}