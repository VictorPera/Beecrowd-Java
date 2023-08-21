public class GalToLitTable {
    public static void main(String[] args) throws Exception {

        double galao, litro;
        int count = 0;

        for(galao = 1; galao <= 100; galao++){
            litro = galao * 3.7854;
            System.out.println(galao + " galões são " + litro + " litros.");

            count++;

            if(count == 10){
                System.out.println();
                count = 0;
            }
        }
    }
}
