public class Main {
    public static void main(String[] args) throws Exception {
        StoreOneA storeOneA = new StoreOneA(true,100000,12,true);
        storeOneA.enterStoreDetails();
        storeOneA.calculateLoanFiancing();
        storeOneA.showStoreInfo();

    }
}
