package item18;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        InstrumentedHashSet<String> instrumentedHashSet = new InstrumentedHashSet<>();
        instrumentedHashSet.addAll(List.of("틱", "탁탁", "펑"));

        System.out.println(instrumentedHashSet.getAddCount()); // 6..

    }

}
