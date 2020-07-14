package com.hackerrank.implementation;

public class Kangaroo {

    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));
        System.out.println(kangaroo(0, 2, 5, 3));
    }

    /**
     * Complete the function kangaroo in the editor below. It should return YES if they reach the same position at
     * the same time, or NO if they don't.
     * <p>
     * kangaroo has the following parameter(s):
     *
     * @param x1 integer, starting position for kangaroo 1
     * @param v1 integer, jump distance for kangaroo 1
     * @param x2 integer, starting position for kangaroo 2
     * @param v2 integer, jump distance for kangaroo 2
     * @return String, "YES" if kangaroos reached the same position in the same time otherwise return "NO"
     */
    static String kangaroo(int x1, int v1, int x2, int v2) {

        KangarooSpecimen kangaroo1 = new KangarooSpecimen(x1, v1);
        KangarooSpecimen kangaroo2 = new KangarooSpecimen(x2, v2);

        if (kangaroo1.getPosition() < kangaroo2.getPosition() && kangaroo1.getVelocity() > kangaroo2.getVelocity() ||
                kangaroo1.getPosition() > kangaroo2.getPosition() && kangaroo1.getVelocity() < kangaroo2.getVelocity()) {

            if (kangaroo1.getPosition() > kangaroo2.getPosition()) {
                while (kangaroo1.getPosition() > kangaroo2.getPosition()) {
                    kangaroo1.jump();
                    kangaroo2.jump();
                }
                if (kangaroo1.getPosition() == kangaroo2.getPosition()) {
                    return "YES";
                } else {
                    return "NO";
                }
            }
            if (kangaroo1.getPosition() < kangaroo2.getPosition()) {
                while (kangaroo1.getPosition() < kangaroo2.getPosition()) {
                    kangaroo1.jump();
                    kangaroo2.jump();
                }
                if (kangaroo1.getPosition() == kangaroo2.getPosition()) {
                    return "YES";
                } else {
                    return "NO";
                }
            }
        } else {
            // kangaroo further away has greater velocity than the closer one
            return "NO";
        }

        return "NO";
    }

    static class KangarooSpecimen {

        private int position;
        private int velocity;

        KangarooSpecimen(int position, int velocity) {
            this.position = position;
            this.velocity = velocity;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public int getVelocity() {
            return velocity;
        }

        public void setVelocity(int velocity) {
            this.velocity = velocity;
        }

        public void jump() {
            this.position += this.velocity;
        }

    }

}
