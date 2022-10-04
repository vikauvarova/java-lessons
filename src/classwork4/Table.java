package classwork4;

public class Table {
    int seatCount = 0;
    String color = null;
    int width;
    int length;
    int high;

    //создаем конструктор - шаблон для создания єксемпляра класса
    // конструктор вызывается когда создается обьект (создали в файле Main)
    public Table(int seatCount, int width, int length, int high, String color){
       this.seatCount = seatCount;
       this.length = length;
       this.width = width;
       this.high = high;
    }

    @Override
    public String toString() {
        return "Table{" +
                "seatCount=" + seatCount +
                ", color='" + color + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", high=" + high +
                '}';
    }
}
