package MainPackage.Bill;

import MainPackage.Bill.BillItem;

public class Item3 implements BillItem {

    @Override
    public int getPrice(String item) {

        switch (item) {
            case "AE Solar": return 30000;
            case "Ginko":    return 28000;
            case "JA Solar": return 32000;
            case "Lunji":    return 25000;
            case "Trina":    return 35000;
            default:         return 0;
        }
    }
}

