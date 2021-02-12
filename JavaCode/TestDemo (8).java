import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2021-01-31
 * Time: 11:04
 *
 * public void heapSort() {
 *         int end = this.usedSize-1;
 *         while (end > 0) {
 *             int tmp = this.elem[0];
 *             this.elem[0] = this.elem[end];
 *             this.elem[end] = tmp;
 *             adjustDown(0,end);
 *             end--;
 *         }
 *     }
 */

class Card implements Comparable<Card>{
    public int rank; // 数值
    public String suit; // 花色
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit='" + suit + '\'' +
                '}';
    }

    @Override
    public int compareTo(Card o) {
        return this.rank-o.rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank &&
                Objects.equals(suit, card.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }
}

class Card2 {
    public int rank; // 数值
    public String suit; // 花色
    public Card2(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card2{" +
                "rank=" + rank +
                ", suit='" + suit + '\'' +
                '}';
    }
}
class RankComparator implements Comparator<Card2> {

    @Override
    public int compare(Card2 o1, Card2 o2) {
        return o1.rank-o2.rank;
    }
}
public class TestDemo {

    public static void main(String[] args) {
        Card card1 = new Card(1,"♦");
        Card card2 = new Card(1,"♦");

        Card card3 = new Card(3,"♦");
        System.out.println(card1.compareTo(card2));
        System.out.println(card1  == card2);
        System.out.println(card1.equals(card2));

        /*
        String str = "fsafsa";
        String str2 = "fsdafsafafsafa";
        System.out.println(str.equals(str2));
        */


    }

    public static void main3(String[] args) {
        PriorityQueue<Integer>  qu2 = new PriorityQueue<>();
        qu2.offer(1);
        qu2.offer(2);
        System.out.println(qu2);
    }


    public static void main2(String[] args) {
        Card2 card21 = new Card2(1,"♦");
        Card2 card22 = new Card2(2,"♦");
        Card2 card23 = new Card2(3,"♦");
        PriorityQueue<Card2>  qu2 = new PriorityQueue<>(new RankComparator());
        qu2.offer(card22);
        qu2.offer(card21);
        qu2.offer(card23);
        System.out.println(qu2);
    }

    public static void main1(String[] args) {
        Card card1 = new Card(1,"♦");
        Card card2 = new Card(2,"♦");
        Card card3 = new Card(3,"♦");

        PriorityQueue<Card>  qu = new PriorityQueue<>();
        qu.offer(card2);
        qu.offer(card1);
        System.out.println(qu);


        Card2 card21 = new Card2(1,"♦");
        Card2 card22 = new Card2(2,"♦");
        Card2 card23 = new Card2(3,"♦");
        PriorityQueue<Card2>  qu2 = new PriorityQueue<>(new Comparator<Card2>() {
            @Override
            public int compare(Card2 o1, Card2 o2) {
                return o1.rank-o2.rank;
            }
        });
        qu2.offer(card22);
        qu2.offer(card21);
        qu2.offer(card23);
        System.out.println(qu2);
    }

}
