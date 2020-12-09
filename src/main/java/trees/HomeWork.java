package trees;

import java.util.concurrent.ThreadLocalRandom;

public class HomeWork {
    public void homework() {
        int countOfMaps = 20;

        int balanced = 0;
        for (int i = 0; i < countOfMaps; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<Integer, Integer>();
            fillMap(map);
            if (map.isBalanced()) {
                balanced++;
            }
        }

        System.out.println("from " + countOfMaps + " CustomTreeMaps balanced is " + balanced + "\r\nnot balanced is " + (countOfMaps - balanced) + " trees");
        System.out.println("not balanced is " + ((((double) balanced) * 100) / (double) countOfMaps) + " %");
        System.out.println("p.s. With a large sample (10_000 trees), 16-17 (closer to 17) percent of the trees are unbalanced");

    }

    private void fillMap(MyTreeMap<Integer, Integer> customTreeMap) {
        while (customTreeMap.height() < 6) {
            customTreeMap.put(ThreadLocalRandom.current().nextInt(-100, 100), 0);
        }
    }
}
