import javax.swing.JOptionPane;
public class miniMarket{
    public static void main(String[] args) {
    String menu = "";
    int orders;
    int numberofProduct = 0;
    String productName = "";
    int hargaNormal = 0;
    int hargaAkhir = 0;
    String totalProduk = "";
    int totalHarga = 0;
    String perulangan;
    String produk [][] = {{"Fried Indomie","10000\n"}, {"Boiled Indomie","10000\n"}
       , {"Hot Coffee","6000\n"}, {"Ice Coffee","8000\n"}, {"Fried rice","15000\n"}, 
       {"Sausages and Nuggets","15000\n"} , {"Mineral water","4000\n"}, 
       {"Ice tea","5000\n"}, {"Hot tea","6000\n"}
    };

        for(int i = 0;i < produk.length;i++){
            menu += "   " + (i+1) + ". " + produk[i][0] + "     Rp. " + produk[i][1];
            }
        
        do{
        orders = Integer.parseInt(JOptionPane.showInputDialog("=== MENU ===\n"+ menu + "\nApa yang ingin anda pesan?"));
        numberofProduct = Integer.parseInt(JOptionPane.showInputDialog("Jumlah pembelian produk"));
        switch(orders){
            case 1 :
                productName = produk[(orders-1)][0];
                hargaNormal = Integer.parseInt(produk[(orders-1)][1].trim());
                hargaAkhir = hargaNormal * numberofProduct;
                break;
            case 2 :
                productName = produk[(orders-1)][0];
                hargaNormal = Integer.parseInt(produk[(orders-1)][1].trim());
                hargaAkhir = hargaNormal * numberofProduct;
                break;
            case 3 :
                productName = produk[(orders-1)][0];
                hargaNormal = Integer.parseInt(produk[(orders-1)][1].trim());
                hargaAkhir = hargaNormal * numberofProduct;
                break;
            case 4 :
                productName = produk[(orders-1)][0];
                hargaNormal = Integer.parseInt(produk[(orders-1)][1].trim());
                hargaAkhir = hargaNormal * numberofProduct;
                break;
            case 5 :
                productName = produk[(orders-1)][0];
                hargaNormal= Integer.parseInt(produk[(orders-1)][1].trim());
                hargaAkhir = hargaNormal * numberofProduct;
                break;
            case 6 :
                productName = produk[(orders-1)][0];
                hargaNormal = Integer.parseInt(produk[(orders-1)][1].trim());
                hargaAkhir = hargaNormal * numberofProduct;
                break;
            case 7 :
                productName = produk[(orders-1)][0];
                hargaNormal = Integer.parseInt(produk[(orders-1)][1].trim());
                hargaAkhir = hargaNormal * numberofProduct;
                break;
            case 8 :
                productName = produk[(orders-1)][0];
                hargaNormal = Integer.parseInt(produk[(orders-1)][1].trim());
                hargaAkhir = hargaNormal * numberofProduct;
                break;
            case 9 :
                productName = produk[(orders-1)][0];
                hargaNormal = Integer.parseInt(produk[(orders-1)][1].trim());
                hargaAkhir = hargaNormal * numberofProduct;
                break;
            default : 
            JOptionPane.showMessageDialog(null,"Sorry, the product number you entered is invalid");
            break;
        }
        totalProduk += productName + "   " + hargaNormal + "    " + numberofProduct + "\n";
        totalHarga += hargaAkhir;

        perulangan = JOptionPane.showInputDialog("Do you want to buy another product (yes/no)?");
        }while(perulangan.equalsIgnoreCase("Yes"));

        JOptionPane.showMessageDialog(null,"=== PAYMENT RECEIPT ===\nPurchased products : \n" +  totalProduk + "The price to pay : " + totalHarga);
    }
}