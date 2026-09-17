public class Main1 {
    public static void main(String[] args) {

        //explicit casting data itkisi olur
        //double-dakı hər dəyəri int saxlaya bilmir, int yalnız tam hissəni saxlayır
        //meselen burda int 12 saxlayir 0.5 data itkisi olur
        double i = 12.5;
        int b = (int) i;
        System.out.println(b);

        //implicit casting automatic cevrilir
        //int double-ın alt çoxlugudur ona gore de hər int dəyər double-da saxlanıla bilər.
        int a = 23;
        double d = a;
        System.out.println(d);
    }
}