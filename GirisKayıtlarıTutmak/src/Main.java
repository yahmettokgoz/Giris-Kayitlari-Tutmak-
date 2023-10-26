import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Kullanıcı adını giriniz:");
		String kullanıcıAdı = input.next();
		System.out.print("Şifreyi giriniz:");
		String sifre = input.next();
		Date tarih = new Date();

		if (kullanıcıAdı.equals("admin") && sifre.equals("123456")) {
			System.out.println("Giriş başarılı!");
			try {
				FileWriter writer = new FileWriter("girisKayitlari.txt");
				writer.write(kullanıcıAdı+" - "+tarih.toString());
			} catch (IOException e) {
				System.out.println("Dosya oluşturulurken bir hata oluştu.");
			}
		} else {
			System.out.println("Giriş başarısız!");
		}

	}

}
