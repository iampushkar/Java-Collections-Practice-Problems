package MPushkar.TReeSet;

public class Person implements Comparable<Person> {
    String name;
    Integer rank;


    public Person(String name, Integer rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        rank = rank;
    }

    public int compareTo(Person specified){
        return specified.rank-this.rank;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
