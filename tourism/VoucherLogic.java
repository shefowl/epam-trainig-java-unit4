package by.epam.unit4.tourism;

public class VoucherLogic {
    public static void sortVouchersByDays(Voucher[] vouchers){
        for (int i = 0; i < vouchers.length; i++) {
            int min = vouchers[i].getDays();
            int minIndex = i;
            for (int j = i+1; j < vouchers.length; j++) {
                if (vouchers[j].getDays() < min) {
                    min = vouchers[j].getDays();
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                Voucher tmp = vouchers[i];
                vouchers[i] = vouchers[minIndex];
                vouchers[minIndex] = tmp;
            }
        }
    }
}
