
package MainPackage.Bill;

import MainPackage.Bill.BillItem;

public class Item1 implements BillItem {

    @Override
    public int getPrice(String item) {

        switch (item) {
            case "5kw":  return 190000;
            case "10kw": return 380000;
            case "20kw": return 760000;
            case "25kw": return 950000;
            case "40kw": return 1520000;
            default:     return 0;
        }
    }
}

