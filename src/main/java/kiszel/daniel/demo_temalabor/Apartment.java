package kiszel.daniel.demo_temalabor;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Data
@Entity
@NoArgsConstructor
@Table(name ="apartments")
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String address;
    private int price;
    private int room;
    private float area;

    @Override
    public String toString() {
        return "Apartment{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", room='" + room + '\'' +
                ", area=" + area +
                '}';
    }
}
