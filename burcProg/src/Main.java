/*
Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart

Ödev
Aynı örneği switch-case kullanmadan yapınız.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day;
        String month, burc = "";
        boolean isError = false;
        Scanner scan = new Scanner(System.in);

        System.out.println("Burcunuzu bulmak için doğum tarihinizi giriniz : ");
        System.out.print("Doğduğunuz gün : ");
        day = scan.nextInt();
        System.out.print("Doğduğunuz ay : ");
        month = scan.next();


        if (month.equals("1") || month.equals("Ocak") || month.equals("ocak")){
            if (day <=21 && 1 <= day){
                burc = "Oğlak";
            }else if(day <= 31){
                burc = "Kova";
            }else{
                isError = true;
            }
        }else if(month.equals("2") || month.equals("Subat") || month.equals("subat") || month.equals("Şubat") || month.equals("şubat")){
            if (day <=19 && 1 <= day){
                burc = "Kova";
            }else if(day <= 28){
                burc = "Balık";
            }else{
                isError = true;
            }
        }else if(month.equals("3") || month.equals("Mart") || month.equals("mart")){
            if (day <=20 && 1 <= day){
                burc = "Balık";
            }else if(day <= 31){
                burc = "Koç";
            }else{
                isError = true;
            }
        }else if(month.equals("4") || month.equals("Nisan") || month.equals("nisan")){
            if (day <=20 && 1 <= day){
                burc = "Koç";
            }else if(day <= 30){
                burc = "Boğa";
            }else{
                isError = true;
            }
        }else if(month.equals("5") || month.equals("Mayıs") || month.equals("mayıs") || month.equals("Mayis") || month.equals("mayis")){
            if (day <=21 && 1 <= day){
                burc = "Boğa";
            }else if(day <= 31){
                burc = "İkizler";
            }else{
                isError = true;
            }
        }else if(month.equals("6") || month.equals("Haziran") || month.equals("haziran")){
            if (day <=22 && 1 <= day){
                burc = "İkizler";
            }else if(day <= 30){
                burc = "Yengeç";
            }else{
                isError = true;
            }
        }else if(month.equals("7") || month.equals("Temmuz") || month.equals("temmuz")){
            if (day <=22 && 1 <= day){
                burc = "Yengeç";
            }else if(day <= 31){
                burc = "Aslan";
            }else{
                isError = true;
            }
        }else if(month.equals("8") || month.equals("Ağustos") || month.equals("ağustos") || month.equals("Agustos") || month.equals("agustos")){
            if (day <=22 && 1 <= day){
                burc = "Aslan";
            }else if(day <= 31){
                burc = "Başak";
            }else{
                isError = true;
            }
        }else if(month.equals("9") || month.equals("Eylül") || month.equals("eylül") || month.equals("Eylul") || month.equals("eylul")){
            if (day <=22 && 1 <= day){
                burc = "Başak";
            }else if(day <= 30){
                burc = "Terazi";
            }else{
                isError = true;
            }
        }else if(month.equals("10") || month.equals("Ekim") || month.equals("ekim")){
            if (day <=22 && 1 <= day){
                burc = "Terazi";
            }else if(day <= 31){
                burc = "Akrep";
            }else{
                isError = true;
            }
        }else if(month.equals("11") || month.equals("Kasım") || month.equals("kasım") || month.equals("Kasim") || month.equals("kasim")){
            if (day <=21 && 1 <= day){
                burc = "Akrep";
            }else if(day <= 30){
                burc = "Yay";
            }else{
                isError = true;
            }
        }else if(month.equals("12") || month.equals("Aralık") || month.equals("aralık") || month.equals("Aralik") || month.equals("aralik")){
            if (day <=21 && 1 <= day){
                burc = "Yay";
            }else if(day <= 31){
                burc = "Oğlak";
            }else{
                isError = true;
            }
        }else{
            isError = true;
        }

        if(isError){
            System.out.println("Geçersiz tarih girdiniz!");
        }else {
            System.out.println("Burcunuz : " + burc);
        }
    }
}
