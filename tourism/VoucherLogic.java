package by.epam.unit4.tourism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VoucherLogic {
    public static void sortVouchersByDays(List<Voucher> vouchers){
        Collections.sort(vouchers);
    }

    public static List<Voucher> takeVouchersByType(List<Voucher> vouchers, Voucher.Type type){
        List<Voucher> list = new ArrayList<>();
        for(Voucher i:vouchers){
            if(i.getType() == type){
                list.add(i);
            }
        }
        return list;
    }

    public static List<Voucher> takeVouchersByTransport(List<Voucher> vouchers, Voucher.Transport transport){
        List<Voucher> list = new ArrayList<>();
        for(Voucher i:vouchers){
            if(i.getTransport() == transport){
                list.add(i);
            }
        }
        return list;
    }

    public static List<Voucher> takeVouchersByFeed(List<Voucher> vouchers, Voucher.Feed feed){
        List<Voucher> list = new ArrayList<>();
        for(Voucher i:vouchers){
            if(i.getFeed() == feed){
                list.add(i);
            }
        }
        return list;
    }
}
