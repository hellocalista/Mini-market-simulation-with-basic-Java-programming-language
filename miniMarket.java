import javax.swing.JOptionPane;
public class miniMarket{
    public static void main(String[] args) {
    String menu = "";
    int orders;
    int numberofProduct = 0;
    String productName = "";
    int normalPrice = 0;
    int finalPrice = 0;
    String totalProducts = "";
    int totalPrice = 0;
    String repetition;
    String products [][] = {{"Fried Indomie","10000\n"}, {"Boiled Indomie","10000\n"}
       , {"Hot Coffee","6000\n"}, {"Ice Coffee","8000\n"}, {"Fried rice","15000\n"}, 
       {"Sausages and Nuggets","15000\n"} , {"Mineral water","4000\n"}, 
       {"Ice tea","5000\n"}, {"Hot tea","6000\n"}
    };

        for(int i = 0;i < products.length;i++){
            menu += "   " + (i+1) + ". " + products[i][0] + "     Rp. " + products[i][1];
            }
        
        do{
        orders = Integer.parseInt(JOptionPane.showInputDialog("=== MENU ===\n"+ menu + "\nApa yang ingin anda pesan?"));
        numberofProduct = Integer.parseInt(JOptionPane.showInputDialog("Jumlah pembelian produk"));
        switch(orders){
            case 1 :
                productName = products[(orders-1)][0];
                normalPrice = Integer.parseInt(products[(orders-1)][1].trim());
                finalPrice = normalPrice * numberofProduct;
                break;
            case 2 :
                productName = products[(orders-1)][0];
                normalPrice = Integer.parseInt(products[(orders-1)][1].trim());
                finalPrice = normalPrice * numberofProduct;
                break;
            case 3 :
                productName = products[(orders-1)][0];
                normalPrice = Integer.parseInt(products[(orders-1)][1].trim());
                finalPrice = normalPrice * numberofProduct;
                break;
            case 4 :
                productName = products[(orders-1)][0];
                normalPrice = Integer.parseInt(products[(orders-1)][1].trim());
                finalPrice = normalPrice * numberofProduct;
                break;
            case 5 :
                productName = products[(orders-1)][0];
                normalPrice = Integer.parseInt(products[(orders-1)][1].trim());
                finalPrice = normalPrice * numberofProduct;
                break;
            case 6 :
                productName = products[(orders-1)][0];
                normalPrice = Integer.parseInt(products[(orders-1)][1].trim());
                finalPrice = normalPrice * numberofProduct;
                break;
            case 7 :
                productName = products[(orders-1)][0];
                normalPrice = Integer.parseInt(products[(orders-1)][1].trim());
                finalPrice = normalPrice * numberofProduct;
                break;
            case 8 :
                productName = products[(orders-1)][0];
                normalPrice = Integer.parseInt(products[(orders-1)][1].trim());
                finalPrice = normalPrice * numberofProduct;
                break;
            case 9 :
                productName = products[(orders-1)][0];
                normalPrice = Integer.parseInt(products[(orders-1)][1].trim());
                finalPrice = normalPrice * numberofProduct;
                break;
            default : 
            JOptionPane.showMessageDialog(null,"Sorry, the product number you entered is invalid");
            break;
        }
        totalProducts += productName + "   " + normalPrice + "    " + numberofProduct + "\n";
        totalPrice += finalPrice;

        repetition = JOptionPane.showInputDialog("Do you want to buy another product (yes/no)?");
        }while(repetition.equalsIgnoreCase("Yes"));

        JOptionPane.showMessageDialog(null,"=== PAYMENT RECEIPT ===\nPurchased products : \n" +  totalProducts + "The price to pay : " + totalPrice);
    }
}