package MainPackage.Bill;

import MainPackage.Bill.BillItem;

public class Item2 implements BillItem {

    @Override
    public int getPrice(String item) {

        switch (item) {
            case "Hybrid":  return 200000;
            case "Offgrid": return 100000;
            case "Ongrid":  return 150000;
            default:        return 0;
        }
    }
}
