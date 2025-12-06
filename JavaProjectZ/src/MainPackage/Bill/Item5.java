package MainPackage.Bill;

import MainPackage.Bill.BillItem;

public class Item5 implements BillItem {

    @Override
    public int getPrice(String item) {

        switch (item) {
            case "Asbastors": return 200000;
            case "TileBase":  return 200000;
            case "Rooftop":   return 250000;
            default:          return 0;
        }
    }
}
