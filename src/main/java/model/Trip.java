package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Trip")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    Company company;
    String plane;
    String town_from;
    String town_to;
    Timestamp time_out;
    Timestamp time_in;

    public Trip(Company company, String plane, String town_from, String town_to, Timestamp time_out, Timestamp time_in) {
        this.company = company;
        this.plane = plane;
        this.town_from = town_from;
        this.town_to = town_to;
        this.time_out = time_out;
        this.time_in = time_in;
    }
}
