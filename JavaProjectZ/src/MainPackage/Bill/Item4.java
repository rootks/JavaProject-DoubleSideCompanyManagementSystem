package MainPackage.Bill;

import MainPackage.Bill.BillItem;

public class Item4 implements BillItem {

    @Override
    public int getPrice(String item) {

        switch (item) {
            case "Deye(5kw)":    return 200000;
            case "Deye(10kw)":    return 400000;
            case "Deye(20kw)":    return 800000;
            case "Deye(25kw)":    return 1300000;
            case "Deye(40kw)":    return 1850000;
            case "Growatt(5kw)": return 210000;
            case "Growatt(10kw)": return 420000;
            case "Growatt(20kw)": return 825000;
            case "Growatt(25kw)": return 1350000;
            case "Growatt(40kw)": return 1975000;
            case "Solax(5kw)":   return 250000;
            case "Solax(10kw)":   return 475000;
            case "Solax(20kw)":   return 850000;
            case "Solax(25kw)":   return 1425000;
            case "Solax(40kw)":   return 2000000;
            case "Splix(5kw)":   return 270000;
            case "Splix(10kw)":   return 500000;
            case "Splix(20kw)":   return 875000;
            case "Splix(25kw)":   return 1575000;
            case "Splix(40kw)":   return 2050000;
            default:        return 0;
        }
    }
}

