package self.generic.test.ex3;

import self.generic.test.ex3.unit.Marine;
import self.generic.test.ex3.unit.Zealot;
import self.generic.test.ex3.unit.Zergling;

public class UnitPrinterTest {

    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("마린", 40));
        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zergling("저글링", 35));
        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zealot("질럿", 100));

        UnitPrinter.printV1(shuttle1);      // 이름: 마린, HP: 40
        UnitPrinter.printV2(shuttle1);      // 이름: 마린, Hp: 40
    }
}
