package Zoom.ZaurNestedAgain.Locall_inner;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(20, 5);
    }
}


class Math {
    private int a = 10;

    public void getResult(final int delimoe, final int delitel) {
//        int delimoe = 21;
//        delimoe = 15;
        class Delenie {
//            private int delitel;

//            public int getDelimoe() {
//                return delimoe;
//            }
//
//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }

//            public int getDelitel() {
//                return delitel;
//            }
//
//            public void setDelitel(int delitel) {
//                this.delitel = delitel;
//            }

            public int getPosleDeleniya() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                System.out.println(a);
                return delimoe % delitel;
            }
        }

        Delenie delenie = new Delenie();
//        delenie.setDelimoe(21);
//        delenie.setDelitel(4);
        System.out.println(delenie.getPosleDeleniya());
        System.out.println(delenie.getOstatok());
    }
}
