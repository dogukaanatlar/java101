public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight, maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("-----YENİ ROUND-----");
                System.out.println(this.f1.name + " Sağlığı : " + this.f1.health);
                System.out.println(this.f2.name + " Sağlığı : " + this.f2.health);

                int randomNo = (int) (Math.random() * 2);
                if (randomNo < 1) { //vote for start
                    this.f2.health = this.f1.hit(this.f2);
                    //System.out.println("a->b");
                    if (isWin()) {
                        break;
                    }

                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                } else {
                    this.f1.health = this.f2.hit(this.f1);
                    //System.out.println("b->a");
                    if (isWin()) {
                        break;
                    }

                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                }
            }
        } else {
            System.out.println("Sporcuların sikletleri uyumsuz!");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " Kazandı!");
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " Kazandı!");
            return true;
        }

        return false;
    }
}