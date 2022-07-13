import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName = "Patika";
        String loginUsername = new String();
        String loginPassword = new String();
        String password = "1234";
        int changepassword,reLogin;

        Scanner kb = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz:");
        loginUsername = kb.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        loginPassword = kb.nextLine();

        if (userName.equals(loginUsername) && password.equals(loginPassword)) {
            System.out.println("Başarıyla Giriş Yaptınız! ");
        } else {
            System.out.println("Kullanıcı Adınız Veya Parolanız Hatalı!\nŞifrenizi Sıfırlamak İstiyorsanız 1'e Basınız, Çıkmak İçin 0'a Basınız: ");
            changepassword = kb.nextInt();

            if (changepassword == 1 ){
                System.out.print("Kullanıcı Adınızı Giriniz: ");
                userName = kb.nextLine();
                System.out.print("Yeni Şifrenizi Giriniz: ");
                password = kb.nextLine();
                if (loginPassword.equals(password) && loginUsername.equals(userName)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    System.out.println("Program Bitti");
                }else{
                    System.out.println("Başarıyla Şifreniz Değiştirildi");
                    System.out.print("Yeniden Giriş Yapmak İçin 1'e, Çıkış Yapmak İçin 0'a Basınız: ");
                    reLogin = kb.nextInt();
                    if (reLogin == 1){
                        System.out.print("Kullanıcı Adınızı Giriniz:");
                        loginUsername = kb.nextLine();
                        System.out.print("Şifrenizi Giriniz: ");
                        loginPassword = kb.nextLine();

                        if (password.equals(loginPassword) && userName.equals(loginUsername)){
                            System.out.println("Başarıyla Giriş Yapıldı!");
                            System.out.println("Program Bitti.");
                        }else{
                            System.out.println("Kullanıcı Adınız Veya Parolanız Hatalı!");
                            System.out.println("Program Bitti.");
                        }
                    }else{
                        System.out.println("Program Bitti.");
                    }
                }
            }else{
                System.out.println("Program Bitti.");
            }
        }

    }
}
